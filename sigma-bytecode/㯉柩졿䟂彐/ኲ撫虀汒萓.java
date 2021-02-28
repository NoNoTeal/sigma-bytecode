public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u12b2\u64ab\u8640\u6c52\u8413 {
    public void \u12b2\u64ab\u8640\u6c52\u8413() {
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
            invokespecial:Object(Object::<init>, this:\u12b2\u64ab\u8640\u6c52\u8413)
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
            var_0_5F = and:int(ldc:int(107002690), ldc:int(1188540205))
            putstatic:\u6198\u59ec\u0a06\u624e\u8df4[](\u12b2\u64ab\u8640\u6c52\u8413::\ud171\u40a9\uc246\u16f6\u3504\ub102, newarray:\u6198\u59ec\u0a06\u624e\u8df4[](\u5d20\u7043\u88c5\u5db4\uf94d.\u6198\u59ec\u0a06\u624e\u8df4.class, and:int(ldc:int(1681), ldc:int(21929))))
            var_2_74 = and:int(ldc:int(26667), ldc:int(-26668))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1064680376))
                
                if (cmpge:boolean(var_2_74:int, arraylength:int(getstatic:\u6198\u59ec\u0a06\u624e\u8df4[](\u12b2\u64ab\u8640\u6c52\u8413::\ud171\u40a9\uc246\u16f6\u3504\ub102)))) {
                    looporswitchbreak()
                }
                
                storeelement:\u6198\u59ec\u0a06\u624e\u8df4(getstatic:\u6198\u59ec\u0a06\u624e\u8df4[](\u12b2\u64ab\u8640\u6c52\u8413::\ud171\u40a9\uc246\u16f6\u3504\ub102), var_2_74:int, initobject:\u6198\u59ec\u0a06\u624e\u8df4(\u6198\u59ec\u0a06\u624e\u8df4::<init>, i2l:long(add:int(ldc:int(-128), var_2_74:int)), aconstnull:\u4975\u5245\uc7fe\u8bb0\ubb2b()))
                inc:int(var_2_74, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\u494c\u6435\u8709\u4492\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
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
        var_3_5F5 = and:int(ldc:int(-1024338004), ldc:int(56686587))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12b2\u64ab\u8640\u6c52\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2045084814))
        }
        else {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1336735675))
            var_5_85 = and:int(ldc:int(16593), ldc:int(-24794))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21585), ldc:int(-22098)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F5:int, ldc:int(-1247346760))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24508), ldc:int(-24507)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1025), ldc:int(1024)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_D2:int, ldc:int(229757311))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(22529), ldc:int(521)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1940540383))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(323695230))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-602959939))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1405891917))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2036379317))
                    }
                    else {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2059008888))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1993795681))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1680642821))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-716354402))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(508757760))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2099505651))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-411905621))
                        var_11_E3 = and:int(ldc:int(-20710), ldc:int(20709))
                        goto(Label_1415)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(852133720))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1347141461))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-195999811))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2082922430))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1244624337))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1446345738))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2066943951))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2017819906))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-536381715))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1018691375))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1825132514))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1669043682))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(643785751))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1723013593))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(368767465))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(7197), ldc:int(24577))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1919920045))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(777517304))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2033523448))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(887348444))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(719220651))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-882843655))
                        var_11_E3 = and:int(ldc:int(14816), ldc:int(-14817))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2057718771))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(154146362))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1341567434))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-544872983))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-812440996))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2133646249))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(368801605))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1363763750))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1041585304))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(841582066))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1904748231))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-420334825))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1080941837))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(4840855))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1456921183))
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1125123601))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1133698893))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(11093687))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1752018867))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-164562565))
                        var_17_600 = add:int(var_16_111:int, and:int(ldc:int(29025), ldc:int(1539)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-731148934))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(293401530))
                
                if (cmple:boolean(var_5_85 = var_17_600:int, sub:int(var_6_8C:int, and:int(ldc:int(5), ldc:int(8721))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
