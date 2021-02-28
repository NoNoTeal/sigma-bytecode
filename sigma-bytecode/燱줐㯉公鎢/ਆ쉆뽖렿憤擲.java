public class \u71f1\uc910\u3bc9\u516c\u93a2.\u0a06\uc246\ubf56\ub83f\u61a4\u64f2 {
    public void \u0a06\uc246\ubf56\ub83f\u61a4\u64f2(float p0, float p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e p2) {
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
            invokespecial:Object(Object::<init>, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2)
            putfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u7873\u0c95\u4bc8\u946b\u7ce1\ud217, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2, p0:float)
            putfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u760c\u6b5f\ucb79\u6fb0\ubefe\u4f52, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2, p1:float)
            putfield:\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u36d3\ud7e8\u6435\u3e2a\uc229\u36d3, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2, p2:\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u92ee\uc238\u6198\u392e\u5d20\u3bc9(float p0, float p1) {
        var_5_66 : float
        var_6_6E : float
        
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
            var_5_66 = sub:float(p0:float, getfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u7873\u0c95\u4bc8\u946b\u7ce1\ud217, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2))
            var_6_6E = sub:float(p1:float, getfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u760c\u6b5f\ucb79\u6fb0\ubefe\u4f52, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2))
            return:float(add:float(mul:float(var_5_66:float, var_5_66:float), mul:float(var_6_6E:float, var_6_6E:float)))
        }
        
        goto(Label_0006)
    }
    
    public float \u8413\u3711\u9255\uf94d\u7bad\u446c() {
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
            return:float(getfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u7873\u0c95\u4bc8\u946b\u7ce1\ud217, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public float \ub32d\u7043\ubded\u120d\u416d\u7330() {
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
            return:float(getfield:float(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u760c\u6b5f\ucb79\u6fb0\ubefe\u4f52, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public \u6b0d\u12cb\u156b\u4179\u8bb0.\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e \u7bad\u647c\u67d0\uf94d\ub70c\u9a18() {
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
            return:\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e(getfield:\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e(\u0a06\uc246\ubf56\ub83f\u61a4\u64f2::\u36d3\ud7e8\u6435\u3e2a\uc229\u36d3, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2))
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
    
    public void \ubf56\u600f\u3c25\ua068\ubcb0\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_595 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5A0 : int
        
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
        var_3_595 = and:int(ldc:int(114406480), ldc:int(1850867578))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\uc246\ubf56\ub83f\u61a4\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_595 = and:int(var_3_595:int, ldc:int(-948620039))
            var_5_7D = and:int(ldc:int(22863), ldc:int(-32112))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3377), ldc:int(-3378)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_595:int, ldc:int(1464988755))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(101), ldc:int(19473)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16659), ldc:int(3621)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_595 = and:int(var_3_D2:int, ldc:int(-1219004801))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(3393), ldc:int(129)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1128800776))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1911228582))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-2110239463))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(217531514))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1290489696))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(919827963))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1741964879))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(494846562))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1550210206))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(816087335))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(170980507))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1201560826))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(128)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(1687518292))
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(509457874))
                        var_11_E3 = and:int(ldc:int(8235), ldc:int(-8236))
                        goto(Label_1343)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1440083638))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1395387400))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-1946634137))
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1610776814))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(600830018))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1042153765))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1361480550))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-1548197845))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-74222438))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-938964167))
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1485736624))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(17), ldc:int(7201))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1055997471))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-2089466946))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(157981294))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1495419085))
                        var_11_E3 = and:int(ldc:int(22546), ldc:int(-22547))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(729111259))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-1389208084))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-1756994134))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-2138985710))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-737672881))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1210239524))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1236)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(-1065106370))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_595:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_595 = and:int(var_3_595:int, ldc:int(2122053594))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1343)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(1310912981))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1988338267))
                        loopcontinue()
                    }
                    
                    var_3_595 = and:int(var_3_595:int, ldc:int(-539674829))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1343:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5A0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1354:
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(950298273))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_595:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_595 = and:int(var_3_595:int, ldc:int(-1218576592))
                        var_17_5A0 = add:int(var_16_111:int, and:int(ldc:int(18641), ldc:int(5125)))
                        looporswitchbreak()
                    }
                }
                
                var_3_595 = and:int(var_3_595:int, ldc:int(930184946))
                
                if (cmple:boolean(var_5_7D = var_17_5A0:int, sub:int(var_6_84:int, and:int(ldc:int(2055), ldc:int(9497))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_595:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_595 = and:int(var_3_595:int, ldc:int(-1489265688))
            goto(Label_0106)
        }
    }
}
