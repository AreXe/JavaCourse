class ToDo{
    constructor(selector) {
        this.toDoListContainer = document.querySelector(selector)
        this.tasks = [{
                taskName: 'Wynieś śmieci',
                isCompleted: true
        }]
        this.newTaskName = ''
        this.render()
    }

    render(){
        this.toDoListContainer.innerHTML = ''
        this.buildUI()
        this.renderTasksList()
    }

    renderTasksList(){
        //you can use 'Array.prototype.forEach' instead of 'for loop'
        for(let i=0; i<this.tasks.length; i++){
            const taskContainer = document.createElement('div')
            taskContainer.innerHTML = this.tasks[i].taskName

            taskContainer.addEventListener(
                'click',
                () => this.onTaskClickHandler(i)
            )

            taskContainer.addEventListener(
                'dblclick',
                () => this.onTaskDoubleClickHandler(i)
            )

            if(this.tasks[i].isCompleted) taskContainer.style.textDecoration = 'line-through'
            this.toDoListContainer.appendChild(taskContainer)
        }
    }

    buildUI(){
        const input = document.createElement('input')
        const button = document.createElement('button')
        button.innerHTML = 'Dodaj zadanie'

        input.addEventListener(
            'input',
            (event) => this.onNewTaskNameChanged(event)
        )
        
        button.addEventListener(
            'click',
            () => this.onAddNewTaskClickHandler()
        )

        this.toDoListContainer.appendChild(input)
        this.toDoListContainer.appendChild(button)
    }

    onTaskClickHandler(index){
        this.tasks[index].isCompleted = !this.tasks[index].isCompleted
        this.render()
    }

        //index tutaj to nr taska, więc usuwamy task z tym indeksem czyli zostawiamy inne, nierówne "i"
    onTaskDoubleClickHandler(index){
        this.tasks = this.tasks.filter((task, i) => index !== i)
        this.render()
    }

    onNewTaskNameChanged(event){
        this.newTaskName = event.target.value
    }

    onAddNewTaskClickHandler(){
        this.addTask(this.newTaskName)
        this.newTaskName = ''
        this.render()
    }

    addTask(taskName) {
        this.tasks = this.tasks.concat({
            taskName: taskName,
            isCompleted: false
        })

        this.render()
    }
    
}

const toDo1 = new ToDo('div.toDo1')