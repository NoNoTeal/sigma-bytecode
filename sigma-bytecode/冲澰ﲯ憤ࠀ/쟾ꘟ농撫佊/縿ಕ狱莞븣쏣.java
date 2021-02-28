public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3 {
    public void \u7e3f\u0c95\u72f1\u839e\ube23\uc3e3() {
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
            invokespecial:Object(Object::<init>, this:\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6198\u7049\u8c8a\ua6bd\u4f52\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e p0) {
        var_1_5F : int
        var_3_64 : String
        var_4_D8 : String
        var_5_FD : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_6_105 : \u4f52\ub7dc\u7bad\ud217\u76bc\u6d99
        var_7_10E : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        var_8_175 : \u74b1\u4d85\u1187\u92ff\uae87\u6ec6
        var_10_143 : \u74b1\u4d85\u1187\u92ff\uae87\u6ec6
        
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
            var_1_5F = and:int(ldc:int(-407508096), ldc:int(-882918482))
            var_3_64 = invokevirtual:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5f50\u392e\u56bd\u99f7\uc7fe\u0b8e, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            
            if (cmpne:boolean(var_3_64:String, aconstnull:String())) {
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_3_64:String))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_3_64:String, loadelement:String[expected:CharSequence](getstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23), and:int(ldc:int(1174), ldc:int(-1175)))))) {
                        if (invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ufe34\u6ec6\uceb8\uff55\u9033\ube23), var_3_64:String[expected:CharSequence]))) {
                            var_4_D8 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23), xor:int(ldc:boolean(0), ldc:boolean(1)))), var_3_64:String), loadelement:String(getstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23), xor:int(ldc:int(10785), ldc:int(10787)))))
                            var_5_FD = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23), and:int(ldc:int(27), ldc:int(5127)))), var_3_64:String)))
                            var_6_105 = invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
                            var_7_10E = invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, var_6_105:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_5_FD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                            
                            if (cmpne:boolean(var_7_10E:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                                if (instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u74b1\u4d85\u1187\u92ff\uae87\u6ec6.class, var_7_10E:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)) {
                                    var_8_175 = checkcast:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(\u3d64\u7af6\uae87\uc238\u7d52.\u74b1\u4d85\u1187\u92ff\uae87\u6ec6.class, var_7_10E:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6)
                                    
                                    if (cmpne:boolean(getfield:Boolean(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::\ub70c\u7330\u946b\uc84e\u4c04\u62da, var_8_175:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6), aconstnull:Boolean())) {
                                        if (invokevirtual:boolean(Boolean::booleanValue, getfield:Boolean(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::\ub70c\u7330\u946b\uc84e\u4c04\u62da, var_8_175:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6))) {
                                            invokevirtual:void(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ub113\u71ae\u0a06\u6cfe\u3d4b\ubefe, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, var_5_FD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                                            
                                            if (instanceof:boolean(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0.class, invokevirtual:Runnable(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::\ub19c\u3c25\uc4d2\u7bad\uc31c\ud171, var_8_175:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6))) {
                                                invokevirtual:void(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u67d0\u64ab\u71ae\u983f\u34df\ua61f, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, invokevirtual:boolean(\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0::\u8d98\uf94d\uc910\u12cb\uae5d\u71ae, checkcast:\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0.class, invokevirtual:Runnable(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::\ub19c\u3c25\uc4d2\u7bad\uc31c\ud171, var_8_175:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6))))
                                            }
                                        }
                                        
                                        return:void()
                                    }
                                }
                            }
                            
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-21495815))
                            var_10_143 = initobject:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::<init>, checkcast:File(java.io.File.class, aconstnull:File()), var_4_D8:String, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\ud523\ufe34\u67e9\u120d\u6fb0\ubb2b), and:int[expected:boolean](ldc:int(-23408), ldc:int(19212)), initobject:\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0[expected:Runnable](\u4f4a\ucfaf\u3a62\u9af2\u516c\u67d0::<init>, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, var_5_FD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
                            putfield:boolean(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::\u3bc9\ud4fe\uae5d\u8df4\u5245\u5fe1, var_10_143:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6, and:int[expected:boolean](ldc:int(20489), ldc:int(8355)))
                            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, var_6_105:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_5_FD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_10_143:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \u1833\ub1b9\u647c\uae87\ua61f\uc229(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p0) {
        var_1_5F : int
        var_3_62 : int
        var_4_65 : int
        var_5_6B : int
        var_6_71 : int
        var_1_7E : int
        var_6_DB : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
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
            var_1_5F = and:int(ldc:int(-3491280), ldc:int(-1174475567))
            var_3_62 = ldc:int(64)
            var_4_65 = ldc:int(32)
            var_5_6B = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            var_6_71 = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_7E = and:int(var_1_5F:int, ldc:int(-1476874922))
                }
                else {
                    var_1_7E = and:int(var_1_5F:int, ldc:int(-102052014))
                    
                    if (cmpge:boolean(var_3_62:int, var_5_6B:int)) {
                        if (cmpge:boolean(var_4_65:int, var_6_71:int)) {
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_7E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_7E:int, ldc:int(85637067))
                }
                else {
                    var_1_5F = and:int(var_1_7E:int, ldc:int(-1077100739))
                    var_3_62 = mul:int(var_3_62:int, xor:int(ldc:int(-12224), ldc:int(-12222)))
                    var_4_65 = mul:int(var_4_65:int, and:int(ldc:int(130), ldc:int(20486)))
                }
            }
            
            var_6_DB = initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, var_3_62:int, var_4_65:int, xor:int[expected:boolean](ldc:int(8714), ldc:int(8715)))
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\uff55\uc910\u5245\uc2bd\uc29a\u4492, var_6_DB:\u5db4\ud523\u7043\u6c52\u8308\u8350, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_6_DB:\u5db4\ud523\u7043\u6c52\u8308\u8350)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uceb8\u5f50\u8258\ub18d\u8753\uc4d2(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p1) {
        var_2_5F : int
        stack_8A_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1219226273), ldc:int(756907507))
            
            if (cmple:boolean(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, p1:\u5db4\ud523\u7043\u6c52\u8308\u8350))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-306925826))
                stack_8A_0 = and:int(ldc:int(-287), ldc:int(286))
            }
            else {
                stack_8A_0 = and:int(ldc:int(39), ldc:int(1))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static void \uc238\u4f4a\ud217\u4f4a\u4c04\u6b5f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e p0) {
        var_4_88 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_5_8D : \u4f52\ub7dc\u7bad\ud217\u76bc\u6d99
        var_6_96 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        
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
            var_4_88 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23), xor:int(ldc:int(-16064), ldc:int(-16061)))), invokevirtual:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5f50\u392e\u56bd\u99f7\uc7fe\u0b8e, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))))
            var_5_8D = invokestatic:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub19c\u16f6\u0b8e\ub83f\ub70c\u8aa5)
            var_6_96 = invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, var_5_8D:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_4_88:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (instanceof:boolean(\u516c\u3d64\u718f\ub171\u6b5f.\u76bc\uc910\u3dd3\uae5d\uc910\ub113.class, var_6_96:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)) {
                invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\uc31c\u8c8a\u0800\u3d64\ua3b4\u0800, checkcast:\u76bc\uc910\u3dd3\uae5d\uc910\ub113(\u516c\u3d64\u718f\ub171\u6b5f.\u76bc\uc910\u3dd3\uae5d\uc910\ub113.class, var_6_96:\u76bc\uc910\u3dd3\uae5d\uc910\ub113[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a]))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u1187\u8d90\u93a2\u839e\u4179\u67e9, var_5_8D:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, var_4_88:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
            
            invokevirtual:void(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ub113\u71ae\u0a06\u6cfe\u3d4b\ubefe, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()))
            invokevirtual:void(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u67d0\u64ab\u71ae\u983f\u34df\ua61f, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, and:int[expected:boolean](ldc:int(-27559), ldc:int(10790)))
            invokestatic:void(\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\u6198\u7049\u8c8a\ua6bd\u4f52\u64f2, p0:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1FE : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_127_0 : byte[] [generated]
        stack_219_0 : byte[] [generated]
        stack_26D_0 : byte[] [generated]
        stack_2DA_0 : byte[] [generated]
        stack_331_0 : byte[] [generated]
        var_4_1EA : int
        var_3_1EF : byte[]
        var_5_1F0 : int
        expr_21C : byte [generated]
        var_0_327 : int
        expr_331 : byte [generated]
        stack_361_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_25B : byte[]
        var_5_25C : int
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_133 : String
        expr_13B : String[] [generated]
        expr_145 : String[] [generated]
        
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
        var_0_1FE = and:int(ldc:int(1216299908), ldc:int(-906243876))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_127_0 = stack_219_0 = stack_26D_0 = stack_2DA_0 = stack_331_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CRoHNnmINJJy9Yp6AEaCDDYCiQbzSDX5RUmCh7Y1SJe01kdHtEhGxHT5VbfJ88aIBvNIMrYz")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1EA = expr_6B:int
        var_3_1EF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1F0 = expr_6B:int
        Label_0498:
        
        while (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0692)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(1501520883))
            var_5_1F0 = add:int(var_5_1F0:int, ldc:int(-1))
            expr_21C = xor:byte(loadelement:byte(stack_219_0:byte[], var_5_1F0:int), ldc:byte(57))
            storeelement:byte(var_3_1EF:byte[], var_5_1F0:int, or:int(and:int(shl:int(expr_21C:byte, xor:int(ldc:int(12303), ldc:int(12299))), ldc:int(-16)), and:int(shr:int(expr_21C:byte[expected:int], and:int(ldc:int(6148), ldc:int(668))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1F0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_127_0 = stack_219_0 = stack_26D_0 = stack_2DA_0 = stack_331_0 = var_3_1EF:byte[]
            goto(Label_0112)
        }
        
        var_0_1FE = and:int(var_0_1FE:int, ldc:int(-174218034))
        goto(Label_0777)
        Label_0692:
        
        while (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(1870529939))
                goto(Label_0498)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-41978258))
            var_5_1F0 = add:int(var_5_1F0:int, ldc:int(-1))
            storeelement:byte(var_3_1EF:byte[], var_5_1F0:int, add:byte(loadelement:byte(stack_2DA_0:byte[], var_5_1F0:int), ldc:byte(6)))
            
            if (cmpne:boolean(var_5_1F0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_127_0 = stack_219_0 = stack_26D_0 = stack_2DA_0 = stack_331_0 = var_3_1EF:byte[]
            goto(Label_0200)
        }
        
        Label_0777:
        
        while (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1319653057))
                goto(Label_0498)
            }
            
            var_0_327 = and:int(var_0_1FE:int, ldc:int(-579616583))
            var_5_1F0 = add:int(var_5_1F0:int, ldc:int(-1))
            expr_331 = loadelement:byte(stack_331_0:byte[], var_5_1F0:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1F0:int, ldc:int(1)), neg:int(var_4_1EA:int)), ldc:int(0))) {
                var_0_327 = and:int(var_0_327:int, ldc:int(1559714283))
                stack_361_2 = add:byte(expr_331:byte, ldc:byte(1))
            }
            else {
                stack_361_2 = add:byte(expr_331:byte, loadelement:byte(var_3_1EF:byte[], add:int(var_5_1F0:int, ldc:int(1))))
            }
            
            var_0_1FE = and:int(var_0_327:int, ldc:int(704610051))
            storeelement:byte(var_3_1EF:byte[], var_5_1F0:int, stack_361_2:byte)
            
            if (cmpne:boolean(var_5_1F0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_127_0 = stack_219_0 = stack_26D_0 = stack_2DA_0 = stack_331_0 = var_3_1EF:byte[]
            goto(Label_0243)
        }
        
        goto(Label_0692)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-340565341))
        }
        else {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1611182128))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_25B = newarray:byte[](byte.class, expr_98:int)
                var_5_25C = expr_98:int
                
                loop {
                    var_0_1FE = and:int(var_0_1FE:int, ldc:int(-343948072))
                    var_5_25C = add:int(var_5_25C:int, ldc:int(-1))
                    storeelement:byte(var_3_25B:byte[], var_5_25C:int, add:int(shl:int(loadelement:byte(stack_26D_0:byte[], var_5_25C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_25C:int, xor:int(ldc:int(-24556), ldc:int(-24555)))), ldc:int(2)), xor:int(ldc:int(-20455), ldc:int(-20442)))))
                    
                    if (cmpne:boolean(var_5_25C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_127_0 = stack_219_0 = stack_26D_0 = stack_2DA_0 = stack_331_0 = var_3_25B:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(187904027))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1695297439))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1EA = expr_C3:int
                var_3_1EF = newarray:byte[](byte.class, expr_C3:int)
                var_5_1F0 = expr_C3:int
                goto(Label_0692)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(-2061615153))
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1166316846))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_1EA = expr_EE:int
                var_3_1EF = newarray:byte[](byte.class, expr_EE:int)
                var_5_1F0 = expr_EE:int
                goto(Label_0777)
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1496353418))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1770029934))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-65154207))
            goto(Label_0112)
        }
        
        var_3_133 = initobject:String(String::<init>, stack_127_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_13B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(43), ldc:int(46)))
        expr_145 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6672), ldc:int(6677)))
        storeelement:String(expr_145:String[], and:int(ldc:int(-31798), ldc:int(29749)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(20913), ldc:int(-20920)), xor:int(ldc:int(-22400), ldc:int(-22399))))
        storeelement:String(expr_145:String[], xor:int(ldc:int(-30203), ldc:int(-30201)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(8289), ldc:int(8288)), xor:int(ldc:int(842), ldc:int(847))))
        storeelement:String(expr_13B:String[], xor:int(ldc:int(-30717), ldc:int(-30713)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(4099), ldc:int(4102)), xor:int(ldc:int(-32105), ldc:int(-32123))))
        storeelement:String(expr_145:String[], and:int(ldc:int(11), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(-32746), ldc:int(-32764)), xor:int(ldc:int(8522), ldc:int(8531))))
        storeelement:String(expr_145:String[], xor:int(ldc:int(160), ldc:int(161)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(-12220), ldc:int(-12195)), and:int(ldc:int(10485), ldc:int(1079))))
        putstatic:String[](\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ud217\u5d20\u52d3\u92ee\u446c\ube23, expr_145:String[])
        putstatic:Pattern(\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, invokestatic:Pattern(Pattern::compile, loadelement:String(expr_13B:String[], and:int(ldc:int(293), ldc:int(20182)))))
    }
    
    public void \u960f\u3e2a\ub6ab\u9937\uae5d\u516c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_639 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_644 : int
        
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
        var_3_639 = and:int(ldc:int(900610082), ldc:int(-1114679138))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(-1208373107))
        }
        else {
            var_3_639 = and:int(var_3_639:int, ldc:int(2002080260))
            var_5_89 = and:int(ldc:int(-10357), ldc:int(10292))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4029), ldc:int(1948)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_639:int, ldc:int(895373431))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(20480), ldc:int(20481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(9240), ldc:int(9241)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_639 = and:int(var_3_D9:int, ldc:int(2102842048))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-23296), ldc:int(-23295)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-916156847))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(128)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1373540405))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0648)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(119643833))
                    }
                    else {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1062206378))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0542)
                            }
                            
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1273663394))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1528994877))
                        goto(Label_0648)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1066360830))
                            var_11_EA = and:int(ldc:int(3179), ldc:int(-3180))
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0542:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1415966833))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1049278693))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-34672443))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0648:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(192188590))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1183743859))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-82888280))
                            goto(Label_0542)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-839820963))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1033196973))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0775:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1907917266))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1955278966))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0648)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(209400188))
                            goto(Label_0542)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1408219822))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-47334791))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(1026), ldc:int(1027))
                                goto(Label_1025)
                            }
                        }
                    }
                    
                    Label_0896:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0648)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1764793983))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(2138460796))
                        var_11_EA = and:int(ldc:int(-7416), ldc:int(7414))
                    }
                    
                    Label_1025:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1613436775))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-793304981))
                            goto(Label_0896)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(273161234))
                            goto(Label_0648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1194414132))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(890729450))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1383354680))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(81017200))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-540294826))
                            goto(Label_1025)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(2069086727))
                            goto(Label_0896)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1865775403))
                            goto(Label_0648)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1005974505))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(924647132))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1437)
                    }
                    
                    Label_1295:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(909280528))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-975953971))
                        goto(Label_0896)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(572963505))
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0648)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(144747381))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-969111783))
                        loopcontinue()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(901545035))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_644 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1086804713))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1502856296))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-673811957))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-526119066))
                        goto(Label_0896)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1692351798))
                        goto(Label_0648)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1243347349))
                        goto(Label_0542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-182484311))
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(891748254))
                        var_17_644 = add:int(var_16_118:int, and:int(ldc:int(4365), ldc:int(1059)))
                        looporswitchbreak()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-306174348))
                }
                
                var_3_639 = and:int(var_3_639:int, ldc:int(-1213400509))
                
                if (cmple:boolean(var_5_89 = var_17_644:int, sub:int(var_6_90:int, and:int(ldc:int(257), ldc:int(197))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
