public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8258\u62da\ud4fe\u0a06\u5f50\u8308 {
    public void \u8258\u62da\ud4fe\u0a06\u5f50\u8308(float p0, float p1, float p2, float p3, float p4, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p5) {
        var_9_98 : UnmodifiableIterator
        
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
            invokespecial:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::<init>, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, p5:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            putfield:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u6bb9\u7bad\ubb2b\uc84e\u6198\u0a06, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, initobject:Object2IntOpenHashMap[expected:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](Object2IntOpenHashMap::<init>))
            putfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u72f1\u8cae\u64f2\ube23\u64f2\u9255, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u927d\u6d99\ub8be\u8709\u9255\u16f6, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, p0:float, p1:float, p4:float, ldc:float(0.0f), p4:float))
            putfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\uc29a\u4bc8\u4ab3\u1187\u527a\u8753, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u927d\u6d99\ub8be\u8709\u9255\u16f6, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, p0:float, p1:float, p2:float, ldc:float(0.0f), p3:float))
            var_9_98 = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, invokevirtual:ImmutableList(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u4492\u8d98\uceb8\ubcb0\u6fb0\u183a, getfield:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ufcaf\ub7dc\u16f6\u12b2\u4d85\ubff1, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308)))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_9_98:Iterator)) {
                invokevirtual:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4e72\ucef1\ub171\u946b\uc246\u8d90, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::next, var_9_98:Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52[] \u927d\u6d99\ub8be\u8709\u9255\u16f6(float p0, float p1, float p2, float p3, float p4) {
        var_6_61 : int
        var_8_67 : float
        var_9_6D : float
        var_10_73 : float
        var_11_79 : float
        var_12_8D : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_13_A2 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_14_B9 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_15_CE : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_16_E5 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_17_EE : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_18_F7 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        expr_FB : \u6c52\ubded\u4975\u71ae\u47c2\u7d52[] [generated]
        var_19_1AA : \u6c52\ubded\u4975\u71ae\u47c2\u7d52[]
        var_20_1B3 : int
        
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
            var_6_61 = and:int(ldc:int(1625363356), ldc:int(-16810124))
            var_8_67 = sub:float(ldc:float(8.0f), p0:float)
            var_9_6D = add:float(ldc:float(8.0f), p0:float)
            var_10_73 = sub:float(ldc:float(8.0f), p1:float)
            var_11_79 = add:float(ldc:float(8.0f), p1:float)
            var_12_8D = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, f2d:double(var_8_67:float), ldc:double(0.0), f2d:double(var_8_67:float), f2d:double(var_9_6D:float), f2d:double(p2:float), f2d:double(var_9_6D:float))
            var_13_A2 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, f2d:double(var_10_73:float), f2d:double(p3:float), ldc:double(0.0), f2d:double(var_11_79:float), f2d:double(p4:float), f2d:double(var_11_79:float))
            var_14_B9 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, f2d:double(var_10_73:float), f2d:double(p3:float), f2d:double(var_10_73:float), f2d:double(var_11_79:float), f2d:double(p4:float), ldc:double(16.0))
            var_15_CE = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), f2d:double(p3:float), f2d:double(var_10_73:float), f2d:double(var_11_79:float), f2d:double(p4:float), f2d:double(var_11_79:float))
            var_16_E5 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, f2d:double(var_10_73:float), f2d:double(p3:float), f2d:double(var_10_73:float), ldc:double(16.0), f2d:double(p4:float), f2d:double(var_11_79:float))
            var_17_EE = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_13_A2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_16_E5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            var_18_F7 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_14_B9:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_15_CE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            expr_FB = newarray:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52.class, ldc:int(16))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(30008), ldc:int(-30073)), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ub83f\u8389\u3e75\u3d4b\u836c\u071d))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(2073), ldc:int(9857)), var_14_B9:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(16451), ldc:int(770)), var_15_CE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(17027), ldc:int(3139)), var_18_F7:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(20996), ldc:int(1156)), var_13_A2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], and:int(ldc:int(645), ldc:int(4197)), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_14_B9:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_13_A2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(6), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_15_CE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_13_A2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(7), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_18_F7:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_13_A2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(8), var_16_E5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(9), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_14_B9:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_16_E5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(10), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_15_CE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_16_E5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(11), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_18_F7:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_16_E5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(12), var_17_EE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(13), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_14_B9:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_17_EE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(14), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_15_CE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_17_EE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], ldc:int(15), invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_18_F7:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_17_EE:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
            var_19_1AA = expr_FB:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[]
            var_20_1B3 = and:int(ldc:int(27217), ldc:int(-27252))
            
            loop {
                var_6_61 = and:int(var_6_61:int, ldc:int(-1544112267))
                
                if (cmpge:boolean(var_20_1B3:int, ldc:int(16))) {
                    looporswitchbreak()
                }
                
                storeelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(var_19_1AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], var_20_1B3:int, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_12_8D:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, loadelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(var_19_1AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], var_20_1B3:int)))
                inc:int(var_20_1B3, ldc:int(1))
            }
            
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](var_19_1AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[])
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud4fe\u960f\u4975\u3d4b\ufe34\u6b5f(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_61 : int
        stack_96_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(-1505934086), ldc:int(-143821085))
            
            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ub1b9\u64ab\u527a\u51b2\u0c95\u516c))))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1497661888))
                stack_96_0 = and:int(ldc:int(-13097), ldc:int(13096))
            }
            else {
                stack_96_0 = and:int(ldc:int(1833), ldc:int(16403))
            }
            
            return:boolean(stack_96_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u6b5f\u5fe1\ua3b4\u873d\u71ae\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u494c\u4975\ua068\u0c95\uc84e.\ucfaf\u9255\u839e\u8258\uc31c\u983f p3) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(loadelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\uc29a\u4bc8\u4ab3\u1187\u527a\u8753, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308), invokevirtual:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4e72\ucef1\ub171\u946b\uc246\u8d90, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u0c95\u5654\ud7e8\u4e72\u8df4\u4179(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u494c\u4975\ua068\u0c95\uc84e.\ucfaf\u9255\u839e\u8258\uc31c\u983f p3) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(loadelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u72f1\u8cae\u64f2\ube23\u64f2\u9255, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308), invokevirtual:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4e72\ucef1\ub171\u946b\uc246\u8d90, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u4d85\u6ec6\ud171\u6d69\u7d52\u392e(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0) {
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
            return:int(shl:int(xor:int(ldc:int(66), ldc:int(67)), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u9937\u40a9\ucb79\uf94d\u7330\u960f, p0:\u760c\u4975\u4179\uc246\u8640\u64f2)))
        }
        
        goto(Label_0006)
    }
    
    public int \u4e72\ucef1\ub171\u946b\uc246\u8d90(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_2_5F : int
        stack_93_0 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7 [generated]
        
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
            var_2_5F = and:int(ldc:int(2072462536), ldc:int(-1615919137))
            
            if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ub1b9\u64ab\u527a\u51b2\u0c95\u516c)))))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1205800245))
                stack_93_0 = invokespecial:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            }
            else {
                stack_93_0 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec::\uc29a\u0b8e\uceb8\u9937\u6bb9\u7873, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), and:int[expected:boolean](ldc:int(22543), ldc:int(-31760)))
            }
            
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(stack_93_0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7873\u1187\u71f1\u600f\ud51e\ub70c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u516c\u3d64\u718f\ub171\u6b5f.\uc4d2\ufcaf\u4f52\u120d\uc2e8\u7873 p3) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-8988), ldc:int(8459)))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u6b5f\u9937\u5f50\u516c\ub32d\uceb8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p1) {
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
        
        switch (loadelement:int(getstatic:int[](\u5140\u392e\ubcb0\u4ab3\u9255\ud217::\ucef1\uc84e\u4d85\u8640\ubcb0\u839e), invokevirtual:int(Enum<E>::ordinal, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d[expected:Enum<\u7049\u52d3\u8640\u5654\u1833\ub18d>]))) {
            case 1:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c)))))
            
            case 2:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a)))))
            
            case 3:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2)))))
            
            default:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5 p1) {
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
        
        switch (loadelement:int(getstatic:int[](\u5140\u392e\ubcb0\u4ab3\u9255\ud217::\u5654\ua3b4\u74b1\u69d9\u183a\uc87f), invokevirtual:int(Enum<E>::ordinal, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5[expected:Enum<\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5>]))) {
            case 1:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a)))))
            
            case 2:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c)))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c), invokevirtual:V extends T[expected:Comparable](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<V>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c)))))
            
            default:
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokespecial:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5))
        }
    }
    
    private static int lambda$\u9937\u8258\uc246\u6b5f\ud7e8\uff55$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_61 : int
        var_3_69 : int
        var_1_87 : int
        
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
            var_1_61 = and:int(ldc:int(-750051349), ldc:int(-529661967))
            var_3_69 = and:int(ldc:int(2765), ldc:int(-2768))
            
            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u56bd\u8df4\uc2bd\u8389\u5654\u527a))))) {
                var_3_69 = or:int(var_3_69:int, invokestatic:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4d85\u6ec6\ud171\u6d69\u7d52\u392e, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_87 = and:int(var_1_61:int, ldc:int(-1821627074))
                    goto(Label_0234)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_87 = and:int(var_1_61:int, ldc:int(-1604334793))
                }
                else {
                    var_1_87 = and:int(var_1_61:int, ldc:int(-565576213))
                    
                    if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u392e\uc87f\u1833\u6435\u6cfe\ub19c))))) {
                        var_3_69 = or:int(var_3_69:int, invokestatic:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4d85\u6ec6\ud171\u6d69\u7d52\u392e, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)))
                    }
                }
                
                Label_0178:
                
                if (cmpeq:boolean(and:int(var_1_87:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_87 = and:int(var_1_87:int, ldc:int(1152369501))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_87:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_87:int, ldc:int(1615936602))
                        loopcontinue()
                    }
                    
                    var_1_87 = and:int(var_1_87:int, ldc:int(-1971325453))
                    
                    if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\ud4fe\uf9c5\ud7e8\u7e3f\ud51e\uc4d2))))) {
                        var_3_69 = or:int(var_3_69:int, invokestatic:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4d85\u6ec6\ud171\u6d69\u7d52\u392e, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
                    }
                }
                
                Label_0234:
                
                if (cmpeq:boolean(and:int(var_1_87:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpne:boolean(and:int(var_1_87:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_87:int, ldc:int(-144658137))
            }
            
            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4492\u3bd6\uc238\uc2e8\u47c2\uc31c))))) {
                var_3_69 = or:int(var_3_69:int, invokestatic:int(\u8258\u62da\ud4fe\u0a06\u5f50\u8308::\u4d85\u6ec6\ud171\u6d69\u7d52\u392e, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)))
            }
            
            return:int(var_3_69:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8308\u3a62\u624e\uc7fe\u527a\u7bad$0(java.util.Map.Entry p0) {
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
            return:boolean(invokevirtual:boolean(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u12b2\u759a\u52d3\u74b1\u927d\ua3b4, invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokeinterface:\u760c\u4975\u4179\uc246\u8640\u64f2(Entry<\u760c\u4975\u4179\uc246\u8640\u64f2, V>::getKey, p0:Entry<\u760c\u4975\u4179\uc246\u8640\u64f2, V>)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(1134107128), ldc:int(2100903787))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\u62da\ud4fe\u0a06\u5f50\u8308[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-40018467))
            var_5_81 = and:int(ldc:int(-13242), ldc:int(12728))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24081), ldc:int(-24082)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-136316567))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(4160), ldc:int(4161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2113), ldc:int(1291)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(-237299330))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4258), ldc:int(4259)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-217297484))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(800910035))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1484513578))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1093410151))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-230798420))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1399647969))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(270765276))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-570738341))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1586975986))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-234164449))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-494395240))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-116635391))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1708088229))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1129267484))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1301920111))
                        var_11_EB = and:int(ldc:int(-9038), ldc:int(8781))
                        goto(Label_1589)
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1225069633))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-6702648))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(125717104))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1950463850))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1034752356))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1349275028))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2063385818))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1360904024))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1368126940))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-707020423))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(2177), ldc:int(9497))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1257896065))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1084150576))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1599281374))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1239759428))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1515600226))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-424393453))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1384065069))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-71574024))
                        var_11_EB = and:int(ldc:int(18248), ldc:int(-18281))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1731873621))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1999899086))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2132136187))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1158436680))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1800452244))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1800397107))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1230708733))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(534252847))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(3541295))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(28868069))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-775464965))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-662257950))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-545317505))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(738718072))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1889510063))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(361301338))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1792026727))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1958370694))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1280592160))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-575022242))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(310515871))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-238422952))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1999230549))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-79872514))
                        var_17_6BC = add:int(var_16_119:int, xor:int(ldc:int(8194), ldc:int(8195)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1990505016))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2109307208))
                
                if (cmple:boolean(var_5_81 = var_17_6BC:int, sub:int(var_6_88:int, xor:int(ldc:int(5), ldc:int(4))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1471069053))
            goto(Label_0108)
        }
    }
}
