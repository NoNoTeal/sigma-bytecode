public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua068\ud36e\uc2e8\u0800\u6c52\u3a62 {
    public void \ua068\ud36e\uc2e8\u0800\u6c52\u3a62() {
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
            invokespecial:Object(Object::<init>, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62)
            putfield:Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\uf995\u3bc9\u2dcc\u5f50\ufe34\u3dd3, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62, invokestatic:HashMap[expected:Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u3504\u960f\u7049\u6bb9\u5db4() {
        var_1_5F : int
        var_3_6E : Iterator<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>
        var_4_9E : \uf9c5\ud217\u8350\u9a18\ub70c\uc229
        
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
            var_1_5F = and:int(ldc:int(410423315), ldc:int(1604771816))
            var_3_6E = invokeinterface:Iterator<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>(Collection<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>::iterator, invokeinterface:Collection<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>(Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>::values, getfield:Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\uf995\u3bc9\u2dcc\u5f50\ufe34\u3dd3, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(998232346))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6E:Iterator)) {
                        var_4_9E = checkcast:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\ud217\u8350\u9a18\ub70c\uc229.class, invokeinterface:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(Iterator<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>::next, var_3_6E:Iterator<\uf9c5\ud217\u8350\u9a18\ub70c\uc229>))
                        invokevirtual:void(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\u759a\u1187\u5db4\u76bc\u7bad\u9033, var_4_9E:\uf9c5\ud217\u8350\u9a18\ub70c\uc229)
                        
                        if (invokevirtual:boolean(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\u7049\u8308\u6c52\u7d52\uc29a\u839e, var_4_9E:\uf9c5\ud217\u8350\u9a18\ub70c\uc229)) {
                            invokeinterface:void(Iterator::remove, var_3_6E:Iterator)
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(2091881134))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.stream.Stream<\u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e> \u7c6b\u4492\u3776\u4d85\uc87f\ub1b9() {
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
    
    private java.util.Collection<\u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e> \ud51e\u51b2\u62da\u36d3\u62da\u88c5(java.util.Random p0, int p1) {
        var_3_5F : int
        var_5_6F : List<? super \u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>
        var_3_7F : int
        var_6_89 : int[]
        var_7_92 : int
        var_8_9B : int
        var_3_139 : int
        var_8_C3 : Set
        var_9_CC : int
        var_11_12A : int
        stack_158_0 : Set<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e> [generated]
        stack_153_0 : List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e> [generated]
        stack_153_1 : int [generated]
        
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
        var_3_5F = and:int(ldc:int(-1153754347), ldc:int(-813981931))
        var_5_6F = checkcast:List<? super \u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(java.util.List<? super \u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>.class, invokeinterface:List<? super \u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(Stream<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>::collect, invokespecial:Stream<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\u7c6b\u4492\u3776\u4d85\uc87f\ub1b9, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62), invokestatic:Collector<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e, ?, List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>>(Collectors::toList)))
        
        if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, var_5_6F:List<? super \u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>))) {
            var_3_7F = and:int(var_3_5F:int, ldc:int(-382035682))
            var_6_89 = newarray:int[](int.class, invokeinterface:int(List<E>::size, var_5_6F:List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>))
            var_7_92 = and:int(ldc:int(6338), ldc:int(-6339))
            var_8_9B = and:int(ldc:int(8618), ldc:int(-8683))
            
            while (cmplt:boolean(var_8_9B:int, invokeinterface:int(List<E>::size, var_5_6F:List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>))) {
                var_7_92 = add:int(var_7_92:int, invokestatic:int(Math::abs, invokevirtual:int(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u7af6\ub171\ua6bd\uc31c\ud217\u6bb9, checkcast:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e(\u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e.class, invokeinterface:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e(List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>::get, var_5_6F:List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>, var_8_9B:int)))))
                storeelement:int(var_6_89:int[], var_8_9B:int, sub:int(var_7_92:int, and:int(ldc:int(17), ldc:int(3215))))
                inc:int(var_8_9B, ldc:int(1))
            }
            
            var_3_139 = and:int(var_3_7F:int, ldc:int(-1153442457))
            var_8_C3 = invokestatic:Set(Sets::newIdentityHashSet)
            var_9_CC = and:int(ldc:int(-3151), ldc:int(3142))
            
            while (cmplt:boolean(var_9_CC:int, p1:int)) {
                var_11_12A = invokestatic:int(Arrays::binarySearch, var_6_89:int[], invokevirtual:int(Random::nextInt, p0:Random, var_7_92:int))
                stack_158_0 = var_8_C3:Set<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>
                stack_153_0 = var_5_6F:List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>
                
                if (cmpge:boolean(var_11_12A:int, ldc:int(0))) {
                    var_3_139 = and:int(var_3_139:int, ldc:int(-1389200850))
                    stack_153_1 = var_11_12A:int
                }
                else {
                    stack_153_1 = sub:int(neg:int(var_11_12A:int), and:int(ldc:int(1047), ldc:int(12937)))
                }
                
                var_3_139 = and:int(var_3_139:int, ldc:int(-1610900955))
                invokeinterface:boolean(Set<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>::add, stack_158_0:Set<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>, invokeinterface:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e(List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>::get, stack_153_0:List<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>, stack_153_1:int))
                inc:int(var_9_CC, ldc:int(1))
            }
            
            return:Collection<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(var_8_C3:Set<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>[expected:Collection<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>])
        }
        
        return:Collection<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(invokestatic:List<Object>[expected:Collection<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>](Collections::emptyList))
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\ud217\u8350\u9a18\ub70c\uc229 \ubff1\ucfaf\u8350\uc2bd\u12cb\ub7dc(java.util.UUID p0) {
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
    
    public void \u3c25\uf9c5\ubefe\u183a\ucef1\u527a(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua068\ud36e\uc2e8\u0800\u6c52\u3a62 p0, java.util.Random p1, int p2) {
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
    
    public int \u4e72\ua3b4\ube23\u516c\u6c52\u527a(java.util.UUID p0, java.util.function.Predicate<\u12b2\u4e72\u8df4\u67e9\u67e9.\u385b\u3504\u51b2\ua068\u8640\ucef1> p1) {
        var_3_5F : int
        var_5_6D : \uf9c5\ud217\u8350\u9a18\ub70c\uc229
        stack_93_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-1409966760), ldc:int(896521085))
            var_5_6D = checkcast:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\ud217\u8350\u9a18\ub70c\uc229.class, invokeinterface:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>::get, getfield:Map<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\uf995\u3bc9\u2dcc\u5f50\ufe34\u3dd3, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62), p0:UUID[expected:Object]))
            
            if (cmpeq:boolean(var_5_6D:\uf9c5\ud217\u8350\u9a18\ub70c\uc229, aconstnull:\uf9c5\ud217\u8350\u9a18\ub70c\uc229())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1776534896))
                stack_93_0 = and:int(ldc:int(17595), ldc:int(-19708))
            }
            else {
                stack_93_0 = invokevirtual:int(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\uceb8\u16f6\uc31c\ucfaf\u4975\u34df, var_5_6D:\uf9c5\ud217\u8350\u9a18\ub70c\uc229, p1:Predicate<\u385b\u3504\u51b2\ua068\u8640\ucef1>)
            }
            
            return:int(stack_93_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\uf995\ubded\u8258\u52d3\u3d64(java.util.UUID p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u385b\u3504\u51b2\ua068\u8640\ucef1 p1, int p2) {
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
    
    public com.mojang.serialization.Dynamic<T> \u9af2\uc84e\u1187\u8aa5\ub6ab\u6b5f(com.mojang.serialization.DynamicOps<T> p0) {
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
    
    public void \u12cb\u8df4\u8308\u72f1\ub6ab\u4c04(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private static int \uc31c\u7ce1\u7bad\ucfaf\u6b5f\u47c2(int p0, int p1) {
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
            return:int(invokestatic:int(Math::max, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    private int \u7e3f\u9a18\u56bd\uc7fe\u3dd3\ufcaf(\u12b2\u4e72\u8df4\u67e9\u67e9.\u385b\u3504\u51b2\ua068\u8640\ucef1 p0, int p1, int p2) {
        var_4_63 : int
        var_6_68 : int
        stack_94_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(519537450), ldc:int(829899482))
            var_6_68 = add:int(p1:int, p2:int)
            
            if (cmple:boolean(var_6_68:int, getfield:int(\u385b\u3504\u51b2\ua068\u8640\ucef1::\u16f6\u836c\u4c2b\uc87f\ub83f\u5f50, p0:\u385b\u3504\u51b2\ua068\u8640\ucef1))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(433539016))
                stack_94_0 = var_6_68:int
            }
            else {
                stack_94_0 = invokestatic:int(Math::max, getfield:int(\u385b\u3504\u51b2\ua068\u8640\ucef1::\u16f6\u836c\u4c2b\uc87f\ub83f\u5f50, p0:\u385b\u3504\u51b2\ua068\u8640\ucef1), p1:int)
            }
            
            return:int(stack_94_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5140\u7c6b\u74b1\u3e75\u120d\u47c2$6(\u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e p0) {
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
            invokeinterface:int(Object2IntMap::put, invokestatic:Object2IntMap(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\u88c5\ub171\u4492\u92ee\u62da\u4c2b, invokespecial:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\ubff1\ucfaf\u8350\uc2bd\u12cb\ub7dc, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62, getfield:UUID(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u965f\u7bad\uc84e\u71f1\uf9c5\u3a62, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e))), getfield:\u385b\u3504\u51b2\ua068\u8640\ucef1[expected:Object](\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u120d\u72f1\u494c\ua6bd\u97b7\u7bad, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e), getfield:int(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u92ee\ud523\ub70c\uf94d\u5bc4\uf94d, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\uc238\u760c\uc238\uc3e3\ud523\u56bd$5(com.mojang.serialization.DataResult p0) {
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
            return:Stream(invokestatic:Stream<Object>(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4ab3\ub7dc\uc238\u7e3f\ub7dc\ud158, invokevirtual:Optional(DataResult::result, p0:DataResult)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u92ee\ud4fe\u6c56\u927d\u93a2\u64ab$4(com.mojang.serialization.DynamicOps p0, \u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e p1) {
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
            return:Dynamic(invokevirtual:Dynamic(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u7043\ub113\u88c5\ufcaf\u67e9\ua6bd, p1:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e, p0:DynamicOps))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Integer lambda$\ua068\ua562\u0800\u8753\u0a06\u8258$3(\u12b2\u4e72\u8df4\u67e9\u67e9.\u385b\u3504\u51b2\ua068\u8640\ucef1 p0, java.lang.Integer p1, java.lang.Integer p2) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokespecial:int(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\u7e3f\u9a18\u56bd\uc7fe\u3dd3\ufcaf, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62, p0:\u385b\u3504\u51b2\ua068\u8640\ucef1, invokevirtual:int(Integer::intValue, p1:Integer), invokevirtual:int(Integer::intValue, p2:Integer))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u62da\u4d85\u56bd\u8709\u873d\u5d20$2(\u56bd\u8413\u647c\u5bc4\ud158.\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e p0) {
        var_4_6E : int
        
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
            var_4_6E = sub:int(getfield:int(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u92ee\ud523\ub70c\uf94d\u5bc4\uf94d, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e), getfield:int(\u385b\u3504\u51b2\ua068\u8640\ucef1::\u3776\ucef1\u34df\u1187\u5245\u6fb0, getfield:\u385b\u3504\u51b2\ua068\u8640\ucef1(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u120d\u72f1\u494c\ua6bd\u97b7\u7bad, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e)))
            
            if (cmpge:boolean(var_4_6E:int, xor:int(ldc:int(19464), ldc:int(19466)))) {
                invokeinterface:int(Object2IntMap::mergeInt, invokestatic:Object2IntMap(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\u88c5\ub171\u4492\u92ee\u62da\u4c2b, invokespecial:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\ua068\ud36e\uc2e8\u0800\u6c52\u3a62::\ubff1\ucfaf\u8350\uc2bd\u12cb\ub7dc, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62, getfield:UUID(\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u965f\u7bad\uc84e\u71f1\uf9c5\u3a62, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e))), getfield:\u385b\u3504\u51b2\ua068\u8640\ucef1[expected:Object](\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e::\u120d\u72f1\u494c\ua6bd\u97b7\u7bad, p0:\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e), var_4_6E:int, invokedynamic:BiFunction<Integer, Integer, Integer>(apply:()Ljava/util/function/BiFunction;))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\ud217\u8350\u9a18\ub70c\uc229 lambda$\u4d85\u71ae\u6fb0\u76bc\ub70c\u40a9$1(java.util.UUID p0) {
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
            return:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(initobject:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::<init>, aconstnull:\u7006\ua61f\u74b1\uc3e3\u760c\u6b5f()))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u527a\u7049\ud158\uafe7\u392e\u4492$0(java.util.Map.Entry p0) {
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
            return:Stream(invokevirtual:Stream<\u7d52\u8640\u93a2\ud7e8\ucfaf\ud12e>(\uf9c5\ud217\u8350\u9a18\ub70c\uc229::\u71ae\u0a06\u9033\u8d98\u446c\u52d3, checkcast:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\ud217\u8350\u9a18\ub70c\uc229.class, invokeinterface:\uf9c5\ud217\u8350\u9a18\ub70c\uc229(Entry<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>::getValue, p0:Entry<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>)), checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Entry<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>::getKey, p0:Entry<UUID, \uf9c5\ud217\u8350\u9a18\ub70c\uc229>))))
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
    
    public void \ua562\uafe7\u3dd3\u4cd9\u51b2\u6d69(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(-561701534), ldc:int(1300617719))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua068\ud36e\uc2e8\u0800\u6c52\u3a62[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(2091883883))
            var_5_80 = and:int(ldc:int(-4611), ldc:int(4610))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29498), ldc:int(-29500)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_65A:int, ldc:int(1857495014))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(37), ldc:int(4097)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(25217), ldc:int(1057)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_D0:int, ldc:int(-5324942))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(5634), ldc:int(5635)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-383595592))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-541214201))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(631412693))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1714799056))
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1607270055))
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-54649866))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1674241468))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(97129106))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-4751873))
                            var_11_E1 = and:int(ldc:int(-5205), ldc:int(5204))
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0556:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(663124514))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(994837911))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-875411471))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-291702285))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-23833783))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1089218824))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1623006188))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-846218382))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0795:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1323490723))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2135778772))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1043881160))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-806434591))
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-18839921))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1876933487))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(9285), ldc:int(6449))
                                goto(Label_1106)
                            }
                        }
                    }
                    
                    Label_0928:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(867988))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(682011471))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1111043955))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(899391852))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(466385))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(509403757))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1845370727))
                        var_11_E1 = and:int(ldc:int(6445), ldc:int(-23358))
                    }
                    
                    Label_1106:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(490854514))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0928)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-289627939))
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-986752011))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1556011371))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1312428611))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1106)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1975526859))
                            goto(Label_0928)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1822505140))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(499877613))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(2095382015))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1358:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-503980163))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(314259931))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1359854870))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1710614455))
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1379160016))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-857277066))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(816525135))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1710062329))
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1220118333))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1382425119))
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-859455622))
                        var_17_665 = add:int(var_16_10F:int, and:int(ldc:int(29921), ldc:int(2329)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(-825458718))
                
                if (cmple:boolean(var_5_80 = var_17_665:int, sub:int(var_6_87:int, and:int(ldc:int(661), ldc:int(9227))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
