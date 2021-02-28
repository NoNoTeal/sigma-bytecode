public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u5fe1\ub7dc\u67d0\ub113\u12cb {
    public void \u5fe1\ub7dc\u67d0\ub113\u12cb() {
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
            invokespecial:Object(Object::<init>, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)
            putfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb, invokestatic:ArrayList[expected:List<\u72f1\u873d\u965f\u9033\uc7fe>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u5fe1\ub7dc\u67d0\ub113\u12cb \ub6ab\u8df4\u3c25\u56bd\u7049\u9a18(int p0, float p1) {
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
            invokeinterface:boolean(List<\u72f1\u873d\u965f\u9033\uc7fe>::add, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb), initobject:\u72f1\u873d\u965f\u9033\uc7fe(\u72f1\u873d\u965f\u9033\uc7fe::<init>, p0:int, p1:float))
            invokespecial:void(\u5fe1\ub7dc\u67d0\ub113\u12cb::\u9af2\u3504\u6bb9\u8cae\u7873\u392e, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)
            return:\u5fe1\ub7dc\u67d0\ub113\u12cb(this:\u5fe1\ub7dc\u67d0\ub113\u12cb)
        }
        
        goto(Label_0006)
    }
    
    private void \u9af2\u3504\u6bb9\u8cae\u7873\u392e() {
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
    
    public float \u0b8e\u4c04\u52d3\uceb8\u5245\ub171(int p0) {
        var_2_5F : int
        var_2_70 : int
        var_4_81 : \u72f1\u873d\u965f\u9033\uc7fe
        var_5_A0 : \u72f1\u873d\u965f\u9033\uc7fe
        stack_D3_0 : int [generated]
        var_2_D2 : int
        var_6_D3 : int
        stack_F6_0 : int [generated]
        var_2_F5 : int
        var_7_F6 : int
        stack_118_0 : float [generated]
        var_2_129 : int
        var_8_118 : float
        var_9_11C : int
        var_10_161 : \u72f1\u873d\u965f\u9033\uc7fe
        
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
        var_2_5F = and:int(ldc:int(-1255659027), ldc:int(-1280739364))
        
        if (cmpgt:boolean(invokeinterface:int(List<E>::size, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)), ldc:int(0))) {
            var_2_70 = and:int(var_2_5F:int, ldc:int(494461949))
            var_4_81 = checkcast:\u72f1\u873d\u965f\u9033\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u72f1\u873d\u965f\u9033\uc7fe.class, invokeinterface:\u72f1\u873d\u965f\u9033\uc7fe(List<\u72f1\u873d\u965f\u9033\uc7fe>::get, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb), getfield:int(\u5fe1\ub7dc\u67d0\ub113\u12cb::\ua562\uc238\u836c\u7043\u7c6b\ud36e, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)))
            var_5_A0 = checkcast:\u72f1\u873d\u965f\u9033\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u72f1\u873d\u965f\u9033\uc7fe.class, invokeinterface:\u72f1\u873d\u965f\u9033\uc7fe(List<\u72f1\u873d\u965f\u9033\uc7fe>::get, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb), sub:int(invokeinterface:int(List<E>::size, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)), and:int(ldc:int(19461), ldc:int(8195)))))
            
            if (cmpge:boolean(p0:int, invokevirtual:int(\u72f1\u873d\u965f\u9033\uc7fe::\u51fa\ua068\ua562\u385b\u071d\u960f, var_4_81:\u72f1\u873d\u965f\u9033\uc7fe))) {
                var_2_70 = and:int(var_2_70:int, ldc:int(1002139844))
                stack_D3_0 = and:int(ldc:int(-8356), ldc:int(8355))
            }
            else {
                stack_D3_0 = and:int(ldc:int(16387), ldc:int(6849))
            }
            
            var_2_D2 = and:int(var_2_70:int, ldc:int(1572506067))
            var_6_D3 = stack_D3_0:int
            
            if (cmpeq:boolean(var_6_D3:int, ldc:int(0))) {
                var_2_D2 = and:int(var_2_D2:int, ldc:int(1374334917))
                stack_F6_0 = getfield:int(\u5fe1\ub7dc\u67d0\ub113\u12cb::\ua562\uc238\u836c\u7043\u7c6b\ud36e, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)
            }
            else {
                stack_F6_0 = and:int(ldc:int(3072), ldc:int(-3073))
            }
            
            var_2_F5 = and:int(var_2_D2:int, ldc:int(-608227136))
            var_7_F6 = stack_F6_0:int
            
            if (cmpeq:boolean(var_6_D3:int, ldc:int(0))) {
                var_2_F5 = and:int(var_2_F5:int, ldc:int(-210103353))
                stack_118_0 = invokevirtual:float(\u72f1\u873d\u965f\u9033\uc7fe::\u8258\uc31c\u9937\u5654\u4cd9\u6b5f, var_4_81:\u72f1\u873d\u965f\u9033\uc7fe)
            }
            else {
                stack_118_0 = invokevirtual:float(\u72f1\u873d\u965f\u9033\uc7fe::\u8258\uc31c\u9937\u5654\u4cd9\u6b5f, var_5_A0:\u72f1\u873d\u965f\u9033\uc7fe)
            }
            
            var_2_129 = and:int(var_2_F5:int, ldc:int(-784576259))
            var_8_118 = stack_118_0:float
            var_9_11C = var_7_F6:int
            
            loop {
                if (cmpne:boolean(and:int(var_2_129:int, ldc:int(128)), ldc:int(0))) {
                    var_2_129 = and:int(var_2_129:int, ldc:int(1970944454))
                    
                    if (cmplt:boolean(var_9_11C:int, invokeinterface:int(List<E>::size, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb)))) {
                        var_10_161 = checkcast:\u72f1\u873d\u965f\u9033\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u72f1\u873d\u965f\u9033\uc7fe.class, invokeinterface:\u72f1\u873d\u965f\u9033\uc7fe(List<\u72f1\u873d\u965f\u9033\uc7fe>::get, getfield:List<\u72f1\u873d\u965f\u9033\uc7fe>(\u5fe1\ub7dc\u67d0\ub113\u12cb::\uc246\u0c95\u9af2\u71ae\u99f7\ub102, this:\u5fe1\ub7dc\u67d0\ub113\u12cb), var_9_11C:int))
                        
                        if (cmple:boolean(invokevirtual:int(\u72f1\u873d\u965f\u9033\uc7fe::\u51fa\ua068\ua562\u385b\u071d\u960f, var_10_161:\u72f1\u873d\u965f\u9033\uc7fe), p0:int)) {
                            var_2_129 = and:int(var_2_129:int, ldc:int(-780302347))
                            putfield:int(\u5fe1\ub7dc\u67d0\ub113\u12cb::\ua562\uc238\u836c\u7043\u7c6b\ud36e, this:\u5fe1\ub7dc\u67d0\ub113\u12cb, var_9_11C:int)
                            var_8_118 = invokevirtual:float(\u72f1\u873d\u965f\u9033\uc7fe::\u8258\uc31c\u9937\u5654\u4cd9\u6b5f, var_10_161:\u72f1\u873d\u965f\u9033\uc7fe)
                            inc:int(var_9_11C, ldc:int(1))
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_129:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_129 = and:int(var_2_129:int, ldc:int(587095847))
            }
            
            return:float(var_8_118:float)
        }
        
        return:float(ldc:float(0.0f))
    }
    
    private static void lambda$\ud12e\u93a2\uc910\u1187\u8cae\ub171$0(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u72f1\u873d\u965f\u9033\uc7fe p1) {
        var_4_6E : \u72f1\u873d\u965f\u9033\uc7fe
        
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
            var_4_6E = checkcast:\u72f1\u873d\u965f\u9033\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u72f1\u873d\u965f\u9033\uc7fe.class, invokeinterface:Object[expected:\u72f1\u873d\u965f\u9033\uc7fe](Int2ObjectSortedMap::put, p0:Int2ObjectSortedMap, invokevirtual:int(\u72f1\u873d\u965f\u9033\uc7fe::\u51fa\ua068\ua562\u385b\u071d\u960f, p1:\u72f1\u873d\u965f\u9033\uc7fe), p1:\u72f1\u873d\u965f\u9033\uc7fe[expected:Object]))
            return:void()
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
    
    public void \u4975\u8640\u8350\u8d98\u8d90\ucb79(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(-1146428112), ldc:int(-36145412))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5fe1\ub7dc\u67d0\ub113\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1006431804))
            var_5_7D = and:int(ldc:int(26120), ldc:int(-26139))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14482), ldc:int(-14995)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FC:int, ldc:int(-14029379))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(269), ldc:int(268)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(1536), ldc:int(1537)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_CA:int, ldc:int(-76846026))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(6276), ldc:int(6277)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(307623561))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-806896447))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1997431072))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-909865864))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1024461186))
                    }
                    else {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-610537093))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1554128607))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1044907870))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(838868914))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-722967670))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-36835394))
                            var_11_DB = and:int(ldc:int(-1815), ldc:int(1814))
                            goto(Label_1417)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(596305783))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1202137960))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2114247254))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(127326969))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1895261495))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(47808465))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1569651251))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1965286161))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1687327557))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-930246045))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2027139440))
                        goto(Label_1028)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(347564821))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1301101290))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(994009210))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(4275), ldc:int(11845))
                                goto(Label_1028)
                            }
                        }
                    }
                    
                    Label_0877:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(706021018))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(66463290))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1691895847))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(692398851))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1069186295))
                        var_11_DB = and:int(ldc:int(-240), ldc:int(235))
                    }
                    
                    Label_1028:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1999965892))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1387356652))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1015335267))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(496820856))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1280)
                            }
                        }
                    }
                    
                    Label_1135:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1292751090))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(793731951))
                            goto(Label_1028)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1368357557))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-991632944))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-38125239))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1228115144))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-570429700))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1417)
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(663082731))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2043335536))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2093732144))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(396210138))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(74447732))
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-580126608))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1417:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1428:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(988204005))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1513283409))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1450453206))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1693812558))
                        var_17_607 = add:int(var_16_109:int, xor:int(ldc:int(20744), ldc:int(20745)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(1867340997))
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(-605522314))
                
                if (cmple:boolean(var_5_7D = var_17_607:int, sub:int(var_6_84:int, and:int(ldc:int(4609), ldc:int(24707))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
