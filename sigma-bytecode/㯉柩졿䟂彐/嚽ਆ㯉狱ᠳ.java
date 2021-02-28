public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u56bd\u0a06\u3bc9\u72f1\u1833 {
    public void \u56bd\u0a06\u3bc9\u72f1\u1833(\u56bd\u8413\u647c\u5bc4\ud158.\u4f52\u3bc9\u7d52\ud523\ub6ab p0) {
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
            invokespecial:Object(Object::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            putfield:List<UUID>(\u56bd\u0a06\u3bc9\u72f1\u1833::\u52d3\u2dcc\u6198\ucb79\u1833, this:\u56bd\u0a06\u3bc9\u72f1\u1833, initobject:ArrayList<UUID>[expected:List<UUID>](ArrayList<E>::<init>))
            putfield:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(\u56bd\u0a06\u3bc9\u72f1\u1833::\ucfaf\u8709\u6fb0\u67e9\uc3e3, this:\u56bd\u0a06\u3bc9\u72f1\u1833, initobject:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(HashMap<K, V>::<init>))
            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u3776\uc31c\uf94d\uc7fe\u8640, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), this:\u56bd\u0a06\u3bc9\u72f1\u1833[expected:Object])
            putfield:HttpClient(\u56bd\u0a06\u3bc9\u72f1\u1833::\u3776\u3d64\u72f1\u4179\u7043, this:\u56bd\u0a06\u3bc9\u72f1\u1833, invokestatic:CloseableHttpClient[expected:HttpClient](HttpClients::createDefault))
            putfield:\u4f52\u3bc9\u7d52\ud523\ub6ab(\u56bd\u0a06\u3bc9\u72f1\u1833::\uf9c5\u873d\u3c25\u8753\u3e75, this:\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u4f52\u3bc9\u7d52\ud523\ub6ab)
            putfield:\ub70c\u836c\u071d\u74b1\uff55(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud7e8\uc4d2\ub7dc\ubf56\u183a, this:\u56bd\u0a06\u3bc9\u72f1\u1833, initobject:\ub70c\u836c\u071d\u74b1\uff55(\ub70c\u836c\u071d\u74b1\uff55::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833))
            putstatic:boolean(\u67e9\ub171\ud158\u62da\uc2bd::\u51fa\u72f1\u527a\ud12e\ud7e8, or:int[expected:boolean](getstatic:boolean[expected:int](\u67e9\ub171\ud158\u62da\uc2bd::\u51fa\u72f1\u527a\ud12e\ud7e8), ternaryop:int(cmpeq:boolean(getfield:String(\u4f52\u3bc9\u7d52\ud523\ub6ab::\u6b5f\ud4fe\u3bd6\ua6bd\ud36e, invokevirtual:\u4f52\u3bc9\u7d52\ud523\ub6ab(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8308\u183a\u946b\ubff1\u946b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), aconstnull:String()), and:int(ldc:int(-6048), ldc:int(5532)), xor:int(ldc:int(-28672), ldc:int(-28671)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.HashMap<java.util.UUID, \u56bd\u8413\u647c\u5bc4\ud158.\u3bc9\u416d\u600f\ua068\u0800> \u67e9\u99f7\uf94d\uc7fe\u99f7() {
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
            return:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(getfield:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(\u56bd\u0a06\u3bc9\u72f1\u1833::\ucfaf\u8709\u6fb0\u67e9\uc3e3, this:\u56bd\u0a06\u3bc9\u72f1\u1833))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3a62\uc2bd\u64f2\u5db4\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_5F : int
        stack_98_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(264047711), ldc:int(188635132))
            
            if (logicaland:boolean(cmpne:boolean(p0:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), invokevirtual:boolean(HashMap<K, V>::containsKey, getfield:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(\u56bd\u0a06\u3bc9\u72f1\u1833::\ucfaf\u8709\u6fb0\u67e9\uc3e3, this:\u56bd\u0a06\u3bc9\u72f1\u1833), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f)))) {
                stack_98_0 = xor:int(ldc:int(-26620), ldc:int(-26619))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-583153794))
                stack_98_0 = and:int(ldc:int(16951), ldc:int(-26232))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u3bc9\u416d\u600f\ua068\u0800 \u4492\ub70c\u5f50\u0a06\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:\u3bc9\u416d\u600f\ua068\u0800(checkcast:\u3bc9\u416d\u600f\ua068\u0800(\u56bd\u8413\u647c\u5bc4\ud158.\u3bc9\u416d\u600f\ua068\u0800.class, invokevirtual:\u3bc9\u416d\u600f\ua068\u0800(HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>::get, getfield:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(\u56bd\u0a06\u3bc9\u72f1\u1833::\ucfaf\u8709\u6fb0\u67e9\uc3e3, this:\u56bd\u0a06\u3bc9\u72f1\u1833), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f))))
        }
        
        goto(Label_0006)
    }
    
    private void \u4c04\ub6ab\ubff1\uff55\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
        var_2_5F : int
        var_2_11B : int
        var_4_83 : List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>
        var_5_8C : Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>
        var_6_FD : \uc910\ufcaf\uc229\u9255\u71f1\u0b8e
        var_6_D8 : Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>
        var_7_E1 : int
        var_8_EA : JsonArray
        var_9_1B8 : \uc910\ufcaf\uc229\u9255\u71f1\u0b8e
        stack_214_0 : \u960f\u6ec6\u3e75\u8d90\u36d3 [generated]
        stack_214_1 : String [generated]
        expr_206 : Object[] [generated]
        
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
        var_2_5F = and:int(ldc:int(2123200895), ldc:int(-763212930))
        
        if (cmpne:boolean(rem:int(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833))), ldc:int(100)), ldc:int(0))) {
            return:void()
        }
        
        var_2_11B = and:int(var_2_5F:int, ldc:int(-702420642))
        invokespecial:void(\u56bd\u0a06\u3bc9\u72f1\u1833::\u5654\uc229\uf995\u5654\u3504, this:\u56bd\u0a06\u3bc9\u72f1\u1833)
        var_4_83 = invokevirtual:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833)))
        var_5_8C = invokeinterface:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>::iterator, var_4_83:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>)
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_8C:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>)) {
            var_6_FD = checkcast:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e.class, invokeinterface:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e(Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>::next, var_5_8C:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>))
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::contains, getfield:List<UUID>(\u56bd\u0a06\u3bc9\u72f1\u1833::\u52d3\u2dcc\u6198\ucb79\u1833, this:\u56bd\u0a06\u3bc9\u72f1\u1833), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_6_FD:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\ufcaf\u64f2\uc246\u97b7::\ud7e8\u0800\uae87\u8d90\u183a, invokevirtual:\u5fe1\ufcaf\u64f2\uc246\u97b7(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4daf\ud51e\ubb2b\uc2e8\u8c8a, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_6_FD:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokeinterface:String(ITextComponent::getUnformattedComponentText, invokevirtual:ITextComponent(\ua3b4\u8aa5\ub113\ubf56\u873d::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_6_FD:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])), loadelement:String[expected:Object](getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(14612), ldc:int(-14613)))))) {
                        goto(Label_0346)
                    }
                }
            }
            
            Label_0272:
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(2)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(-837264898))
                invokeinterface:void(Iterator::remove, var_5_8C:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>)
            }
            
            Label_0346:
            
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0272)
            }
            
            var_2_11B = and:int(var_2_11B:int, ldc:int(-813146145))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(256)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(1789585886))
                
                if (cmpeq:boolean(invokeinterface:int(List::size, var_4_83:List), ldc:int(0))) {
                    return:void()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(33554432)), ldc:int(0))) {
                var_6_D8 = invokeinterface:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>::iterator, var_4_83:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>)
                var_7_E1 = and:int(ldc:int(4523), ldc:int(-12720))
                var_8_EA = initobject:JsonArray(JsonArray::<init>)
                
                while (logicaland:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_6_D8:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>), cmplt:boolean(postincrement:int(1, var_7_E1:int), ldc:int(70)))) {
                    var_9_1B8 = checkcast:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e.class, invokeinterface:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e(Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>::next, var_6_D8:Iterator<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>))
                    invokevirtual:void(JsonArray::add, var_8_EA:JsonArray, invokeinterface:String(ITextComponent::getUnformattedComponentText, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_9_1B8:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                    invokeinterface:boolean(List<UUID>::add, getfield:List<UUID>(\u56bd\u0a06\u3bc9\u72f1\u1833::\u52d3\u2dcc\u6198\ucb79\u1833, this:\u56bd\u0a06\u3bc9\u72f1\u1833), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_9_1B8:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                }
                
                if (cmpne:boolean(getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833), aconstnull:\u960f\u6ec6\u3e75\u8d90\u36d3())) {
                    if (invokevirtual:boolean(\u960f\u6ec6\u3e75\u8d90\u36d3::\ud36e\u34df\u3e2a\ud217\uc229\ua61f, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833))) {
                        stack_214_0 = getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833)
                        stack_214_1 = loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(3), ldc:int(2)))
                        expr_206 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(11), ldc:int(17)))
                        storeelement:Object(expr_206:Object[], and:int(ldc:int(-22593), ldc:int(22592)), var_8_EA:JsonArray[expected:Object])
                        invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u960f\u6ec6\u3e75\u8d90\u36d3::\u8350\u76bc\u67e9\uff55\u8bb0\u385b, stack_214_0:\u960f\u6ec6\u3e75\u8d90\u36d3, stack_214_1:String, expr_206:Object[])
                    }
                }
                
                return:void()
            }
            
            var_2_11B = and:int(var_2_11B:int, ldc:int(-810836084))
        }
    }
    
    private void \u5654\uc229\uf995\u5654\u3504() {
        var_1_61 : int
        var_3_6B : Iterator<UUID>
        var_4_A6 : Iterator<UUID>
        
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
            var_1_61 = and:int(ldc:int(1551135890), ldc:int(-621849033))
            var_3_6B = invokeinterface:Iterator<UUID>(List<UUID>::iterator, getfield:List<UUID>(\u56bd\u0a06\u3bc9\u72f1\u1833::\u52d3\u2dcc\u6198\ucb79\u1833, this:\u56bd\u0a06\u3bc9\u72f1\u1833))
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1836834774))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6B:Iterator)) {
                        if (cmpne:boolean(invokevirtual:\ua3b4\u8aa5\ub113\ubf56\u873d(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u6bb9\u62da\ub1b9\ub7dc\u93a2\ub171, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Iterator<UUID>::next, var_3_6B:Iterator<UUID>))), aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
                            loopcontinue()
                        }
                        
                        invokeinterface:void(Iterator::remove, var_3_6B:Iterator)
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(1748618341))
            }
            
            var_4_A6 = invokeinterface:Iterator<UUID>(Set<UUID>::iterator, invokevirtual:Set<UUID>(HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>::keySet, getfield:HashMap<UUID, \u3bc9\u416d\u600f\ua068\u0800>(\u56bd\u0a06\u3bc9\u72f1\u1833::\ucfaf\u8709\u6fb0\u67e9\uc3e3, this:\u56bd\u0a06\u3bc9\u72f1\u1833)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6B:Iterator<UUID>)) {
                if (cmpne:boolean(invokevirtual:\ua3b4\u8aa5\ub113\ubf56\u873d(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u6bb9\u62da\ub1b9\ub7dc\u93a2\ub171, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Iterator<UUID>::next, var_4_A6:Iterator<UUID>))), aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
                    loopcontinue()
                }
                
                invokeinterface:void(Iterator::remove, var_4_A6:Iterator)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\uf995\u8aa5\ud4fe\ubcb0(java.lang.String p0, java.lang.String p1) {
        var_5_69 : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        stack_C5_0 : \u960f\u6ec6\u3e75\u8d90\u36d3 [generated]
        stack_C5_1 : String [generated]
        expr_B7 : Object[] [generated]
        
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
            var_5_69 = initobject:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::<init>)
            invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_5_69:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(21), ldc:int(23))), p0:String[expected:Object])
            invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_5_69:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(18501), ldc:int(18502))), p1:String[expected:Object])
            
            if (cmpne:boolean(getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833), aconstnull:\u960f\u6ec6\u3e75\u8d90\u36d3())) {
                stack_C5_0 = getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833)
                stack_C5_1 = loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(20), ldc:int(23)))
                expr_B7 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(14913), ldc:int(16385)))
                storeelement:Object(expr_B7:Object[], and:int(ldc:int(-20945), ldc:int(20944)), var_5_69:\uc910\ub6ab\uafe7\ud217\u7330\u600f[expected:Object])
                invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u960f\u6ec6\u3e75\u8d90\u36d3::\u8350\u76bc\u67e9\uff55\u8bb0\u385b, stack_C5_0:\u960f\u6ec6\u3e75\u8d90\u36d3, stack_C5_1:String, expr_B7:Object[])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6435\u8413\u8d90\u9af2\u97e6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_28A : int
        var_2_BE : int
        var_4_C6 : \u647c\ucb79\ud4fe\u98a4\u3bd6
        var_5_192 : URISyntaxException
        
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
            var_2_28A = and:int(ldc:int(-1460946967), ldc:int(-1108609151))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_28A:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0161)
                }
                
                if (cmpeq:boolean(and:int(var_2_28A:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_28A = and:int(var_2_28A:int, ldc:int(293219909))
                }
                else {
                    var_2_28A = and:int(var_2_28A:int, ldc:int(-18176011))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u647c\ucb79\ud4fe\u98a4\u3bd6.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0139:
                
                if (cmpne:boolean(and:int(var_2_28A:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_28A:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_28A = and:int(var_2_28A:int, ldc:int(-1393629243))
                }
                
                Label_0161:
                
                if (cmpne:boolean(and:int(var_2_28A:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0139)
                }
                
                if (cmpeq:boolean(and:int(var_2_28A:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_BE = and:int(var_2_28A:int, ldc:int(-1141987359))
                    var_4_C6 = checkcast:\u647c\ucb79\ud4fe\u98a4\u3bd6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u647c\ucb79\ud4fe\u98a4\u3bd6.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u647c\ucb79\ud4fe\u98a4\u3bd6](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(512)), ldc:int(0))) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(816718709))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0339)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(284832965))
                        }
                        else {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-1192560681))
                            invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u67d0\u5140\u6198\u3e75\ub83f, invokestatic:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u927d\ub70c\uc2bd\u16f6\u16f6), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(521), ldc:int(525))))
                        }
                        
                        try {
                            Label_0274:
                            
                            while (cmpne:boolean(and:int(var_2_BE:int, ldc:int(8388608)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0415)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(4194304)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(134217728)), ldc:int(0))) {
                                        goto(Block_25)
                                    }
                                    
                                    var_2_BE = and:int(var_2_BE:int, ldc:int(-101009509))
                                    putfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833, invokestatic:\u960f\u6ec6\u3e75\u8d90\u36d3(\ua068\u873d\uf9c5\uf9c5\u61a4::\u8aa5\uafe7\u6fb0\u6435\ufcaf\u92ee, loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(83), ldc:int(86)))))
                                }
                                
                                Label_0339:
                                
                                if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Block_26)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Block_27)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Block_28)
                                }
                            }
                            
                            goto(Label_0586)
                            Block_25:
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-711331867))
                            loopcontinue()
                            Block_26:
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-347897549))
                            goto(Label_0586)
                            Block_27:
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-431493322))
                            goto(Label_0415)
                            Block_28:
                            
                            if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(268435456)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-1073748031))
                        }
                        catch (java.net.URISyntaxException var_5_192) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-1410666601))
                            invokevirtual:void(Throwable::printStackTrace, var_5_192:URISyntaxException[expected:Throwable])
                        }
                        
                        Label_0415:
                        
                        if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_BE = and:int(var_2_BE:int, ldc:int(-1160710380))
                                goto(Label_0339)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0274)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_BE = and:int(var_2_BE:int, ldc:int(-665764916))
                                loopcontinue()
                            }
                            
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-1192575065))
                            invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3[expected:\u8350\u183a\u6b5f\uc229\ud12e](\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(6150), ldc:int(16646))), initobject:\u92ff\u69d9\u7ce1\u7c6b\uc84e[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\u92ff\u69d9\u7ce1\u7c6b\uc84e::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(16463), ldc:int(9511))), initobject:\u873d\ub8be\u8709\u516c\ud217[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\u873d\ub8be\u8709\u516c\ud217::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(4360), ldc:int(9864))), initobject:\u62da\u40a9\ub113\u385b\u69d9[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\u62da\u40a9\ub113\u385b\u69d9::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(5645), ldc:int(9))), initobject:\u8bb0\u3a62\ub113\u183a\u0b8e[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\u8bb0\u3a62\ub113\u183a\u0b8e::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833)), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(3102), ldc:int(11))), initobject:\uc246\u647c\u6435\ua562\ud171[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\uc246\u647c\u6435\ua562\ud171::<init>, this:\u56bd\u0a06\u3bc9\u72f1\u1833))
                        }
                        
                        Label_0586:
                        
                        if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-1271592784))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(-361890599))
                            goto(Label_0339)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_BE = and:int(var_2_BE:int, ldc:int(256595557))
                            goto(Label_0274)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(128)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_2_28A = and:int(var_2_BE:int, ldc:int(-1073746019))
                    invokevirtual:\u960f\u6ec6\u3e75\u8d90\u36d3(\u960f\u6ec6\u3e75\u8d90\u36d3::\u839e\u120d\u8350\u183a\u927d\u3d4b, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, this:\u56bd\u0a06\u3bc9\u72f1\u1833))
                    looporswitchbreak()
                }
                
                var_2_28A = and:int(var_2_28A:int, ldc:int(2004182425))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6b5f\u8d98\uc2bd\u7873\u6fb0() {
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
            invokevirtual:void(\u4f52\u3bc9\u7d52\ud523\ub6ab::\u6b0d\u0a06\ub18d\u51b2\u97b7, invokevirtual:\u4f52\u3bc9\u7d52\ud523\ub6ab(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8308\u183a\u946b\ubff1\u946b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u8df4\u983f\u7330\ua6bd\uc2e8(java.lang.String p0) {
        var_1_61 : int
        var_3_77 : byte[]
        stack_AA_0 : String [generated]
        var_3_AF : NoSuchAlgorithmException
        
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
        var_1_61 = and:int(ldc:int(-1085258418), ldc:int(2012368334))
        
        try {
            var_1_61 = and:int(var_1_61:int, ldc:int(-1208263749))
            var_3_77 = invokestatic:byte[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u76bc\u5db4\u7e3f\ub102\ucfaf, p0:String, loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(16411), ldc:int(12367))))
            var_1_61 = and:int(var_1_61:int, ldc:int(1070745407))
            stack_AA_0 = invokevirtual:String(String::replace, invokevirtual:String(BigInteger::toString, initobject:BigInteger(BigInteger::<init>, var_3_77:byte[]), ldc:int(16)), loadelement:String[expected:CharSequence](getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(5378), ldc:int(5390))), loadelement:String[expected:CharSequence](getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), and:int(ldc:int(-31131), ldc:int(31114))))
            var_1_61 = and:int(var_1_61:int, ldc:int(-136642722))
            return:String(stack_AA_0:String)
        }
        catch (java.security.NoSuchAlgorithmException var_3_AF) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_3_AF:NoSuchAlgorithmException[expected:Throwable]))
        }
    }
    
    private static byte[] \u76bc\u5db4\u7e3f\ub102\ucfaf(java.lang.String p0, java.lang.String p1) {
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
            return:byte[](invokevirtual:byte[](MessageDigest::digest, invokestatic:MessageDigest(MessageDigest::getInstance, p1:String), invokevirtual:byte[](String::getBytes, p0:String, getstatic:Charset(StandardCharsets::UTF_8))))
        }
        
        goto(Label_0006)
    }
    
    private void \u6bb9\u3e75\u7873\u6d99\uc2bd(com.mojang.authlib.GameProfile p0, java.lang.String p1) {
        var_5_6C : String
        
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
            var_5_6C = invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\u72f1\uc229\u759a\u600f\ua6bd\u47c2, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833)))
            invokevirtual:void(YggdrasilMinecraftSessionService::joinServer, checkcast:YggdrasilMinecraftSessionService(com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService.class, invokevirtual:MinecraftSessionService(YggdrasilAuthenticationService::createMinecraftSessionService, initobject:YggdrasilAuthenticationService(YggdrasilAuthenticationService::<init>, getstatic:Proxy(Proxy::NO_PROXY), var_5_6C:String))), p0:GameProfile, var_5_6C:String, p1:String)
            invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)
            invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u67d0\u5140\u6198\u3e75\ub83f, invokestatic:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u927d\ub70c\uc2bd\u16f6\u16f6), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(2158), ldc:int(2147)))), p1:String)))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(2194), ldc:int(2204)))), p1:String), loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(1611), ldc:int(1604)))), invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\ub7dc\u6d99\u516c\ub32d\ub113\u7ce1, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, this:\u56bd\u0a06\u3bc9\u72f1\u1833))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String \u67d0\ubb2b\ubf56\uf94d\ub1b9(java.lang.String p0) {
        var_2_61 : int
        var_4_76 : MessageDigest
        var_5_87 : byte[]
        var_6_96 : StringBuffer
        var_7_A5 : int
        stack_1AA_0 : String [generated]
        
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
        var_2_61 = and:int(ldc:int(1851239105), ldc:int(863423169))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(-605086055))
            var_4_76 = invokestatic:MessageDigest(MessageDigest::getInstance, loadelement:String(getstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c), xor:int(ldc:int(12416), ldc:int(12432))))
            var_2_61 = and:int(var_2_61:int, ldc:int(-1017754991))
            var_5_87 = invokevirtual:byte[](MessageDigest::digest, var_4_76:MessageDigest, invokevirtual:byte[](String::getBytes, p0:String))
            var_2_61 = and:int(var_2_61:int, ldc:int(801509085))
            var_6_96 = initobject:StringBuffer(StringBuffer::<init>)
            var_2_61 = and:int(var_2_61:int, ldc:int(939395751))
            var_7_A5 = and:int(ldc:int(-8221), ldc:int(8220))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(180983851))
                    goto(Label_0366)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0271)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-995376572))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1091613789))
                    
                    if (cmpge:boolean(var_7_A5:int, arraylength:int(var_5_87:byte[]))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0223:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0366)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-705871643))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1424918498))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1821398087))
                }
                
                Label_0271:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-427466325))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-897614867))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-411054207))
                    invokevirtual:StringBuffer(StringBuffer::append, var_6_96:StringBuffer, invokevirtual:String(String::substring, invokestatic:String(Integer::toHexString, or:int(and:int(loadelement:byte(var_5_87:byte[], var_7_A5:int), and:int(ldc:int(24831), ldc:int(255))), xor:int(ldc:int(12789), ldc:int(12533)))), and:int(ldc:int(16529), ldc:int(9)), and:int(ldc:int(10535), ldc:int(1539))))
                }
                
                Label_0366:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0271)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0223)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1435219526))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(576121747))
                    inc:int(var_7_A5, ldc:int(1))
                }
            }
            
            stack_1AA_0 = invokevirtual:String(StringBuffer::toString, var_6_96:StringBuffer)
            var_2_61 = and:int(var_2_61:int, ldc:int(-680047959))
            return:String(stack_1AA_0:String)
        }
        catch (java.security.NoSuchAlgorithmException var_4_1AF) {
            return:String(aconstnull:String())
        }
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \ubefe\uc31c\uf94d\u385b\u88c5(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u56bd\u0a06\u3bc9\u72f1\u1833 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ud217\uae5d\u4179\u97e6\u8709, p0:\u56bd\u0a06\u3bc9\u72f1\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static void \u6cfe\u839e\u965f\u8640\u6198(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u56bd\u0a06\u3bc9\u72f1\u1833 p0, com.mojang.authlib.GameProfile p1, java.lang.String p2) {
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
            invokespecial:void(\u56bd\u0a06\u3bc9\u72f1\u1833::\u6bb9\u3e75\u7873\u6d99\uc2bd, p0:\u56bd\u0a06\u3bc9\u72f1\u1833, p1:GameProfile, p2:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3D8 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_147_0 : byte[] [generated]
        stack_35C_0 : byte[] [generated]
        stack_3EB_0 : byte[] [generated]
        stack_43C_0 : byte[] [generated]
        stack_492_0 : byte[] [generated]
        var_4_33D : int
        var_3_342 : byte[]
        var_5_343 : int
        var_0_376 : int
        expr_35C : byte [generated]
        stack_3A5_2 : byte [generated]
        stack_379_0 : byte [generated]
        expr_3EB : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_42A : byte[]
        var_5_42B : int
        expr_112 : int [generated]
        var_3_480 : byte[]
        var_5_481 : int
        var_3_153 : String
        stack_336_0 : String[] [generated]
        expr_165 : String[] [generated]
        
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
        var_0_3D8 = and:int(ldc:int(-1642595226), ldc:int(504622780))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_35C_0 = stack_3EB_0 = stack_43C_0 = stack_492_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("2n38qZwNegeB1WRrif0AHCUmjYF741+A+XwFAQFb8Skm+YIIANfViQB5CYWEo3cG+Hp72IKZfgcJpn7kh372XYOjeYQCAohZCaAODZeYEGuQEOZn6+yKYP4BhQnW/fz//n6H//+Je32C/wb9Bf74iXx7A/+D+geIniwjg/x92dPffYECKS0jpCF/Wl3hYIGlI31/emDcXQB+B/mAh/uifgR++v5eHIH6gqaAZnsIAl4AHgX9+4P72oL6f6MFg3eZAt39AwKZegL+AonQGvswdfoAbYJ1CIUHfAPfAfn7JX2DA/792wMAeQmFBPkAhvZ9/Ij3gAP/iH0HfgQFfQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_33D = expr_6E:int
        var_3_342 = newarray:byte[](byte.class, expr_6E:int)
        var_5_343 = expr_6E:int
        Label_0837:
        
        while (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_376 = and:int(var_0_3D8:int, ldc:int(1589358061))
            var_5_343 = add:int(var_5_343:int, ldc:int(-1))
            expr_35C = stack_3A5_2 = loadelement(stack_35C_0, var_5_343)
            
            if (cmplt:boolean(add:int(add:int(var_5_343:int, ldc:int(6)), neg:int(var_4_33D:int)), ldc:int(0))) {
                stack_3A5_2 = stack_379_0 = add:byte(expr_35C:byte, loadelement:byte(var_3_342:byte[], add:int(var_5_343:int, ldc:int(6))))
                goto(Label_0905)
            }
            
            Label_0873:
            
            if (cmpne:boolean(and:int(var_0_376:int, ldc:int(32768)), ldc:int(0))) {
                var_0_376 = and:int(var_0_376:int, ldc:int(-1640763859))
                stack_3A5_2 = stack_379_0 = add:byte(expr_35C:byte, ldc:byte(6))
            }
            
            Label_0905:
            
            if (cmpeq:boolean(and:int(var_0_376:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_376 = and:int(var_0_376:int, ldc:int(837589888))
                goto(Label_0873)
            }
            
            var_0_3D8 = and:int(var_0_376:int, ldc:int(1600126052))
            storeelement:byte(var_3_342:byte[], var_5_343:int, stack_3A5_2:byte)
            
            if (cmpne:boolean(var_5_343:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_35C_0 = stack_3EB_0 = stack_43C_0 = stack_492_0 = var_3_342:byte[]
            goto(Label_0115)
        }
        
        Label_0971:
        
        while (cmpne:boolean(and:int(var_0_3D8:int, ldc:int(4)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-1222660825))
            var_5_343 = add:int(var_5_343:int, ldc:int(-1))
            expr_3EB = loadelement:byte(stack_3EB_0:byte[], var_5_343:int)
            storeelement:byte(var_3_342:byte[], var_5_343:int, or:int(and:int(shl:int(expr_3EB:byte, and:int(ldc:int(3204), ldc:int(28767))), ldc:int(-16)), and:int(shr:int(expr_3EB:byte[expected:int], xor:int(ldc:int(-29439), ldc:int(-29435))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_343:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_35C_0 = stack_3EB_0 = stack_43C_0 = stack_492_0 = var_3_342:byte[]
            goto(Label_0172)
        }
        
        var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-1279661815))
        goto(Label_0837)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_3D8:int, ldc:int(128)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-283376799))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_3D8:int, ldc:int(524288)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(488123702))
        }
        else {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(1601302118))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_33D = expr_A7:int
                var_3_342 = newarray:byte[](byte.class, expr_A7:int)
                var_5_343 = expr_A7:int
                goto(Label_0971)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_3D8:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-664436511))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-1582713042))
                goto(Label_0115)
            }
            
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-1638273219))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_42A = newarray:byte[](byte.class, expr_E2:int)
                var_5_42B = expr_E2:int
                
                loop {
                    var_0_3D8 = and:int(var_0_3D8:int, ldc:int(522042861))
                    var_5_42B = add:int(var_5_42B:int, ldc:int(-1))
                    storeelement:byte(var_3_42A:byte[], var_5_42B:int, add:int(shl:int(loadelement:byte(stack_43C_0:byte[], var_5_42B:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_42B:int, and:int(ldc:int(129), ldc:int(17167)))), ldc:int(3)), and:int(ldc:int(26207), ldc:int(4383)))))
                    
                    if (cmpne:boolean(var_5_42B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_35C_0 = stack_3EB_0 = stack_43C_0 = stack_492_0 = var_3_42A:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(770490337))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(1985211821))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_480 = newarray:byte[](byte.class, expr_112:int)
                var_5_481 = expr_112:int
                
                loop {
                    var_0_3D8 = and:int(var_0_3D8:int, ldc:int(506969646))
                    var_5_481 = add:int(var_5_481:int, ldc:int(-1))
                    storeelement:byte(var_3_480:byte[], var_5_481:int, xor:byte(add:byte(loadelement:byte(stack_492_0:byte[], var_5_481:int), ldc:byte(100)), ldc:byte(31)))
                    
                    if (cmpne:boolean(var_5_481:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_35C_0 = stack_3EB_0 = stack_43C_0 = stack_492_0 = var_3_480:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(1770622379))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_3D8:int, ldc:int(2048)), ldc:int(0))) {
            var_0_3D8 = and:int(var_0_3D8:int, ldc:int(-524363689))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_3D8:int, ldc:int(4)), ldc:int(0))) {
            var_3_153 = initobject:String(String::<init>, stack_147_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_336_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10446), ldc:int(10463)))
            expr_165 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2638), ldc:int(2655)))
            storeelement:String(expr_165:String[], and:int(ldc:int(2986), ldc:int(-3052)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(-31627), ldc:int(22914)), and:int(ldc:int(6915), ldc:int(-6916))))
            storeelement:String(expr_165:String[], and:int(ldc:int(2895), ldc:int(17599)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(-2779), ldc:int(2770)), xor:int(ldc:int(1155), ldc:int(1161))))
            storeelement:String(expr_165:String[], xor:int(ldc:int(1047), ldc:int(1051)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(9247), ldc:int(18474)), and:int(ldc:int(4175), ldc:int(2571))))
            storeelement:String(expr_165:String[], and:int(ldc:int(23558), ldc:int(781)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(-30663), ldc:int(-30670)), xor:int(ldc:int(530), ldc:int(522))))
            storeelement:String(expr_165:String[], and:int(ldc:int(527), ldc:int(10269)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(-30636), ldc:int(-30644)), xor:int(ldc:int(783), ldc:int(863))))
            storeelement:String(expr_165:String[], and:int(ldc:int(5136), ldc:int(17050)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(25463), ldc:int(4304)), xor:int(ldc:int(24946), ldc:int(24865))))
            storeelement:String(expr_165:String[], and:int(ldc:int(75), ldc:int(14479)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(9757), ldc:int(9806)), and:int(ldc:int(88), ldc:int(8280))))
            storeelement:String(expr_165:String[], and:int(ldc:int(20521), ldc:int(10267)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(177), ldc:int(233)), xor:int(ldc:int(8233), ldc:int(8269))))
            storeelement:String(expr_165:String[], and:int(ldc:int(38), ldc:int(4182)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(1329), ldc:int(1365)), and:int(ldc:int(4463), ldc:int(17003))))
            storeelement:String(expr_165:String[], and:int(ldc:int(18474), ldc:int(8330)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(8276), ldc:int(8255)), and:int(ldc:int(629), ldc:int(18557))))
            storeelement:String(expr_165:String[], and:int(ldc:int(20615), ldc:int(1)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(8601), ldc:int(8684)), and:int(ldc:int(2810), ldc:int(382))))
            storeelement:String(expr_165:String[], and:int(ldc:int(18517), ldc:int(1285)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(766), ldc:int(2427)), and:int(ldc:int(719), ldc:int(16783))))
            storeelement:String(expr_165:String[], xor:int(ldc:int(4172), ldc:int(4162)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(12447), ldc:int(17071)), and:int(ldc:int(2261), ldc:int(25301))))
            storeelement:String(expr_165:String[], and:int(ldc:int(665), ldc:int(1096)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(303), ldc:int(506)), and:int(ldc:int(479), ldc:int(6367))))
            storeelement:String(expr_165:String[], and:int(ldc:int(11015), ldc:int(87)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(-28017), ldc:int(-28080)), and:int(ldc:int(16639), ldc:int(239))))
            storeelement:String(expr_165:String[], and:int(ldc:int(16459), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(170), ldc:int(69)), and:int(ldc:int(5366), ldc:int(502))))
            storeelement:String(expr_165:String[], and:int(ldc:int(514), ldc:int(21786)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(101), ldc:int(147)), xor:int(ldc:int(38), ldc:int(218))))
            putstatic:String[](\u56bd\u0a06\u3bc9\u72f1\u1833::\u64ab\u0b8e\u5245\u64ab\ub70c, expr_165:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u0800\ub6ab\uc9f6\u8709\u5654(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(1897812714), ldc:int(-202225862))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u56bd\u0a06\u3bc9\u72f1\u1833[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-143494351))
            var_5_81 = and:int(ldc:int(1507), ldc:int(-7652))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10926), ldc:int(10413)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_684:int, ldc:int(827807351))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(736), ldc:int(737)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(-24508), ldc:int(-24507)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_D1:int, ldc:int(905082740))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(384), ldc:int(385)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-413386552))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1749853150))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1828314986))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1212714324))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2100821920))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1027368499))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1329019994))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-73083713))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(823623610))
                        var_11_E2 = and:int(ldc:int(-24608), ldc:int(24587))
                        goto(Label_1526)
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(100919991))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-32539003))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1200789109))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(934621976))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1974222950))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-172594561))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-415916233))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-75807189))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1694332175))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1648107911))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1252061488))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(676112587))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2008437495))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1804461986))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1712746392))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-453863860))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1683921249))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1116511309))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(28809), ldc:int(513))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1390355727))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(120310351))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1701876271))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-205790341))
                        var_11_E2 = and:int(ldc:int(29825), ldc:int(-29826))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1932916593))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-174000749))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-913512817))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1091095086))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(869686956))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(971528245))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1084189482))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2046169302))
                            goto(Label_1119)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1151708390))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-454261898))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(966252521))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1526)
                    }
                    
                    Label_1389:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(782564479))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1825805480))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-39841460))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-952003859))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-6823392))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1391316204))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-136477708))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1793734229))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2121891780))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1317032514))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1905487412))
                        var_17_68F = add:int(var_16_110:int, xor:int(ldc:int(-12280), ldc:int(-12279)))
                        looporswitchbreak()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-1111940163))
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(2002253664))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, and:int(ldc:int(361), ldc:int(25237))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
