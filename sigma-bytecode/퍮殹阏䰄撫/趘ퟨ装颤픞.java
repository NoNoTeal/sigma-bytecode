public interface \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d98\ud7e8\u88c5\u98a4\ud51e {
    void \u7049\ub1b9\u3bd6\u8c8a\u52d3\u7bad(boolean p0);
    
    void \ubcb0\ua6bd\ud7e8\u1833\u97b7\u6b0d(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ff\uafe7\u99f7\u624e\u5bc4 p2, float p3);
    
    \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u839e\u1833\u47c2\u97b7\u8389\u7043();
    
    void \u6bb9\u6ec6\ub83f\ua068\u4492\u36d3();
    
    void \ubded\ua068\u5f50\ua61f\ud158\u64ab(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, float p1) {
        var_5_67 : \u34df\ub113\u6c56\u97e6\u51b2\u4c2b
        var_6_6F : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_5_67 = invokestatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u8640\u51b2\u7006\uff55\u3c25::\ub1b9\u9033\u56bd\ud523\u40a9\uc246, p0:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u71ae\ud36e\u071d\u3e75\u69d9\u4bc8))
            var_6_6F = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, p0:\ube23\u67d0\u64f2\u839e\u76bc, var_5_67:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
            
            if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ub8be\u385b\uceb8\u8d98\u5654\u9033, p0:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u71ae\ud36e\u071d\u3e75\u69d9\u4bc8))) {
                invokestatic:void(\u839e\u120d\u8350\u183a\u927d\u3d4b::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc), p0:\ube23\u67d0\u64f2\u839e\u76bc, var_5_67:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b, var_6_6F:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:float, i2f:float(sub:int(ldc:int(14), mul:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc))), and:int(ldc:int(8207), ldc:int(3124))))))
            }
            
            invokeinterface:void(\u8d98\ud7e8\u88c5\u98a4\ud51e::\u6bb9\u6ec6\ub83f\ua068\u4492\u36d3, this:\u8d98\ud7e8\u88c5\u98a4\ud51e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void \u5fe1\u69d9\u446c\ua61f\u7330\u2dcc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ff\uafe7\u99f7\u624e\u5bc4 p2, float p3, float p4) {
        var_8_6C : double
        var_10_77 : double
        var_16_B5 : \uae5d\ua068\u9a18\u8413\u51fa\ub83f
        
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
            var_8_6C = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            var_10_77 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            var_16_B5 = invokeinterface:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\u8d98\ud7e8\u88c5\u98a4\ud51e::\uafe7\u4f52\u7bad\uc9f6\u5140\ub7dc, this:\u8d98\ud7e8\u88c5\u98a4\ud51e, p0:\ube23\u67d0\u64f2\u839e\u76bc, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, var_8_6C:double, add:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ufcaf\u6b0d\u4179\u7bad\ub19c\u718f, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:double(0.3333333333333333)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p2:\u92ff\uafe7\u99f7\u624e\u5bc4[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), mul:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_8_6C:double, var_8_6C:double), mul:double(var_10_77:double, var_10_77:double)))), ldc:double(0.20000000298023224))), var_10_77:double), p3:float)
            invokevirtual:void(\u92ff\uafe7\u99f7\u624e\u5bc4::\u16f6\u8258\u624e\u34df\u76bc\u839e, p2:\u92ff\uafe7\u99f7\u624e\u5bc4, f2d:double(invokevirtual:float(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\ubf56\uc3e3\u3776\ufe34\ube23\u6b0d, var_16_B5:\uae5d\ua068\u9a18\u8413\u51fa\ub83f)), f2d:double(invokevirtual:float(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u4f52\u36d3\ua61f\ucb79\u156b\u156b, var_16_B5:\uae5d\ua068\u9a18\u8413\u51fa\ub83f)), f2d:double(invokevirtual:float(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u600f\u6198\u8308\ud4fe\u624e\ube23, var_16_B5:\uae5d\ua068\u9a18\u8413\u51fa\ub83f)), p4:float, i2f:float(sub:int(ldc:int(14), mul:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc))), xor:int(ldc:int(273), ldc:int(277))))))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uc246\u4c2b\u51b2\u4f4a\u9a18\u99f7, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u72f1\u0800\u3d4b\ubf56\uceb8\u3e2a), ldc:float(1.0f), div:float(ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, p0:\ube23\u67d0\u64f2\u839e\u76bc)), ldc:float(0.4f)), ldc:float(0.8f))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    \u516c\u3d64\u718f\ub171\u6b5f.\uae5d\ua068\u9a18\u8413\u51fa\ub83f \uafe7\u4f52\u7bad\uc9f6\u5140\ub7dc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p1, float p2) {
        var_6_67 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_7_78 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_8_A6 : \ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd
        var_9_B1 : \uae5d\ua068\u9a18\u8413\u51fa\ub83f
        var_10_CB : \ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd
        var_11_D6 : \uae5d\ua068\u9a18\u8413\u51fa\ub83f
        
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
            var_6_67 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, p1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
            var_7_78 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u927d\uc31c\u8aa5\u0c95\uff55\u183a, var_6_67:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, ldc:double(0.0), ldc:double(1.0), ldc:double(0.0)))
            
            if (cmple:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u3a62\u8413\uc2e8\u7043\u0a06\u6d69, var_7_78:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(1.0E-7))) {
                var_7_78 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u927d\uc31c\u8aa5\u0c95\uff55\u183a, var_6_67:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u6cfe\uae5d\u6d69\ubf56\u71ae\ufcaf, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:float(1.0f)))
            }
            
            var_8_A6 = initobject:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd::<init>, initobject:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::<init>, var_7_78:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:float(90.0f), and:int[expected:boolean](ldc:int(2049), ldc:int(24685)))
            var_9_B1 = initobject:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::<init>, var_6_67:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
            invokevirtual:void(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u8640\uc2bd\u8709\u8df4\u6b0d\ucfaf, var_9_B1:\uae5d\ua068\u9a18\u8413\u51fa\ub83f, var_8_A6:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd)
            var_10_CB = initobject:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd::<init>, var_9_B1:\uae5d\ua068\u9a18\u8413\u51fa\ub83f, p2:float, and:int[expected:boolean](ldc:int(16669), ldc:int(67)))
            var_11_D6 = initobject:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::<init>, var_6_67:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
            invokevirtual:void(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u8640\uc2bd\u8709\u8df4\u6b0d\ucfaf, var_11_D6:\uae5d\ua068\u9a18\u8413\u51fa\ub83f, var_10_CB:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd)
            return:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(var_11_D6:\uae5d\ua068\u9a18\u8413\u51fa\ub83f)
        }
        
        goto(Label_0006)
    }
}
