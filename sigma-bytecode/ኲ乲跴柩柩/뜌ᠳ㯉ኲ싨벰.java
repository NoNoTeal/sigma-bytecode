public class \u12b2\u4e72\u8df4\u67e9\u67e9.\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0 {
    public void \ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0(\u3d64\u7af6\uae87\uc238\u7d52.\uae87\u8308\u6fb0\u3bd6\uae5d\uc229 p0) {
        var_4_86 : int
        
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
            putfield:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229(\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u16f6\u7d52\u7af6\u4ab3\u56bd\u3dd3, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, p0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229)
            invokespecial:\ub7dc\u0800\u64ab\u8640\u6198\u927d(\ub7dc\u0800\u64ab\u8640\u6198\u927d::<init>, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229), getfield:int(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, p0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229), getfield:int(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229), ldc:int(80), sub:int(getfield:int(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, p0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229), ldc:int(37)), ldc:int(24))
            var_4_86 = and:int(ldc:int(-6305), ldc:int(6304))
            
            while (cmplt:boolean(var_4_86:int, invokeinterface:int(List::size, invokestatic:List(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\ub171\uae5d\ud4fe\uc2bd\ud51e\ub102)))) {
                invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>], initobject:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f(\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f::<init>, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0))
                inc:int(var_4_86, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873(\u6b0d\u12cb\u156b\u4179\u8bb0.\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f p0) {
        var_2_5F : int
        stack_CC_0 : \u74b1\u516c\u7330\ud523\u8df4\uc87f [generated]
        stack_C6_1 : String [generated]
        expr_A2 : Object[] [generated]
        var_2_6D : int
        stack_E2_0 : \uae87\u8308\u6fb0\u3bd6\uae5d\uc229 [generated]
        stack_E2_1 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(400912439), ldc:int(400096931))
            invokespecial:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>], p0:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f)
            
            if (cmpne:boolean(p0:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f, aconstnull:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f())) {
                stack_CC_0 = getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c)
                stack_C6_1 = loadelement:String(getstatic:String[](\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc), and:int(ldc:int(-25180), ldc:int(8795)))
                expr_A2 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(514), ldc:int(515)))
                storeelement:Object(expr_A2:Object[], and:int(ldc:int(2315), ldc:int(-2320)), invokevirtual:ITextComponent[expected:Object](\u7006\ud36e\u3e2a\u8308\u61a4\u8258::\u960f\u6b5f\u718f\u92ff\u836c\u9033, checkcast:\u7006\ud36e\u3e2a\u8308\u61a4\u8258(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7006\ud36e\u3e2a\u8308\u61a4\u8258.class, invokeinterface:\u7006\ud36e\u3e2a\u8308\u61a4\u8258(List<\u7006\ud36e\u3e2a\u8308\u61a4\u8258>::get, invokestatic:List(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\ub171\uae5d\ud4fe\uc2bd\ud51e\ub102), invokeinterface:int(List<E>::indexOf, invokevirtual:List<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>::\u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>]), p0:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f[expected:Object])))))
                invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, stack_CC_0:\u74b1\u516c\u7330\ud523\u8df4\uc87f, invokevirtual:String(ITextComponent::getString, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_C6_1:String, expr_A2:Object[])))
            }
            
            var_2_6D = and:int(var_2_5F:int, ldc:int(2143026679))
            stack_E2_0 = getfield:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229(\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u16f6\u7d52\u7af6\u4ab3\u56bd\u3dd3, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0)
            
            if (cmpeq:boolean(p0:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f, aconstnull:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f())) {
                var_2_6D = and:int(var_2_6D:int, ldc:int(2140697711))
                stack_E2_1 = and:int[expected:boolean](ldc:int(1132), ldc:int(-1133))
            }
            else {
                stack_E2_1 = and:int[expected:boolean](ldc:int(2121), ldc:int(1207))
            }
            
            invokevirtual:void(\uae87\u8308\u6fb0\u3bd6\uae5d\uc229::\u72f1\uc9f6\u9a18\ud523\u12b2\u2dcc, stack_E2_0:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, stack_E2_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc4d2\uc29a\u416d\ucfaf\u071d\uc29a() {
        var_1_5F : int
        stack_8A_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-399894696), ldc:int(-1192566913))
            
            if (cmpne:boolean(invokevirtual:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u36d3\u97b7\u6ec6\u4c04\ud171\u5245::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, getfield:\uae87\u8308\u6fb0\u3bd6\uae5d\uc229[expected:\u36d3\u97b7\u6ec6\u4c04\ud171\u5245](\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u16f6\u7d52\u7af6\u4ab3\u56bd\u3dd3, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0)), this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753])) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1392986247))
                stack_8A_0 = and:int(ldc:int(21546), ldc:int(-21675))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(5216), ldc:int(5217))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_94 : int
        
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
        var_4_94 = and:int(ldc:int(1167614011), ldc:int(-2202760))
        
        if (logicalnot:boolean(invokespecial:boolean(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>], p0:int, p1:int, p2:int))) {
            loop {
                if (cmpeq:boolean(and:int(var_4_94:int, ldc:int(512)), ldc:int(0))) {
                    var_4_94 = and:int(var_4_94:int, ldc:int(-672514695))
                    
                    if (cmpne:boolean(p0:int, and:int(ldc:int(8509), ldc:int(5569)))) {
                        if (cmpne:boolean(p0:int, and:int(ldc:int(6479), ldc:int(1359)))) {
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_94:int, ldc:int(16)), ldc:int(0))) {
                    var_4_94 = and:int(var_4_94:int, ldc:int(-843546759))
                    
                    if (cmpeq:boolean(invokevirtual:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>]), aconstnull:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f())) {
                        looporswitchbreak()
                    }
                    
                    invokestatic:void(\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f::\u5140\u6c52\uf9c5\u7bad\ua61f\u34df, checkcast:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f.class, invokevirtual:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f>])))
                    looporswitchbreak()
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-23579), ldc:int(23578)))
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(-16112), ldc:int(-16111)))
    }
    
    public void \u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u93a2\ube23\u624e\u6fb0\u4daf\u92ee p0) {
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
            invokevirtual:void(\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, checkcast:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f.class, p0:\u71ae\u7e3f\u4daf\u120d\u4c2b\u7e3f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u6c56\u8709\u5bc4\u12cb\uc229\uc87f(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u8258\u7d52\uc229\u3dd3\ud51e\u7049, p0:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_242_0 : byte[] [generated]
        stack_297_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        var_0_1A1 : int
        expr_189 : byte [generated]
        stack_1CD_2 : byte [generated]
        stack_1A4_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_231 : byte[]
        var_5_232 : int
        expr_F6 : int [generated]
        var_3_286 : byte[]
        var_5_287 : int
        expr_297 : byte [generated]
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-955720333), ldc:int(-552634553))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bOxUwBUc2AibALxdpY2pLA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1A1 = and:int(var_0_5F:int, ldc:int(-202807849))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_189 = stack_1CD_2 = loadelement(stack_189_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(4)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_1CD_2 = stack_1A4_0 = add:byte(expr_189:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(4))))
                goto(Label_0436)
            }
            
            Label_0406:
            
            if (cmpeq:boolean(and:int(var_0_1A1:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1A1 = and:int(var_0_1A1:int, ldc:int(-497222283))
                stack_1CD_2 = stack_1A4_0 = add:byte(expr_189:byte, ldc:byte(4))
            }
            
            Label_0436:
            
            if (cmpne:boolean(and:int(var_0_1A1:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1A1 = and:int(var_0_1A1:int, ldc:int(215828319))
                goto(Label_0406)
            }
            
            var_0_5F = and:int(var_0_1A1:int, ldc:int(-956604497))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_1CD_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        Label_0499:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-695572635))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            storeelement:byte(var_3_171:byte[], var_5_172:int, add:byte(loadelement:byte(stack_208_0:byte[], var_5_172:int), ldc:byte(80)))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_171:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0372)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1387327756))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-820032167))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_16C = expr_96:int
                var_3_171 = newarray:byte[](byte.class, expr_96:int)
                var_5_172 = expr_96:int
                goto(Label_0499)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(954742347))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-497027831))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_231 = newarray:byte[](byte.class, expr_C3:int)
                var_5_232 = expr_C3:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-149240387))
                    var_5_232 = add:int(var_5_232:int, ldc:int(-1))
                    storeelement:byte(var_3_231:byte[], var_5_232:int, add:int(shl:int(loadelement:byte(stack_242_0:byte[], var_5_232:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_232:int, xor:int(ldc:int(5256), ldc:int(5257)))), ldc:int(6)), and:int(ldc:int(2643), ldc:int(259)))))
                    
                    if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_231:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-309467789))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-319319624))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-8824985))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_286 = newarray:byte[](byte.class, expr_F6:int)
                var_5_287 = expr_F6:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-477311055))
                    var_5_287 = add:int(var_5_287:int, ldc:int(-1))
                    expr_297 = loadelement:byte(stack_297_0:byte[], var_5_287:int)
                    storeelement:byte(var_3_286:byte[], var_5_287:int, xor:int(or:int(and:int(shl:int(expr_297:byte, xor:int(ldc:int(256), ldc:int(260))), ldc:int(-16)), and:int(shr:int(expr_297:byte[expected:int], xor:int(ldc:int(8356), ldc:int(8352))), ldc:int(15))), ldc:int(27)))
                    
                    if (cmpne:boolean(var_5_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_286:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1030291807))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1294803458))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17453), ldc:int(65)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16392), ldc:int(16393)))
        storeelement:String(expr_144:String[], and:int(ldc:int(284), ldc:int(-285)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-47), ldc:int(46)), and:int(ldc:int(143), ldc:int(527))))
        putstatic:String[](\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0::\u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc, expr_144:String[])
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_6B0 : int
        
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
        var_3_6A5 = and:int(ldc:int(-524036808), ldc:int(-1290313794))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-46975623))
            var_5_7D = and:int(ldc:int(5143), ldc:int(-30360))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16982), ldc:int(-24151)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_6A5:int, ldc:int(-447002632))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, xor:int(ldc:int(898), ldc:int(899)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(1233), ldc:int(2817)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_6A5 = and:int(var_3_CD:int, ldc:int(-210778567))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(425), ldc:int(10247)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(154504879))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-353117140))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0548)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0368:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1146673368))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1648643126))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(608361564))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1609746043))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(999247138))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-909177566))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1591220930))
                            var_11_DE = and:int(ldc:int(-19288), ldc:int(2902))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0548:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(618057452))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1421929835))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1569266324))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-2095783305))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-377749633))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(283686210))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-10040891))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(675294503))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(816144921))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1882444072))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-904358627))
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-407901476))
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1681917950))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-121131525))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(911620300))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(237089055))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-449541948))
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1479596184))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(4872), ldc:int(4873))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-296548515))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1712104076))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(863969689))
                            goto(Label_0368)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(339490948))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-350243090))
                        var_11_DE = and:int(ldc:int(-24866), ldc:int(24865))
                    }
                    
                    Label_1109:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1692279512))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1701651989))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1999481539))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1791668309))
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(384285740))
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(566315118))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-21545937))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1587604802))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(903450769))
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(474375259))
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-708246832))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1543306184))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-226549907))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1391:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1758113367))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1142830762))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1685573142))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(622737140))
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(2075703281))
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(434725250))
                        loopcontinue()
                    }
                    
                    var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-203180482))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1309963386))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-502702331))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(883652279))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1265272700))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1503014182))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1114720305))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-281859389))
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-420227783))
                        var_17_6B0 = add:int(var_16_10C:int, xor:int(ldc:int(-27520), ldc:int(-27519)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1590074189))
                }
                
                var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1241000136))
                
                if (cmple:boolean(var_5_7D = var_17_6B0:int, sub:int(var_6_84:int, xor:int(ldc:int(144), ldc:int(145))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
