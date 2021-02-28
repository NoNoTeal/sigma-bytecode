public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ubf56\u6435\u156b\u3e2a\ub19c\u51b2 {
    public void \ubf56\u6435\u156b\u3e2a\ub19c\u51b2(\ub113\uc4d2\u183a\u527a\u6435.\u8308\u3d4b\u3e75\u64ab\ube23\ub113[] p0) {
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
            invokespecial:Object(Object::<init>, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2)
            putfield:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[](\ubf56\u6435\u156b\u3e2a\ub19c\u51b2::\u527a\u8aa5\u647c\u7049\u7330\u600f, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2, p0:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2bd\u960f\u3e2a\ub7dc\u647c\uae87() {
        var_1_5F : int
        var_3_67 : int
        
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
            var_1_5F = and:int(ldc:int(-994187824), ldc:int(-671128591))
            var_3_67 = and:int(ldc:int(6577), ldc:int(-8114))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-675317771))
                
                if (cmpge:boolean(var_3_67:int, arraylength:int(getfield:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[](\ubf56\u6435\u156b\u3e2a\ub19c\u51b2::\u527a\u8aa5\u647c\u7049\u7330\u600f, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u8308\u3d4b\u3e75\u64ab\ube23\ub113::\u8d98\ufe34\uc2bd\u8350\ud4fe\u0b8e, loadelement:\u8308\u3d4b\u3e75\u64ab\ube23\ub113(getfield:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[](\ubf56\u6435\u156b\u3e2a\ub19c\u51b2::\u527a\u8aa5\u647c\u7049\u7330\u600f, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2), var_3_67:int))
                inc:int(var_3_67, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u88c5\u67e9\u392e\u4c2b\ubded\ucfaf(\u3d64\u7af6\uae87\uc238\u7d52.\u93a2\ud523\u7af6\ubff1\u64ab\ud217 p0) {
        var_2_5F : int
        var_4_67 : int
        
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
        var_2_5F = and:int(ldc:int(1349927207), ldc:int(-135332649))
        var_4_67 = and:int(ldc:int(846), ldc:int(-8015))
        
        loop {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-227810657))
            
            if (cmpge:boolean(var_4_67:int, arraylength:int(getfield:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[](\ubf56\u6435\u156b\u3e2a\ub19c\u51b2::\u527a\u8aa5\u647c\u7049\u7330\u600f, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2)))) {
                return:boolean(and:int[expected:boolean](ldc:int(16385), ldc:int(8739)))
            }
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8308\u3d4b\u3e75\u64ab\ube23\ub113::\u99f7\u97b7\u9033\u6b0d\u5245\u34df, loadelement:\u8308\u3d4b\u3e75\u64ab\ube23\ub113(getfield:\u8308\u3d4b\u3e75\u64ab\ube23\ub113[](\ubf56\u6435\u156b\u3e2a\ub19c\u51b2::\u527a\u8aa5\u647c\u7049\u7330\u600f, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2), var_4_67:int), p0:\u93a2\ud523\u7af6\ubff1\u64ab\ud217))) {
                return:boolean(and:int[expected:boolean](ldc:int(13714), ldc:int(-30208)))
            }
            
            inc:int(var_4_67, ldc:int(1))
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
    
    public void \u97b7\ud4fe\u6cfe\ud36e\u72f1\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(1861615458), ldc:int(-1040591234))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubf56\u6435\u156b\u3e2a\ub19c\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1023869315))
            var_5_7D = and:int(ldc:int(28385), ldc:int(-28386))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18244), ldc:int(-20293)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F5:int, ldc:int(-70158476))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(2081), ldc:int(21523)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(21), ldc:int(17129)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_D2:int, ldc:int(1674796788))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(325), ldc:int(324)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-245250490))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-74463923))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1562987105))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1965505327))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1173966693))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(204317702))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(83335364))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1628468085))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-304621704))
                        var_11_E3 = and:int(ldc:int(-13306), ldc:int(9192))
                        goto(Label_1407)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(622441200))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1142713947))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1935251341))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1422533644))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-604704800))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1722427390))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-500130096))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1743976692))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1576763255))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1458787938))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2027030972))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1609089984))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1025718580))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1335625438))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1274468194))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(2369), ldc:int(8199))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1814643984))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1086090413))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(550625488))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1031797362))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1675323388))
                        var_11_E3 = and:int(ldc:int(-13314), ldc:int(13313))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1253048229))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1012045141))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(3569973))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1727428323))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1370805605))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1584542953))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(179752978))
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(579921216))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1075385644))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(625655855))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(593258076))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1582985971))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-470747551))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1407)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1572467656))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1161745293))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-182175281))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1682311663))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(885086070))
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-908361879))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1109131789))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(793252460))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-797709710))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(56022933))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1491991579))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1272080359))
                        var_17_600 = add:int(var_16_111:int, and:int(ldc:int(6155), ldc:int(145)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-856391812))
                
                if (cmple:boolean(var_5_7D = var_17_600:int, sub:int(var_6_84:int, xor:int(ldc:int(5280), ldc:int(5281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2031735125))
            goto(Label_0106)
        }
    }
}
