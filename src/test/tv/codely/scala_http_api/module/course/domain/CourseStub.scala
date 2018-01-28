package tv.codely.scala_http_api.module.course.domain

import tv.codely.scala_http_api.module.user.domain.UserIdStub

object CourseStub {
  def apply(
      id: String = CourseIdStub.random.value.toString,
      title: String = CourseTitleStub.random.value.toString,
      lessons: BigDecimal = CourseLessonsStub.random.value,
      creatorId: String = UserIdStub.random.value.toString
  ): Course = Course(id, title, lessons, creatorId)

  def random: Course = apply()

  def randomSeq: Seq[Course] = SeqStub.randomOf(apply())
}
