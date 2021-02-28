public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S> {
    public void \uc31c\u74b1\u8389\u494c\u88c5\u446c(O p0, com.google.common.collect.ImmutableMap<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, java.lang.Comparable<?>> p1, com.mojang.serialization.MapCodec<S> p2) {
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
            invokespecial:Object(Object::<init>, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)
            putfield:O(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, p0:O)
            putfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, p1:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>)
            putfield:MapCodec<S>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u839e\ub8be\u12cb\u8709\u5f50\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, p2:MapCodec<S>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public S \u960f\u600f\u3d64\u69d9\ub102\uf9c5(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0) {
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
            return:S(invokevirtual:S(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, checkcast:V extends T[expected:Comparable](V extends T.class, invokestatic:V extends T(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\ub102\u9033\u61a4\u5f50\u4e72\u6bb9, invokevirtual:Collection<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), invokevirtual:T[expected:V extends T](\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)))))
        }
        
        goto(Label_0006)
    }
    
    public static T \ub102\u9033\u61a4\u5f50\u4e72\u6bb9(java.util.Collection<T> p0, T p1) {
        var_2_5F : int
        var_4_66 : Iterator<T>
        
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
        var_2_5F = and:int(ldc:int(344225296), ldc:int(-923353455))
        var_4_66 = invokeinterface:Iterator<T>(Collection<T>::iterator, p0:Collection<T>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-707367023))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_66:Iterator)) {
                    if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokeinterface:T(Iterator<T>::next, var_4_66:Iterator<T>), p1:T[expected:Object]))) {
                        loopcontinue()
                    }
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_66:Iterator<T>))) {
                        return:T(invokeinterface:T(Iterator<T>::next, invokeinterface:Iterator<T>(Collection<T>::iterator, p0:Collection<T>)))
                    }
                    
                    return:T(invokeinterface:T(Iterator<T>::next, var_4_66:Iterator<T>))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                return:T(invokeinterface:T(Iterator<T>::next, var_4_66:Iterator<T>))
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(1691809152))
        }
    }
    
    public java.lang.String toString() {
        var_3_67 : StringBuilder
        
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
            var_3_67 = initobject:StringBuilder(StringBuilder::<init>)
            invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, getfield:O[expected:Object](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>))
            
            if (logicalnot:boolean(invokevirtual:boolean(ImmutableMap::isEmpty, invokevirtual:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u9af2\u61a4\u965f\u4492\u156b\u0b8e, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)))) {
                invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, ldc:char(91))
                invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, checkcast:String(java.lang.String.class, invokeinterface:String(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokevirtual:Stream(ImmutableSet::stream, invokevirtual:ImmutableSet(ImmutableMap::entrySet, invokevirtual:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u9af2\u61a4\u965f\u4492\u156b\u0b8e, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>))), getstatic:Function<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, String>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u3504\uf9c5\u071d\u3e75\u873d\ud171)), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining, ldc:String[expected:CharSequence](",")))))
                invokevirtual:StringBuilder(StringBuilder::append, var_3_67:StringBuilder, ldc:char(93))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_3_67:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>> \uc246\u3711\uc31c\u516c\ud171\uc84e() {
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
            return:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(invokestatic:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collections::unmodifiableCollection, invokevirtual:ImmutableSet[expected:Collection<? extends \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](ImmutableMap::keySet, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud158\u4179\u4492\u0800\u416d\u927d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0) {
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
            return:boolean(invokevirtual:boolean(ImmutableMap::containsKey, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public T extends java.lang.Comparable<T> \u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0) {
        var_4_6B : Comparable
        
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
        var_4_6B = checkcast:Comparable(java.lang.Comparable.class, invokevirtual:Object[expected:Comparable](ImmutableMap::get, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]))
        
        if (cmpne:boolean(var_4_6B:Comparable, aconstnull:Comparable())) {
            return:T extends Comparable<T>(checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, invokevirtual:T extends Comparable<T>(Class<T>::cast, invokevirtual:Class<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u8aa5\uc910\u3e2a\u72f1\u6ec6\ud171, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), var_4_6B:Comparable[expected:Object])))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Cannot get property ")), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]), ldc:String(" as it does not exist in ")), getfield:O[expected:Object](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)))))
    }
    
    public java.util.Optional<T> \u97b7\u88c5\uc238\u6fb0\u72f1\u6d99(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0) {
        var_2_5F : int
        var_4_6B : Comparable
        stack_92_0 : Optional<T> [generated]
        
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
            var_2_5F = and:int(ldc:int(-152298416), ldc:int(963526644))
            var_4_6B = checkcast:Comparable(java.lang.Comparable.class, invokevirtual:Object[expected:Comparable](ImmutableMap::get, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]))
            
            if (cmpne:boolean(var_4_6B:Comparable, aconstnull:Comparable())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1083228393))
                stack_92_0 = invokestatic:Optional<T>(Optional<T>::of, invokevirtual:T extends Comparable<T>(Class<T>::cast, invokevirtual:Class<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u8aa5\uc910\u3e2a\u72f1\u6ec6\ud171, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), var_4_6B:Comparable[expected:Object]))
            }
            else {
                stack_92_0 = invokestatic:Optional<T>(Optional<T>::empty)
            }
            
            return:Optional<T>(stack_92_0:Optional<T>)
        }
        
        goto(Label_0006)
    }
    
    public S \u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0, V extends T p1) {
        var_3_5F : int
        var_5_6B : Comparable
        var_6_A3 : Object
        
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
        var_3_5F = and:int(ldc:int(150940225), ldc:int(478027642))
        var_5_6B = checkcast:Comparable(java.lang.Comparable.class, invokevirtual:Object[expected:Comparable](ImmutableMap::get, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]))
        
        if (cmpeq:boolean(var_5_6B:Comparable, aconstnull:Comparable())) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Cannot set property ")), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]), ldc:String(" as it does not exist in ")), getfield:O[expected:Object](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)))))
        }
        
        do {
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1478021186))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-621048888))
                
                if (cmpne:boolean(var_5_6B:V extends T, p1:V extends T)) {
                    loopcontinue()
                }
                
                return:S(this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>[expected:S])
            }
        } while (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0)))
        
        var_6_A3 = invokeinterface:Object(Table::get, getfield:Table<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>, S>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u873d\u3e2a\ud171\u7af6\u3504\u4179, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object], p1:V extends T[expected:Object])
        
        if (cmpne:boolean(var_6_A3:Object, aconstnull:Object())) {
            return:S(var_6_A3:Object)
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Cannot set property ")), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]), ldc:String(" to ")), p1:V extends T[expected:Object]), ldc:String(" on ")), getfield:O[expected:Object](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)), ldc:String(", it is not an allowed value")))))
    }
    
    public void \uff55\u5245\u392e\ud4fe\uf94d\uc7fe(java.util.Map<java.util.Map<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, java.lang.Comparable<?>>, S> p0) {
        var_2_61 : int
        var_2_F4 : int
        var_4_72 : HashBasedTable
        var_5_7E : UnmodifiableIterator
        var_6_CD : Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>
        var_7_D9 : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>
        var_8_E5 : Iterator<?>
        var_9_127 : Comparable<?>
        
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
        var_2_61 = and:int(ldc:int(1258775273), ldc:int(1454842580))
        
        if (cmpeq:boolean(getfield:Table<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>, S>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u873d\u3e2a\ud171\u7af6\u3504\u4179, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>), aconstnull:Table<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>, S>())) {
            var_2_F4 = and:int(var_2_61:int, ldc:int(-290199622))
            var_4_72 = invokestatic:HashBasedTable(HashBasedTable::create)
            var_5_7E = invokevirtual:UnmodifiableIterator(ImmutableSet::iterator, invokevirtual:ImmutableSet(ImmutableMap::entrySet, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>)))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_5_7E:Iterator)) {
                var_6_CD = checkcast:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>(java.util.Map.Entry<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>.class, invokeinterface:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>(Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>>::next, var_5_7E:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>>))
                var_7_D9 = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>::getKey, var_6_CD:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>))
                var_8_E5 = invokeinterface:Iterator<?>(Collection<?>::iterator, invokevirtual:Collection<?>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, var_7_D9:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_F4:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_F4 = and:int(var_2_F4:int, ldc:int(-727651992))
                    }
                    else {
                        var_2_F4 = and:int(var_2_F4:int, ldc:int(-306222082))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_8_E5:Iterator<?>)) {
                            var_9_127 = checkcast:Comparable<?>(java.lang.Comparable<?>.class, invokeinterface:?[expected:Comparable<?>](Iterator<?>::next, var_8_E5:Iterator<?>))
                            
                            if (cmpne:boolean(var_9_127:Comparable<?>[expected:Object], invokeinterface:V[expected:Object](Entry<K, V>::getValue, var_6_CD:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, V>))) {
                                invokeinterface:Object(Table::put, var_4_72:Table, var_7_D9:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[expected:Object], var_9_127:Comparable<?>[expected:Object], invokeinterface:S(Map<Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, S>::get, p0:Map<Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, S>, invokespecial:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u40a9\u51fa\u99f7\u8258\uc910\u74b1, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, var_7_D9:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, var_9_127:Comparable<?>)))
                            }
                            
                            var_2_F4 = and:int(var_2_F4:int, ldc:int(-659840296))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_F4 = and:int(var_2_F4:int, ldc:int(1671673595))
            }
            
            putfield:Table<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>, S>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u873d\u3e2a\ud171\u7af6\u3504\u4179, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>, ternaryop:ArrayTable(invokeinterface:boolean(Table::isEmpty, var_4_72:HashBasedTable[expected:Table]), var_4_72:ArrayTable, invokestatic:ArrayTable(ArrayTable::create, var_4_72:Table)))
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    private java.util.Map<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, java.lang.Comparable<?>> \u40a9\u51fa\u99f7\u8258\uc910\u74b1(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?> p0, java.lang.Comparable<?> p1) {
        var_5_69 : HashMap
        
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
            var_5_69 = invokestatic:HashMap(Maps::newHashMap, getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>[expected:Map](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>))
            invokeinterface:Comparable<?>(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>::put, var_5_69:HashMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>[expected:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>], p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, p1:Comparable<?>)
            return:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(var_5_69:HashMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>)
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.ImmutableMap<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, java.lang.Comparable<?>> \u9af2\u61a4\u965f\u4492\u156b\u0b8e() {
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
            return:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(getfield:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u983f\uae87\ud171\ub70c\ud36e\u8350, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>))
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.Codec<S> \ub18d\u0800\u1833\u97b7\u9033\u8d98(com.mojang.serialization.Codec<O> p0, java.util.function.Function<O, S> p1) {
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
    
    private static com.mojang.serialization.Codec lambda$\u120d\ua068\ub70c\u56bd\uf9c5\u6b5f$1(java.util.function.Function p0, java.lang.Object p1) {
        var_2_61 : int
        var_4_6C : \uc31c\u74b1\u8389\u494c\u88c5\u446c
        stack_9F_0 : Codec [generated]
        
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
            var_2_61 = and:int(ldc:int(1339521386), ldc:int(1241463458))
            var_4_6C = checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokeinterface:\uc31c\u74b1\u8389\u494c\u88c5\u446c(Function<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>::apply, p0:Function<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>, p1:Object))
            
            if (logicalnot:boolean(invokevirtual:boolean(ImmutableMap::isEmpty, invokevirtual:ImmutableMap(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u9af2\u61a4\u965f\u4492\u156b\u0b8e, var_4_6C:\uc31c\u74b1\u8389\u494c\u88c5\u446c)))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-69301454))
                stack_9F_0 = invokevirtual:Codec(MapCodec::codec, invokevirtual:MapCodec(MapCodec::fieldOf, getfield:MapCodec<S>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u839e\ub8be\u12cb\u8709\u5f50\u5654, var_4_6C:\uc31c\u74b1\u8389\u494c\u88c5\u446c), ldc:String("Properties")))
            }
            else {
                stack_9F_0 = invokestatic:Codec(Codec::unit, var_4_6C:\uc31c\u74b1\u8389\u494c\u88c5\u446c[expected:Object])
            }
            
            return:Codec(stack_9F_0:Codec)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u600f\ubcb0\u8389\u52d3\u0c95\u4975$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c p0) {
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
            return:Object(getfield:O[expected:Object](\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u183a\ucef1\u5654\ub171\u9a18\u5654, p0:\uc31c\u74b1\u8389\u494c\u88c5\u446c))
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
            putstatic:Function<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, String>(\uc31c\u74b1\u8389\u494c\u88c5\u446c::\u3504\uf9c5\u071d\u3e75\u873d\ud171, initobject:\u1187\u8413\u67e9\u8389\uc29a\u4daf[expected:Function<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, String>](\u1187\u8413\u67e9\u8389\uc29a\u4daf::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u4975\u0b8e\u0c95\u4f52\u5bc4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_655 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_660 : int
        
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
        var_3_655 = and:int(ldc:int(1855151658), ldc:int(-1079057414))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(-8213825))
            var_5_81 = and:int(ldc:int(-6850), ldc:int(6849))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26981), ldc:int(24932)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_655:int, ldc:int(1068969903))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(8841), ldc:int(3079)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1376), ldc:int(1377)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_655 = and:int(var_3_DA:int, ldc:int(-1362758101))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(897), ldc:int(896)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1547538950))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1530479370))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1838028735))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0540)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1188273700))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1470281115))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1073931521))
                            var_11_EB = and:int(ldc:int(-32206), ldc:int(30156))
                            goto(Label_1509)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0540:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1722819401))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1628688180))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1699587368))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(938641996))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-565481602))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(1861334894))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1168524232))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1341752924))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1653406767))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-774614275))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1095668442))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1378987345))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1120085035))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-2091456772))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1889714843))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(1871591150))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(9474), ldc:int(9475))
                                goto(Label_1086)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1653739330))
                            goto(Label_0812)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1824899736))
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-521401665))
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-299951675))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-302811462))
                        var_11_EB = and:int(ldc:int(9130), ldc:int(-9131))
                    }
                    
                    Label_1086:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1964149608))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(127804939))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2119696835))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1421238381))
                            goto(Label_0926)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-370056734))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(884161467))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-37740674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-2145890200))
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1208816147))
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1405805388))
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(933938473))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1093437446))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1509)
                    }
                    
                    Label_1363:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(803576728))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-533614698))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-947623981))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-824713908))
                        goto(Label_0540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2095910750))
                        loopcontinue()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(2094000107))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1509:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_660 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1520:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1505178865))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-558839977))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(247330453))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-3191042))
                        var_17_660 = add:int(var_16_119:int, and:int(ldc:int(21761), ldc:int(21)))
                        looporswitchbreak()
                    }
                }
                
                var_3_655 = and:int(var_3_655:int, ldc:int(-1346206741))
                
                if (cmple:boolean(var_5_81 = var_17_660:int, sub:int(var_6_88:int, and:int(ldc:int(2179), ldc:int(13861))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(113780424))
            goto(Label_0108)
        }
    }
}
