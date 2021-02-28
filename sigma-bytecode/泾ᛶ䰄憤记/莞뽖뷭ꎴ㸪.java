public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u839e\ubf56\ubded\ua3b4\u3e2a {
    public void \u839e\ubf56\ubded\ua3b4\u3e2a() {
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
            invokespecial:Object(Object::<init>, this:\u839e\ubf56\ubded\ua3b4\u3e2a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8df4\u8389\u93a2\u0800\u4cd9\ud4fe(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static com.mojang.brigadier.builder.LiteralArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> \ud523\u72f1\ub18d\ub70c\ud217\u385b() {
        var_0_61 : int
        var_2_70 : LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>
        var_3_74 : \u5d20\uceb8\u64f2\u6c56\u4d85[]
        var_4_77 : int
        var_5_80 : int
        var_6_9F : \u5d20\uceb8\u64f2\u6c56\u4d85
        
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
            var_0_61 = and:int(ldc:int(-1061374777), ldc:int(-24150615))
            var_2_70 = invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(252), ldc:int(24600))))
            var_3_74 = invokestatic:\u5d20\uceb8\u64f2\u6c56\u4d85[](\u5d20\uceb8\u64f2\u6c56\u4d85::values)
            var_4_77 = arraylength:int(var_3_74:\u5d20\uceb8\u64f2\u6c56\u4d85[])
            var_5_80 = and:int(ldc:int(6681), ldc:int(-14938))
            
            loop {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1904386305))
                
                if (cmpge:boolean(var_5_80:int, var_4_77:int)) {
                    looporswitchbreak()
                }
                
                var_6_9F = loadelement:\u5d20\uceb8\u64f2\u6c56\u4d85(var_3_74:\u5d20\uceb8\u64f2\u6c56\u4d85[], var_5_80:int)
                invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, var_2_70:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>, invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, invokevirtual:String(\u5d20\uceb8\u64f2\u6c56\u4d85::\ub8be\uc2bd\u4d85\u51b2\u4f4a\u3d4b, var_6_9F:\u5d20\uceb8\u64f2\u6c56\u4d85)), invokedynamic:Command(run:(L\u5d20\u7043\u88c5\u5db4\uf94d/\u5d20\uceb8\u64f2\u6c56\u4d85;)Lcom/mojang/brigadier/Command;, var_6_9F:\u5d20\uceb8\u64f2\u6c56\u4d85)))
                inc:int(var_5_80, ldc:int(1))
            }
            
            return:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(var_2_70:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u600f\u6fb0\u62da\u5245\u7330\u8753(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, com.mojang.brigadier.suggestion.SuggestionsBuilder p2) {
        var_3_F8 : int
        var_5_65 : ArrayList
        var_6_6E : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_7_7A : Iterator<\u4c04\u34df\ua3b4\uc29a\ub70c>
        var_8_C0 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_9_E1 : int
        var_10_E9 : Iterator<String>
        var_11_127 : String
        
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
            var_3_F8 = and:int(ldc:int(782151610), ldc:int(2106480512))
            var_5_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_6E = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_7_7A = invokeinterface:Iterator<\u4c04\u34df\ua3b4\uc29a\ub70c>(Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>::iterator, invokevirtual:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u76bc\uf94d\ub102\ubcb0\u8aa5\uc2e8, var_6_6E:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd]))
            
            loop {
                if (cmpne:boolean(and:int(var_3_F8:int, ldc:int(128)), ldc:int(0))) {
                    var_3_F8 = and:int(var_3_F8:int, ldc:int(-60925958))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_7A:Iterator)) {
                        var_8_C0 = checkcast:\u4c04\u34df\ua3b4\uc29a\ub70c(\u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c.class, invokeinterface:\u4c04\u34df\ua3b4\uc29a\ub70c(Iterator<\u4c04\u34df\ua3b4\uc29a\ub70c>::next, var_7_7A:Iterator<\u4c04\u34df\ua3b4\uc29a\ub70c>))
                        
                        if (cmpeq:boolean(invokevirtual:\u97e6\u4c2b\uceb8\u9a18\u965f(\u4c04\u34df\ua3b4\uc29a\ub70c::\u156b\u71ae\u2dcc\u0c95\u516c\u67e9, var_8_C0:\u4c04\u34df\ua3b4\uc29a\ub70c), getstatic:\u97e6\u4c2b\uceb8\u9a18\u965f(\u97e6\u4c2b\uceb8\u9a18\u965f::\ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492))) {
                            var_9_E1 = and:int(ldc:int(14598), ldc:int(-14615))
                            var_10_E9 = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_3_F8:int, ldc:int(16384)), ldc:int(0))) {
                                    var_3_F8 = and:int(var_3_F8:int, ldc:int(-1100035156))
                                    
                                    if (invokeinterface:boolean(Iterator::hasNext, var_10_E9:Iterator)) {
                                        var_11_127 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_10_E9:Iterator<String>))
                                        
                                        if (logicaland:boolean(invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_6_6E:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_11_127:String, var_8_C0:\u4c04\u34df\ua3b4\uc29a\ub70c), logicalnot:boolean(invokevirtual:boolean(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u946b\ud51e\u6b5f\u416d\ubf56\u2dcc, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_6_6E:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_11_127:String, var_8_C0:\u4c04\u34df\ua3b4\uc29a\ub70c))))) {
                                            var_3_F8 = and:int(var_3_F8:int, ldc:int(745253371))
                                            loopcontinue()
                                        }
                                        
                                        var_3_F8 = and:int(var_3_F8:int, ldc:int(-1125190194))
                                        var_9_E1 = xor:int(ldc:int(-8191), ldc:int(-8192))
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_3_F8:int, ldc:int(524288)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_3_F8 = and:int(var_3_F8:int, ldc:int(237931977))
                            
                            if (cmpne:boolean(var_9_E1:int, ldc:int(0))) {
                                invokeinterface:boolean(List<String>::add, var_5_65:ArrayList<String>[expected:List<String>], invokevirtual:String(\u4c04\u34df\ua3b4\uc29a\ub70c::\u5bc4\u7873\ub113\u3bc9\ud158\ube23, var_8_C0:\u4c04\u34df\ua3b4\uc29a\ub70c))
                            }
                        }
                        
                        var_3_F8 = and:int(var_3_F8:int, ldc:int(-1610646029))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_F8:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_F8 = and:int(var_3_F8:int, ldc:int(1388370674))
            }
            
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, var_5_65:ArrayList<String>[expected:Iterable<String>], p2:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static int \u7d52\u718f\u836c\u3776\uae87\u6c56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2) {
        var_5_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_6_82 : \u4c04\ub102\ufcaf\u8d90\u8aa5
        stack_C6_1 : String [generated]
        expr_9B : Object[] [generated]
        
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
        var_5_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String, p2:\u4c04\u34df\ua3b4\uc29a\ub70c)) {
            var_6_82 = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String, p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
            stack_C6_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(20539), ldc:int(25)))
            expr_9B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(19923), ldc:int(3)))
            storeelement:Object(expr_9B:Object[], and:int(ldc:int(-15963), ldc:int(14426)), p1:String[expected:Object])
            storeelement:Object(expr_9B:Object[], xor:int(ldc:int(8458), ldc:int(8459)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_6_82:\u4c04\ub102\ufcaf\u8d90\u8aa5)))
            storeelement:Object(expr_9B:Object[], and:int(ldc:int(1107), ldc:int(10)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_C6_1:String, expr_9B:Object[]), and:int[expected:boolean](ldc:int(6794), ldc:int(-23184)))
            return:int(invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_6_82:\u4c04\ub102\ufcaf\u8d90\u8aa5))
        }
        
        athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u8aa5\uafe7\u6fb0\u6435\ufcaf\u92ee), invokevirtual:String[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u5bc4\u7873\ub113\u3bc9\ud158\ube23, p2:\u4c04\u34df\ua3b4\uc29a\ub70c), p1:String[expected:Object]))
    }
    
    private static int \uf94d\ucfaf\uc3e3\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u12b2\u3d4b\u156b\u071d\uc246 p3, java.util.Collection<java.lang.String> p4, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p5) {
        var_6_18E : int
        var_8_6C : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_9_75 : int
        var_10_7D : Iterator<String>
        var_6_111 : int
        var_12_174 : \u4c04\ub102\ufcaf\u8d90\u8aa5
        var_13_17D : Iterator<String>
        stack_238_1 : String [generated]
        expr_206 : Object[] [generated]
        stack_14C_1 : String [generated]
        expr_12A : Object[] [generated]
        
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
            var_6_18E = and:int(ldc:int(-1636526199), ldc:int(1300082520))
            var_8_6C = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_9_75 = and:int(ldc:int(-26425), ldc:int(26416))
            var_10_7D = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpne:boolean(and:int(var_6_18E:int, ldc:int(4)), ldc:int(0))) {
                    var_6_111 = and:int(var_6_18E:int, ldc:int(1632020516))
                    goto(Label_0227)
                }
                
                if (cmpne:boolean(and:int(var_6_18E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_18E = and:int(var_6_18E:int, ldc:int(1857482143))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_10_7D:Iterator)) {
                        var_12_174 = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_8_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_10_7D:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                        var_13_17D = invokeinterface:Iterator<String>(Collection<String>::iterator, p4:Collection<String>)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_6_18E:int, ldc:int(4)), ldc:int(0))) {
                                var_6_18E = and:int(var_6_18E:int, ldc:int(-25247831))
                                
                                if (invokeinterface:boolean(Iterator::hasNext, var_13_17D:Iterator)) {
                                    invokeinterface:void(\u12b2\u3d4b\u156b\u071d\uc246::\u624e\uc7fe\ufe34\u6bb9\u839e\u8308, p3:\u12b2\u3d4b\u156b\u071d\uc246, var_12_174:\u4c04\ub102\ufcaf\u8d90\u8aa5, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_8_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_13_17D:Iterator<String>)), p5:\u4c04\u34df\ua3b4\uc29a\ub70c))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_6_18E:int, ldc:int(256)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_6_18E = and:int(var_6_18E:int, ldc:int(2132314414))
                        }
                        
                        var_6_18E = and:int(var_6_18E:int, ldc:int(-290703908))
                        var_9_75 = add:int(var_9_75:int, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_12_174:\u4c04\ub102\ufcaf\u8d90\u8aa5))
                        loopcontinue()
                    }
                }
                
                Label_0174:
                
                if (cmpeq:boolean(and:int(var_6_18E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_111 = and:int(var_6_18E:int, ldc:int(-939966219))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_18E:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_6_111 = and:int(var_6_18E:int, ldc:int(1323720649))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(9), ldc:int(5635)))) {
                        stack_238_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(10779), ldc:int(4570)))
                        expr_206 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(17416), ldc:int(17419)))
                        storeelement:Object(expr_206:Object[], and:int(ldc:int(1162), ldc:int(-1163)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_206:Object[], and:int(ldc:int(1), ldc:int(7169)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        storeelement:Object(expr_206:Object[], and:int(ldc:int(8454), ldc:int(2123)), invokestatic:Integer[expected:Object](Integer::valueOf, var_9_75:int))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_238_1:String, expr_206:Object[]), and:int[expected:boolean](ldc:int(2073), ldc:int(9221)))
                        looporswitchbreak()
                    }
                }
                
                Label_0227:
                
                if (cmpne:boolean(and:int(var_6_111:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_18E = and:int(var_6_111:int, ldc:int(1915542977))
                    goto(Label_0174)
                }
                
                if (cmpeq:boolean(and:int(var_6_111:int, ldc:int(4)), ldc:int(0))) {
                    var_6_111 = and:int(var_6_111:int, ldc:int(-840661028))
                    stack_14C_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(16443), ldc:int(9307)))
                    expr_12A = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4608), ldc:int(4610)))
                    storeelement:Object(expr_12A:Object[], and:int(ldc:int(6164), ldc:int(-6165)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_12A:Object[], and:int(ldc:int(49), ldc:int(16395)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_14C_1:String, expr_12A:Object[]), and:int[expected:boolean](ldc:int(203), ldc:int(12293)))
                    looporswitchbreak()
                }
                
                var_6_18E = and:int(var_6_111:int, ldc:int(480935613))
            }
            
            return:int(var_9_75:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \u0b8e\ub6ab\uc2bd\u9033\u47c2\u1187(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2) {
        var_3_61 : int
        var_3_71 : int
        var_5_79 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_6_82 : int
        var_7_8A : Iterator<String>
        var_9_190 : \u4c04\ub102\ufcaf\u8d90\u8aa5
        var_3_12E : int
        stack_206_1 : String [generated]
        expr_1E2 : Object[] [generated]
        stack_168_1 : String [generated]
        expr_146 : Object[] [generated]
        
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
        var_3_61 = and:int(ldc:int(646203923), ldc:int(618417330))
        
        if (cmpeq:boolean(invokevirtual:\u97e6\u4c2b\uceb8\u9a18\u965f(\u4c04\u34df\ua3b4\uc29a\ub70c::\u156b\u71ae\u2dcc\u0c95\u516c\u67e9, p2:\u4c04\u34df\ua3b4\uc29a\ub70c), getstatic:\u97e6\u4c2b\uceb8\u9a18\u965f(\u97e6\u4c2b\uceb8\u9a18\u965f::\ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492))) {
            var_3_71 = and:int(var_3_61:int, ldc:int(566643127))
            var_5_79 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_6_82 = and:int(ldc:int(24589), ldc:int(-24592))
            var_7_8A = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_8A:Iterator)) {
                var_9_190 = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_5_79:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_8A:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                
                if (invokevirtual:boolean(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u946b\ud51e\u6b5f\u416d\ubf56\u2dcc, var_9_190:\u4c04\ub102\ufcaf\u8d90\u8aa5)) {
                    invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\ua3b4\u6bb9\u2dcc\u6b0d\ub19c\u4e72, var_9_190:\u4c04\ub102\ufcaf\u8d90\u8aa5, and:int[expected:boolean](ldc:int(-31498), ldc:int(27401)))
                    inc:int(var_6_82, ldc:int(1))
                }
                
                var_3_71 = and:int(var_3_71:int, ldc:int(868015250))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_71:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_12E = and:int(var_3_71:int, ldc:int(-662995022))
                    goto(Label_0263)
                }
                
                if (cmpne:boolean(and:int(var_3_71:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_12E = and:int(var_3_71:int, ldc:int(1918318143))
                }
                else {
                    var_3_12E = and:int(var_3_71:int, ldc:int(-1501175681))
                    
                    if (cmpeq:boolean(var_6_82:int, ldc:int(0))) {
                        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u47c2\ucef1\u59ec\ud158\u4179\u0c95)))
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_3_12E:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_12E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_71 = and:int(var_3_12E:int, ldc:int(-1789653466))
                        loopcontinue()
                    }
                    
                    var_3_12E = and:int(var_3_12E:int, ldc:int(1624600350))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), xor:int(ldc:int(144), ldc:int(145)))) {
                        stack_206_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(4371), ldc:int(4367)))
                        expr_1E2 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(24834), ldc:int(24832)))
                        storeelement:Object(expr_1E2:Object[], and:int(ldc:int(-13137), ldc:int(12880)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_1E2:Object[], xor:int(ldc:int(8289), ldc:int(8288)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_206_1:String, expr_1E2:Object[]), and:int[expected:boolean](ldc:int(17761), ldc:int(2701)))
                        looporswitchbreak()
                    }
                }
                
                Label_0263:
                
                if (cmpeq:boolean(and:int(var_3_12E:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_12E = and:int(var_3_12E:int, ldc:int(1221625364))
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_3_12E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_12E = and:int(var_3_12E:int, ldc:int(-309563210))
                    stack_168_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(16449), ldc:int(16476)))
                    expr_146 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(9217), ldc:int(9219)))
                    storeelement:Object(expr_146:Object[], and:int(ldc:int(-1931), ldc:int(1928)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_146:Object[], and:int(ldc:int(1059), ldc:int(18457)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_168_1:String, expr_146:Object[]), xor:int[expected:boolean](ldc:int(16640), ldc:int(16641)))
                    looporswitchbreak()
                }
                
                var_3_71 = and:int(var_3_12E:int, ldc:int(-1525923233))
            }
            
            return:int(var_6_82:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u4cd9\u8aa5\u3a62\uc7fe\u5fe1\u8c8a)))
    }
    
    private static int \ud51e\u071d\u52d3\u97e6\u7c6b\uc9f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1) {
        var_2_F2 : int
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_5_71 : Iterator<String>
        stack_17F_1 : String [generated]
        expr_168 : Object[] [generated]
        stack_11F_1 : String [generated]
        expr_10A : Object[] [generated]
        
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
            var_2_F2 = and:int(ldc:int(1750544266), ldc:int(1222284699))
            var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_5_71 = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0203)
                }
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(1264225468))
                }
                else {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-661638272))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_71:Iterator)) {
                        invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u624e\u4e72\u6ec6\u6ec6\u7006\ud12e, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_71:Iterator<String>)), checkcast:\u4c04\u34df\ua3b4\uc29a\ub70c(\u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c.class, aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c()))
                        loopcontinue()
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_F2 = and:int(var_2_F2:int, ldc:int(-1710854382))
                        loopcontinue()
                    }
                    
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-609079428))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(16785), ldc:int(14383)))) {
                        stack_17F_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(8818), ldc:int(8812)))
                        expr_168 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(179), ldc:int(4417)))
                        storeelement:Object(expr_168:Object[], and:int(ldc:int(-6394), ldc:int(2169)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_17F_1:String, expr_168:Object[]), and:int[expected:boolean](ldc:int(4229), ldc:int(73)))
                        looporswitchbreak()
                    }
                }
                
                Label_0203:
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(975242154))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-377558720))
                    stack_11F_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-31723), ldc:int(-31734)))
                    expr_10A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16517), ldc:int(14859)))
                    storeelement:Object(expr_10A:Object[], and:int(ldc:int(-11310), ldc:int(11309)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_11F_1:String, expr_10A:Object[]), xor:int[expected:boolean](ldc:int(105), ldc:int(104)))
                    looporswitchbreak()
                }
                
                var_2_F2 = and:int(var_2_F2:int, ldc:int(-1455336005))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p1:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \ud4fe\u6c56\u8d98\u5140\u7043\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2) {
        var_3_D7 : int
        var_5_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_6_71 : Iterator<String>
        stack_17B_1 : String [generated]
        expr_157 : Object[] [generated]
        stack_111_1 : String [generated]
        expr_EF : Object[] [generated]
        
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
            var_3_D7 = and:int(ldc:int(-1255673438), ldc:int(-272945773))
            var_5_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_6_71 = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0185)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-1578901070))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_71:Iterator)) {
                        invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u624e\u4e72\u6ec6\u6ec6\u7006\ud12e, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_71:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                        loopcontinue()
                    }
                }
                
                Label_0147:
                
                if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-46977090))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), xor:int(ldc:int(9296), ldc:int(9297)))) {
                        stack_17B_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(151), ldc:int(183)))
                        expr_157 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8722), ldc:int(34)))
                        storeelement:Object(expr_157:Object[], and:int(ldc:int(-18609), ldc:int(18608)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_157:Object[], xor:int(ldc:int(-31727), ldc:int(-31728)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_17B_1:String, expr_157:Object[]), xor:int[expected:boolean](ldc:int(8840), ldc:int(8841)))
                        looporswitchbreak()
                    }
                }
                
                Label_0185:
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(128)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(1562943510))
                    goto(Label_0147)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-67668078))
                    stack_111_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(6503), ldc:int(57)))
                    expr_EF = newarray:Object[](java.lang.Object.class, and:int(ldc:int(20650), ldc:int(1091)))
                    storeelement:Object(expr_EF:Object[], and:int(ldc:int(22929), ldc:int(-23442)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_EF:Object[], xor:int(ldc:int(21536), ldc:int(21537)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_111_1:String, expr_EF:Object[]), xor:boolean(ldc:boolean(0), ldc:boolean(1)))
                    looporswitchbreak()
                }
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p1:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \ud36e\u8389\u1833\u8350\u3d64\uc2bd(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, int p3) {
        var_4_108 : int
        var_6_6C : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_7_74 : Iterator<String>
        stack_1CF_1 : String [generated]
        expr_19E : Object[] [generated]
        stack_150_1 : String [generated]
        expr_121 : Object[] [generated]
        
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
            var_4_108 = and:int(ldc:int(1735477976), ldc:int(-68632162))
            var_6_6C = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_7_74 = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_4_108:int, ldc:int(8)), ldc:int(0))) {
                    var_4_108 = and:int(var_4_108:int, ldc:int(2079311417))
                    goto(Label_0218)
                }
                
                if (cmpne:boolean(and:int(var_4_108:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_108 = and:int(var_4_108:int, ldc:int(-1783432766))
                }
                else {
                    var_4_108 = and:int(var_4_108:int, ldc:int(-906307079))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_74:Iterator)) {
                        invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u7043\u965f\u4f52\uf94d\u5db4\u52d3, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_74:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c), p3:int)
                        loopcontinue()
                    }
                }
                
                Label_0176:
                
                if (cmpeq:boolean(and:int(var_4_108:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_108:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_108 = and:int(var_4_108:int, ldc:int(1542389660))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), xor:int(ldc:int(-31708), ldc:int(-31707)))) {
                        stack_1CF_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-13292), ldc:int(-13258)))
                        expr_19E = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2053), ldc:int(2054)))
                        storeelement:Object(expr_19E:Object[], and:int(ldc:int(22794), ldc:int(-23883)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_19E:Object[], and:int(ldc:int(22801), ldc:int(203)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        storeelement:Object(expr_19E:Object[], and:int(ldc:int(4238), ldc:int(1026)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1CF_1:String, expr_19E:Object[]), and:int[expected:boolean](ldc:int(5), ldc:int(30307)))
                        looporswitchbreak()
                    }
                }
                
                Label_0218:
                
                if (cmpne:boolean(and:int(var_4_108:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_108 = and:int(var_4_108:int, ldc:int(-1738596169))
                    goto(Label_0176)
                }
                
                if (cmpne:boolean(and:int(var_4_108:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_108 = and:int(var_4_108:int, ldc:int(-571747138))
                    stack_150_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(871), ldc:int(4155)))
                    expr_121 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(23), ldc:int(6411)))
                    storeelement:Object(expr_121:Object[], and:int(ldc:int(-26669), ldc:int(26664)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_121:Object[], and:int(ldc:int(4243), ldc:int(1537)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    storeelement:Object(expr_121:Object[], xor:int(ldc:int(1), ldc:int(3)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_150_1:String, expr_121:Object[]), and:int[expected:boolean](ldc:int(22659), ldc:int(9265)))
                    looporswitchbreak()
                }
                
                var_4_108 = and:int(var_4_108:int, ldc:int(1456440549))
            }
            
            return:int(mul:int(p3:int, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u4492\uc229\u12cb\u494c\u759a\u59ec(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, int p3) {
        var_4_FB : int
        var_6_6C : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_7_75 : int
        var_8_7D : Iterator<String>
        var_10_16B : \u4c04\ub102\ufcaf\u8d90\u8aa5
        stack_1E0_1 : String [generated]
        expr_1A1 : Object[] [generated]
        stack_143_1 : String [generated]
        expr_114 : Object[] [generated]
        
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
            var_4_FB = and:int(ldc:int(-237388700), ldc:int(-1513832713))
            var_6_6C = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_7_75 = and:int(ldc:int(7337), ldc:int(-8110))
            var_8_7D = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_4_FB:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_4_FB:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_FB = and:int(var_4_FB:int, ldc:int(-335552652))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_8_7D:Iterator)) {
                        var_10_16B = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_7D:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                        invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u7043\u965f\u4f52\uf94d\u5db4\u52d3, var_10_16B:\u4c04\ub102\ufcaf\u8d90\u8aa5, add:int(invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_10_16B:\u4c04\ub102\ufcaf\u8d90\u8aa5), p3:int))
                        var_7_75 = add:int(var_7_75:int, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_10_16B:\u4c04\ub102\ufcaf\u8d90\u8aa5))
                        loopcontinue()
                    }
                }
                
                Label_0163:
                
                if (cmpne:boolean(and:int(var_4_FB:int, ldc:int(8)), ldc:int(0))) {
                    var_4_FB = and:int(var_4_FB:int, ldc:int(-2007761341))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_FB:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_FB = and:int(var_4_FB:int, ldc:int(-1009918868))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(19205), ldc:int(8313)))) {
                        stack_1E0_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-32732), ldc:int(-32768)))
                        expr_1A1 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(22), ldc:int(14476)))
                        storeelement:Object(expr_1A1:Object[], and:int(ldc:int(15316), ldc:int(-15357)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                        storeelement:Object(expr_1A1:Object[], xor:int(ldc:int(-32494), ldc:int(-32493)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_1A1:Object[], xor:int(ldc:int(1289), ldc:int(1291)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        storeelement:Object(expr_1A1:Object[], and:int(ldc:int(547), ldc:int(10267)), invokestatic:Integer[expected:Object](Integer::valueOf, var_7_75:int))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1E0_1:String, expr_1A1:Object[]), xor:int[expected:boolean](ldc:int(20483), ldc:int(20482)))
                        looporswitchbreak()
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_4_FB:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0163)
                }
                
                if (cmpeq:boolean(and:int(var_4_FB:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_FB = and:int(var_4_FB:int, ldc:int(-490283532))
                    stack_143_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(237), ldc:int(9509)))
                    expr_114 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-31996), ldc:int(-31993)))
                    storeelement:Object(expr_114:Object[], and:int(ldc:int(11924), ldc:int(-11933)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                    storeelement:Object(expr_114:Object[], xor:int(ldc:int(8208), ldc:int(8209)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_114:Object[], and:int(ldc:int(66), ldc:int(13090)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_143_1:String, expr_114:Object[]), xor:int[expected:boolean](ldc:int(9346), ldc:int(9347)))
                    looporswitchbreak()
                }
                
                var_4_FB = and:int(var_4_FB:int, ldc:int(-1815665870))
            }
            
            return:int(var_7_75:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \ua562\u5d20\u9033\u3e2a\u3dd3\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, int p3) {
        var_4_111 : int
        var_6_6C : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_7_75 : int
        var_8_7D : Iterator<String>
        var_10_181 : \u4c04\ub102\ufcaf\u8d90\u8aa5
        stack_1F6_1 : String [generated]
        expr_1B7 : Object[] [generated]
        stack_159_1 : String [generated]
        expr_12A : Object[] [generated]
        
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
            var_4_111 = and:int(ldc:int(2139940746), ldc:int(390899690))
            var_6_6C = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_7_75 = and:int(ldc:int(-17242), ldc:int(17241))
            var_8_7D = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_4_111:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0227)
                }
                
                if (cmpne:boolean(and:int(var_4_111:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_111 = and:int(var_4_111:int, ldc:int(462202323))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_8_7D:Iterator)) {
                        var_10_181 = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_7D:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                        invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u7043\u965f\u4f52\uf94d\u5db4\u52d3, var_10_181:\u4c04\ub102\ufcaf\u8d90\u8aa5, sub:int(invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_10_181:\u4c04\ub102\ufcaf\u8d90\u8aa5), p3:int))
                        var_7_75 = add:int(var_7_75:int, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, var_10_181:\u4c04\ub102\ufcaf\u8d90\u8aa5))
                        loopcontinue()
                    }
                }
                
                Label_0163:
                
                if (cmpeq:boolean(and:int(var_4_111:int, ldc:int(128)), ldc:int(0))) {
                    var_4_111 = and:int(var_4_111:int, ldc:int(90145875))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_111:int, ldc:int(262144)), ldc:int(0))) {
                        var_4_111 = and:int(var_4_111:int, ldc:int(-1729766313))
                        loopcontinue()
                    }
                    
                    var_4_111 = and:int(var_4_111:int, ldc:int(-97212454))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(315), ldc:int(16385)))) {
                        stack_1F6_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(54), ldc:int(1382)))
                        expr_1B7 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1024), ldc:int(1028)))
                        storeelement:Object(expr_1B7:Object[], and:int(ldc:int(-31905), ldc:int(31904)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                        storeelement:Object(expr_1B7:Object[], xor:int(ldc:int(27136), ldc:int(27137)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                        storeelement:Object(expr_1B7:Object[], xor:int(ldc:int(-32760), ldc:int(-32758)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        storeelement:Object(expr_1B7:Object[], xor:int(ldc:int(564), ldc:int(567)), invokestatic:Integer[expected:Object](Integer::valueOf, var_7_75:int))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1F6_1:String, expr_1B7:Object[]), and:int[expected:boolean](ldc:int(9797), ldc:int(2465)))
                        looporswitchbreak()
                    }
                }
                
                Label_0227:
                
                if (cmpne:boolean(and:int(var_4_111:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_111 = and:int(var_4_111:int, ldc:int(-1867373758))
                    goto(Label_0163)
                }
                
                if (cmpne:boolean(and:int(var_4_111:int, ldc:int(256)), ldc:int(0))) {
                    var_4_111 = and:int(var_4_111:int, ldc:int(-1680494606))
                    stack_159_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-32627), ldc:int(-32598)))
                    expr_12A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1395), ldc:int(2059)))
                    storeelement:Object(expr_12A:Object[], and:int(ldc:int(3178), ldc:int(-3691)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                    storeelement:Object(expr_12A:Object[], xor:int(ldc:int(20486), ldc:int(20487)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
                    storeelement:Object(expr_12A:Object[], and:int(ldc:int(10266), ldc:int(386)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_159_1:String, expr_12A:Object[]), and:int[expected:boolean](ldc:int(2433), ldc:int(4613)))
                    looporswitchbreak()
                }
                
                var_4_111 = and:int(var_4_111:int, ldc:int(1765756257))
            }
            
            return:int(var_7_75:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \u4bc8\u71ae\uf94d\u8258\u64f2\u6198(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_1_61 : int
        var_3_6C : Collection<String>
        stack_B5_1 : String [generated]
        expr_93 : Object[] [generated]
        
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
            var_1_61 = and:int(ldc:int(-1683930770), ldc:int(2070531575))
            var_3_6C = invokevirtual:Collection<String>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6435\u62da\u071d\ud36e\u64ab\uc910, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
            
            if (logicalnot:boolean(invokeinterface:boolean(Collection::isEmpty, var_3_6C:Collection))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2045457238))
                stack_B5_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-31487), ldc:int(-31448)))
                expr_93 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1035), ldc:int(2102)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(-7412), ldc:int(3313)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, var_3_6C:Collection<String>)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(4167), ldc:int(18713)), invokestatic:ITextComponent[expected:Object](TextComponentUtils::makeGreenSortedList, var_3_6C:Collection<String>))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B5_1:String, expr_93:Object[]), and:int[expected:boolean](ldc:int(-25641), ldc:int(25640)))
            }
            else {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(6187), ldc:int(6147)))), and:int[expected:boolean](ldc:int(-1394), ldc:int(1393)))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, var_3_6C:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \u0c95\ubcb0\ub32d\u8d98\ub19c\uc9f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1) {
        var_2_61 : int
        var_4_6D : Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>
        stack_B6_1 : String [generated]
        expr_96 : Object[] [generated]
        var_5_CF : Iterator<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>
        var_6_136 : Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>
        stack_181_1 : String [generated]
        expr_14F : Object[] [generated]
        stack_FC_1 : String [generated]
        expr_EF : Object[] [generated]
        
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
            var_2_61 = and:int(ldc:int(-507496164), ldc:int(1833997596))
            var_4_6D = invokevirtual:Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u3c25\u385b\ucb79\u7043\u3dd3\ucfaf, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), p1:String)
            
            if (logicalnot:boolean(invokeinterface:boolean(Map::isEmpty, var_4_6D:Map))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1675686843))
                stack_B6_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(22), ldc:int(61)))
                expr_96 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(24194), ldc:int(38)))
                storeelement:Object(expr_96:Object[], and:int(ldc:int(16501), ldc:int(-16502)), p1:String[expected:Object])
                storeelement:Object(expr_96:Object[], and:int(ldc:int(645), ldc:int(5121)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Map<K, V>::size, var_4_6D:Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>)))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B6_1:String, expr_96:Object[]), and:int[expected:boolean](ldc:int(20801), ldc:int(-20802)))
                var_5_CF = invokeinterface:Iterator<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>(Set<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>::iterator, invokeinterface:Set<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>(Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>::entrySet, var_4_6D:Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_5_CF:Iterator)) {
                    var_6_136 = checkcast:Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>(java.util.Map.Entry<\u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4c04\ub102\ufcaf\u8d90\u8aa5>.class, invokeinterface:Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>(Iterator<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>::next, var_5_CF:Iterator<Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>>))
                    stack_181_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(8448), ldc:int(8492)))
                    expr_14F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-28605), ldc:int(-28607)))
                    storeelement:Object(expr_14F:Object[], and:int(ldc:int(-28826), ldc:int(28825)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, checkcast:\u4c04\u34df\ua3b4\uc29a\ub70c(\u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c.class, invokeinterface:\u4c04\u34df\ua3b4\uc29a\ub70c(Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>::getKey, var_6_136:Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>))))
                    storeelement:Object(expr_14F:Object[], and:int(ldc:int(11299), ldc:int(89)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, checkcast:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4c04\ub102\ufcaf\u8d90\u8aa5.class, invokeinterface:\u4c04\ub102\ufcaf\u8d90\u8aa5(Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>::getValue, var_6_136:Entry<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>)))))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_181_1:String, expr_14F:Object[]), and:int[expected:boolean](ldc:int(5514), ldc:int(-5547)))
                }
            }
            else {
                stack_FC_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(8746), ldc:int(2235)))
                expr_EF = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(616), ldc:int(617)))
                storeelement:Object(expr_EF:Object[], and:int(ldc:int(20770), ldc:int(-20771)), p1:String[expected:Object])
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_FC_1:String, expr_EF:Object[]), and:int[expected:boolean](ldc:int(-22884), ldc:int(22883)))
            }
            
            return:int(invokeinterface:int(Map<K, V>::size, var_4_6D:Map<\u4c04\u34df\ua3b4\uc29a\ub70c, \u4c04\ub102\ufcaf\u8d90\u8aa5>))
        }
        
        goto(Label_0006)
    }
    
    private static int \uafe7\u4f52\u3dd3\u8413\u5654\ubcb0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, int p1) {
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        stack_AC_1 : String [generated]
        expr_9B : Object[] [generated]
        
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
        var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:int), aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c())) {
            invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\ud4fe\u5db4\u8bb0\u5654\u74b1\u64f2, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:int, checkcast:\u4c04\u34df\ua3b4\uc29a\ub70c(\u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c.class, aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c()))
            stack_AC_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(13423), ldc:int(189)))
            expr_9B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2338), ldc:int(2339)))
            storeelement:Object(expr_9B:Object[], and:int(ldc:int(17656), ldc:int(-17658)), loadelement:String[expected:Object](invokestatic:String[](\u7c6b\ud36e\u8d90\u0800\ua6bd::\u16f6\u0c95\u67e9\uc2bd\u3d4b\u8753), p1:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_AC_1:String, expr_9B:Object[]), and:int[expected:boolean](ldc:int(389), ldc:int(5185)))
            return:int(and:int(ldc:int(-13370), ldc:int(13369)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u7049\u718f\u47c2\ub102\u0c95\u4f4a)))
    }
    
    private static int \u12b2\u8640\u62da\u8389\u8cae\uff55(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, int p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2) {
        var_5_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        stack_B7_1 : String [generated]
        expr_99 : Object[] [generated]
        
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
        var_5_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:int), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)) {
            invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\ud4fe\u5db4\u8bb0\u5654\u74b1\u64f2, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:int, p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
            stack_B7_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(17599), ldc:int(8238)))
            expr_99 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1024), ldc:int(1026)))
            storeelement:Object(expr_99:Object[], and:int(ldc:int(-1589), ldc:int(1588)), loadelement:String[expected:Object](invokestatic:String[](\u7c6b\ud36e\u8d90\u0800\ua6bd::\u16f6\u0c95\u67e9\uc2bd\u3d4b\u8753), p1:int))
            storeelement:Object(expr_99:Object[], xor:int(ldc:int(1601), ldc:int(1600)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u647c\u8cae\u6d99\u56bd\u3776\u4d85, p2:\u4c04\u34df\ua3b4\uc29a\ub70c))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B7_1:String, expr_99:Object[]), and:int[expected:boolean](ldc:int(865), ldc:int(12421)))
            return:int(and:int(ldc:int(23107), ldc:int(-23108)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4)))
    }
    
    private static int \ubcb0\u183a\u983f\u93a2\u6c56\u7873(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p1, net.minecraft.util.text.ITextComponent p2) {
        stack_B8_1 : String [generated]
        expr_9B : Object[] [generated]
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u647c\u8cae\u6d99\u56bd\u3776\u4d85, p1:\u4c04\u34df\ua3b4\uc29a\ub70c), p2:ITextComponent[expected:Object]))) {
                invokevirtual:void(\u4c04\u34df\ua3b4\uc29a\ub70c::\ub7dc\u34df\ubded\ud12e\u3c25\u51fa, p1:\u4c04\u34df\ua3b4\uc29a\ub70c, p2:ITextComponent)
                stack_B8_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(24600), ldc:int(24631)))
                expr_9B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(545), ldc:int(547)))
                storeelement:Object(expr_9B:Object[], and:int(ldc:int(-4629), ldc:int(4628)), invokevirtual:String[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u5bc4\u7873\ub113\u3bc9\ud158\ube23, p1:\u4c04\u34df\ua3b4\uc29a\ub70c))
                storeelement:Object(expr_9B:Object[], xor:int(ldc:int(513), ldc:int(512)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p1:\u4c04\u34df\ua3b4\uc29a\ub70c))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B8_1:String, expr_9B:Object[]), xor:int[expected:boolean](ldc:int(1290), ldc:int(1291)))
            }
            
            return:int(and:int(ldc:int(20812), ldc:int(-21376)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u7330\u9255\u76bc\u1833\u8413\u97e6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u5d20\uceb8\u64f2\u6c56\u4d85 p2) {
        stack_A8_1 : String [generated]
        expr_98 : Object[] [generated]
        
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
            
            if (cmpne:boolean(invokevirtual:\u5d20\uceb8\u64f2\u6c56\u4d85(\u4c04\u34df\ua3b4\uc29a\ub70c::\uf9c5\uc238\u6bb9\u8753\u8d98\u4c2b, p1:\u4c04\u34df\ua3b4\uc29a\ub70c), p2:\u5d20\uceb8\u64f2\u6c56\u4d85)) {
                invokevirtual:void(\u4c04\u34df\ua3b4\uc29a\ub70c::\u6ec6\u9a18\uc84e\u3bd6\ub32d\u624e, p1:\u4c04\u34df\ua3b4\uc29a\ub70c, p2:\u5d20\uceb8\u64f2\u6c56\u4d85)
                stack_A8_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(554), ldc:int(538)))
                expr_98 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(553), ldc:int(8321)))
                storeelement:Object(expr_98:Object[], and:int(ldc:int(6538), ldc:int(-16267)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p1:\u4c04\u34df\ua3b4\uc29a\ub70c))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A8_1:String, expr_98:Object[]), xor:int[expected:boolean](ldc:int(18960), ldc:int(18961)))
            }
            
            return:int(and:int(ldc:int(28315), ldc:int(-28316)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u8d90\uf995\u93a2\u92ff\u183a\ucef1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p1) {
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        stack_98_1 : String [generated]
        expr_88 : Object[] [generated]
        
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
            var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\ud4fe\u120d\u99f7\u3d64\uc4d2\u4f4a, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:\u4c04\u34df\ua3b4\uc29a\ub70c)
            stack_98_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(13237), ldc:int(49)))
            expr_88 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(6144), ldc:int(6145)))
            storeelement:Object(expr_88:Object[], and:int(ldc:int(-6458), ldc:int(2353)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, p1:\u4c04\u34df\ua3b4\uc29a\ub70c))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_98_1:String, expr_88:Object[]), xor:int[expected:boolean](ldc:int(4386), ldc:int(4387)))
            return:int(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u76bc\uf94d\ub102\ubcb0\u8aa5\uc2e8, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd])))
        }
        
        goto(Label_0006)
    }
    
    private static int \ub113\ucfaf\ua068\u7d52\u6d99\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u97e6\u4c2b\uceb8\u9a18\u965f p2, net.minecraft.util.text.ITextComponent p3) {
        var_6_6C : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_7_A3 : \u4c04\u34df\ua3b4\uc29a\ub70c
        stack_CD_1 : String [generated]
        expr_BC : Object[] [generated]
        
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
        var_6_6C = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6cfe\ubefe\u6d69\uc4d2\uae5d\u7d52, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String), aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c())) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\ud217\uc84e\ube23\uc238\uc84e\u62da)))
        }
        
        if (cmple:boolean(invokevirtual:int(String::length, p1:String), ldc:int(16))) {
            invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6fb0\ub32d\ud36e\u51b2\u93a2\u0a06, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String, p2:\u97e6\u4c2b\uceb8\u9a18\u965f, p3:ITextComponent, invokevirtual:\u5d20\uceb8\u64f2\u6c56\u4d85(\u97e6\u4c2b\uceb8\u9a18\u965f::\ubded\ub1b9\u98a4\ub1b9\ubff1\u8413, p2:\u97e6\u4c2b\uceb8\u9a18\u965f))
            var_7_A3 = invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6cfe\ubefe\u6d69\uc4d2\uae5d\u7d52, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String)
            stack_CD_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(256), ldc:int(306)))
            expr_BC = newarray:Object[](java.lang.Object.class, and:int(ldc:int(19), ldc:int(29449)))
            storeelement:Object(expr_BC:Object[], and:int(ldc:int(908), ldc:int(-909)), invokevirtual:ITextComponent[expected:Object](\u4c04\u34df\ua3b4\uc29a\ub70c::\u3d64\u3711\u97b7\ucef1\ud7e8\u7330, var_7_A3:\u4c04\u34df\ua3b4\uc29a\ub70c))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_CD_1:String, expr_BC:Object[]), and:int[expected:boolean](ldc:int(709), ldc:int(18465)))
            return:int(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u76bc\uf94d\ub102\ubcb0\u8aa5\uc2e8, var_6_6C:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd])))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u6cfe\uc4d2\u3711\ubf56\ubf56::\ucb79\u392e\u446c\ubefe\u36d3\u6b5f), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(16))))
    }
    
    private static int \u4bc8\u600f\uf9c5\ub113\u64f2\u98a4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_1_61 : int
        var_3_6C : Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>
        stack_BA_1 : String [generated]
        expr_93 : Object[] [generated]
        
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
            var_1_61 = and:int(ldc:int(-380079512), ldc:int(-2443311))
            var_3_6C = invokevirtual:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u76bc\uf94d\ub102\ubcb0\u8aa5\uc2e8, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
            
            if (logicalnot:boolean(invokeinterface:boolean(Collection::isEmpty, var_3_6C:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-389337493))
                stack_BA_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(391), ldc:int(435)))
                expr_93 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-32760), ldc:int(-32758)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(-28746), ldc:int(28745)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection::size, var_3_6C:Collection)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(8193), ldc:int(7235)), invokestatic:IFormattableTextComponent[expected:Object](TextComponentUtils::func_240649_b_, var_3_6C:Collection<Object>, invokedynamic:Function<Object, ITextComponent>(apply:()Ljava/util/function/Function;)))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_BA_1:String, expr_93:Object[]), and:int[expected:boolean](ldc:int(2086), ldc:int(-2087)))
            }
            else {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(20512), ldc:int(20499)))), and:int[expected:boolean](ldc:int(26764), ldc:int(-30893)))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, var_3_6C:Collection<\u4c04\u34df\ua3b4\uc29a\ub70c>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uae5d\u3c25\uc4d2\u3dd3\u8258\u3504$20(\u5d20\u7043\u88c5\u5db4\uf94d.\u5d20\uceb8\u64f2\u6c56\u4d85 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u7330\u9255\u76bc\u1833\u8413\u97e6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p1:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(46), ldc:int(11525)))), p0:\u5d20\uceb8\u64f2\u6c56\u4d85))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u0800\u62da\u3a62\u98a4\u72f1\u392e$19(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\uf94d\ucfaf\uc3e3\u624e\uc2e8\u0c95, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(8463), ldc:int(16927)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(11287), ldc:int(4341)))), invokestatic:\u12b2\u3d4b\u156b\u071d\uc246(\u8709\u183a\ubefe\u62da\u8308::\u4975\ub1b9\u527a\u8d98\u836c\ube23, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(2590), ldc:int(1461)))), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(400), ldc:int(390)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(6295), ldc:int(8215))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3a62\u6198\uc2bd\u071d\u183a\u6b0d$18(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u0b8e\ub6ab\uc2bd\u9033\u47c2\u1187, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(16590), ldc:int(16577)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(8386), ldc:int(8390))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ub113\ub6ab\u4bc8\u1833\u92ff\u0c95$17(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u839e\ubf56\ubded\ua3b4\u3e2a::\u600f\u6fb0\u62da\u5245\u7330\u8753, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(15), ldc:int(255)))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uf9c5\u759a\u8df4\u4f52\u839e\u927d$16(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ud4fe\u6c56\u8d98\u5140\u7043\ub102, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(11551), ldc:int(175)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(2), ldc:int(6))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub19c\uc2bd\u67e9\ubb2b\ub70c\u4975$15(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ud51e\u071d\u52d3\u97e6\u7c6b\uc9f6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(24639), ldc:int(2319))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub102\u4ab3\ubded\ud171\u759a\u9033$14(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ua562\u5d20\u9033\u3e2a\u3dd3\u965f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-31996), ldc:int(-31989)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(86), ldc:int(12)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-32490), ldc:int(-32506))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8aa5\u983f\u0a06\uf995\u4cd9\u8753$13(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u4492\uc229\u12cb\u494c\u759a\u59ec, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-31982), ldc:int(-31971)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(4363), ldc:int(4367)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(8725), ldc:int(8709))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u93a2\u9af2\u67d0\u56bd\ub1b9\ubf56$12(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u7d52\u718f\u836c\u3776\uae87\u6c56, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(\uc2e8\u40a9\u0c95\u9937\ud36e::\u8258\u4d85\u120d\u759a\ud36e\u8aa5, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(3647), ldc:int(12365)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(17423), ldc:int(14532))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u718f\u4f4a\u76bc\u7c6b\u51fa\u72f1$11(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ud36e\u8389\u1833\u8350\u3d64\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(1295), ldc:int(239)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(4162), ldc:int(4166)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(1024), ldc:int(1040))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u9a18\u3bd6\u3c25\u1833\ud4fe\u8df4$10(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u0c95\ubcb0\ub32d\u8d98\ub19c\uc9f6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(\uc2e8\u40a9\u0c95\u9937\ud36e::\u8258\u4d85\u120d\u759a\ud36e\u8aa5, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(1931), ldc:int(1926))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7873\u88c5\ub6ab\u600f\ud523\u88c5$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u4bc8\u71ae\uf94d\u8258\u64f2\u6198, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6435\ub83f\ud12e\u718f\uc238\u4d85$8(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u12b2\u8640\u62da\u8389\u8cae\uff55, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(\u8709\u7043\ub83f\uf94d\u416d::\ubf56\u8d90\uc7fe\uc87f\ud7e8\u9a18, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(2895), ldc:int(1035)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(16420), ldc:int(5772))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u62da\u5245\u527a\u7043\ubff1\u6cfe$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\uafe7\u4f52\u3dd3\u8413\u5654\ubcb0, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(\u8709\u7043\ub83f\uf94d\u416d::\ubf56\u8d90\uc7fe\uc87f\ud7e8\u9a18, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(2647), ldc:int(2652))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ucef1\u5654\u6bb9\uc31c\ub83f\u6435$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u8d90\uf995\u93a2\u92ff\u183a\ucef1, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(519), ldc:int(515))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uff55\u8aa5\u1833\u4e72\u624e\u8640$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ubcb0\u183a\u983f\u93a2\u6c56\u7873, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(17516), ldc:int(4102)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(11319), ldc:int(20742))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc238\u61a4\ub171\ubcb0\ub171\ubb2b$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ub113\ucfaf\ua068\u7d52\u6d99\u72f1, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(4353), ldc:int(4357)))), invokestatic:\u97e6\u4c2b\uceb8\u9a18\u965f(\u0b8e\u527a\ubcb0\u56bd\u873d::\ub7dc\u839e\u3c25\u7bad\uc29a\ud217, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(8237), ldc:int(69)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(-32247), ldc:int(-32241))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u946b\ub8be\uff55\u7bad\uc84e\u527a$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\ub113\ucfaf\ua068\u7d52\u6d99\u72f1, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(4644), ldc:int(326)))), invokestatic:\u97e6\u4c2b\uceb8\u9a18\u965f(\u0b8e\u527a\ubcb0\u56bd\u873d::\ub7dc\u839e\u3c25\u7bad\uc29a\ud217, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), xor:int(ldc:int(339), ldc:int(342)))), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(24582), ldc:int(4748)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6cfe\u92ff\u4f52\ud171\u5140\u836c$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u839e\ubf56\ubded\ua3b4\u3e2a::\u4bc8\u600f\uf9c5\ub113\u64f2\u98a4, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ube23\ud4fe\u3711\u4179\uc4d2\u62da$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(-32125), ldc:int(-32127))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\uc4d2\u67e9\uc229\u960f\uc7fe\u99f7$0(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06), and:int(ldc:int(6325), ldc:int(565)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(515), ldc:int(513)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-7905), ldc:int(5856)), p0:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(8401), ldc:int(16673)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_84A : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_85D_0 : byte[] [generated]
        stack_898_0 : byte[] [generated]
        stack_8F6_0 : byte[] [generated]
        stack_974_0 : byte[] [generated]
        var_4_835 : int
        var_3_83A : byte[]
        var_5_83B : int
        var_0_910 : int
        expr_8F6 : byte [generated]
        stack_93F_2 : byte [generated]
        stack_913_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_886 : byte[]
        var_5_887 : int
        expr_D0 : int [generated]
        expr_F7 : int [generated]
        var_3_962 : byte[]
        var_5_963 : int
        expr_974 : byte [generated]
        var_3_142 : String
        expr_14A : String[] [generated]
        expr_154 : String[] [generated]
        var_3_79D : String[]
        
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
        var_0_84A = and:int(ldc:int(-1118710409), ldc:int(1984664260))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_F5_0 = stack_F7_0 = stack_136_0 = stack_85D_0 = stack_898_0 = stack_8F6_0 = stack_974_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FBkYGusJFRvjCexT2QrkFAob5wfnDyfUARwbF+IL6AjsVcQZHyDH7B0KHxsV5gsa6wkVG+MJ7FPZCuQUChvnB+cPJ9QBHBsX4gvoCOxVxBkfI9cbCRcY6RkK6wkVG+MJ7FPZCuQUChvnB+cPJ9QBHBsX4gvoCOxQwhzqHQIe4lXMEOQNFBPtLvXlEh8K6wkVG+MJ7FPZCuQUChvnB+cPJ9QBHBsX4gvoCOxQwhzqHQIe4lXMEOQNFBPvNOnoCusJFRvjCexT2QrkFAob5wfnDyfUARwbF+IL6AjsUMIc6h0CHuJTzh4dF+QIGBrrCRUb4wnsU9kK5BQKG+cH5w8n1AEcGxfiC+gI7FDCHOodAh7iU9cJ6ArrCRUb4wnsU9kK5BQKG+cH5w8n1AEcGxfiC+gI7FjKHOYfUcEV5RIfCusJFRvjCexT2QrkFAob5wfnDyfUARwbF+IL6AjsWMoc5h9T1xsJFxjpGQrrCRUb4wnsU9kK5BQKG+cH5w8n1AEcGxfiC+gI7FnE4gIaFeJQwhzqHQIe4hQNERsa6wkVG+MJ7FPZCuQUChvnB+cPJ9QBHBsX4gvoCOxZxOICGhXiUtQP4wYb5xIQEgsa6wkVG+MJ7FPZCuQUChvnB+cPJ9QBHBsX4gvoCOxS1AEU4BgOI9cbCRcY6RkK6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxVxBkfI9cbCRcY6RxZzuAO4gHtDhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxVxBkfI9cbCRcY6RxT0wPuAh4bGusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcUc/kBh8eHi7MERQeGBga6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxRz+QGHx4eLcPhHAwaHBga6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxRz+QGHx4eI9cbCRcY6RxZzuAO4gHtDhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxRz+QGHx4eI9cbCRcY6RxT0wPuAh4bGusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcX8sZ71bQEAkQGusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcX8sZ71PXGwkXGOkZCusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcWMoc5h9RwRXlEh8K6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxYyhzmH1HP4xIN4hJRwRXlEh8K6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxYyhzmH1HP4xIN4hJRz+MbEB8K6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxYyhzmH1HP4xIN4hJT1xsJFxjpGQrrCRUb4wnsU9kK5BQKG+cH5w8k3QIe7QvmHFjKHOYfU9cbCRcY6RkK6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxX1hIL6AXiAOgZU9cbCRcY6RxZzuAO4gHtDhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxX1hIL6AXiAOgZU9cbCRcY6RxT0wPuAh4bGusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcUtQBFOAYDiPXGwkXGOkcWc7gDuIB7Q4bGusJFRvjCexT2QrkFAob5wfnDyTdAh7tC+YcUtQBFOAYDiPXGwkXGOkcU9MD7gIeGxrrCRUb4wnsU9kK5BQKG+cH5w8k3QIe7QvmHFLUCOcJ71XMGRcpzuAO4gHtDhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxS1AjnCe9VzBkXI9MD7gIeGxrrCRUb4wnsU9kK5BQKG+cH5w8k3QIe7QvmHFLUCOcJ71PaEgsTGhQfHCnO4A7iAe0OGxrrCRUb4wnsU9kK5BQKG+cH5w8k3QIe7QvmHFLUCOcJ71PaEgsTGhQfHCPTA+4CHhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxT1wnvU9cbCRcY6RxZzuAO4gHtDhsa6wkVG+MJ7FPZCuQUChvnB+cPJN0CHu0L5hxT1wnvU9cbCRcY6RxT0wPuAh4bGeAN5gvgARQSHOodAh7iNe0RGBIc6h0CHuIUDREZH+QGHx4XGxnhChzmHgTiAhoV4xQBHBsX4gvoDOQBHBsX4gvoCO0WEgvoBeIA6BcdAh7tC+YYFAEU4BgL5A/jBhvnEhASC+QI5wnoGQrkFAjpCuQUChvnB+cJ5wnoFwnpAhzqHQIe7x4F4hgdExoWBxjtExoWBx8F4RwbF+IL6AnqB+ILGekaB+ILGew14RwbF+IL6AnqB+ILGegcWQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_835 = expr_6E:int
        var_3_83A = newarray:byte[](byte.class, expr_6E:int)
        var_5_83B = expr_6E:int
        Label_2109:
        
        while (cmpne:boolean(and:int(var_0_84A:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(-37236108))
            var_5_83B = add:int(var_5_83B:int, ldc:int(-1))
            storeelement:byte(var_3_83A:byte[], var_5_83B:int, xor:byte(loadelement:byte(stack_85D_0:byte[], var_5_83B:int), ldc:byte(25)))
            
            if (cmpne:boolean(var_5_83B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_CE_0 = stack_D0_0 = stack_F5_0 = stack_F7_0 = stack_136_0 = stack_85D_0 = stack_898_0 = stack_8F6_0 = stack_974_0 = var_3_83A:byte[]
            goto(Label_0115)
        }
        
        var_0_84A = and:int(var_0_84A:int, ldc:int(327350594))
        Label_2271:
        
        while (cmpne:boolean(and:int(var_0_84A:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_910 = and:int(var_0_84A:int, ldc:int(1985198845))
            var_5_83B = add:int(var_5_83B:int, ldc:int(-1))
            expr_8F6 = stack_93F_2 = loadelement(stack_8F6_0, var_5_83B)
            
            if (cmplt:boolean(add:int(add:int(var_5_83B:int, ldc:int(1)), neg:int(var_4_835:int)), ldc:int(0))) {
                stack_93F_2 = stack_913_0 = add:byte(expr_8F6:byte, loadelement:byte(var_3_83A:byte[], add:int(var_5_83B:int, ldc:int(1))))
                goto(Label_2339)
            }
            
            Label_2307:
            
            if (cmpne:boolean(and:int(var_0_910:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_910 = and:int(var_0_910:int, ldc:int(1960697196))
                stack_93F_2 = stack_913_0 = add:byte(expr_8F6:byte, ldc:byte(1))
            }
            
            Label_2339:
            
            if (cmpeq:boolean(and:int(var_0_910:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_910 = and:int(var_0_910:int, ldc:int(-1540130755))
                goto(Label_2307)
            }
            
            var_0_84A = and:int(var_0_910:int, ldc:int(937770055))
            storeelement:byte(var_3_83A:byte[], var_5_83B:int, stack_93F_2:byte)
            
            if (cmpne:boolean(var_5_83B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_CE_0 = stack_D0_0 = stack_F5_0 = stack_F7_0 = stack_136_0 = stack_85D_0 = stack_898_0 = stack_8F6_0 = stack_974_0 = var_3_83A:byte[]
            goto(Label_0213)
        }
        
        goto(Label_2109)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(1529261313))
            goto(Label_0252)
        }
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(4096)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(2110427174))
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(922459997))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_886 = newarray:byte[](byte.class, expr_A9:int)
                var_5_887 = expr_A9:int
                
                loop {
                    var_0_84A = and:int(var_0_84A:int, ldc:int(2118983551))
                    var_5_887 = add:int(var_5_887:int, ldc:int(-1))
                    storeelement:byte(var_3_886:byte[], var_5_887:int, add:int(shl:int(loadelement:byte(stack_898_0:byte[], var_5_887:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_887:int, xor:int(ldc:int(-30717), ldc:int(-30718)))), ldc:int(4)), and:int(ldc:int(16575), ldc:int(8271)))))
                    
                    if (cmpne:boolean(var_5_887:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_CE_0 = stack_D0_0 = stack_F5_0 = stack_F7_0 = stack_136_0 = stack_85D_0 = stack_898_0 = stack_8F6_0 = stack_974_0 = var_3_886:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0252)
        }
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_84A = and:int(var_0_84A:int, ldc:int(2094503652))
            expr_D0 = arraylength:int(stack_D0_0:byte[])
            
            if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                var_4_835 = expr_D0:int
                var_3_83A = newarray:byte[](byte.class, expr_D0:int)
                var_5_83B = expr_D0:int
                goto(Label_2271)
            }
        }
        
        Label_0213:
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_84A = and:int(var_0_84A:int, ldc:int(2003801815))
            expr_F7 = arraylength:int(stack_F7_0:byte[])
            
            if (cmpne:boolean(expr_F7:int, ldc:int(0))) {
                var_3_962 = newarray:byte[](byte.class, expr_F7:int)
                var_5_963 = expr_F7:int
                
                loop {
                    var_0_84A = and:int(var_0_84A:int, ldc:int(-1124879874))
                    var_5_963 = add:int(var_5_963:int, ldc:int(-1))
                    expr_974 = loadelement:byte(stack_974_0:byte[], var_5_963:int)
                    storeelement:byte(var_3_962:byte[], var_5_963:int, add:int(or:int(and:int(shl:int(expr_974:byte, xor:int(ldc:int(16547), ldc:int(16551))), ldc:int(-16)), and:int(shr:int(expr_974:byte[expected:int], xor:int(ldc:int(4389), ldc:int(4385))), ldc:int(15))), ldc:int(30)))
                    
                    if (cmpne:boolean(var_5_963:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_CE_0 = stack_D0_0 = stack_F5_0 = stack_F7_0 = stack_136_0 = stack_85D_0 = stack_898_0 = stack_8F6_0 = stack_974_0 = var_3_962:byte[]
            }
        }
        
        Label_0252:
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(-618543240))
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(95854751))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_84A:int, ldc:int(4)), ldc:int(0))) {
            var_0_84A = and:int(var_0_84A:int, ldc:int(568295331))
            goto(Label_0115)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_14A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4394), ldc:int(4369)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1339), ldc:int(16443)))
        storeelement:String(expr_154:String[], and:int(ldc:int(8467), ldc:int(4291)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1830), ldc:int(-5943)), xor:int(ldc:int(60), ldc:int(63))))
        storeelement:String(expr_14A:String[], and:int(ldc:int(8567), ldc:int(54)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-24288), ldc:int(-24285)), xor:int(ldc:int(6175), ldc:int(6192))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(4618), ldc:int(4664)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(8255), ldc:int(4143)), xor:int(ldc:int(16912), ldc:int(16969))))
        storeelement:String(expr_14A:String[], and:int(ldc:int(2175), ldc:int(12599)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17757), ldc:int(91)), xor:int(ldc:int(2392), ldc:int(2516))))
        storeelement:String(expr_14A:String[], xor:int(ldc:int(1554), ldc:int(1578)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(4521), ldc:int(4389)), xor:int(ldc:int(-25995), ldc:int(-25912))))
        storeelement:String(expr_154:String[], and:int(ldc:int(3373), ldc:int(173)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4541), ldc:int(189)), and:int(ldc:int(12795), ldc:int(235))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32564), ldc:int(-32542)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-11060), ldc:int(-11225)), and:int(ldc:int(12565), ldc:int(19733))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(321), ldc:int(370)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(349), ldc:int(4373)), and:int(ldc:int(318), ldc:int(13758))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32623), ldc:int(-32603)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(9401), ldc:int(9607)), xor:int(ldc:int(2947), ldc:int(2794))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32648), ldc:int(-32681)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1385), ldc:int(4457)), and:int(ldc:int(410), ldc:int(926))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(527), ldc:int(575)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4570), ldc:int(8603)), xor:int(ldc:int(-32477), ldc:int(-32535))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(1106), ldc:int(1123)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(4103), ldc:int(4557)), and:int(ldc:int(19447), ldc:int(503))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(24599), ldc:int(24626)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(13303), ldc:int(18943)), and:int(ldc:int(9023), ldc:int(6695))))
        storeelement:String(expr_154:String[], and:int(ldc:int(6180), ldc:int(1254)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1767), ldc:int(1216)), and:int(ldc:int(4693), ldc:int(10101))))
        storeelement:String(expr_14A:String[], and:int(ldc:int(121), ldc:int(16571)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(8688), ldc:int(9125)), and:int(ldc:int(4735), ldc:int(19070))))
        storeelement:String(expr_14A:String[], and:int(ldc:int(442), ldc:int(4218)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17022), ldc:int(5758)), and:int(ldc:int(22249), ldc:int(9128))))
        storeelement:String(expr_154:String[], and:int(ldc:int(8349), ldc:int(4125)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(8876), ldc:int(680)), xor:int(ldc:int(8301), ldc:int(8886))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(17042), ldc:int(17038)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(11003), ldc:int(991)), xor:int(ldc:int(4582), ldc:int(4842))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-20439), ldc:int(-20452)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32467), ldc:int(-32223)), xor:int(ldc:int(26), ldc:int(810))))
        storeelement:String(expr_154:String[], and:int(ldc:int(153), ldc:int(8217)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(19047), ldc:int(18775)), and:int(ldc:int(6103), ldc:int(11127))))
        storeelement:String(expr_154:String[], and:int(ldc:int(17513), ldc:int(552)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1553), ldc:int(1350)), and:int(ldc:int(1917), ldc:int(25471))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-15849), ldc:int(-15811)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17277), ldc:int(5119)), xor:int(ldc:int(617), ldc:int(451))))
        storeelement:String(expr_154:String[], and:int(ldc:int(558), ldc:int(9277)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(8849), ldc:int(8507)), xor:int(ldc:int(-24576), ldc:int(-23593))))
        storeelement:String(expr_154:String[], and:int(ldc:int(17519), ldc:int(2347)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(19415), ldc:int(991)), and:int(ldc:int(21766), ldc:int(1071))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(521), ldc:int(544)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(790), ldc:int(1808)), xor:int(ldc:int(2830), ldc:int(3872))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(4753), ldc:int(4746)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1326), ldc:int(25790)), xor:int(ldc:int(8278), ldc:int(9266))))
        storeelement:String(expr_154:String[], and:int(ldc:int(4154), ldc:int(8799)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(9976), ldc:int(8860)), xor:int(ldc:int(17196), ldc:int(18356))))
        storeelement:String(expr_154:String[], and:int(ldc:int(10407), ldc:int(1127)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1432), ldc:int(11960)), xor:int(ldc:int(465), ldc:int(1306))))
        storeelement:String(expr_154:String[], and:int(ldc:int(9318), ldc:int(23470)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1243), ldc:int(5359)), xor:int(ldc:int(-20286), ldc:int(-19394))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32755), ldc:int(-32750)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(26108), ldc:int(5372)), xor:int(ldc:int(-23599), ldc:int(-22789))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16478), ldc:int(2334)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(6078), ldc:int(1323)), xor:int(ldc:int(6135), ldc:int(4769))))
        storeelement:String(expr_154:String[], and:int(ldc:int(12321), ldc:int(305)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4054), ldc:int(17758)), xor:int(ldc:int(19500), ldc:int(18853))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(22538), ldc:int(22570)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(21929), ldc:int(3483)), xor:int(ldc:int(4758), ldc:int(5932))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(96), ldc:int(67)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(3578), ldc:int(1466)), and:int(ldc:int(24042), ldc:int(1530))))
        storeelement:String(expr_154:String[], and:int(ldc:int(35), ldc:int(13666)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1530), ldc:int(11755)), and:int(ldc:int(1816), ldc:int(28189))))
        storeelement:String(expr_154:String[], and:int(ldc:int(327), ldc:int(23573)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2200), ldc:int(3712)), and:int(ldc:int(1632), ldc:int(1700))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(70), ldc:int(64)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(5928), ldc:int(18102)), and:int(ldc:int(9983), ldc:int(1835))))
        storeelement:String(expr_154:String[], and:int(ldc:int(18506), ldc:int(5133)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-14806), ldc:int(-16383)), and:int(ldc:int(1854), ldc:int(1719))))
        storeelement:String(expr_154:String[], and:int(ldc:int(8499), ldc:int(4627)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(13825), ldc:int(12343)), xor:int(ldc:int(2383), ldc:int(3955))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16987), ldc:int(9649)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1663), ldc:int(16316)), xor:int(ldc:int(-32111), ldc:int(-31570))))
        storeelement:String(expr_154:String[], and:int(ldc:int(2226), ldc:int(527)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-31724), ldc:int(-32213)), xor:int(ldc:int(-30157), ldc:int(-29584))))
        storeelement:String(expr_154:String[], and:int(ldc:int(183), ldc:int(16647)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(3070), ldc:int(3517)), and:int(ldc:int(9817), ldc:int(5993))))
        storeelement:String(expr_154:String[], and:int(ldc:int(6), ldc:int(4756)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(9891), ldc:int(8426)), xor:int(ldc:int(641), ldc:int(1235))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(17), ldc:int(16)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1658), ldc:int(18390)), xor:int(ldc:int(1500), ldc:int(896))))
        storeelement:String(expr_154:String[], and:int(ldc:int(3390), ldc:int(8341)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1660), ldc:int(26460)), and:int(ldc:int(9829), ldc:int(3687))))
        storeelement:String(expr_154:String[], and:int(ldc:int(604), ldc:int(3244)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(18293), ldc:int(3687)), and:int(ldc:int(5740), ldc:int(26221))))
        storeelement:String(expr_154:String[], and:int(ldc:int(2571), ldc:int(5337)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(8847), ldc:int(9443)), and:int(ldc:int(24182), ldc:int(9842))))
        storeelement:String(expr_154:String[], and:int(ldc:int(56), ldc:int(1496)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(9796), ldc:int(8246)), xor:int(ldc:int(-31207), ldc:int(-32667))))
        storeelement:String(expr_154:String[], and:int(ldc:int(2746), ldc:int(338)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32200), ldc:int(-31676)), xor:int(ldc:int(-23322), ldc:int(-23961))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(10278), ldc:int(10294)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(13977), ldc:int(3811)), and:int(ldc:int(18142), ldc:int(3751))))
        storeelement:String(expr_154:String[], and:int(ldc:int(3347), ldc:int(-3540)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-26289), ldc:int(-24631)), xor:int(ldc:int(-16112), ldc:int(-14464))))
        storeelement:String(expr_154:String[], and:int(ldc:int(47), ldc:int(4126)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(11928), ldc:int(18068)), and:int(ldc:int(1719), ldc:int(1683))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16426), ldc:int(4187)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(3439), ldc:int(3068)), and:int(ldc:int(1791), ldc:int(3997))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(260), ldc:int(271)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(20157), ldc:int(1949)), xor:int(ldc:int(217), ldc:int(1656))))
        storeelement:String(expr_154:String[], and:int(ldc:int(670), ldc:int(16438)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(642), ldc:int(1059)), and:int(ldc:int(5799), ldc:int(3751))))
        storeelement:String(expr_154:String[], and:int(ldc:int(5271), ldc:int(639)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1959), ldc:int(20215)), and:int(ldc:int(18111), ldc:int(3766))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-15804), ldc:int(-15799)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-14455), ldc:int(-16065)), and:int(ldc:int(18367), ldc:int(9980))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(8320), ldc:int(8341)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(17011), ldc:int(17615)), and:int(ldc:int(18123), ldc:int(4047))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(1100), ldc:int(1091)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(7919), ldc:int(1739)), and:int(ldc:int(26579), ldc:int(1746))))
        putstatic:String[](\u839e\ubf56\ubded\ua3b4\u3e2a::\uc9f6\ub1b9\u76bc\u983f\u9033\u0a06, expr_154:String[])
        var_3_79D = expr_14A:String[]
        putstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\ud217\uc84e\ube23\uc238\uc84e\u62da, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_79D:String[], xor:int(ldc:int(8262), ldc:int(8304))))))
        putstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u7049\u718f\u47c2\ub102\u0c95\u4f4a, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_79D:String[], and:int(ldc:int(575), ldc:int(4215))))))
        putstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_79D:String[], xor:int(ldc:int(-32725), ldc:int(-32749))))))
        putstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u47c2\ucef1\u59ec\ud158\u4179\u0c95, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_79D:String[], and:int(ldc:int(17081), ldc:int(61))))))
        putstatic:SimpleCommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u4cd9\u8aa5\u3a62\uc7fe\u5fe1\u8c8a, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_79D:String[], xor:int(ldc:int(19755), ldc:int(19729))))))
        putstatic:Dynamic2CommandExceptionType(\u839e\ubf56\ubded\ua3b4\u3e2a::\u8aa5\uafe7\u6fb0\u6435\ufcaf\u92ee, initobject:Dynamic2CommandExceptionType(Dynamic2CommandExceptionType::<init>, invokedynamic:Dynamic2CommandExceptionType$Function(apply:()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType$Function;)))
    }
    
    public void \u34df\u62da\u7bad\u92ee\u8258\u9af2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_684 = and:int(ldc:int(-1828354998), ldc:int(-1345007713))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\ubf56\ubded\ua3b4\u3e2a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-1558786305))
            var_5_81 = and:int(ldc:int(-15751), ldc:int(14726))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24298), ldc:int(23272)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_684:int, ldc:int(-1954222789))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(226), ldc:int(227)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(17680), ldc:int(17681)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_D1:int, ldc:int(-949621185))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16417), ldc:int(129)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(477834076))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(866269456))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1261766596))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1760637237))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2043600194))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-423033877))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1294935912))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1309703329))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-2023236102))
                            var_11_E2 = and:int(ldc:int(16624), ldc:int(-16631))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1571534730))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-820711267))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-20550849))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-608031962))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1301606228))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(376389698))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-487281297))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1286687505))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1879717050))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-92116))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1216807769))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-946864902))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1632962794))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1427943896))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1177824776))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1193273665))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-813373494))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4097), ldc:int(4096))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1319043766))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1342393309))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-135612881))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-623933081))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-2131787869))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1688095895))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-482376210))
                        var_11_E2 = and:int(ldc:int(19013), ldc:int(-19270))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1603477031))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1628021575))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-140744270))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1319277928))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1396175107))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-739449317))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(836142663))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1551604646))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1855841307))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1624810324))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-274293702))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1040096763))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(752464028))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2121775647))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2114152465))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(482707070))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-743129590))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1094234093))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1215094820))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1870064591))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1208105894))
                        var_17_68F = add:int(var_16_110:int, and:int(ldc:int(3591), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-1277254197))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, xor:int(ldc:int(528), ldc:int(529))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
