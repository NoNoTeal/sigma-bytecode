public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae {
    public void \u7043\uc84e\u8bb0\u839e\u0b8e\u71ae() {
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
            invokespecial:Object(Object::<init>, this:\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u718f\u946b\u0b8e\ucfaf\ud217\u16f6(int p0) {
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
        var_1_81 = and:int(ldc:int(712503426), ldc:int(788263154))
        
        if (cmpne:boolean(getstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c), aconstnull:int[]())) {
            loop {
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(1819014361))
                    
                    if (cmpge:boolean(p0:int, ldc:int(0))) {
                        if (cmplt:boolean(p0:int, arraylength:int(getstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c)))) {
                            stack_AC_0 = loadelement:int(getstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c), p0:int)
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(-1125914971))
                    stack_AC_0 = ldc:int(-1)
                    looporswitchbreak()
                }
            }
            
            return:int(stack_AC_0:int)
        }
        
        return:int(ldc:int(-1))
    }
    
    public static void \u624e\u8389\u8c8a\u9255\u8d98\u3504() {
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
            
            if (getstatic:boolean(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\ud158\u5140\u7873\ud7e8\u8c8a\ua6bd)) {
                putstatic:boolean(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\ud158\u5140\u7873\ud7e8\u8c8a\ua6bd, and:int[expected:boolean](ldc:int(-10815), ldc:int(10814)))
                invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u71ae\u8c8a\uc9f6\ua068\u5bc4\ub18d, invokestatic:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u74b1\u8cae\uae5d\u4179\u494c\u839e))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u71ae\u8c8a\uc9f6\ua068\u5bc4\ub18d(\u59ec\u8413\u97e6\uc229\u3776.\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50 p0) {
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
            var_1_5F = and:int(ldc:int(1811648874), ldc:int(-290874453))
            invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\ubded\uceb8\ud51e\u6c52\u8bb0\u3dd3)
            
            if (cmpne:boolean(p0:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50, aconstnull:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50())) {
                if (logicaland:boolean(invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7bad\u7c6b\u6c56\u74b1\u92ee\uae5d)), cmpeq:boolean(invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u624e\u61a4\uc31c\u4d85\ub102, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), aconstnull:\u6c52\u52d3\u516c\uae87\uae5d()))) {
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(916), ldc:int(-917))))
                    putstatic:boolean(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\ud158\u5140\u7873\ud7e8\u8c8a\ua6bd, and:int[expected:boolean](ldc:int(18723), ldc:int(4229)))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-72926229))
                    var_3_86 = initobject:ArrayList<Integer>(ArrayList<E>::<init>)
                    var_4_92 = loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), xor:int(ldc:int(16517), ldc:int(16516)))
                    var_5_9C = invokeinterface:InputStream(\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50::\ud4fe\u3bc9\u71ae\u0800\u6bb9\ud171, p0:\u4daf\ubcb0\ub7dc\u516c\ufe34\u5f50, var_4_92:String)
                    
                    if (cmpne:boolean(var_5_9C:InputStream, aconstnull:InputStream())) {
                        invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u64f2\u98a4\u2dcc\u8389\u4c04\u71f1, var_5_9C:InputStream, var_4_92:String, var_3_86:ArrayList<Integer>[expected:List<Integer>])
                    }
                    
                    invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8413\u4d85\uff55\u61a4\u6198\u5bc4, var_3_86:ArrayList<Integer>[expected:List<Integer>])
                    
                    if (cmpgt:boolean(invokeinterface:int(List<E>::size, var_3_86:ArrayList<Integer>[expected:List<Integer>]), ldc:int(0))) {
                        putstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c, invokestatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u4179\uc29a\ub18d\u927d\u6bb9\u67d0, var_3_86:ArrayList<Integer>[expected:List<Integer>]))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8413\u4d85\uff55\u61a4\u6198\u5bc4(java.util.List<java.lang.Integer> p0) {
        var_1_64 : int
        var_3_68 : String[]
        var_1_6D : int
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
            var_1_64 = and:int(and:int(ldc:int(610280556), ldc:int(-176165511)), ldc:int(-1367414547))
            var_3_68 = invokestatic:String[](\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u52d3\ucef1\u392e\u64f2\u67d0\u0a06)
            var_1_6D = and:int(var_1_64:int, ldc:int(-545275909))
            var_4_75 = and:int(ldc:int(-17651), ldc:int(17632))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_6D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_6D = and:int(var_1_6D:int, ldc:int(-58202157))
                }
                else {
                    var_1_6D = and:int(var_1_6D:int, ldc:int(383838110))
                    
                    if (cmpge:boolean(var_4_75:int, arraylength:int(var_3_68:String[]))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_6D:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_6D = and:int(and:int(var_1_6D:int, ldc:int(117026810)), ldc:int(1583636842))
                    var_5_A7 = loadelement:String(var_3_68:String[], var_4_75:int)
                    
                    try {
                        var_6_BD = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_5_A7:String, loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(2906), ldc:int(5122))))
                        invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u64f2\u98a4\u2dcc\u8389\u4c04\u71f1, invokestatic:InputStream(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u527a\u12cb\u61a4\u8d98\ub113\u4179, var_6_BD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_6_BD:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), p0:List<Integer>)
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
    
    private static void \u64f2\u98a4\u2dcc\u8389\u4c04\u71f1(java.io.InputStream p0, java.lang.String p1, java.util.List<java.lang.Integer> p2) {
        var_3_33D : int
        var_5_F1 : \u3e75\ub19c\uc229\u4e72\uf94d\u760c
        var_6_1CE : \u71f1\ud7e8\u8389\u34df\u385b\uc3e3
        var_7_1DF : Iterator<Object>
        var_8_217 : String
        var_9_226 : String
        var_10_239 : String
        var_12_27B : int
        var_13_2B0 : int[]
        var_14_2CB : int
        
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
            var_3_33D = and:int(ldc:int(-853827135), ldc:int(-593512992))
            
            loop {
                Label_0096:
                
                if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0168)
                }
                
                if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_33D = and:int(var_3_33D:int, ldc:int(1314631933))
                    
                    if (cmpeq:boolean(p0:InputStream, aconstnull:InputStream())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0126:
                
                if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_33D = and:int(var_3_33D:int, ldc:int(517790925))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_33D = and:int(var_3_33D:int, ldc:int(-608779862))
                        goto(Label_0168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_33D = and:int(var_3_33D:int, ldc:int(2139989194))
                }
                
                try {
                    Label_0208:
                    
                    do {
                        Label_0168:
                        
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(32)), ldc:int(0))) {
                                var_3_33D = and:int(var_3_33D:int, ldc:int(100375786))
                                goto(Label_0126)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-316953381))
                            p0 = invokestatic:InputStream(\ud523\u47c2\u3bd6\uc9f6\u64ab\ua068::\u7c6b\u5245\u88c5\u760c\u718f\u2dcc, p0:InputStream, p1:String)
                        }
                    } while (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(524288)), ldc:int(0)))
                    
                    if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_33D = and:int(var_3_33D:int, ldc:int(1583999991))
                    var_5_F1 = initobject:\u3e75\ub19c\uc229\u4e72\uf94d\u760c(\u3e75\ub19c\uc229\u4e72\uf94d\u760c::<init>)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(1381306023))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(714786904))
                            goto(Label_0337)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(2118891231))
                            invokevirtual:void(Properties::load, var_5_F1:\u3e75\ub19c\uc229\u4e72\uf94d\u760c[expected:Properties], p0:InputStream)
                        }
                        
                        Label_0291:
                        
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-1807079471))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(268435456)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(4)), ldc:int(0))) {
                                var_3_33D = and:int(var_3_33D:int, ldc:int(-739509643))
                                loopcontinue()
                            }
                            
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-546721059))
                            invokevirtual:void(InputStream::close, p0:InputStream)
                        }
                        
                        Label_0337:
                        
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(65536)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_0291)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_33D = and:int(var_3_33D:int, ldc:int(710382590))
                                loopcontinue()
                            }
                            
                            var_3_33D = and:int(var_3_33D:int, ldc:int(1287251185))
                            invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(18483), ldc:int(1795)))), p1:String)))
                        }
                        
                        Label_0402:
                        
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0337)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_33D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(1002912739))
                            goto(Label_0291)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(8)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_3_33D = and:int(var_3_33D:int, ldc:int(-1514210928))
                    }
                    
                    var_3_33D = and:int(var_3_33D:int, ldc:int(-821169718))
                    var_6_1CE = initobject:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::<init>, loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), xor:int(ldc:int(256), ldc:int(260))))
                    var_3_33D = and:int(var_3_33D:int, ldc:int(1308342780))
                    var_7_1DF = invokeinterface:Iterator<Object>(Iterable<Object>::iterator, invokevirtual:Set<Object>[expected:Iterable<Object>](Hashtable<Object, V>::keySet, var_5_F1:Hashtable<Object, V>))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-634656129))
                        }
                        else {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-274748932))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_1DF:Iterator))) {
                                looporswitchbreak()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_33D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_33D = and:int(var_3_33D:int, ldc:int(1302328814))
                            var_8_217 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_1DF:Iterator<String>))
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-33970692))
                            var_9_226 = invokevirtual:String(Properties::getProperty, var_5_F1:\u3e75\ub19c\uc229\u4e72\uf94d\u760c[expected:Properties], var_8_217:String)
                            var_3_33D = and:int(var_3_33D:int, ldc:int(-270684175))
                            var_10_239 = loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(8797), ldc:int(5)))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_8_217:String, var_10_239:String))) {
                                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(4494), ldc:int(18518)))), var_8_217:String)))
                            }
                            else {
                                var_12_27B = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\u8d90\u1833\u0b8e\u8cae\u5140\u8640, var_8_217:String, var_10_239:String), ldc:int(-1))
                                
                                if (cmplt:boolean(var_12_27B:int, ldc:int(0))) {
                                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), xor:int(ldc:int(-28605), ldc:int(-28604)))), var_12_27B:int)))
                                }
                                else {
                                    var_13_2B0 = invokevirtual:int[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ub19c\u59ec\u416d\u1187\u6b0d\u156b, var_6_1CE:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_9_226:String)
                                    
                                    if (logicaland:boolean(cmpne:boolean(var_13_2B0:int[], aconstnull:int[]()), cmpge:boolean(arraylength:int(var_13_2B0:int[]), and:int(ldc:int(2137), ldc:int(9761))))) {
                                        var_14_2CB = and:int(ldc:int(8231), ldc:int(-12392))
                                        
                                        while (cmplt:boolean(var_14_2CB:int, arraylength:int(var_13_2B0:int[]))) {
                                            invokestatic:void(\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\uc910\u5bc4\u9033\ub18d\u4179\uff55, p2:List<Integer>, loadelement:int(var_13_2B0:int[], var_14_2CB:int), var_12_27B:int)
                                            inc:int(var_14_2CB, ldc:int(1))
                                        }
                                    }
                                    else {
                                        invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), xor:int(ldc:int(121), ldc:int(113)))), var_8_217:String), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), xor:int(ldc:int(4100), ldc:int(4109)))), var_9_226:String)))
                                    }
                                }
                            }
                        }
                    }
                }
                catch (java.io.IOException var_5_336) {
                    var_3_33D = and:int(var_3_33D:int, ldc:int(1555685607))
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a), and:int(ldc:int(10), ldc:int(25738)))), p1:String)))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \uc910\u5bc4\u9033\ub18d\u4179\uff55(java.util.List<java.lang.Integer> p0, int p1, int p2) {
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
            var_3_61 = and:int(ldc:int(-1234725303), ldc:int(-1169957045))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1210861623))
                
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
    
    private static int[] \u4179\uc29a\ub18d\u927d\u6bb9\u67d0(java.util.List<java.lang.Integer> p0) {
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
            var_1_61 = and:int(ldc:int(-1595113896), ldc:int(188512853))
            var_3_6A = newarray:int[](int.class, invokeinterface:int(List::size, p0:List))
            var_4_72 = and:int(ldc:int(14474), ldc:int(-14507))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1191739440))
                
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
    
    public static void \ubded\uceb8\ud51e\u6c52\u8bb0\u3dd3() {
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
            putstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c, aconstnull:int[]())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B6 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_13A_0 : byte[] [generated]
        stack_2C9_0 : byte[] [generated]
        stack_31D_0 : byte[] [generated]
        stack_393_0 : byte[] [generated]
        stack_3E0_0 : byte[] [generated]
        var_4_292 : int
        var_3_297 : byte[]
        var_5_298 : int
        expr_2C9 : byte [generated]
        var_0_3D6 : int
        expr_3E0 : byte [generated]
        stack_410_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_30B : byte[]
        var_5_30C : int
        expr_CE : int [generated]
        expr_10F : int [generated]
        var_3_146 : String
        stack_287_0 : String[] [generated]
        expr_158 : String[] [generated]
        
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
        var_0_2B6 = and:int(ldc:int(-1550178842), ldc:int(-72372499))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CC_0 = stack_CE_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_2C9_0 = stack_31D_0 = stack_393_0 = stack_3E0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Zay/i4/5pK11s7Kw87Oqd7+uvb2yor3JoqiTgr+Lj6nQr7OAv4uPqebIv0aai6K3HbGxda+mhLvtsb+5rrBGsrKw46HXRr69tqix5KykTbKC6oqrTb2Lvqmivv+7unnzqbR0r6awraG4soC/i4+p5siMQ5y07ritfa+8grvN76yCd7aAv4uPqebIgE+Atqi97bK6RLKysOPB87Wekku+vbaowe+sgne2gL+Lj6nmyIBPgLaove2yukSysrDjwfOFxIGBd7aAv4uPqebIgE+Atqi97bK6RLKysOOhq323vuHRxo/EgYF3toC/i4+p5ti7Qpy9tqriobFBsrKw46HXRr69tqixxOqnbEKysrDzs6lprb+Lj/mkrXWzsrDzs6p3v669vbKivQkUCB4=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_292 = expr_6E:int
        var_3_297 = newarray:byte[](byte.class, expr_6E:int)
        var_5_298 = expr_6E:int
        Label_0666:
        
        while (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(64)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1770457919))
                goto(Label_0868)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(2147250416))
            var_5_298 = add:int(var_5_298:int, ldc:int(-1))
            expr_2C9 = loadelement:byte(stack_2C9_0:byte[], var_5_298:int)
            storeelement:byte(var_3_297:byte[], var_5_298:int, xor:int(or:int(and:int(shl:int(expr_2C9:byte, xor:int(ldc:int(4624), ldc:int(4628))), ldc:int(-16)), and:int(shr:int(expr_2C9:byte[expected:int], xor:int(ldc:int(66), ldc:int(70))), ldc:int(15))), ldc:int(81)))
            
            if (cmpne:boolean(var_5_298:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_2C9_0 = stack_31D_0 = stack_393_0 = stack_3E0_0 = var_3_297:byte[]
            goto(Label_0115)
        }
        
        var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1373766988))
        goto(Label_0962)
        Label_0868:
        
        while (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1978918691))
                goto(Label_0666)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(599685886))
            var_5_298 = add:int(var_5_298:int, ldc:int(-1))
            storeelement:byte(var_3_297:byte[], var_5_298:int, add:byte(loadelement:byte(stack_393_0:byte[], var_5_298:int), ldc:byte(85)))
            
            if (cmpne:boolean(var_5_298:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_2C9_0 = stack_31D_0 = stack_393_0 = stack_3E0_0 = var_3_297:byte[]
            goto(Label_0211)
        }
        
        var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1543282547))
        Label_0962:
        
        while (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0666)
            }
            
            var_0_3D6 = and:int(var_0_2B6:int, ldc:int(1070136045))
            var_5_298 = add:int(var_5_298:int, ldc:int(-1))
            expr_3E0 = loadelement:byte(stack_3E0_0:byte[], var_5_298:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_298:int, ldc:int(3)), neg:int(var_4_292:int)), ldc:int(0))) {
                var_0_3D6 = and:int(var_0_3D6:int, ldc:int(-1411895945))
                stack_410_2 = add:byte(expr_3E0:byte, ldc:byte(3))
            }
            else {
                stack_410_2 = add:byte(expr_3E0:byte, loadelement:byte(var_3_297:byte[], add:int(var_5_298:int, ldc:int(3))))
            }
            
            var_0_2B6 = and:int(var_0_3D6:int, ldc:int(-74875680))
            storeelement:byte(var_3_297:byte[], var_5_298:int, stack_410_2:byte)
            
            if (cmpne:boolean(var_5_298:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_2C9_0 = stack_31D_0 = stack_393_0 = stack_3E0_0 = var_3_297:byte[]
            goto(Label_0276)
        }
        
        goto(Label_0868)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(262144)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-355412670))
        }
        else {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-404949536))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_30B = newarray:byte[](byte.class, expr_A0:int)
                var_5_30C = expr_A0:int
                
                loop {
                    var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1545962242))
                    var_5_30C = add:int(var_5_30C:int, ldc:int(-1))
                    storeelement:byte(var_3_30B:byte[], var_5_30C:int, add:int(shl:int(loadelement:byte(stack_31D_0:byte[], var_5_30C:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_30C:int, xor:int(ldc:int(7200), ldc:int(7201)))), ldc:int(4)), and:int(ldc:int(559), ldc:int(7439)))))
                    
                    if (cmpne:boolean(var_5_30C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_2C9_0 = stack_31D_0 = stack_393_0 = stack_3E0_0 = var_3_30B:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(262144)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1971992672))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1054109))
            expr_CE = arraylength:int(stack_CE_0:byte[])
            
            if (cmpne:boolean(expr_CE:int, ldc:int(0))) {
                var_4_292 = expr_CE:int
                var_3_297 = newarray:byte[](byte.class, expr_CE:int)
                var_5_298 = expr_CE:int
                goto(Label_0868)
            }
        }
        
        Label_0211:
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(933959700))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1869048440))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(16384)), ldc:int(0))) {
                var_0_2B6 = and:int(var_0_2B6:int, ldc:int(1794323373))
                goto(Label_0115)
            }
            
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-1214465165))
            expr_10F = arraylength:int(stack_10F_0:byte[])
            
            if (cmpne:boolean(expr_10F:int, ldc:int(0))) {
                var_4_292 = expr_10F:int
                var_3_297 = newarray:byte[](byte.class, expr_10F:int)
                var_5_298 = expr_10F:int
                goto(Label_0962)
            }
        }
        
        Label_0276:
        
        if (cmpeq:boolean(and:int(var_0_2B6:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_2B6:int, ldc:int(512)), ldc:int(0))) {
            var_0_2B6 = and:int(var_0_2B6:int, ldc:int(-702106102))
            goto(Label_0115)
        }
        
        var_3_146 = initobject:String(String::<init>, stack_13A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_287_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4870), ldc:int(4877)))
        expr_158 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8479), ldc:int(22571)))
        storeelement:String(expr_158:String[], and:int(ldc:int(5601), ldc:int(26627)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(-17146), ldc:int(753)), and:int(ldc:int(1114), ldc:int(8218))))
        storeelement:String(expr_158:String[], and:int(ldc:int(11), ldc:int(2569)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(-31537), ldc:int(-31531)), xor:int(ldc:int(327), ldc:int(348))))
        storeelement:String(expr_158:String[], xor:int(ldc:int(-24054), ldc:int(-24050)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(24667), ldc:int(447)), and:int(ldc:int(3106), ldc:int(419))))
        storeelement:String(expr_158:String[], and:int(ldc:int(26904), ldc:int(-26969)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(8227), ldc:int(3106)), xor:int(ldc:int(1899), ldc:int(1794))))
        storeelement:String(expr_158:String[], xor:int(ldc:int(6791), ldc:int(6797)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(28781), ldc:int(2665)), xor:int(ldc:int(16558), ldc:int(16428))))
        storeelement:String(expr_158:String[], and:int(ldc:int(8776), ldc:int(5163)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(-32348), ldc:int(-32474)), and:int(ldc:int(16615), ldc:int(447))))
        storeelement:String(expr_158:String[], and:int(ldc:int(8326), ldc:int(16486)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(-28656), ldc:int(-28489)), and:int(ldc:int(1732), ldc:int(206))))
        storeelement:String(expr_158:String[], xor:int(ldc:int(2066), ldc:int(2069)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(252), ldc:int(12485)), xor:int(ldc:int(399), ldc:int(360))))
        storeelement:String(expr_158:String[], and:int(ldc:int(19), ldc:int(7683)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(134), ldc:int(97)), xor:int(ldc:int(1709), ldc:int(1959))))
        storeelement:String(expr_158:String[], xor:int(ldc:int(-24543), ldc:int(-24540)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(9674), ldc:int(2331)), xor:int(ldc:int(689), ldc:int(928))))
        storeelement:String(expr_158:String[], and:int(ldc:int(10254), ldc:int(5123)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(664), ldc:int(905)), xor:int(ldc:int(16531), ldc:int(16825))))
        putstatic:String[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u0c95\u12cb\u12b2\u64ab\u7049\u3e2a, expr_158:String[])
        putstatic:int[](\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae::\u8709\u16f6\u873d\u64ab\ubefe\uc31c, aconstnull:int[]())
    }
    
    public void \u5d20\uc910\ub8be\u120d\ud51e\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62C : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_637 : int
        
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
        var_3_62C = and:int(ldc:int(1491212104), ldc:int(-808570100))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\uc84e\u8bb0\u839e\u0b8e\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-1358262670))
        }
        else {
            var_3_62C = and:int(var_3_62C:int, ldc:int(1524869758))
            var_5_8A = and:int(ldc:int(-5618), ldc:int(4592))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8220), ldc:int(-8221)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_62C:int, ldc:int(-621070657))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(2049), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(20753), ldc:int(1057)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_62C = and:int(var_3_D9:int, ldc:int(2062697114))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(6405), ldc:int(9289)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1799248381))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(306337762))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-545890061))
                    }
                    else {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1254322108))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-641375146))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2143452827))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1632940552))
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-520409474))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-327827674))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-777195457))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1439036315))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-52732289))
                        var_11_EA = and:int(ldc:int(-20637), ldc:int(20636))
                        goto(Label_1445)
                    }
                    
                    Label_0582:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1893603845))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1143090953))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-370783432))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1081009674))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(926751410))
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-386166966))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0793:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-902635619))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(562263852))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(233507714))
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-712072929))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-119358339))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-572523846))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(1025), ldc:int(2089))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-528820485))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1110453099))
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1306939135))
                        var_11_EA = and:int(ldc:int(-2249), ldc:int(2248))
                    }
                    
                    Label_1058:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1710334162))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1972908023))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(181226069))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1338351434))
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-140967336))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-874350614))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1188:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1058)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-994524510))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-381403793))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-657323300))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1445)
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1318931135))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(470871648))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1839068987))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1212936836))
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(393422268))
                        loopcontinue()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-571310280))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1445:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_637 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1456:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1981945668))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1989592556))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1949753551))
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1796942862))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-186261054))
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1362799155))
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1593768904))
                        var_17_637 = add:int(var_16_118:int, xor:int(ldc:int(4165), ldc:int(4164)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62C = and:int(var_3_62C:int, ldc:int(-858845492))
                
                if (cmple:boolean(var_5_8A = var_17_637:int, sub:int(var_6_91:int, xor:int(ldc:int(24581), ldc:int(24580))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
