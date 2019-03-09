def call(script) {
    println script.metaClass.methods.name.unique()
//    println script.dump()
//    println Arrays.asList(script.getClass().getInterfaces())
//    println Arrays.asList(script.getClass().getDeclaredFields())
//    println Arrays.asList(script.getClass().getDeclaredMethods())
    def currentRawBuild = script.currentBuild.rawBuild

    println script.env.HOME
    println script.params.class
    println script.currentBuild
    println script.currentBuild.rawBuild                // current job run like dummyJob #11
    println script.currentBuild.rawBuild.parent         // the job definition: dummyJob
    println script.currentBuild.rawBuild.parent.parent  // the actual parent: someFolder (contains dummyJob)


    def jobName = currentRawBuild.parent.name


    def env = script.env

    env.FOOBAR = 'foobar'
    println env.FOOBAR

//    only works if build has parameters
//    List<ParameterValue> newParams = new ArrayList<>()
//    newParams.add(new StringParameterValue('jobName', jobName))
//    currentRawBuild.addOrReplaceAction(currentRawBuild.getAction(ParametersAction.class).createUpdated(newParams))

}