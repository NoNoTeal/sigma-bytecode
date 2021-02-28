public class \u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a {
    public void \ub102\uc9f6\u8aa5\ubff1\u4179\u527a(java.nio.file.Path p0, java.nio.file.Path p1, com.mojang.datafixers.DataFixer p2) {
        var_6_BF : IOException
        
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
            invokespecial:Object(Object::<init>, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a)
            putfield:DataFixer(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ub32d\u494c\ubff1\u36d3\uf995\u12b2, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p2:DataFixer)
            
            try {
                invokestatic:Path(Files::createDirectories, ternaryop:Path(invokestatic:boolean(Files::exists, p0:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-11982), ldc:int(1613)))), invokeinterface:Path(Path::toRealPath, p0:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-15980), ldc:int(14890)))), p0:Path), newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(-22890), ldc:int(22633))))
            }
            catch (java.io.IOException var_6_BF) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, var_6_BF:IOException[expected:Throwable]))
            }
            
            putfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p0:Path)
            putfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u4bc8\u156b\u4d85\u5f50\u51fa\u4bc8, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p1:Path)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a \u446c\u8d98\uc7fe\u4c2b\u8258\u4f4a(java.nio.file.Path p0) {
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
            return:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(initobject:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::<init>, p0:Path, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(830), ldc:int(-831)))), invokestatic:DataFixer(\ud4fe\u67e9\u69d9\ud36e\u3504\u5245::\u12cb\u6cfe\u965f\u34df\ub18d\u7bad)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b, com.mojang.serialization.Lifecycle> \u71ae\u960f\u7873\u416d\u7bad\u416d(com.mojang.serialization.Dynamic<T> p0, com.mojang.datafixers.DataFixer p1, int p2) {
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
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64(com.mojang.serialization.Dynamic<?> p0) {
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
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(checkcast:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf.class, invokevirtual:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(Optional<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>::orElse, invokevirtual:Optional(DataResult::resultOrPartial, invokeinterface:DataResult(Codec::parse, getstatic:Codec<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8350\u8d90\uc3e3\u120d\u76bc\u7d52), p0:Dynamic<?>), invokedynamic:Consumer<String>(accept:(Lorg/apache/logging/log4j/Logger;)Ljava/util/function/Consumer;, getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033))), getstatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8308\u4e72\u5f50\u9937\u3c25\u7bad))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d> \u8aa5\u839e\u8308\u3d64\ub83f\uf9c5() {
        var_1_61 : int
        var_1_6F : int
        var_1_80 : int
        var_3_112 : ArrayList
        var_1_118 : int
        var_4_125 : File[]
        var_1_12C : int
        var_5_12F : File[]
        var_6_134 : int
        var_7_13D : int
        var_1_144 : int
        var_8_157 : File
        var_9_169 : boolean
        var_10_172 : Exception
        var_10_1A3 : \u527a\ucfaf\u34df\u4e72\u5fe1\u873d
        
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
        var_1_61 = and:int(ldc:int(1185503534), ldc:int(-854993858))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                var_1_6F = and:int(var_1_61:int, ldc:int(439167216))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(524288)), ldc:int(0))) {
                var_1_80 = and:int(var_1_61:int, ldc:int(-2078617275))
            }
            else {
                var_1_80 = and:int(var_1_61:int, ldc:int(-1003782420))
                
                if (invokestatic:boolean(Files::isDirectory, getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a), newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(21018), ldc:int(-21275))))) {
                    var_3_112 = invokestatic:ArrayList(Lists::newArrayList)
                    var_1_118 = and:int(var_1_80:int, ldc:int(1484347068))
                    var_4_125 = invokevirtual:File[](File::listFiles, invokeinterface:File(Path::toFile, getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a)))
                    var_1_12C = and:int(var_1_118:int, ldc:int(1108078636))
                    var_5_12F = var_4_125:File[]
                    var_6_134 = arraylength:int(var_5_12F:File[])
                    var_7_13D = and:int(ldc:int(-28583), ldc:int(28578))
                    
                    loop {
                        var_1_144 = and:int(var_1_12C:int, ldc:int(-80742545))
                        
                        if (cmpge:boolean(var_7_13D:int, var_6_134:int)) {
                            looporswitchbreak()
                        }
                        
                        var_1_12C = and:int(var_1_144:int, ldc:int(-276204945))
                        var_8_157 = loadelement:File(var_5_12F:File[], var_7_13D:int)
                        
                        if (invokevirtual:boolean(File::isDirectory, var_8_157:File)) {
                            try {
                                var_9_169 = invokestatic:boolean(\ub7dc\u64f2\u385b\ud171\u760c::\u527a\u516c\u1187\u927d\u40a9\u5f50, invokevirtual:Path(File::toPath, var_8_157:File))
                            }
                            catch (java.lang.Exception var_10_172) {
                                invokeinterface:void(Logger::warn, getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033), loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(16387), ldc:int(16391))), var_8_157:File[expected:Object], var_10_172:Exception[expected:Object])
                                goto(Label_0435)
                            }
                            
                            var_10_1A3 = checkcast:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d.class, invokespecial:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ua61f\u8df4\u7d52\u8640\u873d\u93a2, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, var_8_157:File, invokespecial:BiFunction<File, DataFixer, \u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u98a4\u64f2\uff55\u9af2\u6c52\ubf56, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, var_8_157:File, var_9_169:boolean)))
                            
                            if (cmpne:boolean(var_10_1A3:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d, aconstnull:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d())) {
                                invokeinterface:boolean(List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>::add, var_3_112:ArrayList<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>[expected:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>], var_10_1A3:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d)
                            }
                        }
                        
                        Label_0435:
                        inc:int(var_7_13D, ldc:int(1))
                    }
                    
                    return:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(var_3_112:ArrayList<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>)
                }
            }
            
            Label_0158:
            
            if (cmpne:boolean(and:int(var_1_80:int, ldc:int(262144)), ldc:int(0))) {
                var_1_6F = and:int(var_1_80:int, ldc:int(-736194573))
            }
            else {
                if (cmpne:boolean(and:int(var_1_80:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_80:int, ldc:int(-1138850502))
                    loopcontinue()
                }
                
                var_1_6F = and:int(var_1_80:int, ldc:int(2057920126))
            }
            
            Label_0198:
            
            if (cmpne:boolean(and:int(var_1_6F:int, ldc:int(32768)), ldc:int(0))) {
                var_1_80 = and:int(var_1_6F:int, ldc:int(565796887))
                goto(Label_0158)
            }
            
            if (cmpne:boolean(and:int(var_1_6F:int, ldc:int(65536)), ldc:int(0))) {
                athrow(initobject:\u6c52\u836c\u3bd6\ub8be\u3c25\u97e6(\u6c52\u836c\u3bd6\ub8be\u3c25\u97e6::<init>, invokevirtual:String(ITextComponent::getString, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(512), ldc:int(515)))))))
            }
            
            var_1_61 = and:int(var_1_6F:int, ldc:int(967347918))
        }
    }
    
    private int \u1187\ud51e\u67d0\u4e72\u40a9\uff55() {
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
            return:int(and:int(ldc:int(31485), ldc:int(19133)))
        }
        
        goto(Label_0006)
    }
    
    private T \ua61f\u8df4\u7d52\u8640\u873d\u93a2(java.io.File p0, java.util.function.BiFunction<java.io.File, com.mojang.datafixers.DataFixer, T> p1) {
        var_3_61 : int
        var_3_C4 : int
        var_5_82 : File
        var_6_E2 : T
        var_5_AD : File
        stack_10C_0 : T [generated]
        
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
        var_3_61 = and:int(ldc:int(-1239589813), ldc:int(861394143))
        
        if (invokevirtual:boolean(File::exists, p0:File)) {
            var_3_C4 = and:int(var_3_61:int, ldc:int(2041968077))
            var_5_82 = initobject:File(File::<init>, p0:File, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(18485), ldc:int(8327))))
            
            if (invokevirtual:boolean(File::exists, var_5_82:File)) {
                var_6_E2 = invokeinterface:T(BiFunction<File, DataFixer, T>::apply, p1:BiFunction<File, DataFixer, T>, var_5_82:File, getfield:DataFixer(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ub32d\u494c\ubff1\u36d3\uf995\u12b2, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
                
                if (cmpne:boolean(var_6_E2:T, aconstnull:T())) {
                    return:T(var_6_E2:T)
                }
            }
            
            do {
                if (cmpeq:boolean(and:int(var_3_C4:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_C4 = and:int(var_3_C4:int, ldc:int(-1751130389))
                    var_5_AD = initobject:File(File::<init>, p0:File, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(19470), ldc:int(326))))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_5_AD:File))) {
                        loopcontinue()
                    }
                    
                    stack_10C_0 = invokeinterface:T(BiFunction<File, DataFixer, T>::apply, p1:BiFunction<File, DataFixer, T>, var_5_AD:File, getfield:DataFixer(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ub32d\u494c\ubff1\u36d3\uf995\u12b2, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
                    return:T(stack_10C_0:T)
                }
            } while (cmpne:boolean(and:int(var_3_C4:int, ldc:int(16777216)), ldc:int(0)))
            
            var_3_C4 = and:int(var_3_C4:int, ldc:int(1362583537))
            stack_10C_0 = aconstnull:T()
            return:T(stack_10C_0:T)
        }
        
        return:T(aconstnull:T())
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \ua3b4\uae5d\u71f1\ua562\u5bc4\u71ae(java.io.File p0, com.mojang.datafixers.DataFixer p1) {
        var_2_61 : int
        var_4_6C : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_84 : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_124_0 : int [generated]
        var_6_124 : int
        var_7_14E : Dynamic
        stack_180_0 : \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf [generated]
        var_4_185 : Exception
        
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
        var_2_61 = and:int(ldc:int(-1642539185), ldc:int(-1371671177))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1078011923))
            var_4_6C = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, p0:File)
            var_2_61 = and:int(var_2_61:int, ldc:int(-1944199345))
            var_5_84 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_4_6C:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(17458), ldc:int(17461))))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(520160523))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1134633633))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_5_84:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(3587), ldc:int(3595))))
                }
                
                Label_0181:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1153072233))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(2025129856))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1887897745))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_5_84:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(4356), ldc:int(4365))), ldc:int(99)))) {
                        stack_124_0 = ldc:int(-1)
                        looporswitchbreak()
                    }
                }
                
                Label_0242:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0181)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-830866083))
                    stack_124_0 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_5_84:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(20501), ldc:int(20508))))
                    looporswitchbreak()
                }
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1392640161))
            var_6_124 = stack_124_0:int
            var_2_61 = and:int(var_2_61:int, ldc:int(-8847507))
            var_7_14E = invokeinterface:Dynamic(DataFixer::update, p1:DataFixer, invokevirtual:DSL$TypeReference(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\u12cb\ua3b4\u5245\u6d99\u3d4b\u4c04, getstatic:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\uc31c\u071d\u416d\ud523\u965f\u12b2)), initobject:Dynamic(Dynamic::<init>, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), var_5_84:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]), var_6_124:int, invokeinterface:int(GameVersion::getWorldVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            var_2_61 = and:int(var_2_61:int, ldc:int(-1130496513))
            stack_180_0 = checkcast:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf.class, invokevirtual:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(Optional<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>::orElse, invokevirtual:Optional<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(Optional<Object>::map, invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_7_14E:Dynamic, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(4618), ldc:int(222))))), invokedynamic:Function<Dynamic, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(apply:()Ljava/util/function/Function;)), getstatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8308\u4e72\u5f50\u9937\u3c25\u7bad)))
            var_2_61 = and:int(var_2_61:int, ldc:int(-25625267))
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(stack_180_0:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf)
        }
        catch (java.lang.Exception var_4_185) {
            invokeinterface:void(Logger::error, getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033), loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(2314), ldc:int(2305))), p0:File[expected:Object], var_4_185:Exception[expected:Object])
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(aconstnull:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf())
        }
    }
    
    private static java.util.function.BiFunction<java.io.File, com.mojang.datafixers.DataFixer, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ua6bd\ud523\u416d\u97b7\ub7dc\u9255> \u97b7\ua562\u6b0d\u946b\u8d90\u983f(com.mojang.serialization.DynamicOps<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p0, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p1) {
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
    
    private java.util.function.BiFunction<java.io.File, com.mojang.datafixers.DataFixer, \u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d> \u98a4\u64f2\uff55\u9af2\u6c52\ubf56(java.io.File p0, boolean p1) {
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
    
    public boolean \u4cd9\u6fb0\u62da\ud36e\u9a18\u51fa(java.lang.String p0) {
        var_2_61 : int
        var_4_72 : Path
        stack_E2_0 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(1180541377), ldc:int(1918188414))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(-899828885))
            var_4_72 = invokeinterface:Path(Path::resolve, getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a), p0:String)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0182)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(2147319112))
                    invokestatic:Path(Files::createDirectory, var_4_72:Path, newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(22708), ldc:int(-22781))))
                }
                
                Label_0154:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-404783129))
                    invokestatic:boolean(Files::deleteIfExists, var_4_72:Path)
                }
                
                Label_0182:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0154)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1689451455))
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(2055206724))
            stack_E2_0 = xor:int(ldc:int(-30576), ldc:int(-30575))
            var_2_61 = and:int(var_2_61:int, ldc:int(-69747255))
            return:boolean(stack_E2_0:int)
        }
        catch (java.io.IOException var_4_E7) {
            return:boolean(and:int[expected:boolean](ldc:int(9970), ldc:int(-14067)))
        }
    }
    
    public boolean \u4f52\ubb2b\u4179\uc84e\ud523\u7330(java.lang.String p0) {
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
            return:boolean(invokestatic:boolean(Files::isDirectory, invokeinterface:Path(Path::resolve, getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a), p0:String), newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-9120), ldc:int(9119)))))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.Path \u8709\u8bb0\uae87\u839e\uc31c\u8aa5() {
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
            return:Path(getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.Path \u51b2\u52d3\u446c\u4ab3\ubff1\u8d90() {
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
            return:Path(getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u4bc8\u156b\u4d85\u5f50\u51fa\u4bc8, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be \ua6bd\uc229\u718f\u36d3\ua562\u4179(java.lang.String p0) {
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
            return:\uae87\ub19c\u9937\u836c\u34df\ub8be(initobject:\uae87\ub19c\u9937\u836c\u34df\ub8be(\uae87\ub19c\u9937\u836c\u34df\ub8be::<init>, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p0:String))
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d lambda$\u62da\u8308\ub19c\uc2bd\ubcb0\u7af6$5(java.io.File p0, boolean p1, java.io.File p2, com.mojang.datafixers.DataFixer p3) {
        var_5_63 : int
        var_7_71 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_8B : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_161_0 : int [generated]
        var_9_161 : int
        var_10_18E : Dynamic
        var_11_19D : \ud523\u6198\u5db4\uc9f6\ub6ab\u4975
        var_12_1AC : int
        stack_35C_0 : int [generated]
        var_13_35C : int
        var_14_379 : File
        var_15_3A7 : \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf
        var_16_3B8 : \ubded\u9033\u5654\u6198\uc29a\uc910
        expr_3C2 : \u527a\ucfaf\u34df\u4e72\u5fe1\u873d [generated]
        var_7_3E3 : Exception
        
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
        var_5_63 = and:int(ldc:int(1356595857), ldc:int(431665947))
        
        try {
            var_5_63 = and:int(var_5_63:int, ldc:int(905699581))
            var_7_71 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, p2:File)
            var_5_63 = and:int(var_5_63:int, ldc:int(496808637))
            var_8_8B = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_7_71:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(-12283), ldc:int(-12286))))
            
            loop {
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(1048576)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-340473703))
                    goto(Label_0273)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(4096)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(578221675))
                }
                else {
                    var_5_63 = and:int(var_5_63:int, ldc:int(2145008531))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_8_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(8329), ldc:int(2604))))
                }
                
                Label_0204:
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(4096)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-1610061961))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_63:int, ldc:int(67108864)), ldc:int(0))) {
                        var_5_63 = and:int(var_5_63:int, ldc:int(325504608))
                        loopcontinue()
                    }
                    
                    var_5_63 = and:int(var_5_63:int, ldc:int(-205979529))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_8_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(-28635), ldc:int(-28628))), ldc:int(99)))) {
                        stack_161_0 = ldc:int(-1)
                        looporswitchbreak()
                    }
                }
                
                Label_0273:
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(268435456)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(540591023))
                    goto(Label_0204)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(16)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(364686747))
                    stack_161_0 = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_8_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(24580), ldc:int(24589))))
                    looporswitchbreak()
                }
                
                var_5_63 = and:int(var_5_63:int, ldc:int(1917742888))
            }
            
            var_5_63 = and:int(var_5_63:int, ldc:int(431598875))
            var_9_161 = stack_161_0:int
            var_5_63 = and:int(var_5_63:int, ldc:int(-23371693))
            var_10_18E = invokeinterface:Dynamic(DataFixer::update, p3:DataFixer, invokevirtual:DSL$TypeReference(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\u12cb\ua3b4\u5245\u6d99\u3d4b\u4c04, getstatic:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\uc31c\u071d\u416d\ud523\u965f\u12b2)), initobject:Dynamic(Dynamic::<init>, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), var_8_8B:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]), var_9_161:int, invokeinterface:int(GameVersion::getWorldVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            var_5_63 = and:int(var_5_63:int, ldc:int(-1174731303))
            var_11_19D = invokestatic:\ud523\u6198\u5db4\uc9f6\ub6ab\u4975(\ud523\u6198\u5db4\uc9f6\ub6ab\u4975::\u3c25\u7d52\ua068\uc229\u0c95\u3711, var_10_18E:Dynamic<?>)
            var_5_63 = and:int(var_5_63:int, ldc:int(-136798829))
            var_12_1AC = invokevirtual:int(\ud523\u6198\u5db4\uc9f6\ub6ab\u4975::\u385b\u7e3f\u97b7\u4ab3\u760c\ud217, var_11_19D:\ud523\u6198\u5db4\uc9f6\ub6ab\u4975)
            
            loop {
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-788256619))
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-1167306076))
                    goto(Label_0674)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-519939144))
                    goto(Label_0608)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1539197533))
                    
                    if (cmpeq:boolean(var_12_1AC:int, and:int(ldc:int(19132), ldc:int(24510)))) {
                        goto(Label_0756)
                    }
                }
                
                Label_0519:
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(8)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1810455625))
                    goto(Label_0674)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1467607148))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_63:int, ldc:int(16384)), ldc:int(0))) {
                        var_5_63 = and:int(var_5_63:int, ldc:int(2082909081))
                        loopcontinue()
                    }
                    
                    var_5_63 = and:int(var_5_63:int, ldc:int(1457469297))
                    
                    if (cmpeq:boolean(var_12_1AC:int, xor:int(ldc:int(2376), ldc:int(17397)))) {
                        goto(Label_0756)
                    }
                }
                
                Label_0608:
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(524288)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-1653101636))
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(268435456)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-462705507))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_63:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0519)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_63:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_63 = and:int(var_5_63:int, ldc:int(-627322669))
                }
                
                Label_0674:
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(851344601))
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1254246689))
                    goto(Label_0608)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(16)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(423404162))
                    goto(Label_0519)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(1048576)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-1310946313))
                    return:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(aconstnull:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d())
                }
                
                loopcontinue()
                Label_0756:
                
                if (cmpeq:boolean(var_12_1AC:int, invokespecial:int(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u1187\ud51e\u67d0\u4e72\u40a9\uff55, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))) {
                    stack_35C_0 = and:int(ldc:int(8084), ldc:int(-8086))
                    looporswitchbreak()
                }
                
                Label_0765:
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(32)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-391785139))
                    goto(Label_0674)
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0608)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1908274359))
                    stack_35C_0 = and:int(ldc:int(16385), ldc:int(9505))
                    looporswitchbreak()
                }
                
                var_5_63 = and:int(var_5_63:int, ldc:int(-1189873515))
            }
            
            var_5_63 = and:int(var_5_63:int, ldc:int(2025648533))
            var_13_35C = stack_35C_0:int
            var_5_63 = and:int(var_5_63:int, ldc:int(318610713))
            var_14_379 = initobject:File(File::<init>, p0:File, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(-25595), ldc:int(-25591))))
            var_5_63 = and:int(var_5_63:int, ldc:int(1943598493))
            var_15_3A7 = checkcast:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf.class, invokevirtual:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(Optional<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>::orElse, invokevirtual:Optional<\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(Optional<Object>::map, invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_10_18E:Dynamic<?>, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(19466), ldc:int(8970))))), invokedynamic:Function<Dynamic, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(apply:()Ljava/util/function/Function;)), getstatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8308\u4e72\u5f50\u9937\u3c25\u7bad)))
            var_5_63 = and:int(var_5_63:int, ldc:int(922673275))
            var_16_3B8 = invokestatic:\ubded\u9033\u5654\u6198\uc29a\uc910(\ubded\u9033\u5654\u6198\uc29a\uc910::\u93a2\u4bc8\u6435\u8308\u6cfe\ub18d, var_10_18E:Dynamic<?>, var_15_3A7:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf)
            var_5_63 = and:int(var_5_63:int, ldc:int(-54879855))
            expr_3C2 = initobject:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::<init>, var_16_3B8:\ubded\u9033\u5654\u6198\uc29a\uc910, var_11_19D:\ud523\u6198\u5db4\uc9f6\ub6ab\u4975, invokevirtual:String(File::getName, p0:File), var_13_35C:boolean, p1:boolean, var_14_379:File)
            var_5_63 = and:int(var_5_63:int, ldc:int(-1845873609))
            return:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(expr_3C2:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d)
        }
        catch (java.lang.Exception var_7_3E3) {
            invokeinterface:void(Logger::error, getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033), loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(8236), ldc:int(8231))), p2:File[expected:Object], var_7_3E3:Exception[expected:Object])
            return:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(aconstnull:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d())
        }
    }
    
    private static \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ua6bd\ud523\u416d\u97b7\ub7dc\u9255 lambda$\u69d9\u8753\u600f\u6b0d\u12cb\u516c$4(com.mojang.serialization.DynamicOps p0, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p1, java.io.File p2, com.mojang.datafixers.DataFixer p3) {
        var_4_63 : int
        var_6_71 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_8B : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_E7_0 : \uc31c\uc87f\uc246\u3776\ub7dc [generated]
        var_8_E7 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_9_126 : int
        var_10_148 : Dynamic
        var_11_152 : Pair<\u7043\u40a9\u4975\u0800\u385b, Lifecycle>
        var_6_186 : Exception
        
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
        var_4_63 = and:int(ldc:int(-2035851293), ldc:int(-674922612))
        
        try {
            var_4_63 = and:int(var_4_63:int, ldc:int(-1286122616))
            var_6_71 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, p2:File)
            var_4_63 = and:int(var_4_63:int, ldc:int(-1099073653))
            var_7_8B = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_6_71:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(26959), ldc:int(7))))
            
            loop {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1492386846))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(4809), ldc:int(26650))), ldc:int(10)))) {
                        stack_E7_0 = aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1286973049))
                    stack_E7_0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(10637), ldc:int(24))))
                    looporswitchbreak()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-2125330915))
            }
            
            var_8_E7 = stack_E7_0:\uc31c\uc87f\uc246\u3776\ub7dc
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(1674), ldc:int(1666))))
            var_9_126 = ternaryop:int(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(73), ldc:int(25645))), ldc:int(99)), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(16395), ldc:int(12553)))), ldc:int(-1))
            var_10_148 = invokeinterface:Dynamic(DataFixer::update, p3:DataFixer, invokevirtual:DSL$TypeReference(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\u12cb\ua3b4\u5245\u6d99\u3d4b\u4c04, getstatic:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\uc31c\u071d\u416d\ud523\u965f\u12b2)), initobject:Dynamic(Dynamic::<init>, p0:DynamicOps, var_7_8B:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]), var_9_126:int, invokeinterface:int(GameVersion::getWorldVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            var_11_152 = invokestatic:Pair<\u7043\u40a9\u4975\u0800\u385b, Lifecycle>(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u71ae\u960f\u7873\u416d\u7bad\u416d, var_10_148:Dynamic, p3:DataFixer, var_9_126:int)
            return:\ua6bd\ud523\u416d\u97b7\ub7dc\u9255(invokestatic:\ua6bd\ud523\u416d\u97b7\ub7dc\u9255(\ua6bd\ud523\u416d\u97b7\ub7dc\u9255::\ub113\uc246\u6fb0\ub70c\u392e\ub7dc, var_10_148:Dynamic<\u93a2\u97b7\u647c\ud36e\u64ab>, p3:DataFixer, var_9_126:int, var_8_E7:\uc31c\uc87f\uc246\u3776\ub7dc, invokestatic:\ubded\u9033\u5654\u6198\uc29a\uc910(\ubded\u9033\u5654\u6198\uc29a\uc910::\u93a2\u4bc8\u6435\u8308\u6cfe\ub18d, var_10_148:Dynamic<\u93a2\u97b7\u647c\ud36e\u64ab>, p1:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf), invokestatic:\ud523\u6198\u5db4\uc9f6\ub6ab\u4975(\ud523\u6198\u5db4\uc9f6\ub6ab\u4975::\u3c25\u7d52\ua068\uc229\u0c95\u3711, var_10_148:Dynamic<\u93a2\u97b7\u647c\ud36e\u64ab>), checkcast:\u7043\u40a9\u4975\u0800\u385b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b.class, invokevirtual:Object(Pair::getFirst, var_11_152:Pair<\u7043\u40a9\u4975\u0800\u385b, Lifecycle>)), checkcast:Lifecycle(com.mojang.serialization.Lifecycle.class, invokevirtual:Object(Pair::getSecond, var_11_152:Pair<\u7043\u40a9\u4975\u0800\u385b, Lifecycle>))))
        }
        catch (java.lang.Exception var_6_186) {
            invokeinterface:void(Logger::error, getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033), loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(8779), ldc:int(5163))), p2:File[expected:Object], var_6_186:Exception[expected:Object])
            return:\ua6bd\ud523\u416d\u97b7\ub7dc\u9255(aconstnull:\ua6bd\ud523\u416d\u97b7\ub7dc\u9255())
        }
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b lambda$\uc87f\u8640\u98a4\ucef1\ub83f\u183a$3(com.mojang.serialization.Dynamic p0) {
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
    
    private static java.lang.IllegalStateException lambda$\uf995\u6d99\u5245\u64ab\ub7dc\ub6ab$2() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(600), ldc:int(4114)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.IllegalStateException lambda$\u9a18\u6d99\u960f\u5245\u6fb0\uafe7$1() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), xor:int(ldc:int(1027), ldc:int(1042)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.IllegalStateException lambda$\ud523\u3e75\u3d64\u3bc9\u4d85\u3dd3$0() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85), and:int(ldc:int(4115), ldc:int(50)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.nio.file.Path \u4492\u92ff\ub18d\uc229\u4975\ud523(\u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a p0) {
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
            return:Path(getfield:Path(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe, p0:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.datafixers.DataFixer \u88c5\u836c\u67e9\u760c\u3dd3\u8d98(\u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a p0) {
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
            return:DataFixer(getfield:DataFixer(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ub32d\u494c\ubff1\u36d3\uf995\u12b2, p0:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static int \u5d20\uc31c\u6d69\ubefe\uc31c\u88c5(\u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a p0) {
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
            return:int(invokespecial:int(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u1187\ud51e\u67d0\u4e72\u40a9\uff55, p0:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.function.BiFunction \ub18d\u9a18\u8aa5\u6b0d\u760c\ub7dc(\u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a p0, java.io.File p1, boolean p2) {
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
            return:BiFunction(invokespecial:BiFunction<File, DataFixer, \u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u98a4\u64f2\uff55\u9af2\u6c52\ubf56, p0:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p1:File, p2:boolean))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Object \u927d\u624e\u4daf\uc2bd\ub7dc\uf94d(\u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a p0, java.io.File p1, java.util.function.BiFunction p2) {
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
            return:Object(invokespecial:Object(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ua61f\u8df4\u7d52\u8640\u873d\u93a2, p0:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a, p1:File, p2:BiFunction<File, DataFixer, Object>))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.function.BiFunction \u8753\u3d4b\u960f\u4ab3\u718f\ua3b4(com.mojang.serialization.DynamicOps p0, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p1) {
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
            return:BiFunction(invokestatic:BiFunction<File, DataFixer, \ua6bd\ud523\u416d\u97b7\ub7dc\u9255>(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u97b7\ua562\u6b0d\u946b\u8d90\u983f, p0:DynamicOps, p1:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u0b8e\u4492\ufe34\u4ab3\u4bc8\ube23() {
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
            return:Logger(getstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033))
        }
        
        goto(Label_0006)
    }
    
    public static java.time.format.DateTimeFormatter \ua3b4\uc910\u7c6b\u3d64\u61a4\u8bb0() {
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
            return:DateTimeFormatter(getstatic:DateTimeFormatter(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u7d52\u494c\u6435\u8709\u4492\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u3bd6\u600f\u7043\u7006\u8753\uc2e8(java.io.File p0, com.mojang.datafixers.DataFixer p1) {
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
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(invokestatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ua3b4\uae5d\u71f1\ua562\u5bc4\u71ae, p0:File, p1:DataFixer))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_122_0 : byte[] [generated]
        stack_124_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_534_0 : byte[] [generated]
        stack_5BA_0 : byte[] [generated]
        stack_5F5_0 : byte[] [generated]
        stack_64B_0 : byte[] [generated]
        var_4_515 : int
        var_3_51A : byte[]
        var_5_51B : int
        var_0_54E : int
        expr_534 : byte [generated]
        stack_57D_2 : byte [generated]
        stack_551_0 : byte [generated]
        expr_B0 : int [generated]
        var_2_E7 : byte[]
        expr_EB : int [generated]
        var_3_5E3 : byte[]
        var_5_5E4 : int
        expr_124 : int [generated]
        var_3_639 : byte[]
        var_5_63A : int
        expr_64B : byte [generated]
        var_3_166 : String
        expr_16E : String[] [generated]
        expr_178 : String[] [generated]
        var_3_44A : String[]
        
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
        var_0_61 = and:int(ldc:int(641948768), ldc:int(1736395645))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_E7_0 = stack_E9_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_534_0 = stack_5BA_0 = stack_5F5_0 = stack_64B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GoqUZNzexOwKHCTK9Az4/lwC3NpipMoSLn5iChYE+voS/uQg6jbqHqo89hzYIPr09sI65vDySvzUGBQABiD86hx6APr2AAQIFhj+XALc2mKi1AwuoF4iCOoApAgcFPJoHP522PDM8nowJD6G3gZ++oAafHzs8hqEivQM+P5cAtzixBoMKCQ+ht4GfvqAGnh88AIEhuD86hx+CBAO/lwC3OLEGgwoJD6G3gZ++oAaZHD4BvqcmOj6/tJmHAYIqvYA9B5cAtzixBoMKCQ+ht4GhNqKMgDy8N5w5pAkCloa1swYNtoIIPzMzBYk3DzY6Pr+0mYcBgiq9gD0HlwC3NpiqKwwJnp8VKDyHuoOXLYCEgyIYs4AADToNqICHu7mXAb+tBjS+iA06DaiAh7u5lwG9I6SBOYunGz+4gLI4PI0+jYiEALs/uICyt7gDOoePv4o/hb+DP7iAti4BBjWEkr2IBT+AI7GEAQWdj4ICsyo+ODmAEzsqCgS6ABe/vAoDvbqHH4OHuAWfNjwHH4OHt6icPYGFGISBvr8ngLKAA7i6joAAiwA5gAUaOC6BgT+ODzk0tbS8u4=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_515 = expr_6E:int
        var_3_51A = newarray:byte[](byte.class, expr_6E:int)
        var_5_51B = expr_6E:int
        Label_1309:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_54E = and:int(var_0_61:int, ldc:int(-138150161))
            var_5_51B = add:int(var_5_51B:int, ldc:int(-1))
            expr_534 = stack_57D_2 = loadelement(stack_534_0, var_5_51B)
            
            if (cmplt:boolean(add:int(add:int(var_5_51B:int, ldc:int(5)), neg:int(var_4_515:int)), ldc:int(0))) {
                stack_57D_2 = stack_551_0 = add:byte(expr_534:byte, loadelement:byte(var_3_51A:byte[], add:int(var_5_51B:int, ldc:int(5))))
                goto(Label_1377)
            }
            
            Label_1345:
            
            if (cmpeq:boolean(and:int(var_0_54E:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_54E = and:int(var_0_54E:int, ldc:int(1996478705))
                stack_57D_2 = stack_551_0 = add:byte(expr_534:byte, ldc:byte(5))
            }
            
            Label_1377:
            
            if (cmpeq:boolean(and:int(var_0_54E:int, ldc:int(32)), ldc:int(0))) {
                var_0_54E = and:int(var_0_54E:int, ldc:int(-411070914))
                goto(Label_1345)
            }
            
            var_0_61 = and:int(var_0_54E:int, ldc:int(-1367778705))
            storeelement:byte(var_3_51A:byte[], var_5_51B:int, stack_57D_2:byte)
            
            if (cmpne:boolean(var_5_51B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_534_0 = stack_5BA_0 = stack_5F5_0 = stack_64B_0 = var_3_51A:byte[]
            goto(Label_0115)
        }
        
        Label_1443:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1727487989))
            var_5_51B = add:int(var_5_51B:int, ldc:int(-1))
            storeelement:byte(var_3_51A:byte[], var_5_51B:int, add:byte(loadelement:byte(stack_5BA_0:byte[], var_5_51B:int), ldc:byte(45)))
            
            if (cmpne:boolean(var_5_51B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_534_0 = stack_5BA_0 = stack_5F5_0 = stack_64B_0 = var_3_51A:byte[]
            goto(Label_0181)
        }
        
        goto(Label_1309)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-643709713))
            goto(Label_0297)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8192)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-976170611))
            goto(Label_0240)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-208554021))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1226183069))
            expr_B0 = arraylength:int(stack_B0_0:byte[])
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_4_515 = expr_B0:int
                var_3_51A = newarray:byte[](byte.class, expr_B0:int)
                var_5_51B = expr_B0:int
                goto(Label_1443)
            }
        }
        
        Label_0181:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1774179287))
            goto(Label_0297)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1621183877))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(578284647))
            var_2_E7 = stack_E7_0:byte[]
            expr_EB = add:int(arraylength:int(stack_E9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                var_3_5E3 = newarray:byte[](byte.class, expr_EB:int)
                var_5_5E4 = expr_EB:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1576977))
                    var_5_5E4 = add:int(var_5_5E4:int, ldc:int(-1))
                    storeelement:byte(var_3_5E3:byte[], var_5_5E4:int, add:int(shl:int(loadelement:byte(stack_5F5_0:byte[], var_5_5E4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_E7:byte[], add:int(var_5_5E4:int, and:int(ldc:int(6785), ldc:int(1065)))), ldc:int(5)), and:int(ldc:int(2311), ldc:int(21103)))))
                    
                    if (cmpne:boolean(var_5_5E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_534_0 = stack_5BA_0 = stack_5F5_0 = stack_64B_0 = var_3_5E3:byte[]
            }
        }
        
        Label_0240:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(219890709))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0181)
            }
            
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1428517))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(2062407935))
            expr_124 = arraylength:int(stack_124_0:byte[])
            
            if (cmpne:boolean(expr_124:int, ldc:int(0))) {
                var_3_639 = newarray:byte[](byte.class, expr_124:int)
                var_5_63A = expr_124:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1151898764))
                    var_5_63A = add:int(var_5_63A:int, ldc:int(-1))
                    expr_64B = loadelement:byte(stack_64B_0:byte[], var_5_63A:int)
                    storeelement:byte(var_3_639:byte[], var_5_63A:int, xor:int(or:int(and:int(shl:int(expr_64B:byte, xor:int(ldc:int(-32766), ldc:int(-32762))), ldc:int(-16)), and:int(shr:int(expr_64B:byte[expected:int], and:int(ldc:int(13383), ldc:int(16388))), ldc:int(15))), ldc:int(97)))
                    
                    if (cmpne:boolean(var_5_63A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_534_0 = stack_5BA_0 = stack_5F5_0 = stack_64B_0 = var_3_639:byte[]
            }
        }
        
        Label_0297:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8192)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(190960715))
            goto(Label_0240)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(2)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(104166063))
            goto(Label_0181)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_16E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1050), ldc:int(10266)))
            expr_178 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4370), ldc:int(4360)))
            storeelement:String(expr_178:String[], and:int(ldc:int(-5804), ldc:int(4651)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(-8416), ldc:int(8399)), and:int(ldc:int(1114), ldc:int(20526))))
            storeelement:String(expr_178:String[], and:int(ldc:int(12334), ldc:int(17423)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(25099), ldc:int(25089)), and:int(ldc:int(282), ldc:int(1114))))
            storeelement:String(expr_16E:String[], and:int(ldc:int(12991), ldc:int(25)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(16640), ldc:int(16666)), and:int(ldc:int(28788), ldc:int(1573))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(10272), ldc:int(10279)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(20997), ldc:int(21025)), xor:int(ldc:int(6181), ldc:int(6157))))
            storeelement:String(expr_178:String[], and:int(ldc:int(25290), ldc:int(282)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1192), ldc:int(12328)), and:int(ldc:int(9017), ldc:int(20723))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(9216), ldc:int(9225)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(8245), ldc:int(6257)), and:int(ldc:int(11452), ldc:int(318))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-16311), ldc:int(-16316)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(8245), ldc:int(8201)), and:int(ldc:int(605), ldc:int(5333))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(540), ldc:int(535)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(12375), ldc:int(2429)), xor:int(ldc:int(8709), ldc:int(8812))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(56), ldc:int(41)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(-31427), ldc:int(-31404)), and:int(ldc:int(2757), ldc:int(24751))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(1072), ldc:int(1058)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(14721), ldc:int(14596)), xor:int(ldc:int(1201), ldc:int(1044))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-32499), ldc:int(-32483)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1711), ldc:int(25013)), and:int(ldc:int(13518), ldc:int(2554))))
            storeelement:String(expr_178:String[], and:int(ldc:int(16396), ldc:int(261)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(4298), ldc:int(251)), xor:int(ldc:int(2417), ldc:int(2449))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(6159), ldc:int(6167)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(24802), ldc:int(1264)), and:int(ldc:int(1515), ldc:int(4347))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-28672), ldc:int(-28657)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(28689), ldc:int(28922)), and:int(ldc:int(2452), ldc:int(1796))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(4487), ldc:int(4495)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(326), ldc:int(24860)), xor:int(ldc:int(-32661), ldc:int(-32415))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(875), ldc:int(888)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(2318), ldc:int(5962)), and:int(ldc:int(404), ldc:int(8566))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-28536), ldc:int(-28535)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(5396), ldc:int(887)), xor:int(ldc:int(-31650), ldc:int(-31366))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(1), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(17189), ldc:int(446)), and:int(ldc:int(26102), ldc:int(2870))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(6436), ldc:int(6448)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(2870), ldc:int(5495)), and:int(ldc:int(20843), ldc:int(467))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(-22516), ldc:int(-22503)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(39), ldc:int(356)), and:int(ldc:int(3415), ldc:int(4467))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(17410), ldc:int(17428)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(4372), ldc:int(4167)), xor:int(ldc:int(-16236), ldc:int(-15881))))
            storeelement:String(expr_178:String[], and:int(ldc:int(9486), ldc:int(4109)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(2419), ldc:int(13671)), and:int(ldc:int(379), ldc:int(19307))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(16645), ldc:int(16658)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(5103), ldc:int(2411)), xor:int(ldc:int(17004), ldc:int(17388))))
            storeelement:String(expr_178:String[], and:int(ldc:int(141), ldc:int(17509)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(18832), ldc:int(8576)), and:int(ldc:int(8653), ldc:int(921))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-28671), ldc:int(-28665)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(20615), ldc:int(20750)), and:int(ldc:int(6647), ldc:int(16790))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-30574), ldc:int(-30575)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(16791), ldc:int(950)), xor:int(ldc:int(25004), ldc:int(24600))))
            putstatic:String[](\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8350\u6ec6\uf995\ub171\u3776\u4d85, expr_178:String[])
            var_3_44A = expr_16E:String[]
            putstatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8753\u56bd\u5140\u88c5\uc4d2\u9033, invokestatic:Logger(LogManager::getLogger))
            putstatic:DateTimeFormatter(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u7d52\u494c\u6435\u8709\u4492\u71f1, invokevirtual:DateTimeFormatter(DateTimeFormatterBuilder::toFormatter, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendLiteral, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendLiteral, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendLiteral, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendLiteral, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendLiteral, invokevirtual:DateTimeFormatterBuilder(DateTimeFormatterBuilder::appendValue, initobject:DateTimeFormatterBuilder(DateTimeFormatterBuilder::<init>), getstatic:ChronoField[expected:TemporalField](ChronoField::YEAR), and:int(ldc:int(204), ldc:int(17412)), ldc:int(10), getstatic:SignStyle(SignStyle::EXCEEDS_PAD)), ldc:char(45)), getstatic:ChronoField[expected:TemporalField](ChronoField::MONTH_OF_YEAR), and:int(ldc:int(2058), ldc:int(115))), ldc:char(45)), getstatic:ChronoField[expected:TemporalField](ChronoField::DAY_OF_MONTH), xor:int(ldc:int(4256), ldc:int(4258))), ldc:char(95)), getstatic:ChronoField[expected:TemporalField](ChronoField::HOUR_OF_DAY), and:int(ldc:int(24715), ldc:int(6754))), ldc:char(45)), getstatic:ChronoField[expected:TemporalField](ChronoField::MINUTE_OF_HOUR), xor:int(ldc:int(1408), ldc:int(1410))), ldc:char(45)), getstatic:ChronoField[expected:TemporalField](ChronoField::SECOND_OF_MINUTE), and:int(ldc:int(24582), ldc:int(4770)))))
            putstatic:ImmutableList<String>(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u8413\uc910\ub8be\u6ec6\u927d\ucef1, invokestatic:ImmutableList(ImmutableList::of, loadelement:String(var_3_44A:String[], xor:int(ldc:int(-31734), ldc:int(-31719))), loadelement:String(var_3_44A:String[], xor:int(ldc:int(-32504), ldc:int(-32484))), loadelement:String(var_3_44A:String[], and:int(ldc:int(309), ldc:int(28189))), loadelement:String(var_3_44A:String[], xor:int(ldc:int(68), ldc:int(82))), loadelement:String(var_3_44A:String[], and:int(ldc:int(19223), ldc:int(4255))), loadelement:String(var_3_44A:String[], and:int(ldc:int(3160), ldc:int(408))), loadelement:String(var_3_44A:String[], and:int(ldc:int(4665), ldc:int(8221)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u64f2\u7330\u9033\u6c56\ubff1\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(-774928789), ldc:int(1893649979))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-443831029))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(1425909559))
            var_5_8A = and:int(ldc:int(-25487), ldc:int(25484))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6578), ldc:int(-8127)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-1276123546))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(132), ldc:int(133)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(19968), ldc:int(19969)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(2062411563))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(17441), ldc:int(709)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2039680843))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-680567154))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2005478862))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2138839669))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(255303791))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1607020210))
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2107366931))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1456402219))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0631)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(64941906))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1067392857))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1909247151))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-694494258))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-765822869))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1553662369))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-893340044))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2027851643))
                        var_11_EB = and:int(ldc:int(-4779), ldc:int(4778))
                        goto(Label_1562)
                    }
                    
                    Label_0631:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2104938837))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-587357272))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1979620898))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-608319594))
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(660991247))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(680319092))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(299673135))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1609281189))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1535817779))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-833942472))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(824518112))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1640154147))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(516925367))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(6289), ldc:int(16641))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(289238269))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-447006632))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1884223493))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1005961560))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-711927594))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(536731171))
                        var_11_EB = and:int(ldc:int(-309), ldc:int(308))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2086148959))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1917115947))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1079937812))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-827354437))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(853313534))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(391611120))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(952326499))
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1603727742))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-45253135))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2146340587))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2064421749))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2033145886))
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1907613821))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1993868494))
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1124208717))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1500989010))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1660671002))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1219231522))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-321778207))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(869263207))
                        var_17_6A1 = add:int(var_16_119:int, xor:int(ldc:int(2696), ldc:int(2697)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1508691514))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, and:int(ldc:int(1609), ldc:int(2049))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
