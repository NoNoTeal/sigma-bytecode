public class \u36d3\u9033\u6b0d\u983f\u8d90.\ubefe\u0a06\ub19c\ubff1\uff55\u6b0d {
    public void \ubefe\u0a06\ub19c\ubff1\uff55\u6b0d() {
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
            invokespecial:Object(Object::<init>, this:\ubefe\u0a06\ub19c\ubff1\uff55\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c \ucef1\u718f\uff55\u4daf\u47c2\u8cae(java.lang.String p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c[] p1) {
        var_4_70 : int
        var_5_98 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        
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
        
        if (cmpne:boolean(p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]())) {
            var_4_70 = and:int(ldc:int(-20247), ldc:int(19734))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]))) {
                var_5_98 = loadelement:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], var_4_70:int)
                
                if (invokevirtual:boolean(String::equals, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\uc2e8\u5654\u4daf\u4ab3\u7ce1\u385b, var_5_98:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), p0:String[expected:Object])) {
                    return:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(var_5_98:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                }
                
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c())
        }
        
        return:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c())
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u9a18\u98a4\u7873\uc910\ub83f\u4c04 \u5f50\ube23\ubefe\ud171\u7ce1\u446c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u9a18\u98a4\u7873\uc910\ub83f\u4c04[] p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c[] p1, boolean p2) {
        var_5_70 : int
        var_6_98 : \u9a18\u98a4\u7873\uc910\ub83f\u4c04
        
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
        
        if (cmpne:boolean(p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04[], aconstnull:\u9a18\u98a4\u7873\uc910\ub83f\u4c04[]())) {
            var_5_70 = and:int(ldc:int(27147), ldc:int(-27152))
            
            while (cmplt:boolean(var_5_70:int, arraylength:int(p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04[]))) {
                var_6_98 = loadelement:\u9a18\u98a4\u7873\uc910\ub83f\u4c04(p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04[], var_5_70:int)
                
                if (invokestatic:boolean(\ubefe\u0a06\ub19c\ubff1\uff55\u6b0d::\ua61f\u836c\u7043\u7d52\uc246\ud158, var_6_98:\u9a18\u98a4\u7873\uc910\ub83f\u4c04, p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], p2:boolean)) {
                    return:\u9a18\u98a4\u7873\uc910\ub83f\u4c04(var_6_98:\u9a18\u98a4\u7873\uc910\ub83f\u4c04)
                }
                
                inc:int(var_5_70, ldc:int(1))
            }
            
            return:\u9a18\u98a4\u7873\uc910\ub83f\u4c04(aconstnull:\u9a18\u98a4\u7873\uc910\ub83f\u4c04())
        }
        
        return:\u9a18\u98a4\u7873\uc910\ub83f\u4c04(aconstnull:\u9a18\u98a4\u7873\uc910\ub83f\u4c04())
    }
    
    public static boolean \ua61f\u836c\u7043\u7d52\uc246\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u9a18\u98a4\u7873\uc910\ub83f\u4c04 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c[] p1, boolean p2) {
        var_3_6F : int
        var_5_8C : String[]
        var_6_95 : int
        var_7_DA : String
        var_8_E2 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        
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
        var_3_6F = and:int(ldc:int(2079284135), ldc:int(-605028761))
        
        if (cmpeq:boolean(p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04, aconstnull:\u9a18\u98a4\u7873\uc910\ub83f\u4c04())) {
            return:boolean(and:int[expected:boolean](ldc:int(93), ldc:int(-254)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_3_6F:int, ldc:int(65536)), ldc:int(0))) {
                var_3_6F = and:int(var_3_6F:int, ldc:int(-739247250))
                
                if (cmpeq:boolean(p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]())) {
                    return:boolean(and:int[expected:boolean](ldc:int(-2270), ldc:int(2252)))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_6F:int, ldc:int(65536)), ldc:int(0))) {
                var_5_8C = invokevirtual:String[](\u9a18\u98a4\u7873\uc910\ub83f\u4c04::\ub83f\u3776\u7c6b\uc3e3\u71ae\u983f, p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04)
                var_6_95 = and:int(ldc:int(16008), ldc:int(-16009))
                
                while (cmplt:boolean(var_6_95:int, arraylength:int(var_5_8C:String[]))) {
                    var_7_DA = loadelement:String(var_5_8C:String[], var_6_95:int)
                    var_8_E2 = invokestatic:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(\ubefe\u0a06\ub19c\ubff1\uff55\u6b0d::\ucef1\u718f\uff55\u4daf\u47c2\u8cae, var_7_DA:String, p1:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[])
                    
                    if (logicaland:boolean(cmpne:boolean(var_8_E2:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c()), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::equals, ternaryop:String(p2:boolean, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u52d3\ub18d\u8c8a\uc246\u12cb\uf995, var_8_E2:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ua6bd\u7c6b\u946b\u7c6b\u9255\u6b5f, var_8_E2:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)), invokevirtual:String[expected:Object](\u9a18\u98a4\u7873\uc910\ub83f\u4c04::\u47c2\u7330\u59ec\u3776\u67d0\ud171, p0:\u9a18\u98a4\u7873\uc910\ub83f\u4c04, var_7_DA:String))))) {
                        return:boolean(and:int[expected:boolean](ldc:int(17416), ldc:int(-17417)))
                    }
                    
                    inc:int(var_6_95, ldc:int(1))
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(332), ldc:int(333)))
            }
            
            var_3_6F = and:int(var_3_6F:int, ldc:int(1651166261))
        }
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud7e8\u6cfe\u40a9\u64f2\uc87f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_635 : int
        
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
        var_3_62A = and:int(ldc:int(-1374377366), ldc:int(-17503250))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubefe\u0a06\ub19c\ubff1\uff55\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_62A = and:int(var_3_62A:int, ldc:int(-50931075))
            var_5_7D = and:int(ldc:int(21329), ldc:int(-29522))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11060), ldc:int(-15157)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62A:int, ldc:int(-1522545944))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(4885)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20541), ldc:int(2049)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62A = and:int(var_3_D2:int, ldc:int(-197858563))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8458), ldc:int(8459)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(958515124))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1708697499))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(127773993))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-131794772))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1221208564))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1882595049))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(309675456))
                    }
                    else {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1541615623))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(655510987))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1119970578))
                            var_11_E3 = and:int(ldc:int(-3897), ldc:int(3888))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-100695997))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(235776453))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-735780031))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(402496816))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1326338560))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1446568333))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1363878274))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1026073144))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-387054253))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-346820376))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(995167853))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(697997992))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(551267501))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1801183146))
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-25765141))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1579989882))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(818333183))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(228333766))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(1692450695))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(993937721))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(566620442))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1132991748))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(31793), ldc:int(515))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-208248657))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-810272860))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-630288885))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(8205299))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1523134609))
                        var_11_E3 = and:int(ldc:int(16957), ldc:int(-16958))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1339324777))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-1151243469))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(1708426505))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-859811513))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-180512005))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1285636257))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1388895128))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-187472226))
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(307253751))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-575682826))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-348717270))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62A = and:int(var_3_62A:int, ldc:int(-279597061))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1332:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1241077810))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(322475497))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-25806576))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1131756006))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1824675356))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62A = and:int(var_3_62A:int, ldc:int(-1221092629))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_635 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1475345716))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1827294434))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(1914266561))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-1729757383))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62A = and:int(var_3_62A:int, ldc:int(-272830467))
                        var_17_635 = add:int(var_16_111:int, and:int(ldc:int(24641), ldc:int(4369)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62A = and:int(var_3_62A:int, ldc:int(-1484875009))
                
                if (cmple:boolean(var_5_7D = var_17_635:int, sub:int(var_6_84:int, xor:int(ldc:int(320), ldc:int(321))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_62A:int, ldc:int(512)), ldc:int(0))) {
            var_3_62A = and:int(var_3_62A:int, ldc:int(15201466))
            goto(Label_0106)
        }
    }
}
