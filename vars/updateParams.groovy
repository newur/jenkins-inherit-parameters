def call(script) {
    println script.metaClass.methods.name.unique()
//    println script.dump()
//    println Arrays.asList(script.getClass().getInterfaces())
//    println Arrays.asList(script.getClass().getDeclaredFields())
//    println Arrays.asList(script.getClass().getDeclaredMethods())
    println script.env.HOME
    println script.params.class
    println script.currentBuild
    println script.currentBuild.rawBuild                // current job run like dummyJob #11
    println script.currentBuild.rawBuild.parent         // the job definition: dummyJob
    println script.currentBuild.rawBuild.parent.parent  // the actual parent: someFolder (contains dummyJob)
    def jobName = script.currentBuild.rawBuild.parent

    //params.put('jobName', jobName)            // error due to unmodifiable collection

    def currentRawBuild = script.currentBuild.rawBuild
    List<ParameterValue> newParams = new ArrayList<>()
    newParams.add(new StringParameterValue('jobName', jobName))
    currentRawBuild.addOrReplaceAction($build().getAction(ParametersAction.class).createUpdated(newParams))

}