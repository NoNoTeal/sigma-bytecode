public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\uc229\u983f\uf9c5\u836c {
    public void \u62da\uc229\u983f\uf9c5\u836c() {
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
            invokespecial:Object(Object::<init>, this:\u62da\uc229\u983f\uf9c5\u836c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u76bc\u7ce1\ud51e\uc9f6\u8413\u3bc9(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ucb79\uf94d\u98a4\ubcb0\u69d9\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3) {
        var_6_6B : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_7_81 : \ua61f\uae87\u6b5f\uc31c\ud12e
        stack_11D_1 : String [generated]
        expr_DD : Object[] [generated]
        
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
        var_6_6B = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (logicalnot:boolean(instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e.class, var_6_6B:\ub83f\uc9f6\u47c2\u67d0\u7ce1))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u62da\uc229\u983f\uf9c5\u836c::\u40a9\u5db4\u97b7\u8c8a\u392e\ud7e8)))
        }
        
        var_7_81 = checkcast:\ua61f\uae87\u6b5f\uc31c\ud12e(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e.class, var_6_6B:\ua61f\uae87\u6b5f\uc31c\ud12e)
        
        if (logicaland:boolean(cmpge:boolean(p2:int, ldc:int(0)), cmplt:boolean(p2:int, invokeinterface:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, var_7_81:\ua61f\uae87\u6b5f\uc31c\ud12e)))) {
            invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, var_7_81:\ua61f\uae87\u6b5f\uc31c\ud12e, p2:int, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            stack_11D_1 = loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(8201), ldc:int(488)))
            expr_DD = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17788), ldc:int(8709)))
            storeelement:Object(expr_DD:Object[], and:int(ldc:int(15516), ldc:int(-15774)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
            storeelement:Object(expr_DD:Object[], and:int(ldc:int(1061), ldc:int(7041)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
            storeelement:Object(expr_DD:Object[], xor:int(ldc:int(1225), ldc:int(1227)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
            storeelement:Object(expr_DD:Object[], and:int(ldc:int(2051), ldc:int(4131)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_11D_1:String, expr_DD:Object[]), xor:int[expected:boolean](ldc:int(24712), ldc:int(24713)))
            return:int(and:int(ldc:int(16781), ldc:int(6723)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u62da\uc229\u983f\uf9c5\u836c::\ud7e8\ube23\ub171\ua61f\u4bc8\u36d3), invokestatic:Integer[expected:Object](Integer::valueOf, p2:int)))
    }
    
    private static int \u0800\u74b1\u6fb0\u7c6b\u494c\ub18d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<? extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p1, int p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3) {
        var_4_17D : int
        var_6_6C : ArrayList
        var_7_74 : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        var_8_1D7 : \u7d52\u718f\u3776\u6fb0\ub83f
        stack_2B7_1 : String [generated]
        expr_28C : Object[] [generated]
        stack_1B9_1 : String [generated]
        expr_196 : Object[] [generated]
        
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
            var_4_17D = and:int(ldc:int(252507072), ldc:int(-42991669))
            var_6_6C = invokestatic:ArrayList(Lists::newArrayListWithCapacity, invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>))
            var_7_74 = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(494590109))
                    goto(Label_0337)
                }
                
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(1268770014))
                    goto(Label_0263)
                }
                
                if (cmpeq:boolean(and:int(var_4_17D:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(607765382))
                }
                else {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(536723369))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_74:Iterator)) {
                        var_8_1D7 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, var_7_74:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_8_1D7:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u839e\u8709\u8709\u71f1\u9a18\ud12e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72(\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_8_1D7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                        }
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(8)), ldc:int(0))) {
                                var_4_17D = and:int(var_4_17D:int, ldc:int(462798376))
                            }
                            else {
                                var_4_17D = and:int(var_4_17D:int, ldc:int(-838484090))
                                
                                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua3b4\ub83f\u6c52\u624e\u6d99\u7d52, var_8_1D7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p2:int, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                                    invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, var_6_6C:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>[expected:List<\u51fa\u6c52\u7330\u7330\u960f>], var_8_1D7:\u51fa\u6c52\u7330\u7330\u960f)
                                    
                                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_8_1D7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                        invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u839e\u8709\u8709\u71f1\u9a18\ud12e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72(\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_8_1D7:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                                    }
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_4_17D = and:int(var_4_17D:int, ldc:int(-1374308471))
                        loopcontinue()
                    }
                }
                
                Label_0196:
                
                if (cmpeq:boolean(and:int(var_4_17D:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0337)
                }
                
                if (cmpeq:boolean(and:int(var_4_17D:int, ldc:int(512)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(696537982))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_17D:int, ldc:int(8192)), ldc:int(0))) {
                        var_4_17D = and:int(var_4_17D:int, ldc:int(-412615217))
                        loopcontinue()
                    }
                    
                    var_4_17D = and:int(var_4_17D:int, ldc:int(-1882870840))
                    
                    if (invokeinterface:boolean(List::isEmpty, var_6_6C:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>)) {
                        athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u62da\uc229\u983f\uf9c5\u836c::\u6ec6\ua562\u6cfe\u7ce1\ucfaf\uf9c5), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokestatic:Integer[expected:Object](Integer::valueOf, p2:int)))
                    }
                }
                
                Label_0263:
                
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(2048)), ldc:int(0))) {
                        var_4_17D = and:int(var_4_17D:int, ldc:int(1745728199))
                        goto(Label_0196)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(8)), ldc:int(0))) {
                        var_4_17D = and:int(var_4_17D:int, ldc:int(562647005))
                        loopcontinue()
                    }
                    
                    var_4_17D = and:int(var_4_17D:int, ldc:int(-1631275075))
                    
                    if (cmpeq:boolean(invokeinterface:int(List<E>::size, var_6_6C:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>), xor:int(ldc:int(16770), ldc:int(16771)))) {
                        stack_2B7_1 = loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(17408), ldc:int(17417)))
                        expr_28C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4104), ldc:int(4106)))
                        storeelement:Object(expr_28C:Object[], and:int(ldc:int(10919), ldc:int(-10920)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(List<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, var_6_6C:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:List<\u7d52\u718f\u3776\u6fb0\ub83f>])))))
                        storeelement:Object(expr_28C:Object[], xor:int(ldc:int(768), ldc:int(769)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_2B7_1:String, expr_28C:Object[]), and:int[expected:boolean](ldc:int(4323), ldc:int(8193)))
                        looporswitchbreak()
                    }
                }
                
                Label_0337:
                
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(2)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(1367024561))
                    goto(Label_0263)
                }
                
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpne:boolean(and:int(var_4_17D:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_17D = and:int(var_4_17D:int, ldc:int(761200571))
                    stack_1B9_1 = loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(2052), ldc:int(2062)))
                    expr_196 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(5302), ldc:int(16906)))
                    storeelement:Object(expr_196:Object[], and:int(ldc:int(-8511), ldc:int(8254)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(List<E>::size, var_6_6C:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:List<\u7d52\u718f\u3776\u6fb0\ub83f>])))
                    storeelement:Object(expr_196:Object[], and:int(ldc:int(4147), ldc:int(19785)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1B9_1:String, expr_196:Object[]), and:int[expected:boolean](ldc:int(2075), ldc:int(8961)))
                    looporswitchbreak()
                }
            }
            
            return:int(invokeinterface:int(List<E>::size, var_6_6C:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc87f\u9af2\ub6ab\u6bb9\ud158\u3e2a$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u62da\uc229\u983f\uf9c5\u836c::\u0800\u74b1\u6fb0\u7c6b\u494c\ub18d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(544), ldc:int(551)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(131), ldc:int(128)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(5726), ldc:int(8197)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(13), ldc:int(24725)))), xor:int[expected:boolean](ldc:int(4100), ldc:int(4101)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc84e\u93a2\u6bb9\u93a2\u7af6\u97e6$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u62da\uc229\u983f\uf9c5\u836c::\u0800\u74b1\u6fb0\u7c6b\u494c\ub18d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(196), ldc:int(195)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(1667), ldc:int(83)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(665), ldc:int(669)))), and:int(ldc:int(26945), ldc:int(1069)), and:int[expected:boolean](ldc:int(-440), ldc:int(439)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u071d\u5245\u7bad\u6c52\u6b0d\u392e$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u62da\uc229\u983f\uf9c5\u836c::\ucb79\uf94d\u98a4\ubcb0\u69d9\ubefe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(528), ldc:int(530)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(5147), ldc:int(24579)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(4168), ldc:int(4172)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(18562), ldc:int(18567)))), and:int[expected:boolean](ldc:int(1229), ldc:int(18433)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u62da\uc229\u983f\uf9c5\u836c::\ucb79\uf94d\u98a4\ubcb0\u69d9\ubefe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(29697), ldc:int(29699)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(-7936), ldc:int(-7933)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), and:int(ldc:int(21), ldc:int(2596)))), and:int(ldc:int(28721), ldc:int(3)), and:int[expected:boolean](ldc:int(4908), ldc:int(-5933)))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5d20\u6bb9\ub113\u983f\u47c2\u718f$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(20642), ldc:int(586))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4$1(java.lang.Object p0, java.lang.Object p1) {
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(18465), ldc:int(18474)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-32764), ldc:int(-32762)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(13462), ldc:int(-13975)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(10754), ldc:int(10755)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
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
            stack_85_1 = loadelement:String(getstatic:String[](\u62da\uc229\u983f\uf9c5\u836c::\u7af6\u88c5\u51fa\u6c52\u9af2\uf995), xor:int(ldc:int(326), ldc:int(330)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1281), ldc:int(24825)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(21633), ldc:int(-21658)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CC : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6D7 : int
        
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
        var_3_6CC = and:int(ldc:int(561458752), ldc:int(-1477608862))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u62da\uc229\u983f\uf9c5\u836c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(603261528))
            var_5_81 = and:int(ldc:int(-1044), ldc:int(1043))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(23085), ldc:int(-23086)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6CC:int, ldc:int(-1216995352))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(17165), ldc:int(8321)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(13827), ldc:int(273)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6CC = and:int(var_3_D1:int, ldc:int(1937563507))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(10373), ldc:int(4171)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1616927782))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-594468548))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1635999908))
                    }
                    else {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1676095065))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(436146907))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1765281781))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(668119021))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(430794319))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1024478426))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-776761906))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-470861058))
                            var_11_E2 = and:int(ldc:int(-29318), ldc:int(29317))
                            goto(Label_1607)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-35786210))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1182822549))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(763244203))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1172982330))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1012757348))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(755619056))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-77210043))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-701857012))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1051608572))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-462829803))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1805044862))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-992895855))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1426635659))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-209757330))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1734679018))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1619545987))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2035657257))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1265480715))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-819643329))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1289345102))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2004856515))
                        var_11_E2 = and:int(ldc:int(-7421), ldc:int(6380))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(150939414))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1879196910))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1002852838))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1051376627))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-502549771))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1389344312))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1451458879))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1155856328))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(302620318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(324687288))
                            goto(Label_1128)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-992520218))
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(797965943))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1957150730))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-446126461))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1902940739))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(728722401))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1607)
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(100640158))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1665312776))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1647535330))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-208617610))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1975188146))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2036678743))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(184253043))
                        loopcontinue()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(-511861159))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1607:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D7 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1618:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(830445559))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-214227744))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1649724307))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-956611709))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(938344166))
                        var_17_6D7 = add:int(var_16_110:int, xor:int(ldc:int(17952), ldc:int(17953)))
                        looporswitchbreak()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(398080751))
                }
                
                var_3_6CC = and:int(var_3_6CC:int, ldc:int(-76555403))
                
                if (cmple:boolean(var_5_81 = var_17_6D7:int, sub:int(var_6_88:int, and:int(ldc:int(8609), ldc:int(2137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
