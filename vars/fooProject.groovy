def call(params, actions) {
    def pipelineParams = [:]
    actions.resolveStrategy = Closure.DELEGATE_FIRST
    actions.delegate = pipelineParams
    actions()

    println(pipelineParams)
}
