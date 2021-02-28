public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u516c\uff55\u8aa5\u1187\u34df\u12cb {
    public void \u516c\uff55\u8aa5\u1187\u34df\u12cb(java.lang.String p0) {
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
            invokespecial:\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf(\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf::<init>, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb)
            putfield:Set<Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\uc9f6\u7d52\ufe34\u76bc\u071d\u61a4, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb, initobject:HashSet<Integer>[expected:Set<Integer>](HashSet<E>::<init>))
            putfield:Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\u64f2\u99f7\u3d4b\u8cae\u5140\u183a, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb, initobject:HashMap<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>[expected:Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>](HashMap<K, V>::<init>))
            putfield:int(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\ud523\ud217\ub18d\u6d69\u927d\ubf56, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb, invokestatic:int(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\u0b8e\u92ff\u494c\u3711\u67d0\u0b8e, p0:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ud7e8\u600f\u72f1\u7d52\u8709\ud158 \uc31c\u3d64\u6c52\ube23\ua562\uc910(java.lang.String p0, java.lang.String p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
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
    
    public int \u7049\u4c04\u12b2\u88c5\u600f\ub6ab(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1, int p2) {
        var_6_75 : \u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[]
        var_7_7A : int
        var_8_83 : int
        var_9_B1 : \u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e
        
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
        
        if (cmpeq:boolean(p2:int, getfield:int(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\ud523\ud217\ub18d\u6d69\u927d\ubf56, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb))) {
            var_6_75 = getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[](\u516c\uff55\u8aa5\u1187\u34df\u12cb::\u4f4a\u3dd3\u92ee\u8709\ubb2b\u16f6)
            var_7_7A = arraylength:int(var_6_75:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[])
            var_8_83 = and:int(ldc:int(5417), ldc:int(-5616))
            
            while (cmplt:boolean(var_8_83:int, var_7_7A:int)) {
                var_9_B1 = loadelement:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(var_6_75:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[], var_8_83:int)
                
                if (invokeinterface:boolean(Set<E>::contains, getfield:Set<Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\uc9f6\u7d52\ufe34\u76bc\u071d\u61a4, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf::\uc910\u3dd3\u56bd\ua562\ubff1\ud217, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb[expected:\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf], p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u6cfe\u7049\u8389\ucfaf\ube23\u9033, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, var_9_B1:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e))))) {
                    return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>::get, getfield:Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\u64f2\u99f7\u3d4b\u8cae\u5140\u183a, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb), var_9_B1:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[expected:Object]))))
                }
                
                inc:int(var_8_83, ldc:int(1))
            }
            
            return:int(getfield:int(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\ud523\ud217\ub18d\u6d69\u927d\ubf56, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb))
        }
        
        return:int(p2:int)
    }
    
    private void lambda$\u6ec6\u3bc9\u6d69\u6cfe\u494c\u647c$0(java.lang.String p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u516c\uff55\u8aa5\u1187\u34df\u12cb p1, java.lang.String p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9 p3) {
        var_5_61 : int
        
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
        var_5_61 = and:int(ldc:int(1770350905), ldc:int(1067906046))
        
        if (cmpne:boolean(invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9), getfield:int(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\ud523\ud217\ub18d\u6d69\u927d\ubf56, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb))) {
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, invokevirtual:String[expected:Object](\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u61a4\ud36e\u446c\u8350\u3bd6\uc3e3, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)))) {
                goto(Label_0223)
            }
        }
        
        Label_0111:
        
        if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_5_61 = and:int(var_5_61:int, ldc:int(-259972612))
            goto(Label_0223)
        }
        
        if (cmpne:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
            var_5_61 = and:int(var_5_61:int, ldc:int(1878289215))
            
            if (cmpne:boolean(invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9), getfield:int(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\ud523\ud217\ub18d\u6d69\u927d\ubf56, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb))) {
                invokeinterface:boolean(Set<Integer>::add, getfield:Set<Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\uc9f6\u7d52\ufe34\u76bc\u071d\u61a4, p1:\u516c\uff55\u8aa5\u1187\u34df\u12cb), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)))
            }
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(32)), ldc:int(0))) {
            var_5_61 = and:int(var_5_61:int, ldc:int(-1032053098))
        }
        else {
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_5_61 = and:int(var_5_61:int, ldc:int(2107976177))
            invokeinterface:Object(Int2ObjectMap::put, getstatic:Int2ObjectMap<\u759a\uc4d2\u99f7\u74b1\u9a18\u4daf>(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\ud171\u9af2\u9a18\u59ec\u8350\u718f), invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9), p1:\u516c\uff55\u8aa5\u1187\u34df\u12cb[expected:Object])
        }
        
        Label_0223:
        
        if (cmpne:boolean(and:int(var_5_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0156)
        }
        
        if (cmpne:boolean(and:int(var_5_61:int, ldc:int(8192)), ldc:int(0))) {
            if (invokevirtual:boolean(String::equals, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u61a4\ud36e\u446c\u8350\u3bd6\uc3e3, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9), p2:String[expected:Object])) {
                invokeinterface:Integer(Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>::put, getfield:Map<\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e, Integer>(\u516c\uff55\u8aa5\u1187\u34df\u12cb::\u64f2\u99f7\u3d4b\u8cae\u5140\u183a, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb), invokestatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::valueOf, invokevirtual:String(String::toUpperCase, invokevirtual:String(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u3bc9\ud158\u71f1\u71ae\ub7dc\ub32d, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9, ldc:String("facing")), getstatic:Locale(Locale::ROOT))), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9::\u40a9\ud523\u120d\uc7fe\u6d99\u0b8e, p3:\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9)))
            }
            
            return:void()
        }
        
        goto(Label_0111)
    }
    
    static {
        expr_67 : \u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[] [generated]
        
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
            expr_67 = newarray:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e.class, xor:int(ldc:int(601), ldc:int(605)))
            storeelement:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(expr_67:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[], and:int(ldc:int(7345), ldc:int(-7350)), getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u120d\ubb2b\u6ec6\uc7fe\uc29a\uafe7))
            storeelement:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(expr_67:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[], xor:int(ldc:int(282), ldc:int(283)), getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ua61f\u4daf\ufe34\u071d\u7af6\u7330))
            storeelement:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(expr_67:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[], and:int(ldc:int(17683), ldc:int(8842)), getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\ub70c\uc910\u8d90\u62da\u6d99\uc910))
            storeelement:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(expr_67:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[], and:int(ldc:int(4179), ldc:int(18479)), getstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e(\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e::\u4daf\u8753\u3504\u8389\u983f\u5fe1))
            putstatic:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[](\u516c\uff55\u8aa5\u1187\u34df\u12cb::\u4f4a\u3dd3\u92ee\u8709\ubb2b\u16f6, expr_67:\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\ua61f\ucef1\u156b\ud171\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_649 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_654 : int
        
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
        var_3_649 = and:int(ldc:int(-1917500296), ldc:int(-1514191888))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u516c\uff55\u8aa5\u1187\u34df\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
            var_3_649 = and:int(var_3_649:int, ldc:int(-194872276))
        }
        else {
            var_3_649 = and:int(var_3_649:int, ldc:int(-570590985))
            var_5_85 = and:int(ldc:int(-23942), ldc:int(21893))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19223), ldc:int(-19224)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_649:int, ldc:int(-1141149059))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, and:int(ldc:int(709), ldc:int(27649)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, and:int(ldc:int(4177), ldc:int(10403)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_649 = and:int(var_3_D3:int, ldc:int(-508310277))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(18951), ldc:int(4097)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1376259585))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1841222870))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1771226617))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1613545089))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1101937958))
                    }
                    else {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-709407245))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(2024909808))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(2114684353))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-193217120))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-145005681))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1577355018))
                            var_11_E4 = and:int(ldc:int(482), ldc:int(-16867))
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1166458177))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-252994768))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(2000565492))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(28782765))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-138721419))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1141245019))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-398330928))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1968778368))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(1714335594))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-437158536))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0831:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1301304436))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-832699745))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(697044382))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-939829889))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = and:int(ldc:int(19969), ldc:int(35))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1991824386))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1493295814))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-730485105))
                            goto(Label_0831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-396824378))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-575178377))
                        var_11_E4 = and:int(ldc:int(-9295), ldc:int(1102))
                    }
                    
                    Label_1104:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(1953276302))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1470465212))
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-758829692))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(51975040))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-2056971649))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-570954381))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1351)
                            }
                        }
                    }
                    
                    Label_1236:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1130192509))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1104)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1331274936))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-2114098821))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1351:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-992649662))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1913573600))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-91803193))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1868575498))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(287665429))
                        loopcontinue()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(-273426827))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1497:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_654 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1508:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(746446319))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1009598342))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1065039108))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-2013533829))
                        var_17_654 = add:int(var_16_112:int, xor:int(ldc:int(136), ldc:int(137)))
                        looporswitchbreak()
                    }
                }
                
                var_3_649 = and:int(var_3_649:int, ldc:int(-1409557511))
                
                if (cmple:boolean(var_5_85 = var_17_654:int, sub:int(var_6_8C:int, and:int(ldc:int(1539), ldc:int(8489))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
