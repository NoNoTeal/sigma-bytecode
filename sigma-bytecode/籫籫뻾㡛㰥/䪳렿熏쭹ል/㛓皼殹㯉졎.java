public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u36d3\u76bc\u6bb9\u3bc9\uc84e {
    public void \u36d3\u76bc\u6bb9\u3bc9\uc84e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ucfaf\u12cb\ud523\u7c6b\uc910 p0) {
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
            invokespecial:\ua61f\u946b\u9033\u7043\u446c(\ua61f\u946b\u9033\u7043\u446c::<init>, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e, p0:\ucfaf\u12cb\ud523\u7c6b\uc910[expected:\u4c2b\ub8be\u839e\u71ae\uf9c5], ldc:double(1.0), xor:int[expected:boolean](ldc:int(3), ldc:int(2)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        stack_97_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(225750295), ldc:int(-705299617))
            
            if (logicaland:boolean(invokespecial:boolean(\ua61f\u946b\u9033\u7043\u446c::\u62da\u0b8e\u5f50\u718f\u7ce1\ud523, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e[expected:\ua61f\u946b\u9033\u7043\u446c]), logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8709\u9033\ubff1\u4ab3\u960f\u93a2, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u36d3\u76bc\u6bb9\u3bc9\uc84e::\u16f6\u392e\u3776\u64f2\u9937\u47c2, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e))))) {
                stack_97_0 = and:int(ldc:int(2061), ldc:int(16417))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1320578103))
                stack_97_0 = and:int(ldc:int(17266), ldc:int(-30579))
            }
            
            return:boolean(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
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
        
        if (logicaland:boolean(cmpge:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u5bc4\ud217\uf995\ud12e\ub171\ud158, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u36d3\u76bc\u6bb9\u3bc9\uc84e::\u16f6\u392e\u3776\u64f2\u9937\u47c2, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e)), ldc:float(0.5f)), cmpeq:boolean(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u36d3\u76bc\u6bb9\u3bc9\uc84e::\u16f6\u392e\u3776\u64f2\u9937\u47c2, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e)), ldc:int(100)), ldc:int(0)))) {
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\uc84e\u1187\u6cfe\ubf56\u1187\u836c, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u36d3\u76bc\u6bb9\u3bc9\uc84e::\u16f6\u392e\u3776\u64f2\u9937\u47c2, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e), checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()))
            return:boolean(and:int[expected:boolean](ldc:int(-23260), ldc:int(21083)))
        }
        
        return:boolean(invokespecial:boolean(\ua61f\u946b\u9033\u7043\u446c::\u3d4b\u0b8e\u61a4\u12b2\uff55\u965f, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e[expected:\ua61f\u946b\u9033\u7043\u446c]))
    }
    
    public double \uc9f6\u6198\u3bc9\u4daf\u624e\u6198(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:double(f2d:double(add:float(ldc:float(4.0f), invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u36d3\u4c2b\u839e\u071d\ua068\ud217, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))))
        }
        
        goto(Label_0006)
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_625 = and:int(ldc:int(278628325), ldc:int(912217318))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u36d3\u76bc\u6bb9\u3bc9\uc84e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-1617179281))
            var_5_7D = and:int(ldc:int(-6593), ldc:int(6592))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11792), ldc:int(-11793)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(-587528730))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-24576), ldc:int(-24575)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12), ldc:int(13)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(-1096871945))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5), ldc:int(4361)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1318718750))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1159926717))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1450793543))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1850340741))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(419350891))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1131443696))
                    }
                    else {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1866740490))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1775629377))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1885906295))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(579932943))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1442811004))
                            var_11_E3 = and:int(ldc:int(-5362), ldc:int(5361))
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1500646575))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1170050902))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-503293389))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1204939389))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1130123787))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1774490242))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(576582967))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(613275347))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1044386394))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(975136237))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(915364283))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1086971512))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1101000093))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-182481859))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-932488318))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(2054893438))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(4133), ldc:int(19713))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1598848805))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1051160243))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-937294693))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1418133391))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(382478744))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1814350338))
                        var_11_E3 = and:int(ldc:int(14659), ldc:int(-14660))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1594219091))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-358174762))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1137917040))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(27422910))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-44321300))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1891040547))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-374325606))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1654681817))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1196112813))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-396893265))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1723018099))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2076074208))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1688254475))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1447)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1338671937))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1139184294))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1576976129))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1144916999))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(945006972))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(766118346))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-801176468))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2012277093))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1317583038))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1535286964))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1713014566))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1092474973))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-644233587))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2021644021))
                        var_17_630 = add:int(var_16_111:int, and:int(ldc:int(131), ldc:int(1065)))
                        looporswitchbreak()
                    }
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-620763667))
                
                if (cmple:boolean(var_5_7D = var_17_630:int, sub:int(var_6_84:int, xor:int(ldc:int(-32752), ldc:int(-32751))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-1465075353))
            goto(Label_0106)
        }
    }
}
