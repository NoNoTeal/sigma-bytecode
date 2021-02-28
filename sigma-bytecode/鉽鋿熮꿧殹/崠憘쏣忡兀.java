public final class \u927d\u92ff\u71ae\uafe7\u6bb9.\u5d20\u6198\uc3e3\u5fe1\u5140 {
    public void \u5d20\u6198\uc3e3\u5fe1\u5140(int p0, float p1) {
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
            invokespecial:Object(Object::<init>, this:\u5d20\u6198\uc3e3\u5fe1\u5140)
            putfield:int(\u5d20\u6198\uc3e3\u5fe1\u5140::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, this:\u5d20\u6198\uc3e3\u5fe1\u5140, p0:int)
            putfield:float(\u5d20\u6198\uc3e3\u5fe1\u5140::\ub19c\u76bc\u183a\u416d\ucfaf\u8709, this:\u5d20\u6198\uc3e3\u5fe1\u5140, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ub113\u5fe1\u8bb0\u62da\u67d0\ud217(java.util.Random p0) {
        var_2_7D : int
        var_4_67 : int
        var_5_70 : int
        
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
            var_2_7D = and:int(ldc:int(1421973483), ldc:int(1914876943))
            var_4_67 = and:int(ldc:int(-9134), ldc:int(9133))
            var_5_70 = and:int(ldc:int(28740), ldc:int(-28741))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_7D = and:int(var_2_7D:int, ldc:int(-695664785))
                    
                    if (cmplt:boolean(var_5_70:int, getfield:int(\u5d20\u6198\uc3e3\u5fe1\u5140::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, this:\u5d20\u6198\uc3e3\u5fe1\u5140))) {
                        if (cmplt:boolean(invokevirtual:float(Random::nextFloat, p0:Random), getfield:float(\u5d20\u6198\uc3e3\u5fe1\u5140::\ub19c\u76bc\u183a\u416d\ucfaf\u8709, this:\u5d20\u6198\uc3e3\u5fe1\u5140))) {
                            inc:int(var_4_67, ldc:int(1))
                        }
                        
                        var_2_7D = and:int(var_2_7D:int, ldc:int(-16059365))
                        inc:int(var_5_70, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_7D = and:int(var_2_7D:int, ldc:int(-342710951))
            }
            
            return:int(var_4_67:int)
        }
        
        goto(Label_0006)
    }
    
    public static \u927d\u92ff\u71ae\uafe7\u6bb9.\u5d20\u6198\uc3e3\u5fe1\u5140 \u385b\u97b7\ud7e8\u51b2\u3d4b\u3c25(int p0, float p1) {
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
            return:\u5d20\u6198\uc3e3\u5fe1\u5140(initobject:\u5d20\u6198\uc3e3\u5fe1\u5140(\u5d20\u6198\uc3e3\u5fe1\u5140::<init>, p0:int, p1:float))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u983f\u7ce1\ub113\uc4d2\u718f\u7006() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u5d20\u6198\uc3e3\u5fe1\u5140::\ufcaf\u97e6\uc7fe\u8389\u527a\ud51e))
        }
        
        goto(Label_0006)
    }
    
    public static int \u3a62\u7049\uc29a\u3776\u4e72\u92ee(\u927d\u92ff\u71ae\uafe7\u6bb9.\u5d20\u6198\uc3e3\u5fe1\u5140 p0) {
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
            return:int(getfield:int(\u5d20\u6198\uc3e3\u5fe1\u5140::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:\u5d20\u6198\uc3e3\u5fe1\u5140))
        }
        
        goto(Label_0006)
    }
    
    public static float \u8389\u64f2\u6ec6\u8413\ubded\ucef1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u5d20\u6198\uc3e3\u5fe1\u5140 p0) {
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
            return:float(getfield:float(\u5d20\u6198\uc3e3\u5fe1\u5140::\ub19c\u76bc\u183a\u416d\ucfaf\u8709, p0:\u5d20\u6198\uc3e3\u5fe1\u5140))
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
    
    public void \uafe7\ub6ab\uf94d\u98a4\u7006\uae5d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(358021691), ldc:int(-1745159121))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\u6198\uc3e3\u5fe1\u5140[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1977613547))
            var_5_7D = and:int(ldc:int(25852), ldc:int(-26109))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4469), ldc:int(-4470)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(-1212220609))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(17411), ldc:int(17410)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(2160), ldc:int(2161)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(-1642136786))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(132), ldc:int(133)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1348629360))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-129882240))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-13194367))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(601772640))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-835661632))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2098405464))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1830462276))
                    }
                    else {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1218709254))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1414468653))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1373457154))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(534510378))
                            var_11_DB = and:int(ldc:int(760), ldc:int(-4857))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1743746645))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(647643578))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-579766707))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-234199375))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1458721385))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2144795182))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1160972351))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(239596795))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1201927209))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-596948716))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-71904418))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1238172033))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1214470704))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1367146349))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1139871825))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1479820229))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(376355849))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1054801471))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(9617), ldc:int(1))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-874859702))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(633075624))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-739206550))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1431445292))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1648699466))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-329442276))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(536541246))
                        var_11_DB = and:int(ldc:int(12334), ldc:int(-12399))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1387208441))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-71655815))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(398728061))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(322605623))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-980796936))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-874459643))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(914028650))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1133526365))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(782797265))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-676070021))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(838011532))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1709178899))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(11500735))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-936137288))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-279316650))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-736690257))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1949497915))
                        var_17_5F8 = add:int(var_16_109:int, and:int(ldc:int(1665), ldc:int(12385)))
                        looporswitchbreak()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(1164360267))
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1801717138))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, xor:int(ldc:int(16482), ldc:int(16483))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
