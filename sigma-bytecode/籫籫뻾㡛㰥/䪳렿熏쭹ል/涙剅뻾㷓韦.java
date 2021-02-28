public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 {
    public void \u6d99\u5245\ubefe\u3dd3\u97e6(\u59ec\u8413\u97e6\uc229\u3776.\u6d69\u69d9\u6d99\u64f2\u3776 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p1, int p2) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u6d99\u5245\ubefe\u3dd3\u97e6)
            putfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6, invokestatic:List<\u3dd3\u76bc\u8753\u071d\u56bd>(Collections::emptyList))
            putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6, ldc:int(-1))
            putfield:Boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u718f\u4179\u7e3f\ub113\ud51e\u8413, this:\u6d99\u5245\ubefe\u3dd3\u97e6, invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-13109), ldc:int(13108))))
            putfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6, p0:\u6d69\u69d9\u6d99\u64f2\u3776)
            putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:\ud12e\u946b\u97b7\u51b2\u3d64)
            putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u7af6\u16f6\u5fe1\u3504\u5140\ud12e, this:\u6d99\u5245\ubefe\u3dd3\u97e6, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    private void \uc84e\uc229\u7006\u7049\ufe34\ubb2b() {
        var_1_149 : int
        var_3_84 : int
        var_4_B3 : \u3dd3\u76bc\u8753\u071d\u56bd
        var_5_CA : \u3dd3\u76bc\u8753\u071d\u56bd
        var_6_10C : Iterator<String>
        var_7_12F : String
        
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
            var_1_149 = and:int(ldc:int(1714444509), ldc:int(-2044840389))
            
            if (cmpgt:boolean(invokeinterface:int(List<E>::size, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), and:int(ldc:int(2919), ldc:int(1)))) {
                var_3_84 = and:int(ldc:int(4186), ldc:int(-6235))
                
                loop {
                    var_1_149 = and:int(var_1_149:int, ldc:int(1718703673))
                    
                    if (cmpge:boolean(var_3_84:int, sub:int(invokeinterface:int(List<E>::size, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), xor:int(ldc:int(150), ldc:int(151))))) {
                        looporswitchbreak()
                    }
                    
                    var_4_B3 = checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), var_3_84:int))
                    var_5_CA = checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), add:int(var_3_84:int, xor:int(ldc:int(22536), ldc:int(22537)))))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_4_B3:\u3dd3\u76bc\u8753\u071d\u56bd)))) {
                        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_5_CA:\u3dd3\u76bc\u8753\u071d\u56bd)))) {
                            var_6_10C = invokeinterface:Iterator<String>(Set<String>::iterator, invokeinterface:Set<String>(Map<String, String>::keySet, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_4_B3:\u3dd3\u76bc\u8753\u071d\u56bd)))
                            
                            loop {
                                var_1_149 = and:int(var_1_149:int, ldc:int(-1086536549))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_10C:Iterator<String>))) {
                                    looporswitchbreak()
                                }
                                
                                var_7_12F = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_10C:Iterator<String>))
                                
                                if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(String::contains, var_7_12F:String, loadelement:String[expected:CharSequence](getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(2831), ldc:int(16597))))), invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_5_CA:\u3dd3\u76bc\u8753\u071d\u56bd), var_7_12F:String[expected:Object]))) {
                                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::get, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_4_B3:\u3dd3\u76bc\u8753\u071d\u56bd), var_7_12F:String[expected:Object])), invokeinterface:String(Map<String, String>::get, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, var_5_CA:\u3dd3\u76bc\u8753\u071d\u56bd), var_7_12F:String[expected:Object])))) {
                                        invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3d4b\u3d4b\u3bd6\ucb79\u74b1\u9af2, this:\u6d99\u5245\ubefe\u3dd3\u97e6, var_4_B3:\u3dd3\u76bc\u8753\u071d\u56bd, var_7_12F:String)
                                    }
                                }
                                else {
                                    var_1_149 = and:int(var_1_149:int, ldc:int(913826269))
                                    invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3d4b\u3d4b\u3bd6\ucb79\u74b1\u9af2, this:\u6d99\u5245\ubefe\u3dd3\u97e6, var_4_B3:\u3dd3\u76bc\u8753\u071d\u56bd, var_7_12F:String)
                                }
                                
                                var_1_149 = and:int(var_1_149:int, ldc:int(1068564571))
                            }
                        }
                    }
                    
                    var_1_149 = and:int(var_1_149:int, ldc:int(-1233144231))
                    inc:int(var_3_84, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d4b\u3d4b\u3bd6\ucb79\u74b1\u9af2(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd p0, java.lang.String p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(-496340656), ldc:int(-126135598))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::contains, p1:String, loadelement:String[expected:CharSequence](getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(1037), ldc:int(8631)))))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1410441486))
                invokeinterface:String(Map<String, String>::put, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7, p0:\u3dd3\u76bc\u8753\u071d\u56bd), p1:String, invokeinterface:String(Map<String, String>::get, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, p0:\u3dd3\u76bc\u8753\u071d\u56bd), p1:String[expected:Object]))
            }
            else {
                invokeinterface:String(Map<String, String>::put, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7, p0:\u3dd3\u76bc\u8753\u071d\u56bd), p1:String, invokevirtual:String(DateFormat::format, invokestatic:DateFormat(DateFormat::getDateTimeInstance, xor:int(ldc:int(9217), ldc:int(9218)), xor:int(ldc:int(-6142), ldc:int(-6143))), getfield:Date(\u3dd3\u76bc\u8753\u071d\u56bd::\uc31c\u74b1\u8389\u494c\u88c5\u446c, p0:\u3dd3\u76bc\u8753\u071d\u56bd)))
                invokevirtual:void(\u3dd3\u76bc\u8753\u071d\u56bd::\uf995\u88c5\ubefe\u183a\u4c04\u8350, p0:\u3dd3\u76bc\u8753\u071d\u56bd, and:int[expected:boolean](ldc:int(16915), ldc:int(8609)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u52d3\u97e6\u4492\u8640\ufe34\u8d90() {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6ec6\ub19c\u392e\uc238\u51fa\u92ee, this:\u6d99\u5245\ubefe\u3dd3\u97e6), invokespecial:boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u071d\u72f1\u759a\u4e72\u8258\uc31c, this:\u6d99\u5245\ubefe\u3dd3\u97e6))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d99\u5245\ubefe\u3dd3\u97e6::\u8753\u0800\u4f4a\u4975\u64ab\u4c04, this:\u6d99\u5245\ubefe\u3dd3\u97e6), invokespecial:boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3d64\u6198\u9af2\ub113\u4f4a\u6198, this:\u6d99\u5245\ubefe\u3dd3\u97e6))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u3d64\u6198\u9af2\ub113\u4f4a\u6198() {
        var_1_61 : int
        var_1_B2 : int
        stack_DD_0 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(2038467501), ldc:int(2132257701))
        
        if (cmpne:boolean(getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6), ldc:int(-1))) {
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_B2 = and:int(var_1_61:int, ldc:int(-385825453))
                }
                else {
                    var_1_B2 = and:int(var_1_61:int, ldc:int(-49688657))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<String, String>(\u3dd3\u76bc\u8753\u071d\u56bd::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7, checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6))))))) {
                        stack_DD_0 = xor:int(ldc:int(1098), ldc:int(1099))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_B2:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_B2 = and:int(var_1_B2:int, ldc:int(-111096923))
                    stack_DD_0 = and:int(ldc:int(19026), ldc:int(-19423))
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_B2:int, ldc:int(-1322645601))
            }
            
            return:boolean(stack_DD_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-7468), ldc:int(7434)))
    }
    
    private boolean \u071d\u72f1\u759a\u4e72\u8258\uc31c() {
        var_1_61 : int
        var_1_A1 : int
        stack_CC_0 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(1698289710), ldc:int(931388190))
        
        if (cmpne:boolean(getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6), ldc:int(-1))) {
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    var_1_A1 = and:int(var_1_61:int, ldc:int(-2140420248))
                }
                else {
                    var_1_A1 = and:int(var_1_61:int, ldc:int(1950572399))
                    
                    if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))) {
                        stack_CC_0 = and:int(ldc:int(26193), ldc:int(4131))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_A1:int, ldc:int(16)), ldc:int(0))) {
                    var_1_A1 = and:int(var_1_A1:int, ldc:int(-10322302))
                    stack_CC_0 = and:int(ldc:int(3424), ldc:int(-3425))
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_A1:int, ldc:int(212635843))
            }
            
            return:boolean(stack_CC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(13444), ldc:int(-13445)))
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(-32425), ldc:int(-32681)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getfield:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6))
        return:boolean(xor:int[expected:boolean](ldc:int(4372), ldc:int(4373)))
    }
    
    private void \u965f\u7330\u836c\u0800\u6c52\uc84e(int p0) {
        var_4_AB : Date
        var_5_C3 : String
        var_6_CA : String
        stack_FB_1 : String [generated]
        expr_E2 : Object[] [generated]
        
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
            
            if (cmpge:boolean(p0:int, ldc:int(0))) {
                if (cmplt:boolean(p0:int, invokeinterface:int(List<E>::size, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))) {
                    if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))) {
                        putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6, p0:int)
                        var_4_AB = getfield:Date(\u3dd3\u76bc\u8753\u071d\u56bd::\uc31c\u74b1\u8389\u494c\u88c5\u446c, checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p0:int)))
                        var_5_C3 = invokevirtual:String(DateFormat::format, invokestatic:DateFormat(DateFormat::getDateTimeInstance, xor:int(ldc:int(4609), ldc:int(4610)), and:int(ldc:int(3383), ldc:int(3))), var_4_AB:Date)
                        var_6_CA = invokestatic:String(\u6b5f\u56bd\u071d\ub32d\u16f6::\u4975\u836c\u4bc8\u67e9\u3c25\u965f, var_4_AB:Date)
                        stack_FB_1 = loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), xor:int(ldc:int(2064), ldc:int(2070)))
                        expr_E2 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6), ldc:int(12578)))
                        storeelement:Object(expr_E2:Object[], and:int(ldc:int(20360), ldc:int(-20361)), var_5_C3:String[expected:Object])
                        storeelement:Object(expr_E2:Object[], and:int(ldc:int(8193), ldc:int(6213)), var_6_CA:String[expected:Object])
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), initobject:\u1833\u4f4a\u64f2\uc910\u5d20(\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\u4ab3\ub83f\u718f\ucb79\u120d/\u6d99\u5245\ubefe\u3dd3\u97e6;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\uae87\ub19c\u9937\u836c\u34df\ub8be), initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_FB_1:String, expr_E2:Object[]), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(30287), ldc:int(2215)))), and:int[expected:boolean](ldc:int(22529), ldc:int(521))))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u51fa\u6435\ubb2b\u494c\u6b5f\u8d90() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), initobject:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\u4ab3\ub83f\u718f\ucb79\u120d/\u6d99\u5245\ubefe\u3dd3\u97e6;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\u516c\u8aa5\u8df4\u71f1\u8258\u4d85), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), xor:int(ldc:int(403), ldc:int(411)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), xor:int(ldc:int(-30617), ldc:int(-30610)))), xor:int[expected:boolean](ldc:int(1536), ldc:int(1537))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\u3e75\u4daf\u760c\u1833\u4e72() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, getfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), initobject:\u927d\u16f6\u9af2\ud158\u624e\uc3e3[expected:\u9033\u4179\ube23\u5f50\ucfaf](\u927d\u16f6\u9af2\ud158\u624e\uc3e3::<init>, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u7af6\u16f6\u5fe1\u3504\u5140\ud12e, this:\u6d99\u5245\ubefe\u3dd3\u97e6), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\ud12e\u946b\u97b7\u51b2\u3d64::\u7bad\u718f\u4cd9\u5654\u9255\ub1b9, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6))), loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(11578), ldc:int(715)))), invokevirtual:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u4179\u6b0d\u51fa\uff55\u873d\u9af2, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::get, getfield:Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(\ud12e\u946b\u97b7\u51b2\u3d64::\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6))))), getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))), loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(8207), ldc:int(203))))), this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud217\ufe34\u4d85\u6b0d\u1187\u5f50() {
        var_3_72 : \u3dd3\u76bc\u8753\u071d\u56bd
        
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
            var_3_72 = checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))
            putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6, ldc:int(-1))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), initobject:\u6c52\u93a2\u8709\ub102\u4bc8(\u6c52\u93a2\u8709\ub102\u4bc8::<init>, invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, getfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), initobject:\ubf56\u8258\ub102\u516c\uceb8\u446c(\ubf56\u8258\ub102\u516c\uceb8\u446c::<init>, var_3_72:\u3dd3\u76bc\u8753\u071d\u56bd, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u6d99\u5245\ubefe\u3dd3\u97e6)), getfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_63 : int
        var_5_BE : int
        stack_11B_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_11B_1 : int [generated]
        
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
            var_5_63 = and:int(ldc:int(-1090485295), ldc:int(-13097517))
            putfield:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u927d\u3a62\ufe34\u12b2\u0800, this:\u6d99\u5245\ubefe\u3dd3\u97e6, aconstnull:ITextComponent())
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u5245\u67d0\u4f52\u760c\u56bd[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8bb0\u9a18\u759a\u4f4a\u494c>](\u6d99\u5245\ubefe\u3dd3\u97e6::\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u6d99\u5245\ubefe\u3dd3\u97e6::\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, this:\u6d99\u5245\ubefe\u3dd3\u97e6), this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u67e9\u600f\u3dd3\ucb79\u8389\uc29a), i2f:float(sub:int(div:int(sub:int(getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d99\u5245\ubefe\u3dd3\u97e6), and:int(ldc:int(4758), ldc:int(1238))), and:int(ldc:int(346), ldc:int(514))), ldc:int(90))), ldc:float(20.0f), ldc:int(10526880))
            
            if (invokevirtual:boolean(Boolean::booleanValue, getfield:Boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u718f\u4179\u7e3f\ub113\ud51e\u8413, this:\u6d99\u5245\ubefe\u3dd3\u97e6))) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ua61f\uc9f6\u3e2a\u36d3\u1833\ubb2b), ldc:float(20.0f), i2f:float(sub:int(div:int(getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u6d99\u5245\ubefe\u3dd3\u97e6), xor:int(ldc:int(18560), ldc:int(18562))), ldc:int(10))), ldc:int(16777215))
            }
            
            var_5_BE = and:int(var_5_63:int, ldc:int(1064883065))
            stack_11B_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3c25\u9033\uc229\u156b\u8d98\u7ce1, this:\u6d99\u5245\ubefe\u3dd3\u97e6)
            
            if (invokevirtual:boolean(Boolean::booleanValue, getfield:Boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u718f\u4179\u7e3f\ub113\ud51e\u8413, this:\u6d99\u5245\ubefe\u3dd3\u97e6))) {
                var_5_BE = and:int(var_5_BE:int, ldc:int(2130152831))
                stack_11B_1 = and:int[expected:boolean](ldc:int(-4173), ldc:int(4172))
            }
            else {
                stack_11B_1 = xor:int[expected:boolean](ldc:int(-24559), ldc:int(-24560))
            }
            
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_11B_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_11B_1:boolean)
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (cmpne:boolean(getfield:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u927d\u3a62\ufe34\u12b2\u0800, this:\u6d99\u5245\ubefe\u3dd3\u97e6), aconstnull:ITextComponent())) {
                invokevirtual:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u8413\u071d\uc7fe\u9937\uceb8\u3711, this:\u6d99\u5245\ubefe\u3dd3\u97e6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u927d\u3a62\ufe34\u12b2\u0800, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p1:int, p2:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\u071d\uc7fe\u9937\uceb8\u3711(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, int p2, int p3) {
        var_7_7A : int
        var_8_81 : int
        
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
            
            if (cmpne:boolean(p1:ITextComponent, aconstnull:ITextComponent())) {
                var_7_7A = add:int(p2:int, ldc:int(12))
                var_8_81 = sub:int(p3:int, ldc:int(12))
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u8d98\u120d\u7ce1\u647c\u416d\uc238, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_7_7A:int, and:int(ldc:int(2247), ldc:int(275))), sub:int(var_8_81:int, xor:int(ldc:int(-27582), ldc:int(-27583))), add:int(add:int(var_7_7A:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p1:ITextComponent[expected:ITextProperties])), xor:int(ldc:int(24594), ldc:int(24593))), add:int(add:int(var_8_81:int, ldc:int(8)), xor:int(ldc:int(-31102), ldc:int(-31103))), ldc:int(-1073741824), ldc:int(-1073741824))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d99\u5245\ubefe\u3dd3\u97e6), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:ITextComponent, i2f:float(var_7_7A:int), i2f:float(var_8_81:int), ldc:int(16777215))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ua61f\u7bad\uf995\ub19c\u6cfe\u2dcc$5(boolean p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(628657540), ldc:int(-1644806228))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1235906558))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            }
            else {
                invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u4492\u3e75\u4daf\u760c\u1833\u4e72, this:\u6d99\u5245\ubefe\u3dd3\u97e6)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u62da\u6198\u56bd\u59ec\u4ab3\u120d$4(boolean p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(853906681), ldc:int(-220507009))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1152147477))
                putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6, ldc:int(-1))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            }
            else {
                invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\ud217\ufe34\u4d85\u6b0d\u1187\u5f50, this:\u6d99\u5245\ubefe\u3dd3\u97e6)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc29a\uc4d2\u3711\u7af6\u7ce1\ub7dc$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getfield:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d99\u5245\ubefe\u3dd3\u97e6::\u6bb9\uae87\u527a\u4492\u392e\u760c, this:\u6d99\u5245\ubefe\u3dd3\u97e6))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u071d\ub171\ube23\u9af2\u7ce1\ud158$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d99\u5245\ubefe\u3dd3\u97e6), initobject:\u983f\u4f4a\u873d\u6bb9\u873d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u983f\u4f4a\u873d\u6bb9\u873d::<init>, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(List<\u3dd3\u76bc\u8753\u071d\u56bd>::get, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, this:\u6d99\u5245\ubefe\u3dd3\u97e6), getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6)))))
            putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u965f\u7330\u836c\u0800\u6c52\uc84e, this:\u6d99\u5245\ubefe\u3dd3\u97e6, getfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, this:\u6d99\u5245\ubefe\u3dd3\u97e6))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u51fa\u6435\ubb2b\u494c\u6b5f\u8d90, this:\u6d99\u5245\ubefe\u3dd3\u97e6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 \u3bc9\ucfaf\u718f\u0800\u960f\u3a62(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\ud12e\u946b\u97b7\u51b2\u3d64(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d99\u5245\ubefe\u3dd3\u97e6::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u8709\u120d\ufe34\u9255\uc9f6\u0800(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2() {
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
            return:Logger(getstatic:Logger(\u6d99\u5245\ubefe\u3dd3\u97e6::\u64f2\u6198\uc7fe\uae87\u4d85\uf995))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \ufcaf\u4492\u67d0\u6b0d\ub8be\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, java.util.List p1) {
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
            return:List(putfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, p0:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:List<\u3dd3\u76bc\u8753\u071d\u56bd>))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Boolean \u3e75\u4492\u4f4a\uc7fe\u4cd9\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, java.lang.Boolean p1) {
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
            return:Boolean(putfield:Boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u718f\u4179\u7e3f\ub113\ud51e\u8413, p0:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:Boolean))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \ubefe\u5654\u47c2\u34df\u6b0d\u385b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:List(getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u6d99\u5245\ubefe\u3dd3\u97e6::\u0b8e\ud217\ud12e\u6bb9\ub7dc\u6435, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5245\u67d0\u4f52\u760c\u56bd \u12cb\u12b2\ua3b4\u183a\ud158\u51fa(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\u5245\u67d0\u4f52\u760c\u56bd(getfield:\u5245\u67d0\u4f52\u760c\u56bd(\u6d99\u5245\ubefe\u3dd3\u97e6::\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static void \u3c25\ub7dc\uf9c5\u8aa5\u64ab\u9033(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc84e\uc229\u7006\u7049\ufe34\ubb2b, p0:\u6d99\u5245\ubefe\u3dd3\u97e6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u183a\u76bc\u0a06\ud523\u416d\ua068(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, int p1) {
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
            return:int(putfield:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9, p0:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static int \ub1b9\u64f2\u446c\u7af6\u7af6\u8640(int p0) {
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
            return:int(putstatic:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u92ff\ub171\ubcb0\ucfaf\u156b\u3776, p0:int))
        }
        
        goto(Label_0006)
    }
    
    public static void \u6c56\uc238\u12cb\u873d\u67e9\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, int p1) {
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
            invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u965f\u7330\u836c\u0800\u6c52\uc84e, p0:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u61a4\u3504\ub7dc\u0800\u34df\uc2bd(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            invokespecial:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u52d3\u97e6\u4492\u8640\ufe34\u8d90, p0:\u6d99\u5245\ubefe\u3dd3\u97e6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u3e75\u5db4\u9937\u93a2\u12cb\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u6bb9\u36d3\u3e2a\u3d4b\u624e\u527a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \uae87\ubff1\u6198\ub1b9\u88c5\u4e72() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5245\ubefe\u3dd3\u97e6::\u5654\ub70c\u71ae\u97e6\u385b\u6fb0))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u446c\u7af6\u5bc4\ub83f\u8413\u600f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \ub113\u1187\u4c04\u4cd9\u416d\u9255(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, net.minecraft.util.text.ITextComponent p1) {
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
            return:ITextComponent(putfield:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u927d\u3a62\ufe34\u12b2\u0800, p0:\u6d99\u5245\ubefe\u3dd3\u97e6, p1:ITextComponent))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u64ab\u760c\u416d\u88c5\uc31c\u36d3() {
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
            return:ITextComponent(getstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3dd3\u8c8a\u2dcc\u647c\u16f6\u7330))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5245\ubefe\u3dd3\u97e6::\ufcaf\u4f52\uf94d\u3504\u4f52\u52d3))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d99\u5245\ubefe\u3dd3\u97e6::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u6d99\u5245\ubefe\u3dd3\u97e6))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u6d69\u4c04\ub113\u92ff\u3e75\u12b2() {
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
            return:ITextComponent(getstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u8413\u647c\u120d\uc229\ud4fe\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3D4 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_3E7_0 : byte[] [generated]
        stack_422_0 : byte[] [generated]
        stack_480_0 : byte[] [generated]
        stack_4F5_0 : byte[] [generated]
        var_4_3BF : int
        var_3_3C4 : byte[]
        var_5_3C5 : int
        var_0_476 : int
        expr_480 : byte [generated]
        stack_4C0_2 : byte [generated]
        stack_49D_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_410 : byte[]
        var_5_411 : int
        expr_D9 : int [generated]
        expr_112 : int [generated]
        var_3_4E3 : byte[]
        var_5_4E4 : int
        expr_4F5 : byte [generated]
        var_3_154 : String
        expr_15C : String[] [generated]
        expr_166 : String[] [generated]
        var_3_324 : String[]
        
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
        var_0_3D4 = and:int(ldc:int(209578761), ldc:int(-88081505))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_3E7_0 = stack_422_0 = stack_480_0 = stack_4F5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("xl/3xXXFO/0Eb10N+q39J/0VnXW0tbyFPHXlDf3lDbstBR/9FZ2L3J3nhYSEgl29/4Ud9I31JcUNuy0FH/0VnYvcneeFhISCjW0fhQUtvKW8hbstBR/9FZ2L5HSPze0VHWstVD/0XUUVfIXsOy0FH/0VnYv8bJcNFf0VnXV0TFQ7tbW3DcX9LX2l+p0FF1xd0qXdH/0VnYXkbDu1tbcNxf0tfaX6nQUXXF3SpT0fhQUtvKsEhf+FHfSN9Su1PW/FLRXUhJsdzbf9863l5ju1tbcNxf0tfaX6nQUXXF3SpT0fhQUtvKsEhf+FHfSN9Su1PW/FLRXUhJsdzbf9+63l3ju1tbcNxf0tfaX6nQUXXF3SpT0fhQUtvKsttW/FLRXUhJsdzbf9863l5ju1tbcNxf0tfaX6nQUXXF3SpT0fhQUtvKsttW/FLRXUhJsdzbf9+5U1LkR1xXV13bW1hbxl2kUFx/Pd1QfEdcVLDTxnTcyUtDWdy/01/xXt/TW1hbxl2kUFx/Pd1QfEdcVLHYSXhQUtvLRsZbWdy/01/8uc1LU=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_3BF = expr_6E:int
        var_3_3C4 = newarray:byte[](byte.class, expr_6E:int)
        var_5_3C5 = expr_6E:int
        Label_0967:
        
        while (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(128)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(1221578615))
            var_5_3C5 = add:int(var_5_3C5:int, ldc:int(-1))
            storeelement:byte(var_3_3C4:byte[], var_5_3C5:int, add:byte(loadelement:byte(stack_3E7_0:byte[], var_5_3C5:int), ldc:byte(75)))
            
            if (cmpne:boolean(var_5_3C5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_3E7_0 = stack_422_0 = stack_480_0 = stack_4F5_0 = var_3_3C4:byte[]
            goto(Label_0115)
        }
        
        var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-2015401399))
        Label_1129:
        
        while (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(64)), ldc:int(0))) {
            var_0_476 = and:int(var_0_3D4:int, ldc:int(1268642611))
            var_5_3C5 = add:int(var_5_3C5:int, ldc:int(-1))
            expr_480 = stack_4C0_2 = loadelement(stack_480_0, var_5_3C5)
            
            if (cmplt:boolean(add:int(add:int(var_5_3C5:int, ldc:int(3)), neg:int(var_4_3BF:int)), ldc:int(0))) {
                stack_4C0_2 = stack_49D_0 = add:byte(expr_480:byte, loadelement:byte(var_3_3C4:byte[], add:int(var_5_3C5:int, ldc:int(3))))
                goto(Label_1197)
            }
            
            Label_1165:
            
            if (cmpeq:boolean(and:int(var_0_476:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_476 = and:int(var_0_476:int, ldc:int(1311753005))
                stack_4C0_2 = stack_49D_0 = add:byte(expr_480:byte, ldc:byte(3))
            }
            
            Label_1197:
            
            if (cmpeq:boolean(and:int(var_0_476:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1165)
            }
            
            var_0_3D4 = and:int(var_0_476:int, ldc:int(-1191186573))
            storeelement:byte(var_3_3C4:byte[], var_5_3C5:int, stack_4C0_2:byte)
            
            if (cmpne:boolean(var_5_3C5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_3E7_0 = stack_422_0 = stack_480_0 = stack_4F5_0 = var_3_3C4:byte[]
            goto(Label_0222)
        }
        
        goto(Label_0967)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(1656531711))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(256)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(2119168965))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_410 = newarray:byte[](byte.class, expr_A0:int)
                var_5_411 = expr_A0:int
                
                loop {
                    var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-667029673))
                    var_5_411 = add:int(var_5_411:int, ldc:int(-1))
                    storeelement:byte(var_3_410:byte[], var_5_411:int, add:int(shl:int(loadelement:byte(stack_422_0:byte[], var_5_411:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_411:int, xor:int(ldc:int(8836), ldc:int(8837)))), ldc:int(7)), and:int(ldc:int(4361), ldc:int(3)))))
                    
                    if (cmpne:boolean(var_5_411:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_3E7_0 = stack_422_0 = stack_480_0 = stack_4F5_0 = var_3_410:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(1743656781))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(512)), ldc:int(0))) {
                var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-1015314872))
                goto(Label_0115)
            }
            
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-1996491825))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_3BF = expr_D9:int
                var_3_3C4 = newarray:byte[](byte.class, expr_D9:int)
                var_5_3C5 = expr_D9:int
                goto(Label_1129)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-1357595595))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(32768)), ldc:int(0))) {
                var_0_3D4 = and:int(var_0_3D4:int, ldc:int(606041767))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-113258561))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_4E3 = newarray:byte[](byte.class, expr_112:int)
                var_5_4E4 = expr_112:int
                
                loop {
                    var_0_3D4 = and:int(var_0_3D4:int, ldc:int(514712395))
                    var_5_4E4 = add:int(var_5_4E4:int, ldc:int(-1))
                    expr_4F5 = loadelement:byte(stack_4F5_0:byte[], var_5_4E4:int)
                    storeelement:byte(var_3_4E3:byte[], var_5_4E4:int, xor:int(or:int(and:int(shl:int(expr_4F5:byte, xor:int(ldc:int(1281), ldc:int(1285))), ldc:int(-16)), and:int(shr:int(expr_4F5:byte[expected:int], and:int(ldc:int(37), ldc:int(8582))), ldc:int(15))), ldc:int(115)))
                    
                    if (cmpne:boolean(var_5_4E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_3E7_0 = stack_422_0 = stack_480_0 = stack_4F5_0 = var_3_4E3:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_3D4:int, ldc:int(524288)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(-489403635))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_3D4 = and:int(var_0_3D4:int, ldc:int(489176857))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_3D4:int, ldc:int(1)), ldc:int(0))) {
            var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(49), ldc:int(7952)))
            expr_166 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(46), ldc:int(62)))
            storeelement:String(expr_166:String[], xor:int(ldc:int(2467), ldc:int(2473)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-20515), ldc:int(20514)), xor:int(ldc:int(3112), ldc:int(3114))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(16903), ldc:int(16908)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-32255), ldc:int(-32253)), xor:int(ldc:int(8334), ldc:int(8333))))
            storeelement:String(expr_166:String[], and:int(ldc:int(-10056), ldc:int(1863)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(19), ldc:int(16)), and:int(ldc:int(3095), ldc:int(575))))
            storeelement:String(expr_166:String[], and:int(ldc:int(4485), ldc:int(1573)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(4759), ldc:int(4736)), and:int(ldc:int(319), ldc:int(543))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(8276), ldc:int(8277)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(21023), ldc:int(20992)), xor:int(ldc:int(271), ldc:int(310))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(515), ldc:int(513)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(1337), ldc:int(6205)), xor:int(ldc:int(188), ldc:int(238))))
            storeelement:String(expr_166:String[], and:int(ldc:int(8231), ldc:int(659)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(2135), ldc:int(16626)), xor:int(ldc:int(4696), ldc:int(4660))))
            storeelement:String(expr_15C:String[], xor:int(ldc:int(18699), ldc:int(18692)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(1132), ldc:int(4844)), and:int(ldc:int(5504), ldc:int(18560))))
            storeelement:String(expr_166:String[], and:int(ldc:int(2708), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(16453), ldc:int(16581)), and:int(ldc:int(17562), ldc:int(9114))))
            storeelement:String(expr_166:String[], and:int(ldc:int(25224), ldc:int(6428)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(475), ldc:int(25786)), xor:int(ldc:int(130), ldc:int(79))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(-32656), ldc:int(-32647)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(6297), ldc:int(6228)), and:int(ldc:int(416), ldc:int(772))))
            storeelement:String(expr_166:String[], and:int(ldc:int(1286), ldc:int(8334)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(950), ldc:int(1344)), and:int(ldc:int(1322), ldc:int(2415))))
            storeelement:String(expr_166:String[], and:int(ldc:int(24711), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(955), ldc:int(2346)), and:int(ldc:int(14164), ldc:int(2390))))
            storeelement:String(expr_15C:String[], and:int(ldc:int(24765), ldc:int(268)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(20), ldc:int(320)), and:int(ldc:int(3034), ldc:int(8570))))
            storeelement:String(expr_15C:String[], and:int(ldc:int(45), ldc:int(12509)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(161), ldc:int(507)), and:int(ldc:int(379), ldc:int(9087))))
            storeelement:String(expr_15C:String[], xor:int(ldc:int(4614), ldc:int(4616)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16767), ldc:int(2939)), and:int(ldc:int(16863), ldc:int(12191))))
            putstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833, expr_166:String[])
            var_3_324 = expr_15C:String[]
            putstatic:Logger(\u6d99\u5245\ubefe\u3dd3\u97e6::\u64f2\u6198\uc7fe\uae87\u4d85\uf995, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5245\ubefe\u3dd3\u97e6::\ufcaf\u4f52\uf94d\u3504\u4f52\u52d3, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_324:String[], and:int(ldc:int(4366), ldc:int(24796))), loadelement:String(var_3_324:String[], xor:int(ldc:int(28677), ldc:int(28680)))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5245\ubefe\u3dd3\u97e6::\u5654\ub70c\u71ae\u97e6\u385b\u6fb0, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_324:String[], xor:int(ldc:int(-22267), ldc:int(-22263))), loadelement:String(var_3_324:String[], and:int(ldc:int(14607), ldc:int(174)))))
            putstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3dd3\u8c8a\u2dcc\u647c\u16f6\u7330, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), xor:int(ldc:int(17428), ldc:int(17430)))))
            putstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u8413\u647c\u120d\uc229\ud4fe\uf9c5, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), xor:int(ldc:int(-24192), ldc:int(-24189)))))
            putstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\u67e9\u600f\u3dd3\ucb79\u8389\uc29a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d99\u5245\ubefe\u3dd3\u97e6::\ube23\u51b2\u92ee\u6435\u8308\u1833), and:int(ldc:int(16516), ldc:int(524)))))
            putstatic:ITextComponent(\u6d99\u5245\ubefe\u3dd3\u97e6::\ua61f\uc9f6\u3e2a\u36d3\u1833\ubb2b, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_324:String[], xor:int(ldc:int(65), ldc:int(78)))))
            putstatic:int(\u6d99\u5245\ubefe\u3dd3\u97e6::\u92ff\ub171\ubcb0\ucfaf\u156b\u3776, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(2129953321), ldc:int(2147385969))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(1071895671))
            var_5_81 = and:int(ldc:int(-28765), ldc:int(28740))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8436), ldc:int(-9461)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(518044799))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(8547), ldc:int(4105)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(202), ldc:int(203)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(1055185057))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(25601), ldc:int(151)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-428810137))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1529646193))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1864672659))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2145424875))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1683103715))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2116867021))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(336482102))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1417237226))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1617547578))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-555507295))
                            var_11_EB = and:int(ldc:int(-16426), ldc:int(16425))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-280823601))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-488397464))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1458906369))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1211415))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1635198046))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-466539673))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-740803961))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1922060707))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2043691628))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1612658077))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1346220770))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1197127479))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-581574086))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(702936986))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1610269865))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(129), ldc:int(128))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1460940440))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(949210597))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1799464657))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1425391282))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1090615235))
                        var_11_EB = and:int(ldc:int(-6117), ldc:int(6084))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1970112861))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1491976217))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(26088276))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1298879953))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1946242150))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1056297147))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(199052071))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1119)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1509598388))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1502613666))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1959511732))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-466407855))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2129124405))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1394750897))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1581282496))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(875310489))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(390137476))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1081502385))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-98480834))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(1071764657))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1978477866))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(380314860))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1215799873))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-425312625))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1969084473))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1812575957))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1592376821))
                        var_17_6AA = add:int(var_16_119:int, xor:int(ldc:int(16674), ldc:int(16675)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-1627413459))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, xor:int(ldc:int(8259), ldc:int(8258))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(79946184))
            goto(Label_0108)
        }
    }
}
