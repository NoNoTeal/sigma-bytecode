public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3bd6\uc2bd\u8753\u51fa\u3711 {
    public void \u3bd6\uc2bd\u8753\u51fa\u3711(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:\u4e72\u759a\u62da\ub32d\u3e75(\u4e72\u759a\u62da\ub32d\u3e75::<init>, this:\u3bd6\uc2bd\u8753\u51fa\u3711, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, p4:int, p5:int, and:int[expected:boolean](ldc:int(10794), ldc:int(-12203)))
            putfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\uae5d\uc87f\ucfaf\u7330\u983f, this:\u3bd6\uc2bd\u8753\u51fa\u3711, p4:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_85 : float
        
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
        
        if (cmpne:boolean(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u3bd6\uc2bd\u8753\u51fa\u3711[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(0))) {
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u3e75\u88c5\u9033\u4bc8\ub113, this:\u3bd6\uc2bd\u8753\u51fa\u3711[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
            var_4_85 = sub:float(ldc:float(1.0f), invokestatic:float(Math::min, ldc:float(1.0f), invokestatic:float(Math::max, div:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u3bd6\uc2bd\u8753\u51fa\u3711[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\uae5d\uc87f\ucfaf\u7330\u983f, this:\u3bd6\uc2bd\u8753\u51fa\u3711))), ldc:float(0.0f))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3bd6\uc2bd\u8753\u51fa\u3711)), i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3bd6\uc2bd\u8753\u51fa\u3711)), i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\uae5d\uc87f\ucfaf\u7330\u983f, this:\u3bd6\uc2bd\u8753\u51fa\u3711)), i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\ub8be\u7873\u36d3\ub102\u8258, this:\u3bd6\uc2bd\u8753\u51fa\u3711)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, ldc:int(-3254955), p0:float))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u3bd6\uc2bd\u8753\u51fa\u3711[expected:\u12cb\u93a2\ubf56\uc229\u8d90], mul:float(p0:float, sub:float(ldc:float(1.0f), var_4_85:float)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, ldc:float(0.0f), ldc:float(0.0f), ldc:float(20.0f), i2f:float(getfield:int(\u3bd6\uc2bd\u8753\u51fa\u3711::\ub8be\u7873\u36d3\ub102\u8258, this:\u3bd6\uc2bd\u8753\u51fa\u3711)), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u0c95\u4f4a\u7043\u8350\u3711), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), mul:float(var_4_85:float, p0:float)))
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
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(766388809), ldc:int(-1112660745))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\uc2bd\u8753\u51fa\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(256849054))
        }
        else {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(2146328905))
            var_5_85 = and:int(ldc:int(27156), ldc:int(-28637))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6000), ldc:int(-32629)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FC:int, ldc:int(2113291623))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(15125), ldc:int(131)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(12289), ldc:int(715)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_D2:int, ldc:int(1039077495))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(24656), ldc:int(24657)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2130215498))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1807858594))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-668459149))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2000634582))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1295746172))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-250612080))
                    }
                    else {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1738934135))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(472305518))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-8514811))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(665794533))
                            var_11_E3 = and:int(ldc:int(20242), ldc:int(-20243))
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1823629985))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(388760186))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(981736606))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(934721869))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-640909104))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(872563013))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(325894771))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1647327948))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1941364802))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(635866749))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(326651412))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-913016336))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1646925390))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(665825003))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(8513), ldc:int(3))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-476351770))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(463127439))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(900867780))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1156625547))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1708999333))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(215599203))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1213260201))
                        var_11_E3 = and:int(ldc:int(27210), ldc:int(-28412))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1344633193))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1410248544))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1540448459))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1314362790))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(349428097))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(934745969))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1765891933))
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(985613876))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(850352241))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-184528649))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1711270621))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1391)
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1955442612))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(262754578))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1603003995))
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(2108612803))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-149608709))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-66345332))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(581002293))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1941206629))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-393559342))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1542205913))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-168414767))
                        var_17_607 = add:int(var_16_111:int, and:int(ldc:int(14853), ldc:int(1025)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1487304743))
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(904827465))
                
                if (cmple:boolean(var_5_85 = var_17_607:int, sub:int(var_6_8C:int, and:int(ldc:int(681), ldc:int(25619))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
