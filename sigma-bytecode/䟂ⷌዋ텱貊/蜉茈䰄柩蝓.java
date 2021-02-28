public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u8709\u8308\u4c04\u67e9\u8753 {
    public void \u8709\u8308\u4c04\u67e9\u8753() {
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
            invokespecial:Object(Object::<init>, this:\u8709\u8308\u4c04\u67e9\u8753)
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
            var_0_5F = and:int(ldc:int(-1977319562), ldc:int(1339407988))
            putstatic:\u7043\uc87f\u4f52\u64ab\u8350[](\u8709\u8308\u4c04\u67e9\u8753::\u7006\u760c\u0c95\u4e72\u6c52\uf995, newarray:\u7043\uc87f\u4f52\u64ab\u8350[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7043\uc87f\u4f52\u64ab\u8350.class, and:int(ldc:int(9863), ldc:int(5249))))
            var_2_74 = and:int(ldc:int(-26641), ldc:int(26640))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-75688009))
                
                if (cmpge:boolean(var_2_74:int, arraylength:int(getstatic:\u7043\uc87f\u4f52\u64ab\u8350[](\u8709\u8308\u4c04\u67e9\u8753::\u7006\u760c\u0c95\u4e72\u6c52\uf995)))) {
                    looporswitchbreak()
                }
                
                storeelement:\u7043\uc87f\u4f52\u64ab\u8350(getstatic:\u7043\uc87f\u4f52\u64ab\u8350[](\u8709\u8308\u4c04\u67e9\u8753::\u7006\u760c\u0c95\u4e72\u6c52\uf995), var_2_74:int, initobject:\u7043\uc87f\u4f52\u64ab\u8350(\u7043\uc87f\u4f52\u64ab\u8350::<init>, i2s:short(add:int(ldc:int(-128), var_2_74:int)), aconstnull:\uf94d\u6d69\u64ab\u873d\u8d98()))
                inc:int(var_2_74, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u98a4\u718f\uae5d\ud523\uafe7\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(1359135860), ldc:int(-1451260700))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u8308\u4c04\u67e9\u8753[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1135799791))
            var_5_7D = and:int(ldc:int(-22621), ldc:int(22620))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23227), ldc:int(4282)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DD:int, ldc:int(-472390043))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8194), ldc:int(8195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(12313), ldc:int(613)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_D2:int, ldc:int(325236831))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16392), ldc:int(16393)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-228794732))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-197718948))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1749151583))
                    }
                    else {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-681914281))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(992483727))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(592160848))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1786710223))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1721779329))
                        var_11_E3 = and:int(ldc:int(25072), ldc:int(-27129))
                        goto(Label_1399)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1662191710))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-403846730))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(60177204))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-929156946))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1168229058))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(198973493))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1904159280))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-139018899))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1144891908))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(71737641))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1354107805))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(852972351))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1042100500))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-312606875))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-635502945))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(401428829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1480171575))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-717511324))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-15840), ldc:int(-15839))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1594412534))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1749725542))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1844904030))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(569991789))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-215310898))
                        var_11_E3 = and:int(ldc:int(-21089), ldc:int(21088))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-144728743))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1282343086))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-289439696))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1331257100))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2129762434))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(953944037))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-109868673))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1535054699))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1802139066))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1666205470))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1381944883))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2122660097))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(969089936))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1945914432))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2031177487))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(1327936583))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1907610902))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1665416776))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1964763759))
                        var_17_5E8 = add:int(var_16_111:int, and:int(ldc:int(2641), ldc:int(8453)))
                        looporswitchbreak()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(2127213343))
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(1739300204))
                
                if (cmple:boolean(var_5_7D = var_17_5E8:int, sub:int(var_6_84:int, and:int(ldc:int(39), ldc:int(24577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-149839454))
            goto(Label_0106)
        }
    }
}
