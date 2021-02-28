public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0 {
    public void \ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0() {
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
            invokespecial:Object(Object::<init>, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7d52\u5654\u52d3\u836c\ub1b9\u6b0d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, boolean p1, boolean p2) {
        var_4_61 : int
        var_4_C4 : int
        var_6_D5 : \u51fa\u6c52\u7330\u7330\u960f
        var_4_E1 : int
        var_7_E7 : Random
        stack_136_0 : int [generated]
        stack_136_1 : int [generated]
        var_4_134 : int
        var_8_137 : int
        stack_168_0 : int [generated]
        stack_168_1 : int [generated]
        var_4_166 : int
        var_10_17E : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_4_61 = and:int(ldc:int(1838302652), ldc:int(1725202419))
        
        if (p2:boolean) {
            if (invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u62da\u3776\u92ff\ud4fe\u4ab3\uc2e8))) {
                putfield:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ud7e8\ud7e8\u7ce1\ubcb0\u7043\ufe34, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, sub:int(getfield:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ud7e8\ud7e8\u7ce1\ubcb0\u7043\ufe34, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0), xor:int(ldc:int(13440), ldc:int(13441))))
                
                if (cmple:boolean(getfield:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ud7e8\ud7e8\u7ce1\ubcb0\u7043\ufe34, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0), ldc:int(0))) {
                    goto(Label_0183)
                }
                
                return:int(and:int(ldc:int(-11016), ldc:int(2823)))
            }
        }
        
        Label_0103:
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32)), ldc:int(0))) {
            return:int(and:int(ldc:int(-19774), ldc:int(18749)))
        }
        
        var_4_61 = and:int(var_4_61:int, ldc:int(339201232))
        Label_0183:
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0103)
        }
        
        var_4_C4 = and:int(var_4_61:int, ldc:int(-420089879))
        putfield:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ud7e8\ud7e8\u7ce1\ubcb0\u7043\ufe34, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, xor:int(ldc:int(16806), ldc:int(17686)))
        var_6_D5 = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ube23\uc238\u5140\u4cd9\u8aa5::\u4daf\u960f\u67d0\u0c95\uc9f6\u7043, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
        
        if (cmpeq:boolean(var_6_D5:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
            return:int(and:int(ldc:int(-794), ldc:int(793)))
        }
        
        var_4_E1 = and:int(var_4_C4:int, ldc:int(-407669332))
        var_7_E7 = getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
        stack_136_0 = add:int(ldc:int(8), invokevirtual:int(Random::nextInt, var_7_E7:Random, ldc:int(24)))
        
        if (logicalnot:boolean(invokevirtual:boolean(Random::nextBoolean, var_7_E7:Random))) {
            var_4_E1 = and:int(var_4_E1:int, ldc:int(2109164974))
            stack_136_1 = xor:int(ldc:int(4362), ldc:int(4363))
        }
        else {
            stack_136_1 = ldc:int(-1)
        }
        
        var_4_134 = and:int(var_4_E1:int, ldc:int(2126348157))
        var_8_137 = mul:int(stack_136_0:int, stack_136_1:int)
        stack_168_0 = add:int(ldc:int(8), invokevirtual:int(Random::nextInt, var_7_E7:Random, ldc:int(24)))
        
        if (logicalnot:boolean(invokevirtual:boolean(Random::nextBoolean, var_7_E7:Random))) {
            var_4_134 = and:int(var_4_134:int, ldc:int(-325683350))
            stack_168_1 = and:int(ldc:int(527), ldc:int(18785))
        }
        else {
            stack_168_1 = ldc:int(-1)
        }
        
        var_4_166 = and:int(var_4_134:int, ldc:int(-456098397))
        var_10_17E = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_6_D5:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_8_137:int, and:int(ldc:int(18083), ldc:int(-30388)), mul:int(stack_168_0:int, stack_168_1:int))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uc31c\u6c52\u5bc4\ud523\u64f2\ub6ab, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10))))) {
            return:int(and:int(ldc:int(6976), ldc:int(-6977)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_4_166:int, ldc:int(1)), ldc:int(0))) {
                var_4_166 = and:int(var_4_166:int, ldc:int(-1132159429))
            }
            else {
                var_4_166 = and:int(var_4_166:int, ldc:int(-457322691))
                
                if (invokestatic:boolean(\ud7e8\ud171\u9937\u647c\u6b5f\ud523::\u5d20\u839e\u5f50\ua068\uc2e8\u416d, getstatic:\u8640\u51fa\u5f50\u4492\u8258(\u8640\u51fa\u5f50\u4492\u8258::\u40a9\u946b\u36d3\uc229\u416d\uc238), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u759a\uff55\u8753\u69d9\u93a2>(\u9255\u0c95\u4cd9\ube23\u760c::\u3e75\u16f6\u3bc9\u416d\ud158\u494c))) {
                    if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8bb0\u69d9\ubf56\u839e\u392e\u92ee, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(834), ldc:int(2191)))) {
                        return:int(invokespecial:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\u4daf\u516c\ua3b4\u62da\u6d99\u61a4, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                    }
                    
                    var_4_166 = and:int(var_4_166:int, ldc:int(1991305190))
                    
                    if (invokevirtual:boolean(\u34df\uceb8\u34df\u8640\u1187<C>::\u4e72\ufe34\u0c95\u3e2a\u8d98\ud36e, invokevirtual:\u34df\uceb8\u34df\u8640\u1187<?>(\u8753\u4975\ubf56\u6b0d\u7e3f::\u5245\ucfaf\u8709\u8709\ub83f\uc3e3, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, p0:\ube23\uc238\u5140\u4cd9\u8aa5), var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int[expected:boolean](ldc:int(-32726), ldc:int(-32725)), getstatic:\ub102\ua61f\ua61f\u69d9\u98a4[expected:\u5654\u9937\u72f1\ud4fe\u0c95<?>](\u5654\u9937\u72f1\ud4fe\u0c95::\u9af2\u760c\ud217\u6cfe\ub32d\ud523)))) {
                        return:int(invokespecial:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\u4c04\ub6ab\u64f2\u8aa5\u62da\uc7fe, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_10_17E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_4_166:int, ldc:int(1048576)), ldc:int(0))) {
                return:int(and:int(ldc:int(26417), ldc:int(-28466)))
            }
        }
    }
    
    private int \u4daf\u516c\ua3b4\u62da\u6d99\u61a4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
        
        if (logicaland:boolean(cmpgt:boolean(invokevirtual:long(\u6c52\u9a18\u3504\u718f\u64f2\u6ec6::\u4f4a\ub6ab\u8d98\u0800\uc3e3\u88c5, invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1, p0:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:Predicate<\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0>(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u6bb9\u7af6\u6435\u6bb9\u8cae\ub113, getstatic:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u76bc\ua6bd\u8c8a\u494c\u839e\u8308)), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(48), getstatic:\ubcb0\u9af2\u92ee\uc7fe\u56bd\u36d3(\ubcb0\u9af2\u92ee\uc7fe\u56bd\u36d3::\u5654\u416d\uceb8\u1833\u6bb9\u3d4b)), ldc:long(4L)), cmplt:boolean(invokeinterface:int(List<E>::size, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u965f\ucef1\u34df\u4daf\u760c\u6d99, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e], ldc:Class<\u759a\uff55\u8753\u69d9\u93a2>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:double(48.0), ldc:double(8.0), ldc:double(48.0)))), xor:int(ldc:int(20502), ldc:int(20499))))) {
            return:int(invokespecial:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ub113\uc31c\u71f1\ub18d\u8413\ucef1, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        return:int(and:int(ldc:int(-28016), ldc:int(19819)))
    }
    
    private int \u4c04\ub6ab\u64f2\u8aa5\u62da\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_3_5F : int
        stack_AF_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-761180078), ldc:int(2092702878))
            
            if (cmpge:boolean(invokeinterface:int(List<E>::size, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u965f\ucef1\u34df\u4daf\u760c\u6d99, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e], ldc:Class<\u759a\uff55\u8753\u69d9\u93a2>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:double(16.0), ldc:double(8.0), ldc:double(16.0)))), xor:int(ldc:int(-28669), ldc:int(-28670)))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1626003247))
                stack_AF_0 = and:int(ldc:int(-4949), ldc:int(4948))
            }
            else {
                stack_AF_0 = invokespecial:int(\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0::\ub113\uc31c\u71f1\ub18d\u8413\ucef1, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
            }
            
            return:int(stack_AF_0:int)
        }
        
        goto(Label_0006)
    }
    
    private int \ub113\uc31c\u71f1\ub18d\u8413\ucef1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1) {
        var_5_6A : \u759a\uff55\u8753\u69d9\u93a2
        
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
        var_5_6A = checkcast:\u759a\uff55\u8753\u69d9\u93a2(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u759a\uff55\u8753\u69d9\u93a2.class, invokevirtual:\u759a\uff55\u8753\u69d9\u93a2(\u9255\u0c95\u4cd9\ube23\u760c<\u759a\uff55\u8753\u69d9\u93a2>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u759a\uff55\u8753\u69d9\u93a2>(\u9255\u0c95\u4cd9\ube23\u760c::\u3e75\u16f6\u3bc9\u416d\ud158\u494c), p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
        
        if (cmpne:boolean(var_5_6A:\u759a\uff55\u8753\u69d9\u93a2, aconstnull:\u759a\uff55\u8753\u69d9\u93a2())) {
            invokevirtual:\u120d\u98a4\uceb8\u8cae\u47c2(\u759a\uff55\u8753\u69d9\u93a2::\uc3e3\u183a\u8640\ud171\uafe7\u1833, var_5_6A:\u759a\uff55\u8753\u69d9\u93a2, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u5f50\u3e75\u51fa\u983f\u67e9(\u5f50\u3e75\u51fa\u983f\u67e9::\u6fb0\u120d\u7bad\uc7fe\u64ab\uc3e3), checkcast:\u120d\u98a4\uceb8\u8cae\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u120d\u98a4\uceb8\u8cae\u47c2.class, aconstnull:\u120d\u98a4\uceb8\u8cae\u47c2()), checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u4cd9\ub7dc\ucfaf\ub18d\u071d, var_5_6A:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:float(0.0f), ldc:float(0.0f))
            invokevirtual:void(\ua6bd\u8d98\u6ec6\uc246\uc238::\u624e\ub113\u3a62\u93a2\u6cfe\u6fb0, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], var_5_6A:\u759a\uff55\u8753\u69d9\u93a2[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:int(xor:int(ldc:int(10250), ldc:int(10251)))
        }
        
        return:int(and:int(ldc:int(-22975), ldc:int(22920)))
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
    
    public void \u1187\ufcaf\uf94d\ub6ab\u7d52\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_65C : int
        
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
        var_3_651 = and:int(ldc:int(763598575), ldc:int(1994099311))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\u64f2\u2dcc\u8258\ub18d\u67d0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(994543789))
        }
        else {
            var_3_651 = and:int(var_3_651:int, ldc:int(-1208584857))
            var_5_8A = and:int(ldc:int(2824), ldc:int(-2825))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8320), ldc:int(-8321)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_651:int, ldc:int(-286728713))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(10372), ldc:int(10373)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8321), ldc:int(1067)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_DA:int, ldc:int(-1133598985))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1281), ldc:int(83)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(697785486))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-2059322398))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1485267337))
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(854040887))
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(934088319))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(245747967))
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1620570842))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-45487769))
                        var_11_EB = and:int(ldc:int(15619), ldc:int(-15620))
                        goto(Label_1494)
                    }
                    
                    Label_0555:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(649141242))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1578440413))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-83570194))
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1237363939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(528548008))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1502136081))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-532496744))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1157851289))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(889971319))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0797:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-772230705))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-653231694))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1720275237))
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-513900706))
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(583497699))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-6227737))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(2594), ldc:int(2595))
                                goto(Label_1078)
                            }
                        }
                    }
                    
                    Label_0928:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1480876456))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1366050521))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(558609024))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1702635263))
                        var_11_EB = and:int(ldc:int(-6567), ldc:int(6562))
                    }
                    
                    Label_1078:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-455374142))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(553689361))
                            goto(Label_0928)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1794446583))
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1784694683))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(785304896))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1680101487))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1355836800))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1231281526))
                            goto(Label_1078)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0928)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-2056098220))
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1058246839))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(2134531345))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-282500361))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-365523220))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(154728983))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-519633116))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1699052902))
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1484449610))
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(1690328319))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(304448936))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(793898521))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(621892907))
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-305858449))
                        var_17_65C = add:int(var_16_119:int, xor:int(ldc:int(-32476), ldc:int(-32475)))
                        looporswitchbreak()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(481944880))
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(628322039))
                
                if (cmple:boolean(var_5_8A = var_17_65C:int, sub:int(var_6_91:int, xor:int(ldc:int(2059), ldc:int(2058))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
