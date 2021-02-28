public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ucfaf\ubff1\u8aa5\u71f1\u6435 {
    public void \ucfaf\ubff1\u8aa5\u71f1\u6435() {
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
            invokespecial:Object(Object::<init>, this:\ucfaf\ubff1\u8aa5\u71f1\u6435)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static double[] \u7ce1\u8258\u4bc8\ud12e\uafe7(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_3_72 : double
        var_7_7F : double
        expr_88 : double[] [generated]
        expr_CC : double[] [generated]
        
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
        
        if (cmpne:boolean(p0:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
            var_3_72 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getfield:double(\ube23\u67d0\u64f2\u839e\u76bc::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, p0:\ube23\u67d0\u64f2\u839e\u76bc))
            var_7_7F = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getfield:double(\ube23\u67d0\u64f2\u839e\u76bc::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, p0:\ube23\u67d0\u64f2\u839e\u76bc))
            expr_88 = newarray:double[](double.class, and:int(ldc:int(9731), ldc:int(2115)))
            storeelement:double(expr_88:double[], and:int(ldc:int(-20869), ldc:int(20868)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), mul:double(var_3_72:double, ldc:double(2.0))))
            storeelement:double(expr_88:double[], and:int(ldc:int(1025), ldc:int(2145)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(0.0)))
            storeelement:double(expr_88:double[], and:int(ldc:int(12354), ldc:int(18738)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), mul:double(var_7_7F:double, ldc:double(2.0))))
            return:double[](expr_88:double[])
        }
        
        expr_CC = newarray:double[](double.class, xor:int(ldc:int(-20464), ldc:int(-20461)))
        storeelement:double(expr_CC:double[], and:int(ldc:int(23764), ldc:int(-24021)), ldc:double(0.0))
        storeelement:double(expr_CC:double[], and:int(ldc:int(17443), ldc:int(22)), storeelement:double(expr_CC:double[], xor:int(ldc:int(16640), ldc:int(16641)), ldc:double(0.0)))
        return:double[](expr_CC:double[])
    }
    
    public static double[] \uf9c5\u4ab3\u5bc4\ub171\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_3_72 : double
        var_7_7F : double
        expr_88 : double[] [generated]
        expr_DF : double[] [generated]
        
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
        
        if (cmpne:boolean(p0:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
            var_3_72 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getfield:double(\ube23\u67d0\u64f2\u839e\u76bc::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, p0:\ube23\u67d0\u64f2\u839e\u76bc))
            var_7_7F = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getfield:double(\ube23\u67d0\u64f2\u839e\u76bc::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, p0:\ube23\u67d0\u64f2\u839e\u76bc))
            expr_88 = newarray:double[](double.class, xor:int(ldc:int(-32736), ldc:int(-32733)))
            storeelement:double(expr_88:double[], and:int(ldc:int(-16048), ldc:int(11426)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), div:double(mul:double(var_3_72:double, i2d:double(invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub113\u960f\u4975\u74b1\ubcb0))), ldc:double(50.0))))
            storeelement:double(expr_88:double[], xor:int(ldc:int(17216), ldc:int(17217)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), div:double(mul:double(ldc:double(0.0), i2d:double(invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub113\u960f\u4975\u74b1\ubcb0))), ldc:double(50.0))))
            storeelement:double(expr_88:double[], and:int(ldc:int(10258), ldc:int(903)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), div:double(mul:double(var_7_7F:double, i2d:double(invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub113\u960f\u4975\u74b1\ubcb0))), ldc:double(50.0))))
            return:double[](expr_88:double[])
        }
        
        expr_DF = newarray:double[](double.class, and:int(ldc:int(4227), ldc:int(8247)))
        storeelement:double(expr_DF:double[], and:int(ldc:int(7584), ldc:int(-7587)), ldc:double(0.0))
        storeelement:double(expr_DF:double[], xor:int(ldc:int(3084), ldc:int(3086)), storeelement:double(expr_DF:double[], xor:int(ldc:int(20480), ldc:int(20481)), ldc:double(0.0)))
        return:double[](expr_DF:double[])
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
            putstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ucfaf\ubff1\u8aa5\u71f1\u6435::\u64ab\u7d52\u5f50\uc3e3\ubb2b, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uff55\u6c56\u16f6\u4f4a\ud523(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_630 : int
        
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
        var_3_625 = and:int(ldc:int(407540722), ldc:int(-1075347733))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucfaf\ubff1\u8aa5\u71f1\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-883228793))
            var_5_7D = and:int(ldc:int(-4722), ldc:int(4209))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11331), ldc:int(-28108)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(468445155))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(12294), ldc:int(12295)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(389), ldc:int(22073)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(1247969023))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(25537), ldc:int(25)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(350491314))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(391251469))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2065374147))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-375921672))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(762110728))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1695421774))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1248399899))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-313119355))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1788707516))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1560079435))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1340233663))
                        var_11_E3 = and:int(ldc:int(-31599), ldc:int(9038))
                        goto(Label_1455)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1882060976))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-587033127))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1532954305))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1027825049))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-956975921))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1675213195))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1352462125))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-545462534))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2002316466))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-647507973))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1334104584))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1206158978))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1574438743))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1140259191))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1903882129))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-549746037))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-493736519))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1351579945))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(2310), ldc:int(2311))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1396172847))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-435680451))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-820361861))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-473161632))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-353791573))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1516247758))
                        var_11_E3 = and:int(ldc:int(-3738), ldc:int(2713))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2008811207))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1573837379))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1079287202))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-401938051))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1815317518))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1281636566))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1016093375))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1446042994))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-269113084))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1738408898))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1910112659))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1544400337))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-926679366))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1346597435))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(367284197))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-630481640))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1456014624))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1083689105))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-1678429462))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1068536350))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1499124435))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(397887425))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1842044884))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-851177522))
                        var_17_630 = add:int(var_16_111:int, and:int(ldc:int(11329), ldc:int(20537)))
                        looporswitchbreak()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(811081892))
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-54270325))
                
                if (cmple:boolean(var_5_7D = var_17_630:int, sub:int(var_6_84:int, xor:int(ldc:int(-32752), ldc:int(-32751))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-745296643))
            goto(Label_0106)
        }
    }
}
