
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
import helper._
/**/
object aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("About Us")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

   """),format.raw/*5.4*/("""<h1>About Us</h1>
   	<div class="jumbotron">
   <h3><strong>Project Overview</strong></h3>
   <p>JPL has provided a repository of web services for multi-aspect physics-based and phenomenon-oriented phenomenon-oriented climate model performance evaluation and diagnosis through the comprehensive and synergistic use of multiple observational data, reanalysis data, and model outputs.</p>
   <p>We will help you learn the available web services, how to use them, and help you to design your climate analytics workflows.</p>
   <h3><strong>JPL Advisors</strong></h3>
   <p>Seungwon Lee</p>
   <p>Lei Pan</p>
   <h3><strong>Current Contributors</strong></h3>
   <p>Xing Wei</p>
   <p>Wei Wang</p>
   <p>Chris Lee</p>
   <p>Rao Li</p>
   <p>Chenran Gong</p>
   <p>Zelin Zeng</p>
   <p>Xiatao Jin</p>
   <p>Yichen Liu</p>
   <p>Edward Huang</p>
   <p>Zhiyu Lin</p>
   <p>Ming Qi</p>
   <p>Jian Jiao</p>
   <p>Juanchen Li</p>
   <h3><strong>Former Contributors</strong></h3>
   <p>Pinchao Wang</p>
   <p>Kang Fang</p>
   <p>Minghan Chen</p>
   
   <h3><strong>Advisors</strong></h3>
   <p>Jia Zhang		<a href="http://www.andrew.cmu.edu/user/jiaz/">Personal Website</a></p>
   
   

   <h3><strong>Publications</strong></h3>
   <b>2014</b>
   <p>1. J. Zhang, C. Lee, S. Xiao, P. Votava, T.J. Lee, R. Nemani and I. Foster, "A Community-Driven Workflow Recommendations and Reuse Infrastructure", accepted by The 8th IEEE International Symposium on Service-Oriented System Engineering (SOSE 2014).</p>
   <p>2. J. Zhang, D. Kuc, and S. Lu, "Confucius: A Tool Supporting Collaborative Scientific Workflow Composition", IEEE Transactions on Services Computing (TSC), 7(1), Jan.-Mar, 2014.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-Confucius-TSC.pdf">[pdf]</a></p>
   <b>2013</b>
   <p>3. J. Zhang, Z. Li, O. Sandoval, N. Xin, Y. Ren, B. Iannucci, M. Griss, S. Rosernberg, R.A. Martin, J. Cao, A. Rowe, "Supporting Personizable Virtual Internet of Things", in Proceedings of The 10th IEEE International Conference on Ubiquitous Intelligence and Computing (UIC-2013), Dec. 18-20, 2013, Vietri sul Mare, Italy.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-VirtualSensorEditor.pdf">[pdf]</a></p>
   <p>4. J. Zhang, N. Radia, Z. Li, N. Xin, Y. Ren, P. Sachdeva, P. Subramanyam, S. Hu, S. Luan, L. Lee, B. Xing, D. Li, J. Cao, T. Selker, B. Iannucci, M. Griss, A. Rowe, "An Infrastructure Supporting Considerate Sensor Service Provisioning", in Proceedings of the 6th IEEE International Conference on Service Oriented Computing and Applications (SOCA 2013), Dec. 16-18, 2013, Kauai, HA, USA.<a href="http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-SocialSensors.pdf">[pdf]</a></p>
   <p>5. L.-J. Zhang and J. Zhang, "Service Oriented Solution Modeling and Variation Propagation Analysis based on Architectural Building Blocks", International Journal of Web Services Research (JWSR), 10(4), 2013.</p>
   <p>6. J. Wang, Z. Feng, J. Zhang, P.C.K. Hung, K. He, and L.-J. Zhang, "A Unified RGPS-Based Approach Supporting Service-Oriented Process Customization", accepted as a book chapter in Web Services Foundations, edited by Athman Bouguettaya and Schahram Dustdar, Springer Verlag, pp. 657-682.</p>
   <p>7. J. Zhang, P. Votava, T.J. Lee, S. Adhikarla, I. Kulkumjon, M. Schlau, D. Natesan, R. Nemani, "A Technique of Analyzing Trust Relationships to Facilitate Scientific Service Discovery and Recommendation", in Proceedings of 2013 IEEE 10th International Conference on Services Computing (SCC), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 57-64. (acceptance rate: 18%)<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-TrustServiceDiscovery.pdf">[pdf]</a></p>
   <p>8. J. Zhang, B. Iannucci, M. Hennessy, K. Gopal, S. Xiao, S. Kumar, D. Pfeffer, B. Aljedia, Y. Ren, M. Griss, S. Rosenberg, J. Cao, A. Rowe, "Sensor Data as a Service - A Federated Platform for Mobile Data-Centric Service Development and Sharing", in Proceedings of 2013 IEEE 10th International Conference on Services Computing (SCC), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 446-453.<a href="http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-SensorServicePlatform.pdf">[pdf]</a></p>
   <p>9. J. Zhang, P. Votava, T.J. Lee, O. Chu, C. Li, D. Liu, K. Liu, N. Xin, R. Nemani, "Bridging VisTrails Scientific Workflow Management System to High Performance Computing", IEEE 2013 7th International Workshop on Scientific Workflows (SWF), in Proceedings of 2013 IEEE 9th World Congress on Services (SERVICES), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 29-36.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-VisTrails-HECC.pdf">[pdf]</a></p>
   <p>10. B. Plale, M.R. Lyu, J. Zhang (Eds.), 2013 IEEE 20th International Conference on Web Services (ICWS), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, IEEE 2013.</p>
   <p>11. L.-J. Zhang and J. Zhang, "Technical Architecture of Enabling Body of Knowledge System for Effective Learning and Information Dissemination", International Journal of Web Services Research (JWSR), 10(2), 2013, pp. 41-62.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-BoK.pdf">[pdf]</a></p>
   <p>12. I. Bojanova, J. Zhang, J.M. Voas, "Cloud Computing", IEEE IT Professional, 15(2), 2013, pp. 12-14.</p>
</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/aboutUs.scala.html
                  HASH: 99247a5d5d25ff8d5b9e92f99db9efdd42e3cf50
                  MATRIX: 815->21|839->37|878->39|911->46
                  LINES: 29->3|29->3|29->3|31->5
                  -- GENERATED --
              */
          