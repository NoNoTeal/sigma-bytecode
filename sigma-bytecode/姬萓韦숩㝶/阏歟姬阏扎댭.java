public class \u59ec\u8413\u97e6\uc229\u3776.\u960f\u6b5f\u59ec\u960f\u624e\ub32d {
    public void \u960f\u6b5f\u59ec\u960f\u624e\ub32d() {
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
            invokespecial:Object(Object::<init>, this:\u960f\u6b5f\u59ec\u960f\u624e\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u8258\u927d\u8389\u3e2a\u5245\uae87(int p0) {
        var_1_81 : int
        stack_AC_0 : int [generated]
        
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
        var_1_81 = and:int(ldc:int(999773100), ldc:int(929364430))
        
        if (cmpne:boolean(getstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910), aconstnull:int[]())) {
            loop {
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(1027013560))
                    
                    if (cmpge:boolean(p0:int, ldc:int(0))) {
                        if (cmplt:boolean(p0:int, arraylength:int(getstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910)))) {
                            stack_AC_0 = loadelement:int(getstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910), p0:int)
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(256)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(883414942))
                    stack_AC_0 = ldc:int(-1)
                    looporswitchbreak()
                }
            }
            
            return:int(stack_AC_0:int)
        }
        
        return:int(ldc:int(-1))
    }
    
    public static void \u392e\u8cae\ube23\u3e75\u446c\ucef1() {
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
            
            if (getstatic:boolean(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ud523\u8389\u98a4\u527a\u40a9\uafe7)) {
                putstatic:boolean(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ud523\u8389\u98a4\u527a\u40a9\uafe7, and:int[expected:boolean](ldc:int(-26828), ldc:int(10434)))
                invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u56bd\u8aa5\uc4d2\u836c\ud51e\u759a, invokestatic:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u74b1\u8cae\uae5d\u4179\u494c\u839e))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u56bd\u8aa5\uc4d2\u836c\ud51e\u759a(\u59ec\u8413\u97e6\uc229\u3776.\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50 p0) {
        var_1_5F : int
        var_3_86 : ArrayList<Integer>
        var_4_92 : String
        var_5_9C : InputStream
        
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
            var_1_5F = and:int(ldc:int(-994378320), ldc:int(-1502024459))
            invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u67d0\u9af2\u6cfe\uae5d\uf94d\u7af6)
            
            if (cmpne:boolean(p0:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50, aconstnull:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50())) {
                if (logicaland:boolean(invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7bad\u7c6b\u6c56\u74b1\u92ee\uae5d)), cmpeq:boolean(invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u624e\u61a4\uc31c\u4d85\ub102, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), aconstnull:\u6c52\u52d3\u516c\uae87\uae5d()))) {
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(-27648), ldc:int(18809))))
                    putstatic:boolean(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ud523\u8389\u98a4\u527a\u40a9\uafe7, and:int[expected:boolean](ldc:int(737), ldc:int(26625)))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-2034316038))
                    var_3_86 = initobject:ArrayList<Integer>(ArrayList<E>::<init>)
                    var_4_92 = loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(9545), ldc:int(2563)))
                    var_5_9C = invokeinterface:InputStream(\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50::\ud4fe\u3bc9\u71ae\u0800\u6bb9\ud171, p0:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50, var_4_92:String)
                    
                    if (cmpne:boolean(var_5_9C:InputStream, aconstnull:InputStream())) {
                        invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u8640\u3e2a\u3776\u4179\u4daf\u4f4a, var_5_9C:InputStream, var_4_92:String, var_3_86:ArrayList<Integer>[expected:List<Integer>])
                    }
                    
                    invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u8d98\ua068\u965f\u600f\ud217\u7049, var_3_86:ArrayList<Integer>[expected:List<Integer>])
                    
                    if (cmpgt:boolean(invokeinterface:int(List<E>::size, var_3_86:ArrayList<Integer>[expected:List<Integer>]), ldc:int(0))) {
                        putstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910, invokestatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u61a4\u62da\u839e\u98a4\ud36e\u4f4a, var_3_86:ArrayList<Integer>[expected:List<Integer>]))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8d98\ua068\u965f\u600f\ud217\u7049(java.util.List<java.lang.Integer> p0) {
        var_1_64 : int
        var_3_68 : String[]
        var_1_82 : int
        var_4_75 : int
        var_5_A7 : String
        var_6_BD : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            var_1_64 = and:int(and:int(ldc:int(-1537220479), ldc:int(-789577763)), ldc:int(-1478841617))
            var_3_68 = invokestatic:String[](\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u52d3\ucef1\u392e\u64f2\u67d0\u0a06)
            var_1_82 = and:int(var_1_64:int, ldc:int(-859085621))
            var_4_75 = and:int(ldc:int(21840), ldc:int(-21842))
            
            loop {
                if (cmpne:boolean(and:int(var_1_82:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_82 = and:int(var_1_82:int, ldc:int(-487638835))
                    
                    if (cmpge:boolean(var_4_75:int, arraylength:int(var_3_68:String[]))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_82:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_82 = and:int(var_1_82:int, ldc:int(1343980489))
                }
                else {
                    var_1_82 = and:int(and:int(var_1_82:int, ldc:int(-2115260701)), ldc:int(-1898189171))
                    var_5_A7 = loadelement:String(var_3_68:String[], var_4_75:int)
                    
                    try {
                        var_6_BD = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_5_A7:String, loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), xor:int(ldc:int(20481), ldc:int(20483))))
                        invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u8640\u3e2a\u3776\u4179\u4daf\u4f4a, invokestatic:InputStream(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u527a\u12cb\u61a4\u8d98\ub113\u4179, var_6_BD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_6_BD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), p0:List<Integer>)
                    }
                    catch (java.io.IOException stack_D8_0) {
                    }
                    
                    inc:int(var_4_75, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8640\u3e2a\u3776\u4179\u4daf\u4f4a(java.io.InputStream p0, java.lang.String p1, java.util.List<java.lang.Integer> p2) {
        var_3_34B : int
        var_5_109 : \u3e75\ub19c\uc229\u4e72\uf94d\u760c
        var_6_1DE : \u71f1\ud7e8\u8389\u34df\u385b\uc3e3
        var_7_1EF : Iterator<Object>
        var_8_225 : String
        var_9_234 : String
        var_10_247 : String
        var_12_289 : int
        var_13_2BE : int[]
        var_14_2D9 : int
        
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
            var_3_34B = and:int(ldc:int(1842740565), ldc:int(1358818997))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(1)), ldc:int(0))) {
                    var_3_34B = and:int(var_3_34B:int, ldc:int(-1908469727))
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_34B = and:int(var_3_34B:int, ldc:int(1168471622))
                    goto(Label_0176)
                }
                
                if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(512)), ldc:int(0))) {
                    var_3_34B = and:int(var_3_34B:int, ldc:int(-1040783171))
                    
                    if (cmpeq:boolean(p0:InputStream, aconstnull:InputStream())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0142:
                
                if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(512)), ldc:int(0))) {
                    var_3_34B = and:int(var_3_34B:int, ldc:int(-1489191008))
                    goto(Label_0176)
                }
                
                if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(16384)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_34B = and:int(var_3_34B:int, ldc:int(-2495735))
                
                try {
                    loop {
                        Label_0176:
                        
                        if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_34B = and:int(var_3_34B:int, ldc:int(820094914))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_0142)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(2048)), ldc:int(0))) {
                                var_3_34B = and:int(var_3_34B:int, ldc:int(-1923815019))
                                loopcontinue(Label_0096)
                            }
                            
                            var_3_34B = and:int(var_3_34B:int, ldc:int(-539821531))
                            p0 = invokestatic:InputStream(\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u7c6b\u5245\u88c5\u760c\u718f\u2dcc, p0:InputStream, p1:String)
                        }
                        
                        Label_0224:
                        
                        if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_34B = and:int(var_3_34B:int, ldc:int(-834998864))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_0142)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(268435456)), ldc:int(0))) {
                                var_3_34B = and:int(var_3_34B:int, ldc:int(2144364985))
                                var_5_109 = initobject:\u3e75\ub19c\uc229\u4e72\uf94d\u760c(\u3e75\ub19c\uc229\u4e72\uf94d\u760c::<init>)
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_0426)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(8192)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1832721147))
                                        goto(Label_0361)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(512)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1354338414))
                                    }
                                    else {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1439955989))
                                        invokevirtual:void(Properties::load, var_5_109:\u3e75\ub19c\uc229\u4e72\uf94d\u760c[expected:Properties], p0:InputStream)
                                    }
                                    
                                    Label_0315:
                                    
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(16384)), ldc:int(0))) {
                                        goto(Label_0426)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(512)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1064058008))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(268435456)), ldc:int(0))) {
                                            var_3_34B = and:int(var_3_34B:int, ldc:int(206680486))
                                            loopcontinue()
                                        }
                                        
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1156999575))
                                        invokevirtual:void(InputStream::close, p0:InputStream)
                                    }
                                    
                                    Label_0361:
                                    
                                    if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(1048576)), ldc:int(0))) {
                                        if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(4194304)), ldc:int(0))) {
                                            var_3_34B = and:int(var_3_34B:int, ldc:int(-932227908))
                                            goto(Label_0315)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(2147483647)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1943829729))
                                        invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), xor:int(ldc:int(3208), ldc:int(3211)))), p1:String)))
                                    }
                                    
                                    Label_0426:
                                    
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(-2073963244))
                                        goto(Label_0361)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(16384)), ldc:int(0))) {
                                        goto(Label_0315)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(8192)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                var_3_34B = and:int(var_3_34B:int, ldc:int(1457056773))
                                var_6_1DE = initobject:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::<init>, loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(1028), ldc:int(16647))))
                                var_3_34B = and:int(var_3_34B:int, ldc:int(1156671609))
                                var_7_1EF = invokeinterface:Iterator<Object>(Iterable<Object>::iterator, invokevirtual:Set<Object>[expected:Iterable<Object>](Hashtable<Object, V>::keySet, var_5_109:Hashtable<Object, V>))
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_3_34B:int, ldc:int(8192)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(2044132267))
                                        
                                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_1EF:Iterator))) {
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_34B:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1770239659))
                                    }
                                    else {
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1171778443))
                                        var_8_225 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_1EF:Iterator<String>))
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(1626832809))
                                        var_9_234 = invokevirtual:String(Properties::getProperty, var_5_109:\u3e75\ub19c\uc229\u4e72\uf94d\u760c[expected:Properties], var_8_225:String)
                                        var_3_34B = and:int(var_3_34B:int, ldc:int(-822609739))
                                        var_10_247 = loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(8485), ldc:int(135)))
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_8_225:String, var_10_247:String))) {
                                            invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(4294), ldc:int(550)))), var_8_225:String)))
                                        }
                                        else {
                                            var_12_289 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\u8d90\u1833\u0b8e\u8cae\u5140\u8640, var_8_225:String, var_10_247:String), ldc:int(-1))
                                            
                                            if (cmplt:boolean(var_12_289:int, ldc:int(0))) {
                                                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), xor:int(ldc:int(12298), ldc:int(12301)))), var_12_289:int)))
                                            }
                                            else {
                                                var_13_2BE = invokevirtual:int[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u3c25\ub171\u9255\u8389\u6b5f\u16f6, var_6_1DE:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_9_234:String)
                                                
                                                if (logicaland:boolean(cmpne:boolean(var_13_2BE:int[], aconstnull:int[]()), cmpge:boolean(arraylength:int(var_13_2BE:int[]), and:int(ldc:int(11035), ldc:int(1))))) {
                                                    var_14_2D9 = and:int(ldc:int(-27071), ldc:int(25014))
                                                    
                                                    while (cmplt:boolean(var_14_2D9:int, arraylength:int(var_13_2BE:int[]))) {
                                                        invokestatic:void(\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u5654\ub19c\u12cb\uf94d\u5245\uc910, p2:List<Integer>, loadelement:int(var_13_2BE:int[], var_14_2D9:int), var_12_289:int)
                                                        inc:int(var_14_2D9, ldc:int(1))
                                                    }
                                                }
                                                else {
                                                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(328), ldc:int(2189)))), var_8_225:String), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), xor:int(ldc:int(-32439), ldc:int(-32448)))), var_9_234:String)))
                                                }
                                            }
                                        }
                                    }
                                }
                                
                                looporswitchbreak()
                            }
                            
                            loopcontinue(Label_0096)
                        }
                    }
                }
                catch (java.io.IOException var_5_344) {
                    var_3_34B = and:int(var_3_34B:int, ldc:int(2011036781))
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4), and:int(ldc:int(12827), ldc:int(1198)))), p1:String)))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u5654\ub19c\u12cb\uf94d\u5245\uc910(java.util.List<java.lang.Integer> p0, int p1, int p2) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(267591739), ldc:int(1320598586))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(1038826811))
                
                if (cmpgt:boolean(invokeinterface:int(List::size, p0:List), p1:int)) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<Integer>::add, p0:List<Integer>, invokestatic:Integer(Integer::valueOf, ldc:int(-1)))
            }
            
            invokeinterface:Integer(List<Integer>::set, p0:List<Integer>, p1:int, invokestatic:Integer(Integer::valueOf, p2:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int[] \u61a4\u62da\u839e\u98a4\ud36e\u4f4a(java.util.List<java.lang.Integer> p0) {
        var_1_61 : int
        var_3_6A : int[]
        var_4_72 : int
        
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
            var_1_61 = and:int(ldc:int(-290230405), ldc:int(-1359614114))
            var_3_6A = newarray:int[](int.class, invokeinterface:int(List::size, p0:List))
            var_4_72 = and:int(ldc:int(-1779), ldc:int(1778))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-73699525))
                
                if (cmpge:boolean(var_4_72:int, arraylength:int(var_3_6A:int[]))) {
                    looporswitchbreak()
                }
                
                storeelement:int(var_3_6A:int[], var_4_72:int, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(List<Integer>::get, p0:List<Integer>, var_4_72:int))))
                inc:int(var_4_72, ldc:int(1))
            }
            
            return:int[](var_3_6A:int[])
        }
        
        goto(Label_0006)
    }
    
    public static void \u67d0\u9af2\u6cfe\uae5d\uf94d\u7af6() {
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
            putstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910, aconstnull:int[]())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_369 : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_2C2_0 : byte[] [generated]
        stack_316_0 : byte[] [generated]
        stack_37C_0 : byte[] [generated]
        stack_3F9_0 : byte[] [generated]
        var_4_2A3 : int
        var_3_2A8 : byte[]
        var_5_2A9 : int
        expr_2C2 : byte [generated]
        var_0_395 : int
        expr_37C : byte [generated]
        stack_3C4_2 : byte [generated]
        stack_398_0 : byte [generated]
        var_0_7F : int
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_304 : byte[]
        var_5_305 : int
        expr_DD : int [generated]
        expr_10C : int [generated]
        var_3_3E7 : byte[]
        var_5_3E8 : int
        var_3_157 : String
        stack_298_0 : String[] [generated]
        expr_169 : String[] [generated]
        
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
        var_0_369 = and:int(ldc:int(-998570281), ldc:int(-974449121))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DB_0 = stack_DD_0 = stack_10A_0 = stack_10C_0 = stack_14B_0 = stack_2C2_0 = stack_316_0 = stack_37C_0 = stack_3F9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("n3hlPeBva0+WLrozgVD3/2Y4ZDv/ZK4LEvRtPeBva2+pfW094G9rbwrYeDfhbH1yv65y7/uwMGE9buK9LmG6M3HsYqy7fzVhbYpTP2H6Y0sT++P6pik/MyALU288s+5y7/vgP+/kfW094G9rbwrYODN/ZsgT++N+sDBhPbwR5X1tPeBva28K2DlpebHibr6uYbozcdxpzqZirLt/NWE9vBHlfW094G9rbwrYOWl5seJuvq5hujNx3GnO9BHlfW094G9rbwrYOWl5seJuvq5hujNx3D/ibq0MU2nO9BHlfW094G9rbwrYc2tsP/RhPW5hujNx7GKsu381YW2KsSFhujOBUDhlPeBva0+WLrozgVD3/2Y4ZDv/ZK4Ldg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2A3 = expr_6E:int
        var_3_2A8 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2A9 = expr_6E:int
        Label_0683:
        
        while (cmpeq:boolean(and:int(var_0_369:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_369 = and:int(var_0_369:int, ldc:int(83763167))
            var_5_2A9 = add:int(var_5_2A9:int, ldc:int(-1))
            expr_2C2 = loadelement:byte(stack_2C2_0:byte[], var_5_2A9:int)
            storeelement:byte(var_3_2A8:byte[], var_5_2A9:int, add:int(or:int(and:int(shl:int(expr_2C2:byte, and:int(ldc:int(8710), ldc:int(5))), ldc:int(-16)), and:int(shr:int(expr_2C2:byte[expected:int], xor:int(ldc:int(-8186), ldc:int(-8190))), ldc:int(15))), ldc:int(9)))
            
            if (cmpne:boolean(var_5_2A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_10A_0 = stack_10C_0 = stack_14B_0 = stack_2C2_0 = stack_316_0 = stack_37C_0 = stack_3F9_0 = var_3_2A8:byte[]
            goto(Label_0115)
        }
        
        Label_0861:
        
        while (cmpne:boolean(and:int(var_0_369:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_395 = and:int(var_0_369:int, ldc:int(1465538551))
            var_5_2A9 = add:int(var_5_2A9:int, ldc:int(-1))
            expr_37C = stack_3C4_2 = loadelement(stack_37C_0, var_5_2A9)
            
            if (cmplt:boolean(add:int(add:int(var_5_2A9:int, ldc:int(1)), neg:int(var_4_2A3:int)), ldc:int(0))) {
                stack_3C4_2 = stack_398_0 = add:byte(expr_37C:byte, loadelement:byte(var_3_2A8:byte[], add:int(var_5_2A9:int, ldc:int(1))))
                goto(Label_0936)
            }
            
            Label_0905:
            
            if (cmpne:boolean(and:int(var_0_395:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_395 = and:int(var_0_395:int, ldc:int(618027007))
                stack_3C4_2 = stack_398_0 = add:byte(expr_37C:byte, ldc:byte(1))
            }
            
            Label_0936:
            
            if (cmpne:boolean(and:int(var_0_395:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_395 = and:int(var_0_395:int, ldc:int(-1257589043))
                goto(Label_0905)
            }
            
            var_0_369 = and:int(var_0_395:int, ldc:int(-2056423553))
            storeelement:byte(var_3_2A8:byte[], var_5_2A9:int, stack_3C4_2:byte)
            
            if (cmpne:boolean(var_5_2A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_10A_0 = stack_10C_0 = stack_14B_0 = stack_2C2_0 = stack_316_0 = stack_37C_0 = stack_3F9_0 = var_3_2A8:byte[]
            goto(Label_0226)
        }
        
        var_0_369 = and:int(var_0_369:int, ldc:int(-1223748939))
        goto(Label_0683)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_369:int, ldc:int(16384)), ldc:int(0))) {
            var_0_7F = and:int(var_0_369:int, ldc:int(461233736))
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0226)
        }
        
        if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(1)), ldc:int(0))) {
            var_0_369 = and:int(var_0_369:int, ldc:int(285419279))
        }
        else {
            var_0_369 = and:int(var_0_369:int, ldc:int(1566086719))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_304 = newarray:byte[](byte.class, expr_A7:int)
                var_5_305 = expr_A7:int
                
                loop {
                    var_0_369 = and:int(var_0_369:int, ldc:int(1607522263))
                    var_5_305 = add:int(var_5_305:int, ldc:int(-1))
                    storeelement:byte(var_3_304:byte[], var_5_305:int, add:int(shl:int(loadelement:byte(stack_316_0:byte[], var_5_305:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_305:int, xor:int(ldc:int(6404), ldc:int(6405)))), ldc:int(2)), and:int(ldc:int(9535), ldc:int(2623)))))
                    
                    if (cmpne:boolean(var_5_305:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_10A_0 = stack_10C_0 = stack_14B_0 = stack_2C2_0 = stack_316_0 = stack_37C_0 = stack_3F9_0 = var_3_304:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_369:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_7F = and:int(var_0_369:int, ldc:int(-1276987926))
            goto(Label_0273)
        }
        
        if (cmpne:boolean(and:int(var_0_369:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(1)), ldc:int(0))) {
                var_0_369 = and:int(var_0_369:int, ldc:int(566659546))
                goto(Label_0115)
            }
            
            var_0_369 = and:int(var_0_369:int, ldc:int(2084976511))
            expr_DD = arraylength:int(stack_DD_0:byte[])
            
            if (cmpne:boolean(expr_DD:int, ldc:int(0))) {
                var_4_2A3 = expr_DD:int
                var_3_2A8 = newarray:byte[](byte.class, expr_DD:int)
                var_5_2A9 = expr_DD:int
                goto(Label_0861)
            }
        }
        
        Label_0226:
        
        if (cmpne:boolean(and:int(var_0_369:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_7F = and:int(var_0_369:int, ldc:int(-1015576461))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_7F = and:int(var_0_369:int, ldc:int(1608242975))
            expr_10C = arraylength:int(stack_10C_0:byte[])
            
            if (cmpne:boolean(expr_10C:int, ldc:int(0))) {
                var_3_3E7 = newarray:byte[](byte.class, expr_10C:int)
                var_5_3E8 = expr_10C:int
                
                loop {
                    var_0_7F = and:int(var_0_7F:int, ldc:int(777275327))
                    var_5_3E8 = add:int(var_5_3E8:int, ldc:int(-1))
                    storeelement:byte(var_3_3E7:byte[], var_5_3E8:int, xor:byte(loadelement:byte(stack_3F9_0:byte[], var_5_3E8:int), ldc:byte(46)))
                    
                    if (cmpne:boolean(var_5_3E8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_10A_0 = stack_10C_0 = stack_14B_0 = stack_2C2_0 = stack_316_0 = stack_37C_0 = stack_3F9_0 = var_3_3E7:byte[]
            }
        }
        
        Label_0273:
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_369 = and:int(var_0_7F:int, ldc:int(-1205336375))
            goto(Label_0226)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(32768)), ldc:int(0))) {
            var_0_369 = and:int(var_0_7F:int, ldc:int(-420048994))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(32)), ldc:int(0))) {
            var_0_369 = and:int(var_0_7F:int, ldc:int(-1282826751))
            goto(Label_0115)
        }
        
        var_3_157 = initobject:String(String::<init>, stack_14B_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_298_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11307), ldc:int(16395)))
        expr_169 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28160), ldc:int(-28149)))
        storeelement:String(expr_169:String[], xor:int(ldc:int(9282), ldc:int(9283)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(595), ldc:int(-596)), and:int(ldc:int(600), ldc:int(16669))))
        storeelement:String(expr_169:String[], and:int(ldc:int(19497), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(210), ldc:int(202)), xor:int(ldc:int(16961), ldc:int(16984))))
        storeelement:String(expr_169:String[], and:int(ldc:int(4204), ldc:int(8983)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(603), ldc:int(24765)), xor:int(ldc:int(-12280), ldc:int(-12248))))
        storeelement:String(expr_169:String[], and:int(ldc:int(-3505), ldc:int(2480)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(145), ldc:int(177)), xor:int(ldc:int(16421), ldc:int(16448))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(-28154), ldc:int(-28148)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(1405), ldc:int(1304)), and:int(ldc:int(4350), ldc:int(2942))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(16472), ldc:int(16464)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(129), ldc:int(255)), xor:int(ldc:int(-8179), ldc:int(-8020))))
        storeelement:String(expr_169:String[], and:int(ldc:int(16390), ldc:int(14)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(8505), ldc:int(8600)), and:int(ldc:int(446), ldc:int(8957))))
        storeelement:String(expr_169:String[], and:int(ldc:int(4103), ldc:int(3991)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(16572), ldc:int(5821)), xor:int(ldc:int(5240), ldc:int(5285))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(272), ldc:int(275)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(4108), ldc:int(4305)), xor:int(ldc:int(8386), ldc:int(8252))))
        storeelement:String(expr_169:String[], and:int(ldc:int(20485), ldc:int(9509)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(12542), ldc:int(18687)), and:int(ldc:int(3339), ldc:int(451))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(1542), ldc:int(1540)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(-32032), ldc:int(-31773)), xor:int(ldc:int(17453), ldc:int(17719))))
        putstatic:String[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4, expr_169:String[])
        putstatic:int[](\u960f\u6b5f\u59ec\u960f\u624e\ub32d::\ucef1\u3e2a\u67e9\u8753\ua068\uc910, aconstnull:int[]())
    }
    
    public void \ubded\u3711\u7d52\uf9c5\u67e9\u59ec(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_678 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_683 : int
        
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
        var_3_678 = and:int(ldc:int(2117971438), ldc:int(2017455598))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\u6b5f\u59ec\u960f\u624e\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
            var_3_678 = and:int(var_3_678:int, ldc:int(2062417339))
            var_5_80 = and:int(ldc:int(-3903), ldc:int(3628))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1586), ldc:int(1585)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_678:int, ldc:int(2029633196))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(16964), ldc:int(16965)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(-14320), ldc:int(-14319)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_678 = and:int(var_3_D0:int, ldc:int(2124279736))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(11651), ldc:int(21)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1908819468))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1499736893))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-2064531418))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-35017047))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(291872634))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-861046246))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1686832614))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-997964236))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1469709345))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(974297600))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1755871579))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(2057940702))
                        var_11_E1 = and:int(ldc:int(11369), ldc:int(-15742))
                        goto(Label_1538)
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-165422785))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-954456450))
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1093084467))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1992791658))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(-68293237))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-994392216))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1585112233))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(2142221711))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-88326048))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1937906356))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(337465000))
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1282962220))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1950474191))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-862426041))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-985894256))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(2084417197))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(193), ldc:int(12561))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1275824468))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(844405775))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1370984443))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-760390695))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-606615399))
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(-76550449))
                        var_11_E1 = and:int(ldc:int(3328), ldc:int(-3329))
                    }
                    
                    Label_1115:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1238623814))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1396705113))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-774171655))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-1931198032))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_678 = and:int(var_3_678:int, ldc:int(-106188823))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1234:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(14732933))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-214697253))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(128)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1186406448))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(1506363707))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(242132186))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_678 = and:int(var_3_678:int, ldc:int(-45374242))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1538)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1376:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1434462672))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-858315168))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1566790629))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1757373335))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-352214436))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-645524279))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-1420133060))
                        loopcontinue()
                    }
                    
                    var_3_678 = and:int(var_3_678:int, ldc:int(-58720519))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1538:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_683 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1549:
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(969463368))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-189709955))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-491988846))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(1412466856))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_678:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_678 = and:int(var_3_678:int, ldc:int(-34734449))
                        var_17_683 = add:int(var_16_10F:int, and:int(ldc:int(16393), ldc:int(10355)))
                        looporswitchbreak()
                    }
                }
                
                var_3_678 = and:int(var_3_678:int, ldc:int(-81795588))
                
                if (cmple:boolean(var_5_80 = var_17_683:int, sub:int(var_6_87:int, xor:int(ldc:int(-31744), ldc:int(-31743))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_678:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
