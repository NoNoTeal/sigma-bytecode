public class \u36d3\u9033\u6b0d\u983f\u8d90.\uff55\ua562\u4daf\ud158\u839e {
    public void \uff55\ua562\u4daf\ud158\u839e() {
        expr_8B : String[] [generated]
        expr_AD : String[] [generated]
        
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
            invokespecial:\u385b\u7bad\u8308\ud217\u36d3(\u385b\u7bad\u8308\ud217\u36d3::<init>, this:\uff55\ua562\u4daf\ud158\u839e, loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(12837), ldc:int(-29496))), loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(187), ldc:int(6977))), newarray:String[](java.lang.String.class, and:int(ldc:int(23377), ldc:int(-23378))))
            expr_8B = newarray:String[](java.lang.String.class, xor:int(ldc:int(9536), ldc:int(9537)))
            storeelement:String(expr_8B:String[], and:int(ldc:int(4508), ldc:int(-5056)), loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(6499), ldc:int(8706))))
            invokevirtual:void(\u385b\u7bad\u8308\ud217\u36d3::\u6fb0\u12cb\u5db4\uc7fe\u0800, this:\uff55\ua562\u4daf\ud158\u839e[expected:\u385b\u7bad\u8308\ud217\u36d3], expr_8B:String[])
            expr_AD = newarray:String[](java.lang.String.class, xor:int(ldc:int(2049), ldc:int(2048)))
            storeelement:String(expr_AD:String[], and:int(ldc:int(-10013), ldc:int(10012)), loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(17539), ldc:int(2563))))
            invokevirtual:void(\u385b\u7bad\u8308\ud217\u36d3::\u6fb0\u12cb\u5db4\uc7fe\u0800, this:\uff55\ua562\u4daf\ud158\u839e[expected:\u385b\u7bad\u8308\ud217\u36d3], expr_AD:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run(java.lang.String p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u6cfe\ub102\u6c56\uc2e8\u51fa[] p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u965f\u120d\ub1b9\u36d3\ub171 p2) {
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
    
    public int \u3d64\u3c25\u6435\u6b0d\u8d90(java.lang.String p0) {
        var_4_9F : String
        var_5_AE : Iterator<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>
        var_6_D9 : Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>
        
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
        
        if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(5164), ldc:int(5154)))), invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(4398), ldc:int(1231))))))) {
            var_4_9F = loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(13), ldc:int(11)))
            var_5_AE = invokeinterface:Iterator<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>(Set<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>::iterator, invokeinterface:Set<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>(Map<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>::entrySet, getstatic:Map<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u8640\ub32d\ub18d\u5db4\u6ec6\u983f)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_AE:Iterator<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>)) {
                var_6_D9 = checkcast:Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>(java.util.Map.Entry<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ub7dc\u8640\u9937\u92ee\u836c\ud7e8>.class, invokeinterface:Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>(Iterator<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>::next, var_5_AE:Iterator<Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>>))
                
                if (logicaland:boolean(invokevirtual:boolean(String::startsWith, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>::getKey, var_6_D9:Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>)), var_4_9F:String), invokevirtual:boolean(String::equals, p0:String, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(String::substring, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>::getKey, var_6_D9:Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>)), invokevirtual:int(String::length, var_4_9F:String)), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(4486), ldc:int(4489))), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(16393), ldc:int(16409)))), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(83), ldc:int(1169))), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), and:int(ldc:int(24663), ldc:int(4498))))))) {
                    return:int(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, checkcast:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ub7dc\u8640\u9937\u92ee\u836c\ud7e8.class, invokeinterface:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>::getValue, var_6_D9:Entry<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>))))
                }
            }
            
            return:int(ldc:int(-2))
        }
        
        return:int(ldc:int(-1))
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c \ub83f\uc9f6\u7ce1\u97b7\u7ce1(java.lang.String p0) {
        var_2_5F : int
        var_4_73 : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_5_AB : \ud158\u839e\u7006\uc3e3\u446c
        
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
        var_2_5F = and:int(ldc:int(-1173096191), ldc:int(-32244489))
        var_4_73 = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(Collection<\ud158\u839e\u7006\uc3e3\u446c>::iterator, invokeinterface:Collection<\ud158\u839e\u7006\uc3e3\u446c>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>::values, invokevirtual:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>(\u3776\u647c\u51fa\u7e3f\ub32d::\uc246\ud171\u8709\u6435\u416d, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-627851373))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_73:Iterator<\ud158\u839e\u7006\uc3e3\u446c>)) {
                    var_5_AB = checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_4_73:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(String::replace, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u67d0\u98a4\uc910\u4f4a\u8c8a, var_5_AB:\ud158\u839e\u7006\uc3e3\u446c), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(5128), ldc:int(5147))), loadelement:String[expected:CharSequence](getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(-32221), ldc:int(-32205)))), p0:String))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-1153442539))
                        loopcontinue()
                    }
                    
                    return:\ud158\u839e\u7006\uc3e3\u446c(var_5_AB:\ud158\u839e\u7006\uc3e3\u446c)
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(128)), ldc:int(0))) {
                return:\ud158\u839e\u7006\uc3e3\u446c(aconstnull:\ud158\u839e\u7006\uc3e3\u446c())
            }
        }
    }
    
    private static void lambda$\u51b2\ub1b9\u965f\u7ce1\u3504$0() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uff55\ua562\u4daf\ud158\u839e::\u5d20\u7043\u88c5\u5db4\uf94d), initobject:\uc29a\ud171\u88c5\uc246\u76bc[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uc29a\ud171\u88c5\uc246\u76bc::<init>, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb), xor:int(ldc:int(1818), ldc:int(1806))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_40F : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A7_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_E8_0 : byte[] [generated]
        stack_EA_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_422_0 : byte[] [generated]
        stack_474_0 : byte[] [generated]
        stack_4FA_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_3A9 : byte[]
        var_4_3AA : int
        expr_A9 : int [generated]
        var_5_3FA : int
        var_3_3FF : byte[]
        var_4_400 : int
        var_0_48D : int
        expr_474 : byte [generated]
        stack_4C5_2 : byte [generated]
        stack_499_0 : byte [generated]
        expr_EA : int [generated]
        expr_121 : int [generated]
        var_3_4E8 : byte[]
        var_4_4E9 : int
        expr_4FA : byte [generated]
        var_3_151 : String
        stack_3A0_0 : String[] [generated]
        expr_163 : String[] [generated]
        
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
            var_0_40F = and:int(ldc:int(283729299), ldc:int(-96800801))
            expr_68 = var_2_6C = stack_A7_0 = stack_A9_0 = stack_E8_0 = stack_EA_0 = stack_11F_0 = stack_121_0 = stack_145_0 = stack_422_0 = stack_474_0 = stack_4FA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FC4ohNgrOoLTOw6nQrYa1C4ohNgrOoLTKKwnXIwirq4yrrkourKzLDaunVwwvILYIyCG2oc2CtaJXCbKh0oguLSoPrEjKQiguDKufSykuDiIPrEwgtcmrrzaohr6Crrm1EjOtmyioOamhz8EeIDCNmy9Wp66hzQK1JLYC1CmyodKILi0qD6xIOLesIggcS7C1KUqKoykjraygKaqNqbKirLIpKLQyJSwjzyiuIDSOqqExya2vKUwNqCmyDyklIagoTbM1LKMPqykoMCp4jaozu9FBr5gi0rwyvSwQA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_3A9 = newarray:byte[](byte.class, expr_70:int)
                var_4_3AA = expr_70:int
                
                loop {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(1513804490))
                    var_4_3AA = add:int(var_4_3AA:int, ldc:int(-1))
                    storeelement:byte(var_3_3A9:byte[], var_4_3AA:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_3AA:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_3AA:int, and:int(ldc:int(6465), ldc:int(8193)))), ldc:int(5)), and:int(ldc:int(16711), ldc:int(13327)))))
                    
                    if (cmpne:boolean(var_4_3AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A9_0 = stack_A7_0 = stack_E8_0 = stack_EA_0 = stack_11F_0 = stack_121_0 = stack_145_0 = stack_422_0 = stack_474_0 = stack_4FA_0 = var_3_3A9:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0294)
                }
                
                if (cmpne:boolean(and:int(var_0_40F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(-2126646704))
                    goto(Label_0239)
                }
                
                if (cmpne:boolean(and:int(var_0_40F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(-1995124387))
                    goto(Label_0174)
                }
                
                var_0_40F = and:int(var_0_40F:int, ldc:int(-9644349))
                expr_A9 = arraylength:int(stack_A9_0:byte[])
                
                if (cmpeq:boolean(expr_A9:int, ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_5_3FA = expr_A9:int
                var_3_3FF = newarray:byte[](byte.class, expr_A9:int)
                var_4_400 = expr_A9:int
                Label_1026:
                
                while (cmpne:boolean(and:int(var_0_40F:int, ldc:int(2)), ldc:int(0))) {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(-1665335562))
                    var_4_400 = add:int(var_4_400:int, ldc:int(-1))
                    storeelement:byte(var_3_3FF:byte[], var_4_400:int, xor:byte(add:byte(loadelement:byte(stack_422_0:byte[], var_4_400:int), ldc:byte(3)), ldc:byte(120)))
                    
                    if (cmpne:boolean(var_4_400:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_E8_0 = stack_EA_0 = stack_11F_0 = stack_121_0 = stack_145_0 = stack_422_0 = stack_474_0 = stack_4FA_0 = var_3_3FF:byte[]
                    goto(Label_0174)
                }
                
                var_0_40F = and:int(var_0_40F:int, ldc:int(1053660668))
                Label_1108:
                
                while (cmpne:boolean(and:int(var_0_40F:int, ldc:int(2)), ldc:int(0))) {
                    var_0_48D = and:int(var_0_40F:int, ldc:int(1924680067))
                    var_4_400 = add:int(var_4_400:int, ldc:int(-1))
                    expr_474 = stack_4C5_2 = loadelement(stack_474_0, var_4_400)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_400:int, ldc:int(5)), neg:int(var_5_3FA:int)), ldc:int(0))) {
                        stack_4C5_2 = stack_499_0 = add:byte(expr_474:byte, loadelement:byte(var_3_3FF:byte[], add:int(var_4_400:int, ldc:int(5))))
                        goto(Label_1193)
                    }
                    
                    Label_1153:
                    
                    if (cmpeq:boolean(and:int(var_0_48D:int, ldc:int(16384)), ldc:int(0))) {
                        var_0_48D = and:int(var_0_48D:int, ldc:int(-843978497))
                    }
                    else {
                        var_0_48D = and:int(var_0_48D:int, ldc:int(-1213414478))
                        stack_4C5_2 = stack_499_0 = add:byte(expr_474:byte, ldc:byte(5))
                    }
                    
                    Label_1193:
                    
                    if (cmpeq:boolean(and:int(var_0_48D:int, ldc:int(128)), ldc:int(0))) {
                        var_0_48D = and:int(var_0_48D:int, ldc:int(837673071))
                        goto(Label_1153)
                    }
                    
                    var_0_40F = and:int(var_0_48D:int, ldc:int(452754306))
                    storeelement:byte(var_3_3FF:byte[], var_4_400:int, stack_4C5_2:byte)
                    
                    if (cmpne:boolean(var_4_400:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_E8_0 = stack_EA_0 = stack_11F_0 = stack_121_0 = stack_145_0 = stack_422_0 = stack_474_0 = stack_4FA_0 = var_3_3FF:byte[]
                    goto(Label_0239)
                }
                
                var_0_40F = and:int(var_0_40F:int, ldc:int(-1244018837))
                goto(Label_1026)
                Label_0174:
                
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(-1403954591))
                    goto(Label_0294)
                }
                
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_40F = and:int(var_0_40F:int, ldc:int(424593323))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(2)), ldc:int(0))) {
                        var_0_40F = and:int(var_0_40F:int, ldc:int(-1284597760))
                        loopcontinue()
                    }
                    
                    var_0_40F = and:int(var_0_40F:int, ldc:int(1383922682))
                    expr_EA = arraylength:int(stack_EA_0:byte[])
                    
                    if (cmpne:boolean(expr_EA:int, ldc:int(0))) {
                        var_5_3FA = expr_EA:int
                        var_3_3FF = newarray:byte[](byte.class, expr_EA:int)
                        var_4_400 = expr_EA:int
                        goto(Label_1108)
                    }
                }
                
                Label_0239:
                
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_40F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_40F = and:int(var_0_40F:int, ldc:int(-1802914239))
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_40F:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_40F = and:int(var_0_40F:int, ldc:int(-1100077394))
                        loopcontinue()
                    }
                    
                    var_0_40F = and:int(var_0_40F:int, ldc:int(1929107679))
                    expr_121 = arraylength:int(stack_121_0:byte[])
                    
                    if (cmpne:boolean(expr_121:int, ldc:int(0))) {
                        var_3_4E8 = newarray:byte[](byte.class, expr_121:int)
                        var_4_4E9 = expr_121:int
                        
                        loop {
                            var_0_40F = and:int(var_0_40F:int, ldc:int(1429916574))
                            var_4_4E9 = add:int(var_4_4E9:int, ldc:int(-1))
                            expr_4FA = loadelement:byte(stack_4FA_0:byte[], var_4_4E9:int)
                            storeelement:byte(var_3_4E8:byte[], var_4_4E9:int, or:int(and:int(shl:int(expr_4FA:byte, xor:int(ldc:int(17410), ldc:int(17414))), ldc:int(-16)), and:int(shr:int(expr_4FA:byte[expected:int], and:int(ldc:int(141), ldc:int(31812))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_4E9:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A9_0 = stack_A7_0 = stack_E8_0 = stack_EA_0 = stack_11F_0 = stack_121_0 = stack_145_0 = stack_422_0 = stack_474_0 = stack_4FA_0 = var_3_4E8:byte[]
                    }
                }
                
                Label_0294:
                
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0239)
                }
                
                if (cmpne:boolean(and:int(var_0_40F:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0174)
                }
                
                if (cmpeq:boolean(and:int(var_0_40F:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_151 = initobject:String(String::<init>, stack_145_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_3A0_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8204), ldc:int(8217)))
            expr_163 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(503), ldc:int(1045)))
            storeelement:String(expr_163:String[], and:int(ldc:int(24598), ldc:int(7481)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(5575), ldc:int(-21984)), and:int(ldc:int(15872), ldc:int(-15873))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(-16208), ldc:int(-16221)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(3460), ldc:int(-19941)), and:int(ldc:int(1), ldc:int(18689))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(395), ldc:int(386)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(24709), ldc:int(3961)), xor:int(ldc:int(229), ldc:int(245))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(544), ldc:int(552)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(78), ldc:int(94)), xor:int(ldc:int(-32751), ldc:int(-32710))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(4352), ldc:int(4357)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(5167), ldc:int(8315)), and:int(ldc:int(2175), ldc:int(4917))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(9732), ldc:int(9736)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(703), ldc:int(1077)), and:int(ldc:int(11721), ldc:int(617))))
            storeelement:String(expr_163:String[], and:int(ldc:int(6195), ldc:int(9045)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(3291), ldc:int(16489)), xor:int(ldc:int(22), ldc:int(92))))
            storeelement:String(expr_163:String[], and:int(ldc:int(8205), ldc:int(17729)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(603), ldc:int(6250)), and:int(ldc:int(9849), ldc:int(96))))
            storeelement:String(expr_163:String[], and:int(ldc:int(596), ldc:int(8372)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(3136), ldc:int(3104)), and:int(ldc:int(111), ldc:int(20971))))
            storeelement:String(expr_163:String[], and:int(ldc:int(1051), ldc:int(16590)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(-32701), ldc:int(-32728)), and:int(ldc:int(4207), ldc:int(2415))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(3589), ldc:int(3598)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(2543), ldc:int(8303)), xor:int(ldc:int(16545), ldc:int(16429))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(8196), ldc:int(8192)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(260), ldc:int(392)), and:int(ldc:int(147), ldc:int(4243))))
            storeelement:String(expr_163:String[], and:int(ldc:int(17997), ldc:int(4143)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(2203), ldc:int(5815)), xor:int(ldc:int(184), ldc:int(29))))
            storeelement:String(expr_163:String[], and:int(ldc:int(9274), ldc:int(20562)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(13285), ldc:int(181)), and:int(ldc:int(8422), ldc:int(174))))
            storeelement:String(expr_163:String[], and:int(ldc:int(-18717), ldc:int(18716)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(-32451), ldc:int(-32357)), xor:int(ldc:int(2108), ldc:int(2198))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(145), ldc:int(151)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(17), ldc:int(187)), and:int(ldc:int(10935), ldc:int(1527))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(1670), ldc:int(1669)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(1471), ldc:int(6391)), xor:int(ldc:int(10490), ldc:int(10309))))
            storeelement:String(expr_163:String[], and:int(ldc:int(9247), ldc:int(6735)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(4287), ldc:int(9215)), xor:int(ldc:int(-32394), ldc:int(-32336))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(1312), ldc:int(1314)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(16929), ldc:int(17127)), xor:int(ldc:int(-31178), ldc:int(-30982))))
            storeelement:String(expr_163:String[], xor:int(ldc:int(10257), ldc:int(10271)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(16538), ldc:int(16470)), and:int(ldc:int(8402), ldc:int(3568))))
            storeelement:String(expr_163:String[], and:int(ldc:int(111), ldc:int(21655)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(216), ldc:int(6902)), xor:int(ldc:int(-32742), ldc:int(-32576))))
            putstatic:String[](\uff55\ua562\u4daf\ud158\u839e::\ub19c\u416d\uc84e\u8389\u12cb, expr_163:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc7fe\ua61f\ub18d\u64ab\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_688 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_693 : int
        
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
        var_3_688 = and:int(ldc:int(2007695549), ldc:int(1589593021))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\ua562\u4daf\ud158\u839e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(1704902846))
            var_5_81 = and:int(ldc:int(-28146), ldc:int(17873))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12963), ldc:int(4770)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_688:int, ldc:int(1525315838))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(37), ldc:int(1161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-29568), ldc:int(-29567)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_688 = and:int(var_3_DA:int, ldc:int(-236046147))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(18979), ldc:int(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1864167389))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-557817612))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-414110306))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1158533005))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1735496449))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1778108770))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-185862718))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(616143574))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2034749299))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1934394221))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-447555894))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(716891068))
                            var_11_EB = and:int(ldc:int(-8779), ldc:int(8778))
                            goto(Label_1551)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1793477831))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-861533853))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-2061723802))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(231625407))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(587468400))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1816524202))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2047086401))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1073661992))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(506168593))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-641763650))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(432607822))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1158350400))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1219218830))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1316314357))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(324172356))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-912863007))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1617267522))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(37), ldc:int(1155))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2120372521))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1429678089))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1859863177))
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(824922635))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(690236901))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-490484856))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(650877437))
                        var_11_EB = and:int(ldc:int(30728), ldc:int(-30858))
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1025866154))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1680738808))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-2027099033))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(654248444))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1428)
                            }
                        }
                    }
                    
                    Label_1277:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1906977272))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-428379024))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1409740828))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1966353894))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-844100280))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1173824385))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(1386140860))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1551)
                    }
                    
                    Label_1428:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-352764259))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1505283708))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(446858092))
                        loopcontinue()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(-704649729))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_693 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1634517034))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(348293162))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1937183930))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(383486961))
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1340009980))
                        var_17_693 = add:int(var_16_119:int, and:int(ldc:int(2625), ldc:int(169)))
                        looporswitchbreak()
                    }
                }
                
                var_3_688 = and:int(var_3_688:int, ldc:int(-457214211))
                
                if (cmple:boolean(var_5_81 = var_17_693:int, sub:int(var_6_88:int, xor:int(ldc:int(-32766), ldc:int(-32765))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(581730878))
            goto(Label_0108)
        }
    }
}
