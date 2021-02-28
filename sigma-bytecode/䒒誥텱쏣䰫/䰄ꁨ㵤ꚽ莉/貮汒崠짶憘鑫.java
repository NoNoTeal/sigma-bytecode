public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8cae\u6c52\u5d20\uc9f6\u6198\u946b {
    public void \u8cae\u6c52\u5d20\uc9f6\u6198\u946b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u527a\u873d\u071d\u4f52\uc229\ud217 p0) {
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
            invokespecial:Object(Object::<init>, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b)
            putfield:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\ucfaf\u4975\u51fa\u0b8e\u6fb0\u1833, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, ldc:int(-1))
            putfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u8d98\u494c\ud171\u3776\uc29a\u3711, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, p0:\u527a\u873d\u071d\u4f52\uc229\ud217)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\u759a\ud7e8\ub171\u7c6b\u5245(int p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
        
        if (logicaland:boolean(cmpeq:boolean(getfield:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\ucfaf\u4975\u51fa\u0b8e\u6fb0\u1833, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), p0:int), cmpne:boolean(getfield:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3d4b\uc246\uc84e\uceb8\u92ee\uf995, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), aconstnull:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>()))) {
            invokeinterface:void(Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>::accept, getfield:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3d4b\uc246\uc84e\uceb8\u92ee\uf995, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), p1:\uc31c\uc87f\uc246\u3776\ub7dc)
            putfield:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3d4b\uc246\uc84e\uceb8\u92ee\uf995, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, aconstnull:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>())
            return:boolean(and:int[expected:boolean](ldc:int(7555), ldc:int(609)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-2099), ldc:int(2098)))
    }
    
    private int \u3504\u4c2b\u3711\u97b7\u1187\u7006(java.util.function.Consumer<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> p0) {
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
            putfield:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3d4b\uc246\uc84e\uceb8\u92ee\uf995, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, p0:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>)
            return:int(putfield:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\ucfaf\u4975\u51fa\u0b8e\u6fb0\u1833, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, add:int(getfield:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\ucfaf\u4975\u51fa\u0b8e\u6fb0\u1833, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), and:int(ldc:int(13641), ldc:int(643)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u7873\ud171\u64f2\u647c\u92ee(int p0, java.util.function.Consumer<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> p1) {
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
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u8d98\u494c\ud171\u3776\uc29a\u3711, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), initobject:\u7bad\u5140\uc2bd\u718f\u7330[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u7bad\u5140\uc2bd\u718f\u7330::<init>, invokespecial:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3504\u4c2b\u3711\u97b7\u1187\u7006, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, p1:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>), p0:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u183a\u2dcc\u71ae\ub32d\ud171\uc9f6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, java.util.function.Consumer<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> p1) {
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
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u8d98\u494c\ud171\u3776\uc29a\u3711, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b), initobject:\u6d69\u836c\u4f52\ub18d\u93a2[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u6d69\u836c\u4f52\ub18d\u93a2::<init>, invokespecial:int(\u8cae\u6c52\u5d20\uc9f6\u6198\u946b::\u3504\u4c2b\u3711\u97b7\u1187\u7006, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b, p1:Consumer<\uc31c\uc87f\uc246\u3776\ub7dc>), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            return:void()
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
    
    public void \u7006\u4179\u72f1\u4d85\u3a62\ub18d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5D8 : int
        
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
        var_3_5CD = and:int(ldc:int(-195782422), ldc:int(-1109471008))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8cae\u6c52\u5d20\uc9f6\u6198\u946b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-162358294))
            var_5_7D = and:int(ldc:int(-31769), ldc:int(27672))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16209), ldc:int(4944)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5CD:int, ldc:int(-1269581879))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(17184), ldc:int(17185)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(384), ldc:int(385)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_CA:int, ldc:int(-1101941807))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(9), ldc:int(1623)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1019658273))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(742962705))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(289770452))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-732895694))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1529094713))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(220360161))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1600674470))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1269630519))
                            var_11_DB = and:int(ldc:int(9120), ldc:int(-9125))
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(522372809))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1166712003))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1772960472))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(217430882))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1238241394))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(538783652))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1098998552))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-754660147))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1581955783))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1342193980))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1212653058))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(624265115))
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1939187660))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(884578776))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1691360708))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1504266536))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(2188), ldc:int(2189))
                                goto(Label_1011)
                            }
                        }
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1311681810))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1988494030))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-140399657))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-555298677))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-313205779))
                        var_11_DB = and:int(ldc:int(-30720), ldc:int(5703))
                    }
                    
                    Label_1011:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1925168579))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-33962215))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1168415763))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-406637493))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(362271992))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-420228901))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1008083505))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1954949997))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1011)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(2092767143))
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2142090682))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(2143674438))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1101161776))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-692214199))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(113860765))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-452578933))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1208222968))
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-178807825))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(791427130))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1748911364))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1992491913))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1267090490))
                        var_17_5D8 = add:int(var_16_109:int, and:int(ldc:int(1169), ldc:int(21059)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1403146044))
                
                if (cmple:boolean(var_5_7D = var_17_5D8:int, sub:int(var_6_84:int, xor:int(ldc:int(12448), ldc:int(12449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
