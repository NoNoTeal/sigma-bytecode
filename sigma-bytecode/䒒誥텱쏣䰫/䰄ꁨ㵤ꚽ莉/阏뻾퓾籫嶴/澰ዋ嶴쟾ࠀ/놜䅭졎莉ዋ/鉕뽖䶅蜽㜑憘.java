public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u9255\ubf56\u4d85\u873d\u3711\u6198<T> {
    public void \u9255\ubf56\u4d85\u873d\u3711\u6198(java.lang.Class<T> p0) {
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
            invokespecial:AbstractCollection(AbstractCollection::<init>, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)
            putfield:Map<Class<?>, List<T>>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u56bd\u6d69\uc31c\u7330\u7bad\u8709, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>, invokestatic:HashMap[expected:Map<Class<?>, List<T>>](Maps::newHashMap))
            putfield:List<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>, invokestatic:ArrayList[expected:List<T>](Lists::newArrayList))
            putfield:Class<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u71f1\u4c04\u5db4\uc7fe\ubb2b\ubf56, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>, p0:Class<T>)
            invokeinterface:List<?>(Map<Class<?>, List<T>>::put, getfield:Map<Class<?>, List<T>>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u56bd\u6d69\uc31c\u7330\u7bad\u8709, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>), p0:Class<T>, getfield:List<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean add(T p0) {
        var_2_5F : int
        var_4_67 : int
        var_5_77 : Iterator<Entry<Class<?>, List<T>>>
        var_6_B4 : Entry<Class<?>, List<T>>
        
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
            var_2_5F = and:int(ldc:int(1701116532), ldc:int(-269556979))
            var_4_67 = and:int(ldc:int(29442), ldc:int(-29475))
            var_5_77 = invokeinterface:Iterator<Entry<Class<?>, List<T>>>(Set<Entry<Class<?>, List<T>>>::iterator, invokeinterface:Set<Entry<Class<?>, List<T>>>(Map<Class<?>, List<T>>::entrySet, getfield:Map<Class<?>, List<T>>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u56bd\u6d69\uc31c\u7330\u7bad\u8709, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1141570975))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-2228523))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_77:Iterator<Entry<Class<?>, List<T>>>)) {
                        var_6_B4 = checkcast:Entry<Class<?>, List<T>>(java.util.Map.Entry<java.lang.Class<?>, java.util.List<T>>.class, invokeinterface:Entry<Class<?>, List<T>>(Iterator<Entry<Class<?>, List<T>>>::next, var_5_77:Iterator<Entry<Class<?>, List<T>>>))
                        
                        if (invokevirtual:boolean(Class<T>::isInstance, checkcast:Class<?>(java.lang.Class<?>.class, invokeinterface:Class<?>(Entry<Class<?>, List<T>>::getKey, var_6_B4:Entry<Class<?>, List<T>>)), p0:T[expected:Object])) {
                            var_4_67 = or:boolean(var_4_67:boolean, invokeinterface:boolean(List<T>::add, checkcast:List<T>(java.util.List<T>.class, invokeinterface:List<T>(Entry<Class<?>, List<T>>::getValue, var_6_B4:Entry<Class<?>, List<T>>)), p0:T))
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-453582089))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(var_4_67:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean remove(java.lang.Object p0) {
        var_2_5F : int
        var_4_67 : int
        var_5_77 : Iterator<Entry<Class<?>, List<T>>>
        var_2_84 : int
        var_6_BC : Entry<Class<?>, List<T>>
        
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
            var_2_5F = and:int(ldc:int(-886442828), ldc:int(-275687644))
            var_4_67 = and:int(ldc:int(-11170), ldc:int(11169))
            var_5_77 = invokeinterface:Iterator<Entry<Class<?>, List<T>>>(Set<Entry<Class<?>, List<T>>>::iterator, invokeinterface:Set<Entry<Class<?>, List<T>>>(Map<Class<?>, List<T>>::entrySet, getfield:Map<Class<?>, List<T>>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u56bd\u6d69\uc31c\u7330\u7bad\u8709, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                    var_2_84 = and:int(var_2_5F:int, ldc:int(-2001144274))
                }
                else {
                    var_2_84 = and:int(var_2_5F:int, ldc:int(-336487129))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_77:Iterator<Entry<Class<?>, List<T>>>)) {
                        var_6_BC = checkcast:Entry<Class<?>, List<T>>(java.util.Map.Entry<java.lang.Class<?>, java.util.List<T>>.class, invokeinterface:Entry<Class<?>, List<T>>(Iterator<Entry<Class<?>, List<T>>>::next, var_5_77:Iterator<Entry<Class<?>, List<T>>>))
                        
                        if (invokevirtual:boolean(Class<T>::isInstance, checkcast:Class<?>(java.lang.Class<?>.class, invokeinterface:Class<?>(Entry<Class<?>, List<T>>::getKey, var_6_BC:Entry<Class<?>, List<T>>)), p0:Object)) {
                            var_4_67 = or:boolean(var_4_67:boolean, invokeinterface:boolean(List<E>::remove, checkcast:List<T>(java.util.List<T>.class, invokeinterface:List<T>(Entry<Class<?>, List<T>>::getValue, var_6_BC:Entry<Class<?>, List<T>>)), p0:Object))
                        }
                        
                        var_2_5F = and:int(var_2_84:int, ldc:int(-340003521))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_84:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_84:int, ldc:int(-1624371918))
            }
            
            return:boolean(var_4_67:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean contains(java.lang.Object p0) {
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
            return:boolean(invokeinterface:boolean(Collection<E>::contains, invokevirtual:Collection<?>(\u9255\ubf56\u4d85\u873d\u3711\u6198<T>::\u3776\u071d\ud36e\u6cfe\u6fb0\u960f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>, invokevirtual:Class<?>(Object::getClass, p0:Object)), p0:Object))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<S> \u3776\u071d\ud36e\u6cfe\u6fb0\u960f(java.lang.Class<S> p0) {
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
    
    public java.util.Iterator<T> iterator() {
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
            return:Iterator<T>(ternaryop:Object[expected:Iterator<T>](invokeinterface:boolean(List<E>::isEmpty, getfield:List<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)), invokestatic:Iterator<Object>[expected:Object](Collections::emptyIterator), invokestatic:UnmodifiableIterator[expected:Object](Iterators::unmodifiableIterator, invokeinterface:Iterator<T>(List<T>::iterator, getfield:List<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \ua3b4\u494c\ucfaf\u34df\u839e\u965f() {
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
            return:List<T>(invokestatic:ImmutableList[expected:List<T>](ImmutableList::copyOf, getfield:List<T>[expected:Collection](\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)))
        }
        
        goto(Label_0006)
    }
    
    public int size() {
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
            return:int(invokeinterface:int(List<E>::size, getfield:List<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.List lambda$\u0800\u7ce1\u64f2\u873d\u873d\ube23$0(java.lang.Class p0) {
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
            return:List(checkcast:List<? super Object>(java.util.List<? super java.lang.Object>.class, invokeinterface:List<? super Object>(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::filter, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:List<T>[expected:Collection<Object>](\u9255\ubf56\u4d85\u873d\u3711\u6198::\u3e75\u4c04\u5fe1\u7bad\uc229\u983f, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>)), invokedynamic:Predicate<Object>(test:(Ljava/lang/Class;)Ljava/util/function/Predicate;, p0:Class)), invokestatic:Collector<Object, ?, List<Object>>(Collectors::toList))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_304 : int
        expr_6E : int [generated]
        stack_B6_0 : byte[] [generated]
        stack_B8_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_141_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_186_0 : byte[] [generated]
        stack_1C4_0 : byte[] [generated]
        stack_231_0 : byte[] [generated]
        stack_291_0 : byte[] [generated]
        stack_31F_0 : byte[] [generated]
        stack_370_0 : byte[] [generated]
        stack_3C6_0 : byte[] [generated]
        var_4_20A : int
        var_3_20F : byte[]
        var_5_210 : int
        var_0_287 : int
        expr_291 : byte [generated]
        stack_2D1_2 : byte [generated]
        stack_2AE_0 : byte [generated]
        expr_31F : byte [generated]
        expr_B8 : int [generated]
        expr_F9 : int [generated]
        var_2_141 : byte[]
        expr_145 : int [generated]
        var_3_35E : byte[]
        var_5_35F : int
        expr_186 : int [generated]
        var_3_3B4 : byte[]
        var_5_3B5 : int
        var_3_1D0 : String
        stack_203_0 : String[] [generated]
        expr_1E2 : String[] [generated]
        
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
        var_0_304 = and:int(ldc:int(-2074192275), ldc:int(873923949))
        expr_6E = arraylength:int(stack_B6_0 = stack_B8_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("6L3NG3wIxOCT0w+F5MAOy8YQdM/LxozfItrY0RzK")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_20A = expr_6E:int
        var_3_20F = newarray:byte[](byte.class, expr_6E:int)
        var_5_210 = expr_6E:int
        Label_0530:
        
        while (cmpne:boolean(and:int(var_0_304:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0608)
            }
            
            var_0_304 = and:int(var_0_304:int, ldc:int(891160557))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, add:byte(loadelement:byte(stack_231_0:byte[], var_5_210:int), ldc:byte(52)))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = var_3_20F:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0759)
        Label_0608:
        
        while (cmpeq:boolean(and:int(var_0_304:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(858144183))
                goto(Label_0530)
            }
            
            var_0_287 = and:int(var_0_304:int, ldc:int(2095031549))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_291 = stack_2D1_2 = loadelement(stack_291_0, var_5_210)
            
            if (cmplt:boolean(add:int(add:int(var_5_210:int, ldc:int(6)), neg:int(var_4_20A:int)), ldc:int(0))) {
                stack_2D1_2 = stack_2AE_0 = add:byte(expr_291:byte, loadelement:byte(var_3_20F:byte[], add:int(var_5_210:int, ldc:int(6))))
                goto(Label_0702)
            }
            
            Label_0670:
            
            if (cmpne:boolean(and:int(var_0_287:int, ldc:int(1024)), ldc:int(0))) {
                var_0_287 = and:int(var_0_287:int, ldc:int(1815541629))
                stack_2D1_2 = stack_2AE_0 = add:byte(expr_291:byte, ldc:byte(6))
            }
            
            Label_0702:
            
            if (cmpeq:boolean(and:int(var_0_287:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0670)
            }
            
            var_0_304 = and:int(var_0_287:int, ldc:int(1702768623))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, stack_2D1_2:byte)
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = var_3_20F:byte[]
            goto(Label_0189)
        }
        
        var_0_304 = and:int(var_0_304:int, ldc:int(-937840486))
        Label_0759:
        
        while (cmpeq:boolean(and:int(var_0_304:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0530)
            }
            
            var_0_304 = and:int(var_0_304:int, ldc:int(-1916881409))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_31F = loadelement:byte(stack_31F_0:byte[], var_5_210:int)
            storeelement:byte(var_3_20F:byte[], var_5_210:int, or:int(and:int(shl:int(expr_31F:byte, and:int(ldc:int(68), ldc:int(30870))), ldc:int(-16)), and:int(shr:int(expr_31F:byte[expected:int], and:int(ldc:int(9612), ldc:int(580))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = var_3_20F:byte[]
            goto(Label_0254)
        }
        
        var_0_304 = and:int(var_0_304:int, ldc:int(-1983332025))
        goto(Label_0608)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0395)
        }
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(-719310024))
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(1229818406))
            goto(Label_0254)
        }
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(262144)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(-1239153821))
        }
        else {
            var_0_304 = and:int(var_0_304:int, ldc:int(-1272980355))
            expr_B8 = arraylength:int(stack_B8_0:byte[])
            
            if (cmpne:boolean(expr_B8:int, ldc:int(0))) {
                var_4_20A = expr_B8:int
                var_3_20F = newarray:byte[](byte.class, expr_B8:int)
                var_5_210 = expr_B8:int
                goto(Label_0608)
            }
        }
        
        Label_0189:
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(-1743265887))
            goto(Label_0395)
        }
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_304:int, ldc:int(16)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(795965259))
                goto(Label_0115)
            }
            
            var_0_304 = and:int(var_0_304:int, ldc:int(1461688063))
            expr_F9 = arraylength:int(stack_F9_0:byte[])
            
            if (cmpne:boolean(expr_F9:int, ldc:int(0))) {
                var_4_20A = expr_F9:int
                var_3_20F = newarray:byte[](byte.class, expr_F9:int)
                var_5_210 = expr_F9:int
                goto(Label_0759)
            }
        }
        
        Label_0254:
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1024)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(-636432392))
            goto(Label_0395)
        }
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_304:int, ldc:int(128)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(-999523530))
                goto(Label_0189)
            }
            
            if (cmpne:boolean(and:int(var_0_304:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(1206361957))
                goto(Label_0115)
            }
            
            var_0_304 = and:int(var_0_304:int, ldc:int(-1244221715))
            var_2_141 = stack_141_0:byte[]
            expr_145 = add:int(arraylength:int(stack_143_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_145:int, ldc:int(0))) {
                var_3_35E = newarray:byte[](byte.class, expr_145:int)
                var_5_35F = expr_145:int
                
                loop {
                    var_0_304 = and:int(var_0_304:int, ldc:int(-188844689))
                    var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
                    storeelement:byte(var_3_35E:byte[], var_5_35F:int, add:int(shl:int(loadelement:byte(stack_370_0:byte[], var_5_35F:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_141:byte[], add:int(var_5_35F:int, xor:int(ldc:int(144), ldc:int(145)))), ldc:int(4)), and:int(ldc:int(2127), ldc:int(15)))))
                    
                    if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = var_3_35E:byte[]
            }
        }
        
        Label_0330:
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_304:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(303245020))
                goto(Label_0189)
            }
            
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(1)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(-1400676924))
                goto(Label_0115)
            }
            
            var_0_304 = and:int(var_0_304:int, ldc:int(-1262586625))
            expr_186 = arraylength:int(stack_186_0:byte[])
            
            if (cmpne:boolean(expr_186:int, ldc:int(0))) {
                var_3_3B4 = newarray:byte[](byte.class, expr_186:int)
                var_5_3B5 = expr_186:int
                
                loop {
                    var_0_304 = and:int(var_0_304:int, ldc:int(1994344063))
                    var_5_3B5 = add:int(var_5_3B5:int, ldc:int(-1))
                    storeelement:byte(var_3_3B4:byte[], var_5_3B5:int, xor:byte(loadelement:byte(stack_3C6_0:byte[], var_5_3B5:int), ldc:byte(116)))
                    
                    if (cmpne:boolean(var_5_3B5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_141_0 = stack_143_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_231_0 = stack_291_0 = stack_31F_0 = stack_370_0 = stack_3C6_0 = var_3_3B4:byte[]
            }
        }
        
        Label_0395:
        
        if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(1537533857))
            goto(Label_0330)
        }
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0254)
        }
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0189)
        }
        
        if (cmpne:boolean(and:int(var_0_304:int, ldc:int(65536)), ldc:int(0))) {
            var_0_304 = and:int(var_0_304:int, ldc:int(389686038))
            goto(Label_0115)
        }
        
        var_3_1D0 = initobject:String(String::<init>, stack_1C4_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_203_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11265), ldc:int(5057)))
        expr_1E2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4161), ldc:int(9099)))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(-6406), ldc:int(6405)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(8366), ldc:int(-8367)), xor:int(ldc:int(553), ldc:int(564))))
        putstatic:String[](\u9255\ubf56\u4d85\u873d\u3711\u6198::\u0800\ua6bd\u7043\u3d4b\uc29a\ubefe, expr_1E2:String[])
    }
    
    public void \u960f\u36d3\ubded\u5fe1\uc246\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(-2087107103), ldc:int(-201642779))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\ubf56\u4d85\u873d\u3711\u6198<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-188513646))
        }
        else {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(625169137))
            var_5_8A = and:int(ldc:int(18721), ldc:int(-18852))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9521), ldc:int(9520)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6BA:int, ldc:int(-747951963))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(4121), ldc:int(4120)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(192), ldc:int(193)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_E3:int, ldc:int(-537684489))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(67), ldc:int(1445)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-868006416))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1635589787))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1000393927))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2025493969))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1649122082))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1795627507))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1391766599))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2080540658))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(640262569))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-418652110))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(195690475))
                            var_11_F4 = and:int(ldc:int(-27605), ldc:int(27524))
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-445201670))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2089562325))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(735653117))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(282066386))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1659957679))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1188370203))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2108521750))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1284476474))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-431181612))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-613197420))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-245790467))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-722018941))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1766091079))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1908283352))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1996985744))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2131305280))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1049136699))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-279900997))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(72), ldc:int(73))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1653132417))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(873516030))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(300224522))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1797042861))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(903048885))
                        var_11_F4 = and:int(ldc:int(-29903), ldc:int(17486))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1258843063))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(669431291))
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1324417351))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(331289421))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(7059332))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2085634133))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(868387918))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-934064032))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1697516387))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-609451923))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(55242732))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1424948286))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(768572389))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1589)
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1066290330))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1725132277))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1313892390))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2027715577))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(1434944233))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(590311656))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2106454593))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-366265210))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1573553310))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1863269793))
                        var_17_6C5 = add:int(var_16_122:int, xor:int(ldc:int(8194), ldc:int(8195)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-597209550))
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(2069572349))
                
                if (cmple:boolean(var_5_8A = var_17_6C5:int, sub:int(var_6_91:int, xor:int(ldc:int(-22512), ldc:int(-22511))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1033875426))
            goto(Label_0108)
        }
    }
}
