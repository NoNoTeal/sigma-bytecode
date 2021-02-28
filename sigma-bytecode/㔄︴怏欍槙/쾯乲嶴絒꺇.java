public class \u3504\ufe34\u600f\u6b0d\u69d9.\ucfaf\u4e72\u5db4\u7d52\uae87 {
    public void \ucfaf\u4e72\u5db4\u7d52\uae87() {
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
            invokespecial:Object(Object::<init>, this:\ucfaf\u4e72\u5db4\u7d52\uae87)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        var_2_74 : int
        
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
            var_0_5F = and:int(ldc:int(1571545500), ldc:int(1290789009))
            putstatic:\uc246\u52d3\u873d\u6c52\u7049[](\ucfaf\u4e72\u5db4\u7d52\uae87::\u4f52\ub83f\u071d\uc246\u647c\u12b2, newarray:\uc246\u52d3\u873d\u6c52\u7049[](\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\u52d3\u873d\u6c52\u7049.class, xor:int(ldc:int(12699), ldc:int(13594))))
            var_2_74 = and:int(ldc:int(13128), ldc:int(-13129))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-520395594))
                
                if (cmpge:boolean(var_2_74:int, arraylength:int(getstatic:\uc246\u52d3\u873d\u6c52\u7049[](\ucfaf\u4e72\u5db4\u7d52\uae87::\u4f52\ub83f\u071d\uc246\u647c\u12b2)))) {
                    looporswitchbreak()
                }
                
                storeelement:\uc246\u52d3\u873d\u6c52\u7049(getstatic:\uc246\u52d3\u873d\u6c52\u7049[](\ucfaf\u4e72\u5db4\u7d52\uae87::\u4f52\ub83f\u071d\uc246\u647c\u12b2), var_2_74:int, initobject:\uc246\u52d3\u873d\u6c52\u7049(\uc246\u52d3\u873d\u6c52\u7049::<init>, add:int(ldc:int(-128), var_2_74:int), aconstnull:\u3711\u6b0d\u99f7\u071d\uc2bd()))
                inc:int(var_2_74, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\u8753\u56bd\u4e72\uf995\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_638 : int
        
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
        var_3_62D = and:int(ldc:int(-1844385233), ldc:int(-404568323))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucfaf\u4e72\u5db4\u7d52\uae87[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(1397246322))
        }
        else {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-1023362435))
            var_5_85 = and:int(ldc:int(-24181), ldc:int(22116))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2251), ldc:int(-3292)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62D:int, ldc:int(-414914947))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16947), ldc:int(7437)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4097), ldc:int(3521)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_D2:int, ldc:int(-1368401283))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-16318), ldc:int(-16317)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(977356533))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-732384956))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-897073504))
                    }
                    else {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-154032129))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-568288012))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1242242871))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-783999266))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1211499327))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(302214821))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1710052561))
                        var_11_E3 = and:int(ldc:int(-3546), ldc:int(3225))
                        goto(Label_1471)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(447175765))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1574134357))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(291431304))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-676521753))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-945972982))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1761836161))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-297187406))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(814675347))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-137525506))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-2018417774))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(603378650))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-92421203))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1450372070))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(846588263))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1267276146))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1651035806))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-417281700))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-477197699))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(8194), ldc:int(8195))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1416111875))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1324076371))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-950678435))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2134349462))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(859491029))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-998434010))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(53505004))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(934051315))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-675969427))
                        var_11_E3 = and:int(ldc:int(25874), ldc:int(-25875))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1865659635))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2111457039))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1899115024))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1847226970))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1214432720))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1577699643))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1500795139))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1260059719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1305381123))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-2014204534))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-405269374))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-151195729))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1471)
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1733286407))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1770646757))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1944367097))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(53870661))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1788524578))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1157979486))
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(-503127491))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-328473572))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1022557858))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-413441629))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1889208256))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1150777409))
                        var_17_638 = add:int(var_16_111:int, xor:int(ldc:int(13316), ldc:int(13317)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-1442145683))
                
                if (cmple:boolean(var_5_85 = var_17_638:int, sub:int(var_6_8C:int, xor:int(ldc:int(2100), ldc:int(2101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
