/* Generated By:JJTree&JavaCC: Do not edit this line. parser.java */
package logic.parse.SOP;

public class parser/*@bgen(jjtree)*/implements parserTreeConstants, parserConstants {/*@bgen(jjtree)*/
  protected JJTparserState jjtree = new JJTparserState();

  final public ASTRecipient Recipient() throws ParseException {
 /*@bgen(jjtree) Recipient */
  ASTRecipient jjtn000 = new ASTRecipient(JJTRECIPIENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      DebugExp();
                     jjtree.closeNodeScope(jjtn000, true);
                     jjtc000 = false;
                    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  final public void DebugExp() throws ParseException {
 /*@bgen(jjtree) #DebugEx(> 1) */
  ASTDebugEx jjtn000 = new ASTDebugEx(JJTDEBUGEX);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARG:
        Address();
        break;
      case HASH:
        Debug();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ARG:
          AddExp();
          break;
        default:
          jj_la1[0] = jj_gen;
          ;
        }
        jj_consume_token(AT);
        domain();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, jjtree.nodeArity() > 1);
          }
    }
  }

  final public void Debug() throws ParseException {
 /*@bgen(jjtree) Debug */
  ASTDebug jjtn000 = new ASTDebug(JJTDEBUG);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(HASH);
      function();
      jj_consume_token(PERIOD);
      command();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PERIOD:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_1;
        }
        jj_consume_token(PERIOD);
        commandArg();
      }
      jj_consume_token(HASH);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Address() throws ParseException {
 /*@bgen(jjtree) Address */
  ASTAddress jjtn000 = new ASTAddress(JJTADDRESS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      AddExp();
      jj_consume_token(AT);
      domain();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void domain() throws ParseException {
 /*@bgen(jjtree) domain */
  ASTdomain jjtn000 = new ASTdomain(JJTDOMAIN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Subdomain();
      label_2:
      while (true) {
        jj_consume_token(PERIOD);
        DomainArg();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PERIOD:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void AddExp() throws ParseException {
    MulExp();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUS:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
        jj_consume_token(MINUS);
                                          ASTException jjtn001 = new ASTException(JJTEXCEPTION);
                                          boolean jjtc001 = true;
                                          jjtree.openNodeScope(jjtn001);
        try {
          MulExp();
        } catch (Throwable jjte001) {
                                          if (jjtc001) {
                                            jjtree.clearNodeScope(jjtn001);
                                            jjtc001 = false;
                                          } else {
                                            jjtree.popNode();
                                          }
                                          if (jjte001 instanceof RuntimeException) {
                                            {if (true) throw (RuntimeException)jjte001;}
                                          }
                                          if (jjte001 instanceof ParseException) {
                                            {if (true) throw (ParseException)jjte001;}
                                          }
                                          {if (true) throw (Error)jjte001;}
        } finally {
                                          if (jjtc001) {
                                            jjtree.closeNodeScope(jjtn001,  2);
                                          }
        }
        break;
      case PLUS:
        jj_consume_token(PLUS);
                                                  ASTUnion jjtn002 = new ASTUnion(JJTUNION);
                                                  boolean jjtc002 = true;
                                                  jjtree.openNodeScope(jjtn002);
        try {
          MulExp();
        } catch (Throwable jjte002) {
                                                  if (jjtc002) {
                                                    jjtree.clearNodeScope(jjtn002);
                                                    jjtc002 = false;
                                                  } else {
                                                    jjtree.popNode();
                                                  }
                                                  if (jjte002 instanceof RuntimeException) {
                                                    {if (true) throw (RuntimeException)jjte002;}
                                                  }
                                                  if (jjte002 instanceof ParseException) {
                                                    {if (true) throw (ParseException)jjte002;}
                                                  }
                                                  {if (true) throw (Error)jjte002;}
        } finally {
                                                  if (jjtc002) {
                                                    jjtree.closeNodeScope(jjtn002,  2);
                                                  }
        }
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void MulExp() throws ParseException {
    Exp();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PERIOD:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      jj_consume_token(PERIOD);
                                  ASTIntersection jjtn001 = new ASTIntersection(JJTINTERSECTION);
                                  boolean jjtc001 = true;
                                  jjtree.openNodeScope(jjtn001);
      try {
        Exp();
      } catch (Throwable jjte001) {
                                  if (jjtc001) {
                                    jjtree.clearNodeScope(jjtn001);
                                    jjtc001 = false;
                                  } else {
                                    jjtree.popNode();
                                  }
                                  if (jjte001 instanceof RuntimeException) {
                                    {if (true) throw (RuntimeException)jjte001;}
                                  }
                                  if (jjte001 instanceof ParseException) {
                                    {if (true) throw (ParseException)jjte001;}
                                  }
                                  {if (true) throw (Error)jjte001;}
      } finally {
                                  if (jjtc001) {
                                    jjtree.closeNodeScope(jjtn001,  2);
                                  }
      }
    }
  }

  final public void Exp() throws ParseException {
 /*@bgen(jjtree) Exp */
  ASTExp jjtn000 = new ASTExp(JJTEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Rule();
      jj_consume_token(OP_BRACE);
      Paralist();
      jj_consume_token(END_BRACE);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Paralist() throws ParseException {
 /*@bgen(jjtree) #Paralis(> 1) */
  ASTParalis jjtn000 = new ASTParalis(JJTPARALIS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Para();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case VIRTICAL:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          Para();
          break;
        case VIRTICAL:
          jj_consume_token(VIRTICAL);
          Para();
          break;
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, jjtree.nodeArity() > 1);
          }
    }
  }

  final public void Para() throws ParseException {
 /*@bgen(jjtree) #PolimolPara(> 1) */
  ASTPolimolPara jjtn000 = new ASTPolimolPara(JJTPOLIMOLPARA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Value();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
        case COMMA:
          ;
          break;
        default:
          jj_la1[9] = jj_gen;
          break label_6;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
          jj_consume_token(MINUS);
          Value();
          break;
        case COMMA:
          jj_consume_token(COMMA);
          Value();
          break;
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, jjtree.nodeArity() > 1);
          }
    }
  }

  final public void Rule() throws ParseException {
 /*@bgen(jjtree) Rule */
  ASTRule jjtn000 = new ASTRule(JJTRULE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Value() throws ParseException {
 /*@bgen(jjtree) Value */
  ASTValue jjtn000 = new ASTValue(JJTVALUE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Subdomain() throws ParseException {
 /*@bgen(jjtree) Subdomain */
  ASTSubdomain jjtn000 = new ASTSubdomain(JJTSUBDOMAIN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Arg() throws ParseException {
 /*@bgen(jjtree) Arg */
  ASTArg jjtn000 = new ASTArg(JJTARG);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void function() throws ParseException {
 /*@bgen(jjtree) function */
  ASTfunction jjtn000 = new ASTfunction(JJTFUNCTION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void alias() throws ParseException {
 /*@bgen(jjtree) alias */
  ASTalias jjtn000 = new ASTalias(JJTALIAS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void command() throws ParseException {
 /*@bgen(jjtree) command */
  ASTcommand jjtn000 = new ASTcommand(JJTCOMMAND);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void commandArg() throws ParseException {
 /*@bgen(jjtree) commandArg */
  ASTcommandArg jjtn000 = new ASTcommandArg(JJTCOMMANDARG);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void DomainArg() throws ParseException {
 /*@bgen(jjtree) DomainArg */
  ASTDomainArg jjtn000 = new ASTDomainArg(JJTDOMAINARG);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ARG);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.nodeValue = t.image;
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public ASTRecipient1 Recipient1() throws ParseException {
 /*@bgen(jjtree) Recipient1 */
  ASTRecipient1 jjtn000 = new ASTRecipient1(JJTRECIPIENT1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      DebugExp1();
                      jjtree.closeNodeScope(jjtn000, true);
                      jjtc000 = false;
                     {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  final public void DebugExp1() throws ParseException {
 /*@bgen(jjtree) #DebugEx1(> 1) */
  ASTDebugEx1 jjtn000 = new ASTDebugEx1(JJTDEBUGEX1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case HASH:
        Debug();
        break;
      default:
        jj_la1[11] = jj_gen;
        ;
      }
      Address1();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, jjtree.nodeArity() > 1);
          }
    }
  }

  final public void Address1() throws ParseException {
 /*@bgen(jjtree) Address1 */
  ASTAddress1 jjtn000 = new ASTAddress1(JJTADDRESS1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Paras1();
      jj_consume_token(AT);
      domain1();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Paras1() throws ParseException {
 /*@bgen(jjtree) Paras1 */
  ASTParas1 jjtn000 = new ASTParas1(JJTPARAS1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Paralist();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PERIOD:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_7;
        }
        jj_consume_token(PERIOD);
        Paralist();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void domain1() throws ParseException {
 /*@bgen(jjtree) domain1 */
  ASTdomain1 jjtn000 = new ASTdomain1(JJTDOMAIN1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      DomainArg();
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PERIOD:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_8;
        }
        jj_consume_token(PERIOD);
        DomainArg();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  /** Generated Token Manager. */
  public parserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[14];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000,0x6000,0x80,0x80,0x60,0x60,0x80,0x140,0x140,0x220,0x220,0x2000,0x80,0x80,};
   }

  /** Constructor with InputStream. */
  public parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new parserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new parserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public parser(parserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(parserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[15];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 14; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 15; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
