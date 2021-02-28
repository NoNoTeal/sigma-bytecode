public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6198\u624e\u3504\u965f\u4c2b\ub8be {
    public void \u6198\u624e\u3504\u965f\u4c2b\ub8be(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u5245\u4daf\u8753\u9a18\u8d90\u718f p0) {
        var_4_80 : int
        
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
            invokespecial:\uceb8\u5140\u8389\ub32d\ubcb0\u7006(\uceb8\u5140\u8389\ub32d\ubcb0\u7006::<init>, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be)
            putfield:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u416d\uceb8\ub83f\ud158\u36d3\u6bb9, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be, checkcast:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8.class, p0:\u5245\u4daf\u8753\u9a18\u8d90\u718f[expected:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8]))
            putfield:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u36d3\u6bb9\u47c2\uc2bd\uf9c5\u71ae, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be, newarray:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](\ua562\ucb79\uc87f\u3dd3\ubcb0.\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff.class, invokevirtual:int(\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\u624e\ud4fe\ucb79\ubf56\u7873\u516c, getfield:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u416d\uceb8\ub83f\ud158\u36d3\u6bb9, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be))))
            var_4_80 = and:int(ldc:int(24891), ldc:int(-24892))
            
            while (cmplt:boolean(var_4_80:int, arraylength:int(getfield:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u36d3\u6bb9\u47c2\uc2bd\uf9c5\u71ae, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be)))) {
                storeelement:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff(getfield:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u36d3\u6bb9\u47c2\uc2bd\uf9c5\u71ae, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be), var_4_80:int, initobject:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff(\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff::<init>, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be, var_4_80:int, aconstnull:\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc()))
                inc:int(var_4_80, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u62da\u3e75\u3504\u97b7\u6ec6\u4179() {
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
            return:int(invokevirtual:int(\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8::\u3776\u3776\u4492\u4e72\u4179\u839e, getfield:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u416d\uceb8\ub83f\ud158\u36d3\u6bb9, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be)))
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[] \u836c\u3d64\u62da\ubefe\u67d0\uc910() {
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
            return:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](getfield:\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff[](\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u36d3\u6bb9\u47c2\uc2bd\uf9c5\u71ae, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be))
        }
        
        goto(Label_0006)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8 \ucef1\u527a\u7c6b\u8350\u5fe1\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6198\u624e\u3504\u965f\u4c2b\ub8be p0) {
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
            return:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(getfield:\u5bc4\u071d\ub83f\uf9c5\u5654\ud7e8(\u6198\u624e\u3504\u965f\u4c2b\ub8be::\u416d\uceb8\ub83f\ud158\u36d3\u6bb9, p0:\u6198\u624e\u3504\u965f\u4c2b\ub8be))
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
    
    public void \uf9c5\ube23\u647c\u93a2\u36d3\u9033(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(1427330538), ldc:int(1973105083))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\u624e\u3504\u965f\u4c2b\ub8be[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1669980638))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1159696286))
            var_5_85 = and:int(ldc:int(-3255), ldc:int(3222))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14734), ldc:int(-32671)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(-685290789))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4117), ldc:int(25705)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8196), ldc:int(8197)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(1207944155))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(22609), ldc:int(1153)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1582642235))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-213670419))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-536402256))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1371722009))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(43085650))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1559486934))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-421792951))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1120404533))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2020764203))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-228712664))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1612990369))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1020316430))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1913943558))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(106250627))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-980447237))
                        var_11_E3 = and:int(ldc:int(-409), ldc:int(408))
                        goto(Label_1439)
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(236282769))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1929303401))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1026731582))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1773729926))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1200627400))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1398198964))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-585160466))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2096074247))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1949848739))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1977450727))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1445325854))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-265880178))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1120452102))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1345218300))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1686564424))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1610615570))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4121), ldc:int(321))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(992875353))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(606537520))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1528354850))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-980193329))
                        var_11_E3 = and:int(ldc:int(-24303), ldc:int(3654))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1434271854))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(698384958))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(196752132))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1058321211))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1076910369))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1189930262))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1765721329))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-668565236))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1675315932))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1255335197))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1302303887))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1308:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(359012574))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1641013968))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(302075186))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1408993876))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(20036518))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1117829637))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(651193854))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1783680102))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-693551779))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-180416963))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1025612491))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1885367090))
                        var_17_628 = add:int(var_16_111:int, and:int(ldc:int(13), ldc:int(2657)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1186335188))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-543689057))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, xor:int(ldc:int(16386), ldc:int(16387))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
