public class \u6435\ub8be\u718f\u6b0d\u67e9.\uc87f\uae87\ud51e\uae87\u983f {
    public void \uc87f\uae87\ud51e\uae87\u983f(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:\ud7e8\u9937\u4c04\ub1b9\ub19c(\ud7e8\u9937\u4c04\ub1b9\ub19c::<init>, this:\uc87f\uae87\ud51e\uae87\u983f, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, p4:int, p5:int, getstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u5140\u88c5\uf9c5\u40a9\u7873))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_2_B8 : int
        
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
        var_2_B8 = and:int(ldc:int(530231517), ldc:int(-100680209))
        
        if (cmpne:boolean(p0:float, ldc:float(0.0f))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(779240138))
                    goto(Label_0255)
                }
                
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0206)
                }
                
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(-18957971))
                    
                    if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u600f\u8413\u983f\u839e, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])) {
                        if (logicalnot:boolean(invokevirtual:boolean(\uafe7\u72f1\u7e3f\uc238\u34df::\uc84e\u983f\ubefe\u1187\ubefe, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\uafe7\u72f1\u7e3f\uc238\u34df]))) {
                            goto(Label_0206)
                        }
                        
                        looporswitchbreak()
                    }
                }
                
                Label_0143:
                
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(2130851074))
                    goto(Label_0255)
                }
                
                if (cmpne:boolean(and:int(var_2_B8:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_B8 = and:int(var_2_B8:int, ldc:int(-323128203))
                        loopcontinue()
                    }
                    
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(-1694516391))
                    looporswitchbreak()
                }
                
                Label_0206:
                
                if (cmpne:boolean(and:int(var_2_B8:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(-244566024))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_B8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0143)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_B8:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_B8 = and:int(var_2_B8:int, ldc:int(1774574751))
                        loopcontinue()
                    }
                    
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(968620281))
                    
                    if (invokevirtual:boolean(\uafe7\u72f1\u7e3f\uc238\u34df::\u8aa5\u8d90\u5bc4\u3504\u16f6, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\uafe7\u72f1\u7e3f\uc238\u34df])) {
                        looporswitchbreak()
                    }
                }
                
                Label_0255:
                
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(832232313))
                    goto(Label_0206)
                }
                
                if (cmpeq:boolean(and:int(var_2_B8:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0143)
                }
                
                if (cmpne:boolean(and:int(var_2_B8:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_B8 = and:int(var_2_B8:int, ldc:int(-1126713777))
                    invokestatic:float(Math::max, mul:float(p0:float, getfield:float(\uc87f\uae87\ud51e\uae87\u983f::\ube23\u4ab3\u67e9\ud36e\ub18d, this:\uc87f\uae87\ud51e\uae87\u983f)), ldc:float(0.0f))
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u4d85\ucef1\u8640\ub102\u5db4\u64ab, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(5.0f), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\u4c04\u6b0d\u61a4\u6435\u71ae::\ub1b9\uae87\uae5d\ua068\u647c\uc84e, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u7330\u7bad\u6bb9\u416d\ub171, this:\uc87f\uae87\ud51e\uae87\u983f)), p0:float))
            
            if (cmpne:boolean(invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), aconstnull:String())) {
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, invokevirtual:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u12cb\u93a2\ubf56\uc229\u8d90::\u5db4\u927d\u92ee\u4c04\ua3b4, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), xor:int(ldc:int(16905), ldc:int(16907))))), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), xor:int(ldc:int(-31997), ldc:int(-31999))))), invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\u4c04\u6b0d\u61a4\u6435\u71ae::\u34df\u5245\u61a4\u4ab3\u9255\u97b7, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u7330\u7bad\u6bb9\u416d\ub171, this:\uc87f\uae87\ud51e\uae87\u983f)), p0:float), invokevirtual:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4c04\u6b0d\u61a4\u6435\u71ae::\u839e\u6d69\u7d52\u88c5\ub32d\u47c2, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u7330\u7bad\u6bb9\u416d\ub171, this:\uc87f\uae87\ud51e\uae87\u983f)), invokevirtual:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4c04\u6b0d\u61a4\u6435\u71ae::\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u7330\u7bad\u6bb9\u416d\ub171, this:\uc87f\uae87\ud51e\uae87\u983f)))
            }
            
            invokestatic:void(GL11::glPushMatrix)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u4e72\ubcb0\u6d99\u8aa5\uc2e8, this:\uc87f\uae87\ud51e\uae87\u983f[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            invokestatic:void(GL11::glPopMatrix)
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
            putstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\uc87f\uae87\ud51e\uae87\u983f::\u5140\u88c5\uf9c5\u40a9\u7873, initobject:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::<init>, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u67e9\u624e\u7043\u4c2b\ubf56)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\ucef1\u516c\u3a62\ubcb0, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u67e9\u624e\u7043\u4c2b\ubf56)), ldc:float(0.1f))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(-1213682738), ldc:int(-81592757))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\uae87\ud51e\uae87\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-2045319198))
        }
        else {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1103459778))
            var_5_85 = and:int(ldc:int(-2480), ldc:int(2447))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10836), ldc:int(-10838)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_641:int, ldc:int(-1242051994))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2065), ldc:int(12329)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1489), ldc:int(26637)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D2:int, ldc:int(-1258824835))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-23488), ldc:int(-23487)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-569832494))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2005293949))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(730366909))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(491763697))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1163861999))
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-864649971))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-581821334))
                    }
                    else {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1179722885))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1258437881))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1358909603))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1909261409))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(782262855))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1288213553))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-131863733))
                        var_11_E3 = and:int(ldc:int(-11620), ldc:int(8483))
                        goto(Label_1484)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1629186446))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1350536468))
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1670669632))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1971091165))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(812756558))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1009359449))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1403861155))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1990221108))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1959819524))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(921472687))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(901414850))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(8026986))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(711027279))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1526098691))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1850406073))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1843282038))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(2133564322))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(523), ldc:int(6305))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1613144987))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(933081838))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(207206521))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1128254012))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(871164577))
                        var_11_E3 = and:int(ldc:int(-1959), ldc:int(1958))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2007693476))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(930744679))
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2042000259))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1761205057))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1334186211))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-494988987))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1676423238))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-637153521))
                            goto(Label_0948)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1065895394))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2047010351))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1745794774))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(939364188))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1484)
                    }
                    
                    Label_1363:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(500921621))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(713012018))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(656349439))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(1059233405))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(402389087))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1314241029))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-424801798))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-93021265))
                        var_17_64C = add:int(var_16_111:int, xor:int(ldc:int(264), ldc:int(265)))
                        looporswitchbreak()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(-1923086544))
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(1911675404))
                
                if (cmple:boolean(var_5_85 = var_17_64C:int, sub:int(var_6_8C:int, xor:int(ldc:int(30720), ldc:int(30721))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
