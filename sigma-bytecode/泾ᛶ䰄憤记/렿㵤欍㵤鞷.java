public abstract class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7<T> {
    public void \ub83f\u3d64\u6b0d\u3d64\u97b7(java.util.Properties p0) {
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
            invokespecial:Object(Object::<init>, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>)
            putfield:Properties(\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:Properties)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Properties \u8cae\uf9c5\u67e9\ua3b4\u8350\u5f50(java.nio.file.Path p0) {
        var_1_64 : int
        var_3_6C : Properties
        var_4_80 : InputStream
        var_5_83 : Throwable
        var_6_BD : Throwable
        var_8_E2 : Throwable
        
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
            var_1_64 = and:int(and:int(ldc:int(451957276), ldc:int(-554011715)), ldc:int(448225233))
            var_3_6C = initobject:Properties(Properties::<init>)
            
            try {
                var_1_64 = and:int(var_1_64:int, ldc:int(989551321))
                var_4_80 = invokestatic:InputStream(Files::newInputStream, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(4515), ldc:int(-4516))))
                var_5_83 = aconstnull:Throwable()
                
                try {
                    invokevirtual:void(Properties::load, var_3_6C:Properties, var_4_80:InputStream)
                }
                catch (java.lang.Throwable var_6_BD) {
                    var_5_83 = var_6_BD:Throwable
                    athrow(var_6_BD:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_4_80:InputStream, aconstnull:InputStream())) {
                        if (cmpne:boolean(var_5_83:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(InputStream::close, var_4_80:InputStream)
                            }
                            catch (java.lang.Throwable var_8_E2) {
                                invokevirtual:void(Throwable::addSuppressed, var_5_83:Throwable, var_8_E2:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(InputStream::close, var_4_80:InputStream)
                        }
                    }
                }
            }
            catch (java.io.IOException var_4_105) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ub83f\u3d64\u6b0d\u3d64\u97b7::\u36d3\u718f\u3bd6\ud158\u8cae\uc9f6), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Failed to load properties from file: ")), p0:Path[expected:Object])))
            }
            
            return:Properties(var_3_6C:Properties)
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\u6b0d\u9255\uc31c\u7ce1\u99f7(java.nio.file.Path p0) {
        var_2_5F : int
        var_4_73 : OutputStream
        var_5_76 : Throwable
        var_6_B5 : Throwable
        var_8_DA : Throwable
        
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
            var_2_5F = and:int(ldc:int(748284659), ldc:int(-1498387302))
            
            try {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1247949678))
                var_4_73 = invokestatic:OutputStream(Files::newOutputStream, p0:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(9475), ldc:int(-13700))))
                var_5_76 = aconstnull:Throwable()
                
                try {
                    invokevirtual:void(Properties::store, getfield:Properties(\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>), var_4_73:OutputStream, ldc:String("Minecraft server properties"))
                }
                catch (java.lang.Throwable var_6_B5) {
                    var_5_76 = var_6_B5:Throwable
                    athrow(var_6_B5:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_4_73:OutputStream, aconstnull:OutputStream())) {
                        if (cmpne:boolean(var_5_76:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(OutputStream::close, var_4_73:OutputStream)
                            }
                            catch (java.lang.Throwable var_8_DA) {
                                invokevirtual:void(Throwable::addSuppressed, var_5_76:Throwable, var_8_DA:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(OutputStream::close, var_4_73:OutputStream)
                        }
                    }
                }
            }
            catch (java.io.IOException var_4_FD) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ub83f\u3d64\u6b0d\u3d64\u97b7::\u36d3\u718f\u3bd6\ud158\u8cae\uc9f6), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Failed to store properties to file: ")), p0:Path[expected:Object])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Function<java.lang.String, V> \u1187\u56bd\u8709\u0a06\u5654\ub1b9(java.util.function.Function<java.lang.String, V> p0) {
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
    
    public static java.util.function.Function<java.lang.String, V> \uc2e8\uf995\ud171\u8aa5\u7049\u3d4b(java.util.function.IntFunction<V> p0, java.util.function.Function<java.lang.String, V> p1) {
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
    
    private java.lang.String \ube23\u600f\u1833\ub171\u71f1\u3e75(java.lang.String p0) {
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
            return:String(checkcast:String(java.lang.String.class, invokevirtual:String(Hashtable<K, String>::get, getfield:Properties[expected:Hashtable<K, String>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>), p0:String[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public V \u3711\ud36e\ud158\u071d\u52d3\u7049(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1) {
        var_5_65 : String
        
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
        var_5_65 = invokespecial:String(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ube23\u600f\u1833\ub171\u71f1\u3e75, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String)
        
        if (cmpne:boolean(var_5_65:String, aconstnull:String())) {
            invokevirtual:Object(Hashtable<Object, Object>::remove, getfield:Properties[expected:Hashtable<Object, Object>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>), p0:String[expected:Object])
            return:V(invokeinterface:V(Function<String, V>::apply, p1:Function<String, V>, var_5_65:String))
        }
        
        return:V(aconstnull:V())
    }
    
    public V \ub7dc\u3776\u156b\u416d\ud158\u67e9(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1, java.util.function.Function<V, java.lang.String> p2, V p3) {
        var_5_61 : int
        var_7_68 : String
        stack_8F_0 : V [generated]
        var_8_92 : Object
        
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
            var_5_61 = and:int(ldc:int(1274108051), ldc:int(1542437675))
            var_7_68 = invokespecial:String(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ube23\u600f\u1833\ub171\u71f1\u3e75, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String)
            
            if (cmpeq:boolean(var_7_68:String, aconstnull:String())) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1324555791))
                stack_8F_0 = aconstnull:V()
            }
            else {
                stack_8F_0 = invokeinterface:V(Function<String, V>::apply, p1:Function<String, V>, var_7_68:String)
            }
            
            var_8_92 = invokestatic:Object(MoreObjects::firstNonNull, stack_8F_0:V[expected:Object], p3:V[expected:Object])
            invokevirtual:String(Hashtable<String, String>::put, getfield:Properties[expected:Hashtable<String, String>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>), p0:String, invokeinterface:String(Function<V, String>::apply, p2:Function<V, String>, var_8_92:V))
            return:V(var_8_92:V[expected:Object])
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<V> \ua6bd\u4179\u9af2\u9a18\ua068\u0a06(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1, java.util.function.Function<V, java.lang.String> p2, V p3) {
        var_5_61 : int
        var_7_68 : String
        stack_8F_0 : V [generated]
        var_8_92 : Object
        
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
            var_5_61 = and:int(ldc:int(-1234410383), ldc:int(-18566469))
            var_7_68 = invokespecial:String(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ube23\u600f\u1833\ub171\u71f1\u3e75, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String)
            
            if (cmpeq:boolean(var_7_68:String, aconstnull:String())) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-1208712261))
                stack_8F_0 = aconstnull:V()
            }
            else {
                stack_8F_0 = invokeinterface:V(Function<String, V>::apply, p1:Function<String, V>, var_7_68:String)
            }
            
            var_8_92 = invokestatic:Object(MoreObjects::firstNonNull, stack_8F_0:V[expected:Object], p3:V[expected:Object])
            invokevirtual:String(Hashtable<String, String>::put, getfield:Properties[expected:Hashtable<String, String>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>), p0:String, invokeinterface:String(Function<V, String>::apply, p2:Function<V, String>, var_8_92:V))
            return:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<V>(initobject:\u718f\u9255\u6bb9\u6435\ucfaf<V>(\u718f\u9255\u6bb9\u6435\ucfaf<V>::<init>, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, var_8_92:V[expected:Object], p2:Function<V, String>, aconstnull:\u8308\u4bc8\u7006\ucef1\u3711()))
        }
        
        goto(Label_0006)
    }
    
    public V \ud36e\u494c\ub19c\u4cd9\ud36e\u36d3(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1, java.util.function.UnaryOperator<V> p2, java.util.function.Function<V, java.lang.String> p3, V p4) {
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
    
    public V \u8bb0\u0b8e\uc3e3\u385b\ubefe\u965f(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1, V p2) {
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
            return:V(invokevirtual:V(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ub7dc\u3776\u156b\u416d\ud158\u67e9, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, p1:Function<String, V>, invokedynamic:Function<V, String>(apply:()Ljava/util/function/Function;), p2:V))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<V> \u6b5f\u4f4a\u71f1\uc910\uae87\u392e(java.lang.String p0, java.util.function.Function<java.lang.String, V> p1, V p2) {
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
            return:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<V>(invokevirtual:\u718f\u9255\u6bb9\u6435\ucfaf[expected:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<V>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\ua6bd\u4179\u9af2\u9a18\ua068\u0a06, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, p1:Function<String, V>, invokedynamic:Function<Object, String>(apply:()Ljava/util/function/Function;), p2:V[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u71ae\u3bc9\ufcaf\u6b5f\uc2bd\u4daf(java.lang.String p0, java.lang.String p1) {
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
            return:String(checkcast:String(java.lang.String.class, invokevirtual:String(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ub7dc\u3776\u156b\u416d\ud158\u67e9, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, String>(Function<T, R>::identity), invokestatic:Function<String, String>(Function<T, R>::identity), p1:String)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ua61f\u76bc\u7e3f\uc238\u59ec\u516c(java.lang.String p0) {
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
            return:String(checkcast:String(java.lang.String.class, invokevirtual:String(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u3711\ud36e\ud158\u071d\u52d3\u7049, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, String>(Function<T, R>::identity))))
        }
        
        goto(Label_0006)
    }
    
    public int \ubefe\uc7fe\u5bc4\ubb2b\uf995\u67d0(java.lang.String p0, int p1) {
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
            return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u8bb0\u0b8e\uc3e3\u385b\ubefe\u965f, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, V>(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u1187\u56bd\u8709\u0a06\u5654\ub1b9, invokedynamic:Function<String, Integer>(apply:()Ljava/util/function/Function;)), invokestatic:Integer(Integer::valueOf, p1:int)))))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<java.lang.Integer> \u7330\u120d\ua3b4\u183a\u72f1\u4f4a(java.lang.String p0, int p1) {
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
            return:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<Integer>(invokevirtual:\u718f\u9255\u6bb9\u6435\ucfaf[expected:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<Integer>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u6b5f\u4f4a\u71f1\uc910\uae87\u392e, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, Integer>(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u1187\u56bd\u8709\u0a06\u5654\ub1b9, invokedynamic:Function<String, Integer>(apply:()Ljava/util/function/Function;)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int)))
        }
        
        goto(Label_0006)
    }
    
    public int \u3776\u120d\u4179\u3504\u5d20\u5db4(java.lang.String p0, java.util.function.UnaryOperator<java.lang.Integer> p1, int p2) {
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
            return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\ud36e\u494c\ub19c\u4cd9\ud36e\u36d3, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, V>(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u1187\u56bd\u8709\u0a06\u5654\ub1b9, invokedynamic:Function<String, Integer>(apply:()Ljava/util/function/Function;)), p1:UnaryOperator<Integer>, invokedynamic:Function<Integer, String>(apply:()Ljava/util/function/Function;), invokestatic:Integer(Integer::valueOf, p2:int)))))
        }
        
        goto(Label_0006)
    }
    
    public long \u47c2\u839e\ubff1\u4f4a\u3bd6\u873d(java.lang.String p0, long p1) {
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
            return:long(invokevirtual:long(Long::longValue, checkcast:Long(java.lang.Long.class, invokevirtual:Long(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u8bb0\u0b8e\uc3e3\u385b\ubefe\u965f, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokestatic:Function<String, V>(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u1187\u56bd\u8709\u0a06\u5654\ub1b9, invokedynamic:Function<String, Long>(apply:()Ljava/util/function/Function;)), invokestatic:Long(Long::valueOf, p1:long)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u12cb\u6198\ub18d\u1833\u4cd9\u5db4(java.lang.String p0, boolean p1) {
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
            return:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u8bb0\u0b8e\uc3e3\u385b\ubefe\u965f, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokedynamic:Function<String, Boolean>(apply:()Ljava/util/function/Function;), invokestatic:Boolean(Boolean::valueOf, p1:boolean)))))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<java.lang.Boolean> \u0c95\ucb79\u759a\ubf56\u71f1\ud158(java.lang.String p0, boolean p1) {
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
            return:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<Boolean>(invokevirtual:\u718f\u9255\u6bb9\u6435\ucfaf[expected:\ub83f\u3d64\u6b0d\u3d64\u97b7$Property<Boolean>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u6b5f\u4f4a\u71f1\uc910\uae87\u392e, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokedynamic:Function<String, Boolean>(apply:()Ljava/util/function/Function;), invokestatic:Boolean[expected:Object](Boolean::valueOf, p1:boolean)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Boolean \u8c8a\u8cae\ubf56\uceb8\ud12e\u946b(java.lang.String p0) {
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
            return:Boolean(checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\ub83f\u3d64\u6b0d\u3d64\u97b7<T>::\u3711\ud36e\ud158\u071d\u52d3\u7049, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>, p0:String, invokedynamic:Function<String, Boolean>(apply:()Ljava/util/function/Function;))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Properties \u7d52\u6d69\u1187\uc9f6\u7043\ub83f() {
        var_3_69 : Properties
        
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
            var_3_69 = initobject:Properties(Properties::<init>)
            invokevirtual:void(Hashtable<Object, Object>::putAll, var_3_69:Properties[expected:Hashtable<Object, Object>], getfield:Properties[expected:Map<?, ?>](\ub83f\u3d64\u6b0d\u3d64\u97b7::\u9937\u97e6\u62da\uceb8\u3e2a\u97e6, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>))
            return:Properties(var_3_69:Properties)
        }
        
        goto(Label_0006)
    }
    
    public abstract T extends \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub83f\u3d64\u6b0d\u3d64\u97b7<T> \u9a18\uae87\u5245\u8cae\u0800\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, java.util.Properties p1);
    
    private static java.lang.Object lambda$\u7043\u1187\ud7e8\uceb8\u3e2a\ud217$2(java.util.function.Function p0, java.util.function.UnaryOperator p1, java.lang.String p2) {
        var_3_61 : int
        var_5_69 : Object
        stack_8C_0 : Object [generated]
        
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
            var_3_61 = and:int(ldc:int(-848206622), ldc:int(-630755624))
            var_5_69 = invokeinterface:Object(Function<String, Object>::apply, p0:Function<String, Object>, p2:String)
            
            if (cmpeq:boolean(var_5_69:Object, aconstnull:Object())) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-117610812))
                stack_8C_0 = aconstnull:Object()
            }
            else {
                stack_8C_0 = invokeinterface:Object(Function<Object, Object>::apply, p1:UnaryOperator<Object>[expected:Function<Object, Object>], var_5_69:Object)
            }
            
            return:Object(stack_8C_0:Object)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u385b\uf94d\u3711\u92ee\u7873\ub102$1(java.util.function.IntFunction p0, java.util.function.Function p1, java.lang.String p2) {
        var_3_61 : int
        stack_78_0 : Object [generated]
        
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
        var_3_61 = and:int(ldc:int(-1768793131), ldc:int(77029083))
        
        try {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1936531748))
            stack_78_0 = invokeinterface:Object(IntFunction<Object>::apply, p0:IntFunction<Object>, invokestatic:int(Integer::parseInt, p2:String))
            var_3_61 = and:int(var_3_61:int, ldc:int(-1931814182))
            return:Object(stack_78_0:Object)
        }
        catch (java.lang.NumberFormatException var_5_7D) {
            return:Object(invokeinterface:Object(Function<String, Object>::apply, p1:Function<String, Object>, p2:String))
        }
    }
    
    private static java.lang.Number lambda$\u64f2\u8c8a\u5140\u8cae\ubf56\u52d3$0(java.util.function.Function p0, java.lang.String p1) {
        var_2_61 : int
        stack_78_0 : Number [generated]
        
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
        var_2_61 = and:int(ldc:int(1667591053), ldc:int(-1059637297))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(-271485445))
            stack_78_0 = checkcast:Number(java.lang.Number.class, invokeinterface:Number(Function<String, Number>::apply, p0:Function<String, Number>, p1:String))
            var_2_61 = and:int(var_2_61:int, ldc:int(-1269255767))
            return:Number(stack_78_0:Number)
        }
        catch (java.lang.NumberFormatException var_4_7D) {
            return:Number(checkcast:Number(java.lang.Number.class, aconstnull:Number()))
        }
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
            putstatic:Logger(\ub83f\u3d64\u6b0d\u3d64\u97b7::\u36d3\u718f\u3bd6\ud158\u8cae\uc9f6, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\u156b\u2dcc\u52d3\ufcaf\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(656810053), ldc:int(644152726))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub83f\u3d64\u6b0d\u3d64\u97b7<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(1675937159))
            var_5_81 = and:int(ldc:int(-19941), ldc:int(17892))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20676), ldc:int(20675)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(862247416))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2324), ldc:int(2325)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4388), ldc:int(4389)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-1281039704))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8193), ldc:int(8192)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1568286140))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1399572301))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2016820324))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(977086618))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1328910591))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-957622197))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1482070245))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(926336636))
                        var_11_EB = and:int(ldc:int(11841), ldc:int(-15938))
                        goto(Label_1508)
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(206975849))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-728867821))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(342227503))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-82169126))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1528627481))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1538498169))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-203076116))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(391154894))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(858538468))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-295618323))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1375348926))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-901172068))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1084406762))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-470010166))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(506531588))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1957540401))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(2116374696))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(6147), ldc:int(6146))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(747651787))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(104820038))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1305501690))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1314024393))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1494894050))
                        var_11_EB = and:int(ldc:int(-32470), ldc:int(27717))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2147482152))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1238556330))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2072161119))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-4088719))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-142638295))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1317853972))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(341504265))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2063574311))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1427756323))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1614419668))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(792631030))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1508)
                    }
                    
                    Label_1389:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(738307271))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1629059142))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-486554454))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1689182035))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1204217717))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1655570112))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-244261463))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(736989092))
                        var_17_66B = add:int(var_16_119:int, xor:int(ldc:int(10498), ldc:int(10499)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(1743679977))
                
                if (cmple:boolean(var_5_81 = var_17_66B:int, sub:int(var_6_88:int, xor:int(ldc:int(4680), ldc:int(4681))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(-504899765))
            goto(Label_0108)
        }
    }
}
