public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u9937\u99f7\u8308\u92ff\ub113\u9937 {
    public void \u9937\u99f7\u8308\u92ff\ub113\u9937(\u3504\ufe34\u600f\u6b0d\u69d9.\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1) {
        var_5_7D : Iterator<String>
        var_7_F9 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        var_5_C6 : String
        
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
            putfield:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u6cfe\ub171\u88c5\u3504\u72f1\u7043, this:\u9937\u99f7\u8308\u92ff\ub113\u9937, p0:\u965f\u8709\ub19c\u92ff\u6fb0\uc9f6)
            invokespecial:Object(Object::<init>, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)
            putfield:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u7e3f\ubcb0\ube23\u183a\u3bc9\u7043, this:\u9937\u99f7\u8308\u92ff\ub113\u9937, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8)
            putfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937, invokestatic:ArrayList[expected:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>](Lists::newArrayList))
            var_5_7D = invokeinterface:Iterator<String>(Collection<String>::iterator, invokevirtual:Collection<String>(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u839e\uc229\u6bb9\uc229\u16f6\u6ec6, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_7D:Iterator<String>)) {
                var_7_F9 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u527a\u873d\u071d\u4f52\uc229\ud217::\u72f1\u9af2\u71ae\u1187\u2dcc\u8308, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_7D:Iterator<String>)))
                
                if (cmpeq:boolean(var_7_F9:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                    loopcontinue()
                }
                
                invokeinterface:boolean(List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>::add, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937), var_7_F9:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)
            }
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)))) {
                var_5_C6 = invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uae87\uc31c\ud523\u5245\u8413\uc3e3, checkcast:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u839e\ud36e\ufe34\uc31c\u392e\u64ab.class, invokeinterface:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>::get, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937), invokevirtual:int(Random::nextInt, initobject:Random(Random::<init>), invokeinterface:int(List<E>::size, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)))))))
                invokestatic:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u36d3\ud51e\u3776\u8aa5\ud12e\u516c, putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u52d3\u8640\uc3e3\ub102\uff55\u72f1, this:\u9937\u99f7\u8308\u92ff\ub113\u9937, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ubb2b\ufcaf\u3c25\u5140\u8350\u4e72, var_5_C6:String)), var_5_C6:String)
            }
            else {
                putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u52d3\u8640\uc3e3\ub102\uff55\u72f1, this:\u9937\u99f7\u8308\u92ff\ub113\u9937, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u5db4\u836c\ud171\uae5d\u71f1\u494c))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\uc9f6\u6d69\ucfaf\u3d4b\u8d90(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6c52\u0800\u183a\ud7e8\ufcaf\u0800 p0) {
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
            invokevirtual:void(\u6c52\u0800\u183a\ud7e8\ufcaf\u0800::\u8350\u8df4\uf94d\u9937\u7006\u759a, p0:\u6c52\u0800\u183a\ud7e8\ufcaf\u0800, initobject:\u8d90\u3bd6\u0a06\u3e75\u99f7\u8bb0[expected:\u647c\u4c04\u385b\ubefe\u74b1\ud217](\u8d90\u3bd6\u0a06\u3e75\u99f7\u8bb0::<init>, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>[expected:Collection<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>](\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \ube23\ubb2b\u9937\u4c2b\u52d3\u516c() {
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
            return:ITextComponent(invokevirtual:ITextComponent(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u8c8a\u4f52\uc229\ud7e8\u385b\u8bb0, getfield:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u7e3f\ubcb0\ube23\u183a\u3bc9\u7043, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u759a\u416d\u1187\u6435\uc910(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, int p2) {
        var_6_6D : Integer
        
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
            var_6_6D = invokevirtual:Integer(TextFormatting::getColor, invokevirtual:TextFormatting(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u97b7\u9033\uc2e8\u836c\u8640\u156b, getfield:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u7e3f\ubcb0\ube23\u183a\u3bc9\u7043, this:\u9937\u99f7\u8308\u92ff\ub113\u9937)))
            
            if (cmpne:boolean(var_6_6D:Integer, aconstnull:Integer())) {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, xor:boolean[expected:int](ldc:boolean(0), ldc:boolean(1)), xor:int(ldc:int(2056), ldc:int(2057)), ldc:int(15), ldc:int(15), or:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7049\u7ce1\u7bad\uc246\u8d98\ubf56, mul:float(div:float(i2f:float(and:int(shr:int(invokevirtual:int(Integer::intValue, var_6_6D:Integer), ldc:int(16)), xor:int(ldc:int(8414), ldc:int(8225)))), ldc:float(255.0f)), p1:float), mul:float(div:float(i2f:float(and:int(shr:int(invokevirtual:int(Integer::intValue, var_6_6D:Integer), ldc:int(8)), xor:int(ldc:int(24584), ldc:int(24823)))), ldc:float(255.0f)), p1:float), mul:float(div:float(i2f:float(and:int(invokevirtual:int(Integer::intValue, var_6_6D:Integer), and:int(ldc:int(19199), ldc:int(9471)))), ldc:float(255.0f)), p1:float)), shl:int(p2:int, ldc:int(24))))
            }
            
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u52d3\u8640\uc3e3\ub102\uff55\u72f1, this:\u9937\u99f7\u8308\u92ff\ub113\u9937))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, p1:float, p1:float, p1:float, div:float(i2f:float(p2:int), ldc:float(255.0f)))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, xor:int(ldc:int(3712), ldc:int(3714)), and:int(ldc:int(6146), ldc:int(16939)), ldc:int(12), ldc:int(12), ldc:float(8.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, and:int(ldc:int(1034), ldc:int(7058)), xor:int(ldc:int(28), ldc:int(30)), ldc:int(12), ldc:int(12), ldc:float(40.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4492\u4f4a\u0b8e\u0b8e\u3dd3\u4179() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(2089518407), ldc:int(-34272665))
            
            if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u839e\ud36e\ufe34\uc31c\u392e\u64ab>(\u9937\u99f7\u8308\u92ff\ub113\u9937::\u8709\u4cd9\uc9f6\u36d3\u6435\u647c, this:\u9937\u99f7\u8308\u92ff\ub113\u9937))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(766720963))
                stack_8B_0 = and:int(ldc:int(-21879), ldc:int(20854))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(8230), ldc:int(8231))
            }
            
            return:boolean(stack_8B_0:int)
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
    
    public void \uc2e8\uc4d2\u34df\u8aa5\u873d\uc29a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B8 : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6C3 : int
        
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
        var_3_6B8 = and:int(ldc:int(1252719028), ldc:int(-556402215))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\u99f7\u8308\u92ff\ub113\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(820229043))
            var_5_7F = and:int(ldc:int(-15688), ldc:int(7490))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18608), ldc:int(18603)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_6B8:int, ldc:int(1810143704))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, xor:int(ldc:int(4112), ldc:int(4113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(1188), ldc:int(1189)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_6B8 = and:int(var_3_CF:int, ldc:int(-136315501))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(2627), ldc:int(21889)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-326176841))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-2112143395))
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1502670382))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1857805111))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(788196687))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1097844305))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1201485643))
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1191162836))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1401318805))
                        goto(Label_1625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(970491397))
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1308242198))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1801017386))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-737590235))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-74522661))
                            var_11_E0 = and:int(ldc:int(-13491), ldc:int(13490))
                            goto(Label_1614)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0602:
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1559599693))
                        goto(Label_1625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1329130918))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(2018401931))
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(2096689033))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1276293728))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(524683521))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1041495933))
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1363813391))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1834501625))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1391198982))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1651223048))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1572460477))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0877:
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1186812195))
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1516265344))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(992166649))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(221389376))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(144344993))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1469975858))
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-142345735))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = xor:int(ldc:int(-32500), ldc:int(-32499))
                                goto(Label_1198)
                            }
                        }
                    }
                    
                    Label_1020:
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-114057985))
                        goto(Label_1625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(515926315))
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(2144395880))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-57836161))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1070275418))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1021227985))
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(562757534))
                        var_11_E0 = and:int(ldc:int(20976), ldc:int(-21489))
                    }
                    
                    Label_1198:
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1291908340))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-286574942))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1168285308))
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-778149043))
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1749437546))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1468)
                            }
                        }
                    }
                    
                    Label_1323:
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1198)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(440839253))
                            goto(Label_1020)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(81067769))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1796459140))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(944327617))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1271001857))
                            loopcontinue()
                        }
                        
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-1214334572))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                        goto(Label_1614)
                    }
                    
                    Label_1468:
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1888923201))
                        goto(Label_1625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1545636357))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-264243739))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(870145581))
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(65539165))
                        loopcontinue()
                    }
                    
                    var_3_6B8 = and:int(var_3_6B8:int, ldc:int(447017431))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1614:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C3 = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1625:
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1323)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-507578002))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(1105137632))
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B8 = and:int(var_3_6B8:int, ldc:int(-877486128))
                        var_17_6C3 = add:int(var_16_10E:int, xor:int(ldc:int(21506), ldc:int(21507)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B8 = and:int(var_3_6B8:int, ldc:int(14219198))
                
                if (cmple:boolean(var_5_7F = var_17_6C3:int, sub:int(var_6_86:int, xor:int(ldc:int(2321), ldc:int(2320))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_6B8:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
