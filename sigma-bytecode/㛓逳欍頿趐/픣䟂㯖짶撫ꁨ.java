public class \u36d3\u9033\u6b0d\u983f\u8d90.\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068 {
    public void \ud523\u47c2\u3bd6\uc9f6\u64ab\ua068() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.io.InputStream \u7c6b\u5245\u88c5\u760c\u718f\u2dcc(java.io.InputStream p0, java.lang.String p1) {
        var_2_8B : int
        var_4_6F : String
        var_5_76 : String
        var_4_DA : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_8B = and:int(ldc:int(1603562328), ldc:int(1509313517))
            var_4_6F = invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u946b\u6d69\ua3b4\u93a2\u4f52\u5245, p0:InputStream, loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), and:int(ldc:int(9529), ldc:int(-10042))))
            var_5_76 = invokestatic:String(\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\uc7fe\u71f1\u8389\u8640\u71ae\u7d52, var_4_6F:String)
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_76:String))) {
                var_4_DA = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_5_76:String), var_4_6F:String))
                
                if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6198\uc4d2\u71f1\u93a2\uf9c5\u6b5f)) {
                    invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u59ec\u527a\u8413\uc31c\u5245\u97e6, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(String::replace, p1:String, ldc:char(58), ldc:char(47))), loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), xor:int(ldc:int(804), ldc:int(805))))), var_4_DA:String)
                }
                
                var_2_8B = and:int(var_2_8B:int, ldc:int(-609101847))
                var_4_6F = invokestatic:String(\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u7c6b\u5245\u88c5\u760c\u718f\u2dcc, var_4_DA:String)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_8B:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_8B = and:int(var_2_8B:int, ldc:int(-40075399))
                    
                    if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6198\uc4d2\u71f1\u93a2\uf9c5\u6b5f)) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u59ec\u527a\u8413\uc31c\u5245\u97e6, invokevirtual:String(String::replace, p1:String, ldc:char(58), ldc:char(47)), var_4_6F:String)
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_8B:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_8B = and:int(var_2_8B:int, ldc:int(1233011517))
            }
            
            return:InputStream(initobject:ByteArrayInputStream(ByteArrayInputStream::<init>, invokevirtual:byte[](String::getBytes, var_4_6F:String, loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), and:int(ldc:int(-13063), ldc:int(13062))))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u7c6b\u5245\u88c5\u760c\u718f\u2dcc(java.lang.String p0) {
        var_1_5F : int
        var_4_71 : BufferedReader
        var_5_7A : \u4daf\ubf56\u7043\ud158\uf9c5\u516c
        var_6_83 : StringBuilder
        var_1_89 : int
        var_7_8F : String
        var_1_9A : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(1922836344), ldc:int(1994137261))
            var_4_71 = initobject:BufferedReader(BufferedReader::<init>, initobject:StringReader[expected:Reader](StringReader::<init>, p0:String))
            var_5_7A = initobject:\u4daf\ubf56\u7043\ud158\uf9c5\u516c(\u4daf\ubf56\u7043\ud158\uf9c5\u516c::<init>)
            var_6_83 = initobject:StringBuilder(StringBuilder::<init>)
            
            loop {
                var_1_89 = and:int(var_1_5F:int, ldc:int(2058864490))
                var_7_8F = invokevirtual:String(BufferedReader::readLine, var_4_71:BufferedReader)
                
                if (cmpeq:boolean(var_7_8F:String, aconstnull:String())) {
                    looporswitchbreak()
                }
                
                var_1_9A = and:int(var_1_89:int, ldc:int(2071908203))
                
                if (invokevirtual:boolean(\u4daf\ubf56\u7043\ud158\uf9c5\u516c::\ubb2b\ud171\u9af2\u3711\u4179\uafe7, var_5_7A:\u4daf\ubf56\u7043\ud158\uf9c5\u516c, var_7_8F:String)) {
                    if (logicalnot:boolean(invokestatic:boolean(\u4daf\ubf56\u7043\ud158\uf9c5\u516c::\u6ec6\u494c\u12b2\u6ec6\ub1b9\ufcaf, var_7_8F:String))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_6_83:StringBuilder, var_7_8F:String)
                        invokevirtual:StringBuilder(StringBuilder::append, var_6_83:StringBuilder, loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), and:int(ldc:int(8290), ldc:int(6406))))
                    }
                }
                
                var_1_5F = and:int(var_1_9A:int, ldc:int(-2299985))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_6_83:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \uc7fe\u71f1\u8389\u8640\u71ae\u7d52(java.lang.String p0) {
        var_3_67 : StringBuilder
        var_5_6C : List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>
        var_7_81 : BufferedReader
        var_8_88 : String
        var_9_BD : Iterator<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>
        var_10_106 : \u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_67 = initobject:StringBuilder(StringBuilder::<init>)
            var_5_6C = aconstnull:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>()
            var_7_81 = initobject:BufferedReader(BufferedReader::<init>, initobject:StringReader[expected:Reader](StringReader::<init>, p0:String))
            
            loop {
                var_8_88 = invokevirtual:String(BufferedReader::readLine, var_7_81:BufferedReader)
                
                if (cmpeq:boolean(var_8_88:String, aconstnull:String())) {
                    looporswitchbreak()
                }
                
                if (logicalnot:boolean(invokestatic:boolean(\u4daf\ubf56\u7043\ud158\uf9c5\u516c::\u6ec6\u494c\u12b2\u6ec6\ub1b9\ufcaf, var_8_88:String))) {
                    loopcontinue()
                }
                
                if (cmpeq:boolean(invokevirtual:int(StringBuilder::length, var_3_67:StringBuilder), ldc:int(0))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, invokestatic:String(\u1833\u8aa5\ub102\ube23\ud158\u8308::\u4f52\u5d20\uc87f\ube23\uc31c\u624e))
                }
                
                if (cmpeq:boolean(var_5_6C:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>, aconstnull:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>())) {
                    var_5_6C = initobject:ArrayList<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>[expected:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>](ArrayList<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>::<init>, invokestatic:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>[expected:Collection<? extends \u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>](Arrays::asList, invokestatic:\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a[](\u1833\u8aa5\ub102\ube23\ud158\u8308::\u7e3f\ua562\uceb8\u3e75\uc238\u4f52)))
                }
                
                var_9_BD = invokeinterface:Iterator<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>(List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>::iterator, var_5_6C:List<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>)
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_BD:Iterator)) {
                    var_10_106 = checkcast:\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a(\u6b0d\u12cb\u156b\u4179\u8bb0.\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a.class, invokeinterface:\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a(Iterator<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>::next, var_9_BD:Iterator<\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_8_88:String, invokevirtual:String(\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a::\u8aa5\u6d69\ua61f\u62da\uc31c\ub70c, var_10_106:\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a)))) {
                        loopcontinue()
                    }
                    
                    invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, invokevirtual:String(\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a::\u3bc9\u392e\u69d9\uc2e8\u3711\ud36e, var_10_106:\u5db4\u7c6b\u385b\u4c2b\u965f\u3e2a))
                    invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), and:int(ldc:int(1058), ldc:int(11027))))
                    invokeinterface:void(Iterator::remove, var_9_BD:Iterator)
                }
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_3_67:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List<\u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c> \u7049\u7006\u92ee\u99f7\u6b5f\u4d85() {
        var_0_5F : int
        var_2_67 : ArrayList<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>
        var_3_6B : \u120d\u7c6b\u1187\u52d3\u3e75\u446c[]
        var_4_73 : int
        var_5_90 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        var_6_97 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_5F = and:int(ldc:int(1116444247), ldc:int(1265741107))
            var_2_67 = initobject:ArrayList<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>(ArrayList<E>::<init>)
            var_3_6B = invokestatic:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3bd6\u446c\uc238\uc87f\u40a9\u527a)
            var_4_73 = and:int(ldc:int(2961), ldc:int(-19348))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1880377823))
                
                if (cmpge:boolean(var_4_73:int, arraylength:int(var_3_6B:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]))) {
                    looporswitchbreak()
                }
                
                var_5_90 = loadelement:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(var_3_6B:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], var_4_73:int)
                var_6_97 = invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u385b\u5245\u8df4\u9255\u392e\ubb2b, var_5_90:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                
                if (cmpne:boolean(var_6_97:String, aconstnull:String())) {
                    if (invokevirtual:boolean(String::startsWith, var_6_97:String, loadelement:String(getstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2), xor:int(ldc:int(641), ldc:int(642))))) {
                        invokeinterface:boolean(List<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>::add, var_2_67:ArrayList<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>[expected:List<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>], var_5_90:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                    }
                }
                
                inc:int(var_4_73, ldc:int(1))
            }
            
            return:List<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>(var_2_67:ArrayList<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>[expected:List<\u120d\u7c6b\u1187\u52d3\u3e75\u446c>])
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_262 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_1CC_0 : byte[] [generated]
        stack_207_0 : byte[] [generated]
        stack_275_0 : byte[] [generated]
        stack_2DB_0 : byte[] [generated]
        var_4_1A5 : int
        var_3_1AA : byte[]
        var_5_1AB : int
        expr_275 : byte [generated]
        var_0_2D1 : int
        expr_2DB : byte [generated]
        stack_30B_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1F5 : byte[]
        var_5_1F6 : int
        expr_B3 : int [generated]
        expr_E6 : int [generated]
        var_3_11A : String
        stack_19E_0 : String[] [generated]
        expr_12C : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_262 = and:int(ldc:int(-628460992), ldc:int(-128557851))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B1_0 = stack_B3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1CC_0 = stack_207_0 = stack_275_0 = stack_2DB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lXsJpIyGJmLCVraw")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1A5 = expr_6B:int
        var_3_1AA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1AB = expr_6B:int
        Label_0429:
        
        while (cmpne:boolean(and:int(var_0_262:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0590)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-1694248667))
            var_5_1AB = add:int(var_5_1AB:int, ldc:int(-1))
            storeelement:byte(var_3_1AA:byte[], var_5_1AB:int, add:byte(loadelement:byte(stack_1CC_0:byte[], var_5_1AB:int), ldc:byte(112)))
            
            if (cmpne:boolean(var_5_1AB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B1_0 = stack_B3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1CC_0 = stack_207_0 = stack_275_0 = stack_2DB_0 = var_3_1AA:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0701)
        Label_0590:
        
        while (cmpne:boolean(and:int(var_0_262:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(8)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(1055733398))
                goto(Label_0429)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-385190235))
            var_5_1AB = add:int(var_5_1AB:int, ldc:int(-1))
            expr_275 = loadelement:byte(stack_275_0:byte[], var_5_1AB:int)
            storeelement:byte(var_3_1AA:byte[], var_5_1AB:int, xor:int(or:int(and:int(shl:int(expr_275:byte, and:int(ldc:int(94), ldc:int(13093))), ldc:int(-16)), and:int(shr:int(expr_275:byte[expected:int], and:int(ldc:int(6356), ldc:int(16932))), ldc:int(15))), ldc:int(87)))
            
            if (cmpne:boolean(var_5_1AB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B1_0 = stack_B3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1CC_0 = stack_207_0 = stack_275_0 = stack_2DB_0 = var_3_1AA:byte[]
            goto(Label_0184)
        }
        
        Label_0701:
        
        while (cmpeq:boolean(and:int(var_0_262:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0429)
            }
            
            var_0_2D1 = and:int(var_0_262:int, ldc:int(-1901596456))
            var_5_1AB = add:int(var_5_1AB:int, ldc:int(-1))
            expr_2DB = loadelement:byte(stack_2DB_0:byte[], var_5_1AB:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1AB:int, ldc:int(5)), neg:int(var_4_1A5:int)), ldc:int(0))) {
                var_0_2D1 = and:int(var_0_2D1:int, ldc:int(-1635552820))
                stack_30B_2 = add:byte(expr_2DB:byte, ldc:byte(5))
            }
            else {
                stack_30B_2 = add:byte(expr_2DB:byte, loadelement:byte(var_3_1AA:byte[], add:int(var_5_1AB:int, ldc:int(5))))
            }
            
            var_0_262 = and:int(var_0_2D1:int, ldc:int(-882713071))
            storeelement:byte(var_3_1AA:byte[], var_5_1AB:int, stack_30B_2:byte)
            
            if (cmpne:boolean(var_5_1AB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B1_0 = stack_B3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1CC_0 = stack_207_0 = stack_275_0 = stack_2DB_0 = var_3_1AA:byte[]
            goto(Label_0235)
        }
        
        goto(Label_0590)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0184)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-1372621112))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1F5 = newarray:byte[](byte.class, expr_90:int)
                var_5_1F6 = expr_90:int
                
                loop {
                    var_0_262 = and:int(var_0_262:int, ldc:int(-843426802))
                    var_5_1F6 = add:int(var_5_1F6:int, ldc:int(-1))
                    storeelement:byte(var_3_1F5:byte[], var_5_1F6:int, add:int(shl:int(loadelement:byte(stack_207_0:byte[], var_5_1F6:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1F6:int, and:int(ldc:int(1), ldc:int(20487)))), ldc:int(5)), xor:int(ldc:int(1061), ldc:int(1058)))))
                    
                    if (cmpne:boolean(var_5_1F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B1_0 = stack_B3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1CC_0 = stack_207_0 = stack_275_0 = stack_2DB_0 = var_3_1F5:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-1661013501))
            expr_B3 = arraylength:int(stack_B3_0:byte[])
            
            if (cmpne:boolean(expr_B3:int, ldc:int(0))) {
                var_4_1A5 = expr_B3:int
                var_3_1AA = newarray:byte[](byte.class, expr_B3:int)
                var_5_1AB = expr_B3:int
                goto(Label_0590)
            }
        }
        
        Label_0184:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(839332468))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(32768)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(-1922895493))
                goto(Label_0112)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-1163232851))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_4_1A5 = expr_E6:int
                var_3_1AA = newarray:byte[](byte.class, expr_E6:int)
                var_5_1AB = expr_E6:int
                goto(Label_0701)
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0184)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(1024)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-1092657785))
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_19E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16641), ldc:int(16645)))
            expr_12C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9732), ldc:int(16565)))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-26623), ldc:int(-26621)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-7729), ldc:int(7728)), and:int(ldc:int(1041), ldc:int(19011))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(259), ldc:int(25131)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(14403), ldc:int(553)), xor:int(ldc:int(17421), ldc:int(17423))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(768), ldc:int(769)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(264), ldc:int(266)), xor:int(ldc:int(5123), ldc:int(5125))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(-15303), ldc:int(7108)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-31744), ldc:int(-31738)), and:int(ldc:int(2315), ldc:int(17423))))
            putstatic:String[](\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u6c52\u8cae\u4492\u71f1\u392e\uc4d2, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u2dcc\u3504\u183a\u494c\ub32d\u0800(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_662 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_662 = and:int(ldc:int(-328850606), ldc:int(-1049638))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(128)), ldc:int(0))) {
            var_3_662 = and:int(var_3_662:int, ldc:int(-76715149))
            var_5_81 = and:int(ldc:int(27362), ldc:int(-28391))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29234), ldc:int(-29243)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_662:int, ldc:int(-26415141))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(4152), ldc:int(4153)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(517), ldc:int(3331)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_662 = and:int(var_3_DA:int, ldc:int(-379194383))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(281), ldc:int(20481)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1004289533))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1482901157))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(2133642632))
                    }
                    else {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-43042820))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1135599189))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1518868888))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(882758046))
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1580600989))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-16148098))
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-293848226))
                        var_11_EB = and:int(ldc:int(-32170), ldc:int(19625))
                        goto(Label_1503)
                    }
                    
                    Label_0572:
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1541176039))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(128)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-752928338))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1644119239))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-387663914))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-210335404))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-265957364))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1622700857))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(939981908))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1549191540))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(952465952))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-26460331))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0835:
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(602096567))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(699683668))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-786147953))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1974903212))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1203237928))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-370904201))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(1553), ldc:int(329))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0967:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1055066208))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1671299921))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(1776314725))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1018478070))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-345180201))
                        var_11_EB = and:int(ldc:int(-26729), ldc:int(26728))
                    }
                    
                    Label_1126:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1151735023))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1070630485))
                            goto(Label_0967)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-558529377))
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(2092347249))
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-59806857))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1377)
                            }
                        }
                    }
                    
                    Label_1251:
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1406901866))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1126)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0967)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1541825620))
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(2088510544))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-25871365))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1377:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1411176908))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(512)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1114434821))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1621650642))
                        loopcontinue()
                    }
                    
                    var_3_662 = and:int(var_3_662:int, ldc:int(-311449738))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1160905101))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1763726118))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(512)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-873431446))
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1924219818))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(64)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-353078287))
                        var_17_66D = add:int(var_16_119:int, and:int(ldc:int(505), ldc:int(28673)))
                        looporswitchbreak()
                    }
                    
                    var_3_662 = and:int(var_3_662:int, ldc:int(158302867))
                }
                
                var_3_662 = and:int(var_3_662:int, ldc:int(-310381582))
                
                if (cmple:boolean(var_5_81 = var_17_66D:int, sub:int(var_6_88:int, and:int(ldc:int(6727), ldc:int(1169))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
            var_3_662 = and:int(var_3_662:int, ldc:int(-405722049))
            goto(Label_0108)
        }
    }
}
