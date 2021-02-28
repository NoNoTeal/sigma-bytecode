public class \ub113\uc4d2\u183a\u527a\u6435.\u0800\uff55\ua6bd\u3d64\u3711 {
    public void \u0800\uff55\ua6bd\u3d64\u3711() {
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
            invokespecial:\ud158\u839e\u7006\uc3e3\u446c(\ud158\u839e\u7006\uc3e3\u446c::<init>, this:\u0800\uff55\ua6bd\u3d64\u3711, getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u4e72\ua6bd\u927d\uc238\ub8be), loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), and:int(ldc:int(-21126), ldc:int(21125))), loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), and:int(ldc:int(1109), ldc:int(26633))))
            putfield:HashMap<\ua3b4\u8aa5\ub113\ubf56\u873d, \ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2>(\u0800\uff55\ua6bd\u3d64\u3711::\u3711\u8d98\u3bd6\u5654\u8709, this:\u0800\uff55\ua6bd\u3d64\u3711, initobject:HashMap<\ua3b4\u8aa5\ub113\ubf56\u873d, \ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2>(HashMap<K, V>::<init>))
            putstatic:\u0800\uff55\ua6bd\u3d64\u3711(\u0800\uff55\ua6bd\u3d64\u3711::\u9af2\u9255\uc4d2\u3504\ub83f, this:\u0800\uff55\ua6bd\u3d64\u3711)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u7006\ub171\ud12e\u51b2(\u5245\u8aa5\u61a4\u7049\u4cd9.\ud158\ud7e8\u527a\u7af6\u16f6 p0) {
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
    
    public void \u446c\u1833\u72f1\u6bb9\ub171(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
        var_2_61 : int
        var_2_6E : int
        var_4_84 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_5_B1 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_DC : \ua3b4\u8aa5\ub113\ubf56\u873d
        var_7_E3 : \ua068\uc7fe\u4ab3\u385b\ua61f
        var_8_102 : double[]
        
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
        var_2_61 = and:int(ldc:int(-954446679), ldc:int(-2025980113))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u0800\uff55\ua6bd\u3d64\u3711[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            var_2_6E = and:int(var_2_61:int, ldc:int(-566448773))
            invokevirtual:void(HashMap<K, V>::clear, getfield:HashMap<\ua3b4\u8aa5\ub113\ubf56\u873d, \ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2>(\u0800\uff55\ua6bd\u3d64\u3711::\u3711\u8d98\u3bd6\u5654\u8709, this:\u0800\uff55\ua6bd\u3d64\u3711))
            var_4_84 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokevirtual:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3bc9\u4daf\u446c\u647c\u7ce1\u960f, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u0800\uff55\ua6bd\u3d64\u3711::\u64f2\u8350\u0b8e\u64f2\u946b))))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_84:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)) {
                var_5_B1 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_84:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_5_B1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    if (logicalnot:boolean(instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_5_B1:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        var_6_DC = checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_5_B1:\ua3b4\u8aa5\ub113\ubf56\u873d)
                        var_7_E3 = invokestatic:\ua068\uc7fe\u4ab3\u385b\ua61f(\u0c95\ub102\u3d4b\u51b2\ud4fe::\u385b\u8640\u5245\ub70c\u67e9, var_6_DC:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        var_8_102 = invokestatic:double[](\u51fa\u494c\u71f1\u7330\u12cb::\u47c2\u62da\u6fb0\u0c95\u71f1\u8d90, getfield:double(\ua068\uc7fe\u4ab3\u385b\ua61f::\u9af2\ub19c\ub1b9\u5bc4\u8640, var_7_E3:\ua068\uc7fe\u4ab3\u385b\ua61f), add:double(add:double(getfield:double(\ua068\uc7fe\u4ab3\u385b\ua61f::\u6bb9\u5140\ub18d\u97e6\u4975, var_7_E3:\ua068\uc7fe\u4ab3\u385b\ua61f), f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7ce1\u392e\ufe34\u3a62\u4492\u3a62, var_6_DC:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))), ldc:double(0.30000001192092896)), getfield:double(\ua068\uc7fe\u4ab3\u385b\ua61f::\ube23\u8d90\u4daf\u446c\u4c04, var_7_E3:\ua068\uc7fe\u4ab3\u385b\ua61f))
                        
                        if (cmpne:boolean(var_8_102:double[], aconstnull:double[]())) {
                            if (cmpge:boolean(loadelement:double(var_8_102:double[], and:int(ldc:int(802), ldc:int(22679))), ldc:double(0.0))) {
                                if (cmplt:boolean(loadelement:double(var_8_102:double[], and:int(ldc:int(1382), ldc:int(131))), ldc:double(1.0))) {
                                    invokevirtual:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(HashMap<\ua3b4\u8aa5\ub113\ubf56\u873d, \ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2>::put, getfield:HashMap<\ua3b4\u8aa5\ub113\ubf56\u873d, \ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2>(\u0800\uff55\ua6bd\u3d64\u3711::\u3711\u8d98\u3bd6\u5654\u8709, this:\u0800\uff55\ua6bd\u3d64\u3711), var_6_DC:\ua3b4\u8aa5\ub113\ubf56\u873d, initobject:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::<init>, d2f:float(loadelement:double(var_8_102:double[], and:int(ldc:int(-18010), ldc:int(18009)))), d2f:float(loadelement:double(var_8_102:double[], xor:int(ldc:int(-32760), ldc:int(-32759))))))
                                }
                            }
                        }
                    }
                }
                
                var_2_6E = and:int(var_2_6E:int, ldc:int(-1234299279))
            }
        }
    }
    
    public void \uff55\u6ec6\u836c\u98a4\ub1b9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7873\u647c\u5f50\u5db4\ucef1 p0) {
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
            
            if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u0800\uff55\ua6bd\u3d64\u3711[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7873\u647c\u5f50\u5db4\ucef1::\u3711\u3e75\u7ce1\uc3e3\ufe34, p0:\u7873\u647c\u5f50\u5db4\ucef1))) {
                    invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u4e72\u6198\u7c6b\u718f\u64ab, p0:\u7873\u647c\u5f50\u5db4\ucef1[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d], xor:int[expected:boolean](ldc:int(8769), ldc:int(8768)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ube23\u97b7\u98a4\ua562\ucef1$0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p1) {
        var_4_72 : String
        var_5_AA : String
        var_6_B3 : int
        var_7_D8 : String
        
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
            var_4_72 = invokeinterface:String(ITextComponent::getUnformattedComponentText, invokevirtual:ITextComponent(\u965f\u7043\ufcaf\uae87\u839e::\u527a\u71f1\u3dd3\u69d9\u071d\u2dcc, p1:\u965f\u7043\ufcaf\uae87\u839e, xor:int(ldc:int(5160), ldc:int(5161))))
            var_5_AA = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), xor:int(ldc:int(-15872), ldc:int(-15866)))), invokevirtual:String(String::substring, var_4_72:String, and:int(ldc:int(5277), ldc:int(-5280)), invokestatic:int(Math::min, xor:int(ldc:int(16388), ldc:int(16390)), invokevirtual:int(String::length, var_4_72:String)))))
            var_6_B3 = and:int(ldc:int(6234), ldc:int(-6747))
            
            if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), and:int(ldc:int(143), ldc:int(28007))))) {
                var_6_B3 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), and:int(ldc:int(24663), ldc:int(5031))))
            }
            
            var_7_D8 = loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), xor:int(ldc:int(8865), ldc:int(8866)))
            
            if (cmple:boolean(var_6_B3:int, xor:int(ldc:int(-32504), ldc:int(-32501)))) {
                if (cmpgt:boolean(var_6_B3:int, xor:int(ldc:int(10243), ldc:int(10241)))) {
                    var_7_D8 = loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), xor:int(ldc:int(5250), ldc:int(5255)))
                }
            }
            else {
                var_7_D8 = loadelement:String(getstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf), xor:int(ldc:int(1304), ldc:int(1308)))
            }
            
            invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_5_AA:String), var_7_D8:String), var_6_B3:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_D0 : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_26F_0 : byte[] [generated]
        stack_2CE_0 : byte[] [generated]
        stack_349_0 : byte[] [generated]
        stack_39F_0 : byte[] [generated]
        var_4_251 : int
        var_3_256 : byte[]
        var_5_257 : int
        expr_26F : byte [generated]
        var_0_2C4 : int
        expr_2CE : byte [generated]
        stack_317_2 : byte [generated]
        stack_2F4_0 : byte [generated]
        expr_A5 : int [generated]
        var_2_D3 : byte[]
        expr_D7 : int [generated]
        var_3_337 : byte[]
        var_5_338 : int
        expr_118 : int [generated]
        var_3_38D : byte[]
        var_5_38E : int
        var_3_15A : String
        stack_24A_0 : String[] [generated]
        expr_16C : String[] [generated]
        
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
        var_0_D0 = and:int(ldc:int(981385288), ldc:int(-230171909))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_26F_0 = stack_2CE_0 = stack_349_0 = stack_39F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("jzbF15s22cN12+9X17F+99vfM+e5ZslV7d1Y1eXfwenhDzJh298w3d/f29/fB58UpQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_251 = expr_6E:int
        var_3_256 = newarray:byte[](byte.class, expr_6E:int)
        var_5_257 = expr_6E:int
        Label_0601:
        
        while (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(8192)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(-1091636872))
            var_5_257 = add:int(var_5_257:int, ldc:int(-1))
            expr_26F = loadelement:byte(stack_26F_0:byte[], var_5_257:int)
            storeelement:byte(var_3_256:byte[], var_5_257:int, add:int(or:int(and:int(shl:int(expr_26F:byte, and:int(ldc:int(2124), ldc:int(4868))), ldc:int(-16)), and:int(shr:int(expr_26F:byte[expected:int], and:int(ldc:int(8204), ldc:int(1718))), ldc:int(15))), ldc:int(3)))
            
            if (cmpne:boolean(var_5_257:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_26F_0 = stack_2CE_0 = stack_349_0 = stack_39F_0 = var_3_256:byte[]
            goto(Label_0115)
        }
        
        Label_0695:
        
        while (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_2C4 = and:int(var_0_D0:int, ldc:int(-1635918338))
            var_5_257 = add:int(var_5_257:int, ldc:int(-1))
            expr_2CE = stack_317_2 = loadelement(stack_2CE_0, var_5_257)
            
            if (cmplt:boolean(add:int(add:int(var_5_257:int, ldc:int(3)), neg:int(var_4_251:int)), ldc:int(0))) {
                stack_317_2 = stack_2F4_0 = add:byte(expr_2CE:byte, loadelement:byte(var_3_256:byte[], add:int(var_5_257:int, ldc:int(3))))
                goto(Label_0772)
            }
            
            Label_0731:
            
            if (cmpeq:boolean(and:int(var_0_2C4:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_2C4 = and:int(var_0_2C4:int, ldc:int(1782212813))
            }
            else {
                var_0_2C4 = and:int(var_0_2C4:int, ldc:int(1045884619))
                stack_317_2 = stack_2F4_0 = add:byte(expr_2CE:byte, ldc:byte(3))
            }
            
            Label_0772:
            
            if (cmpeq:boolean(and:int(var_0_2C4:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0731)
            }
            
            var_0_D0 = and:int(var_0_2C4:int, ldc:int(2144136941))
            storeelement:byte(var_3_256:byte[], var_5_257:int, stack_317_2:byte)
            
            if (cmpne:boolean(var_5_257:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_26F_0 = stack_2CE_0 = stack_349_0 = stack_39F_0 = var_3_256:byte[]
            goto(Label_0170)
        }
        
        goto(Label_0601)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(1)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(1147391610))
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(16384)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(-70959097))
        }
        else {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(517916120))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_251 = expr_A5:int
                var_3_256 = newarray:byte[](byte.class, expr_A5:int)
                var_5_257 = expr_A5:int
                goto(Label_0695)
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(65536)), ldc:int(0))) {
                var_0_D0 = and:int(var_0_D0:int, ldc:int(758948223))
                goto(Label_0115)
            }
            
            var_0_D0 = and:int(var_0_D0:int, ldc:int(-220204675))
            var_2_D3 = stack_D3_0:byte[]
            expr_D7 = add:int(arraylength:int(stack_D5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_3_337 = newarray:byte[](byte.class, expr_D7:int)
                var_5_338 = expr_D7:int
                
                loop {
                    var_0_D0 = and:int(var_0_D0:int, ldc:int(1602092382))
                    var_5_338 = add:int(var_5_338:int, ldc:int(-1))
                    storeelement:byte(var_3_337:byte[], var_5_338:int, add:int(shl:int(loadelement:byte(stack_349_0:byte[], var_5_338:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_D3:byte[], add:int(var_5_338:int, xor:int(ldc:int(12), ldc:int(13)))), ldc:int(5)), and:int(ldc:int(17159), ldc:int(4127)))))
                    
                    if (cmpne:boolean(var_5_338:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_26F_0 = stack_2CE_0 = stack_349_0 = stack_39F_0 = var_3_337:byte[]
            }
        }
        
        Label_0220:
        
        if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(8192)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(-1590796294))
        }
        else {
            if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_D0 = and:int(var_0_D0:int, ldc:int(709154901))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(8)), ldc:int(0))) {
                var_0_D0 = and:int(var_0_D0:int, ldc:int(1104685458))
                goto(Label_0115)
            }
            
            var_0_D0 = and:int(var_0_D0:int, ldc:int(1476392414))
            expr_118 = arraylength:int(stack_118_0:byte[])
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_3_38D = newarray:byte[](byte.class, expr_118:int)
                var_5_38E = expr_118:int
                
                loop {
                    var_0_D0 = and:int(var_0_D0:int, ldc:int(-604116531))
                    var_5_38E = add:int(var_5_38E:int, ldc:int(-1))
                    storeelement:byte(var_3_38D:byte[], var_5_38E:int, xor:byte(loadelement:byte(stack_39F_0:byte[], var_5_38E:int), ldc:byte(93)))
                    
                    if (cmpne:boolean(var_5_38E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_26F_0 = stack_2CE_0 = stack_349_0 = stack_39F_0 = var_3_38D:byte[]
            }
        }
        
        Label_0285:
        
        if (cmpne:boolean(and:int(var_0_D0:int, ldc:int(32)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(-1868117395))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpeq:boolean(and:int(var_0_D0:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_D0 = and:int(var_0_D0:int, ldc:int(1260735248))
            goto(Label_0115)
        }
        
        var_3_15A = initobject:String(String::<init>, stack_14E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_24A_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(30872), ldc:int(616)))
        expr_16C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2095), ldc:int(4744)))
        storeelement:String(expr_16C:String[], and:int(ldc:int(13517), ldc:int(-30190)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(3779), ldc:int(-3780)), and:int(ldc:int(2124), ldc:int(8218))))
        storeelement:String(expr_16C:String[], xor:int(ldc:int(8448), ldc:int(8449)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(305), ldc:int(313)), xor:int(ldc:int(25114), ldc:int(25093))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(21610), ldc:int(10887)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(15), ldc:int(16)), and:int(ldc:int(8741), ldc:int(225))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(2055), ldc:int(16527)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(1057), ldc:int(14627)), xor:int(ldc:int(2457), ldc:int(2493))))
        storeelement:String(expr_16C:String[], xor:int(ldc:int(616), ldc:int(621)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(-8128), ldc:int(-8092)), xor:int(ldc:int(-8031), ldc:int(-8057))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(20587), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(65), ldc:int(103)), and:int(ldc:int(8232), ldc:int(22013))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(8260), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(1081), ldc:int(1041)), xor:int(ldc:int(67), ldc:int(105))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(71), ldc:int(13350)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(5690), ldc:int(106)), xor:int(ldc:int(320), ldc:int(364))))
        putstatic:String[](\u0800\uff55\ua6bd\u3d64\u3711::\u983f\u392e\ud7e8\uc910\ucfaf, expr_16C:String[])
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(288775168), ldc:int(-1611203261))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0800\uff55\ua6bd\u3d64\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(1150733334))
        }
        else {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-1200207725))
            var_5_89 = and:int(ldc:int(17561), ldc:int(-17562))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2668), ldc:int(-6765)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_66B:int, ldc:int(1382481838))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(277), ldc:int(12873)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(1037), ldc:int(16673)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_E2:int, ldc:int(-1632117232))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(12561), ldc:int(16385)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1423246437))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-312789199))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(888660359))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1739449337))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-447563936))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1108881776))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1006272849))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-387366679))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1718739131))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(950018435))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-26785479))
                        var_11_F3 = and:int(ldc:int(-5561), ldc:int(5560))
                        goto(Label_1519)
                    }
                    
                    Label_0593:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1031365378))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1939521014))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1825284829))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(977453342))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-972461005))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1687237225))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1439698724))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(745854005))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(739040519))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1935046170))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1023371462))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0854:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-486306162))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1441581354))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-14229783))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-276850127))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-996112653))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1665138874))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(13411), ldc:int(541))
                                goto(Label_1135)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-434327387))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-618704202))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(260581370))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1925180990))
                        var_11_F3 = and:int(ldc:int(-25812), ldc:int(17489))
                    }
                    
                    Label_1135:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-639243433))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-2025016845))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1441721187))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1401097611))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1135)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-499502838))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1645207217))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1103053903))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2007911556))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1374:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(760703964))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1313692350))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1370279682))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-765572950))
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1978560460))
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-717750503))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(327141466))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(40418163))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1132585723))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1313411889))
                        var_17_676 = add:int(var_16_121:int, xor:int(ldc:int(1031), ldc:int(1030)))
                        looporswitchbreak()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-721329238))
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-14263109))
                
                if (cmple:boolean(var_5_89 = var_17_676:int, sub:int(var_6_90:int, xor:int(ldc:int(27648), ldc:int(27649))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-497262368))
            goto(Label_0108)
        }
    }
}
