public abstract class \u6435\ub8be\u718f\u6b0d\u67e9.\ub6ab\u4d85\u97e6\ud51e\u983f {
    public void \ub6ab\u4d85\u97e6\ud51e\u983f() {
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
            invokespecial:Object(Object::<init>, this:\ub6ab\u4d85\u97e6\ud51e\u983f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf995\u4bc8\u97b7\u6198\u8753\ub19c(\u6435\ub8be\u718f\u6b0d\u67e9.\ub6ab\u4d85\u97e6\ud51e\u983f p0) {
        var_2_80 : int
        stack_AA_0 : int [generated]
        
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
        var_2_80 = and:int(ldc:int(969341142), ldc:int(-868393))
        
        if (cmpne:boolean(p0:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
            do {
                if (cmpne:boolean(and:int(var_2_80:int, ldc:int(4)), ldc:int(0))) {
                    var_2_80 = and:int(var_2_80:int, ldc:int(2112354951))
                    
                    if (cmpne:boolean(this:\ub6ab\u4d85\u97e6\ud51e\u983f, p0:\ub6ab\u4d85\u97e6\ud51e\u983f)) {
                        loopcontinue()
                    }
                    
                    stack_AA_0 = and:int[expected:boolean](ldc:int(9517), ldc:int(147))
                    return:boolean(stack_AA_0:boolean)
                }
            } while (cmpeq:boolean(and:int(var_2_80:int, ldc:int(8192)), ldc:int(0)))
            
            var_2_80 = and:int(var_2_80:int, ldc:int(-1144324657))
            stack_AA_0 = and:int[expected:boolean](ldc:int(-13645), ldc:int(12616))
            return:boolean(stack_AA_0:boolean[expected:int])
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-10756), ldc:int(10755)))
    }
    
    public abstract java.lang.String \u8308\ua562\u4f52\u93a2\ubb2b\u4e72();
    
    public abstract net.minecraft.util.text.IFormattableTextComponent \uc4d2\u40a9\u0b8e\ubf56\u3711\u8d90(net.minecraft.util.text.ITextComponent p0);
    
    public abstract boolean \u8389\uf995\u7043\ubcb0\u9937\u7d52();
    
    public abstract boolean \ubf56\uc238\ud7e8\uc84e\ubb2b\u5fe1();
    
    public abstract \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5140\u4c2b\u183a\u7330\u6435 \u385b\u183a\u97e6\u8389\u0c95\u3504();
    
    public abstract net.minecraft.util.text.TextFormatting \u97b7\u9033\uc2e8\u836c\u8640\u156b();
    
    public abstract java.util.Collection<java.lang.String> \u839e\uc229\u6bb9\uc229\u16f6\u6ec6();
    
    public abstract \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5140\u4c2b\u183a\u7330\u6435 \ua61f\ua3b4\u4ab3\u7bad\u9033\u6ec6();
    
    public abstract \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u2dcc\uceb8\u6bb9\uc9f6\u5140 \u4975\u98a4\u1833\ub70c\ubff1\u7006();
    
    public void \u12b2\ub113\uc238\u76bc\ud7e8\uc87f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_5CD = and:int(ldc:int(-479664289), ldc:int(-681988613))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u4d85\u97e6\ud51e\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2092650413))
            var_5_7D = and:int(ldc:int(17204), ldc:int(-17205))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28805), ldc:int(-29832)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5CD:int, ldc:int(-477470601))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1536), ldc:int(1537)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(18961), ldc:int(4173)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_D2:int, ldc:int(-546867589))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2249), ldc:int(29207)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-195201057))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(693591404))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1340190590))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1181103100))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1256266526))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(565280505))
                    }
                    else {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-675484549))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1218570954))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2089897581))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-10702730))
                            var_11_E3 = and:int(ldc:int(-21067), ldc:int(21066))
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-404867865))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1189087506))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-891706020))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-759239374))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1122137133))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-954763689))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1299088939))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1140195144))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2143614565))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1331209249))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1679447458))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(283321834))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2096885553))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1146447253))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1855269290))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2092258434))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(6432), ldc:int(6433))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1537161152))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1799017929))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-341941550))
                        var_11_E3 = and:int(ldc:int(-20523), ldc:int(20522))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2069992221))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1767510528))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-511964977))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1093030402))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2084799273))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1403030028))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1552494061))
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-805487089))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(897954460))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1630036472))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-739645965))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1651001553))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-817428816))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1071671120))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-515706915))
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1546423853))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1735046253))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1856437169))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1539955656))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1879903361))
                        var_17_5D8 = add:int(var_16_111:int, and:int(ldc:int(257), ldc:int(28289)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1007618445))
                
                if (cmple:boolean(var_5_7D = var_17_5D8:int, sub:int(var_6_84:int, and:int(ldc:int(16577), ldc:int(8193))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1913935768))
            goto(Label_0106)
        }
    }
}
