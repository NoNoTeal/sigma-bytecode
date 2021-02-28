public class \u5d20\u97b7\u8753\u873d\u16f6.\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T> {
    public void \u718f\uae5d\u47c2\ud51e\u3711\ufcaf(java.util.Set<T> p0, java.lang.Class<?> p1) {
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
            invokespecial:Object(Object::<init>, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>)
            putfield:Class<?>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\u8308\ub113\ub70c\uc2bd\ua562\uc31c, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>, p1:Class<?>)
            putfield:Set<T>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\u12cb\ubcb0\u3c25\u9937\uc87f\u3776, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>, p0:Set<T>)
            putfield:ImmutableList<T>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\ud217\ubf56\u7ce1\ub19c\uff55\u97b7, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>, invokestatic:ImmutableList(ImmutableList::copyOf, p0:Set<T>[expected:Collection]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T> \u8753\u5654\u6cfe\u36d3\u7e3f\ucef1() {
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
            return:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>(initobject:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>::<init>, invokestatic:ImmutableSet[expected:Set<T>](ImmutableSet::of), ldc:Class<Void>(java.lang.Void.class)))
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T> \uc4d2\u6ec6\u759a\ub32d\u120d\u3504(java.util.Set<T> p0) {
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
            return:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>(initobject:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>::<init>, p0:Set<T>, invokestatic:Class<?>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>::\u88c5\u7c6b\ub19c\u74b1\ud523\u67e9, p0:Set<T>)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3e2a\ub7dc\u1833\u6d69\u5fe1\u5245(T p0) {
        var_2_5F : int
        stack_9E_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-212498326), ldc:int(-214327602))
            
            if (logicaland:boolean(invokevirtual:boolean(Class<T>::isInstance, getfield:Class<?>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\u8308\ub113\ub70c\uc2bd\ua562\uc31c, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>), p0:T[expected:Object]), invokeinterface:boolean(Set<E>::contains, getfield:Set<T>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\u12cb\ubcb0\u3c25\u9937\uc87f\u3776, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>), p0:T[expected:Object]))) {
                stack_9E_0 = xor:int(ldc:int(-20464), ldc:int(-20463))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1971407010))
                stack_9E_0 = and:int(ldc:int(27568), ldc:int(-27633))
            }
            
            return:boolean(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \ucef1\ub32d\u7ce1\ub70c\u6b0d\u97e6() {
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
            return:List<T>(getfield:ImmutableList<T>[expected:List<T>](\u718f\uae5d\u47c2\ud51e\u3711\ufcaf::\ud217\ubf56\u7ce1\ub19c\uff55\u97b7, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Class<?> \u88c5\u7c6b\ub19c\u74b1\ud523\u67e9(java.util.Set<T> p0) {
        var_1_5F : int
        var_1_6D : int
        var_3_6F : Class<?>
        var_4_76 : Iterator<T>
        var_5_A0 : T
        
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
        var_1_5F = and:int(ldc:int(1850223160), ldc:int(-471254401))
        
        if (logicalnot:boolean(invokeinterface:boolean(Set::isEmpty, p0:Set))) {
            var_1_6D = and:int(var_1_5F:int, ldc:int(1802695418))
            var_3_6F = aconstnull:Class<?>()
            var_4_76 = invokeinterface:Iterator<T>(Set<T>::iterator, p0:Set<T>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_76:Iterator<T>)) {
                var_5_A0 = invokeinterface:T(Iterator<T>::next, var_4_76:Iterator<T>)
                
                if (cmpne:boolean(var_3_6F:Class<?>, aconstnull:Class<?>())) {
                    var_3_6F = invokestatic:Class<?>(\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>::\ubcb0\u946b\u6c52\u5fe1\u99f7\uafe7, var_3_6F:Class<?>, invokevirtual:Class<?>(Object::getClass, var_5_A0:T[expected:Object]))
                }
                else {
                    var_3_6F = invokevirtual:Class<?>(Object::getClass, var_5_A0:T[expected:Object])
                }
                
                var_1_6D = and:int(var_1_6D:int, ldc:int(-414299791))
            }
            
            return:Class<?>(var_3_6F:Class<?>)
        }
        
        return:Class<?>(ldc:Class<Void>(java.lang.Void.class))
    }
    
    private static java.lang.Class<?> \ubcb0\u946b\u6c52\u5fe1\u99f7\uafe7(java.lang.Class<?> p0, java.lang.Class<?> p1) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(1190297419), ldc:int(326958942))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(763232042))
                
                if (invokevirtual:boolean(Class<T>::isAssignableFrom, var_0_7C:Class<?>, p1:Class<?>)) {
                    looporswitchbreak()
                }
                
                var_0_7C = invokevirtual:Class<?>(Class<?>::getSuperclass, var_0_7C:Class<?>)
            }
            
            return:Class<?>(var_0_7C:Class<?>)
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
    
    public void \u7ce1\u5140\u51b2\ub1b9\u92ee\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60E : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_619 : int
        
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
        var_3_60E = and:int(ldc:int(-1331797693), ldc:int(-828386555))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\uae5d\u47c2\ud51e\u3711\ufcaf<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
            var_3_60E = and:int(var_3_60E:int, ldc:int(122761626))
        }
        else {
            var_3_60E = and:int(var_3_60E:int, ldc:int(1302265800))
            var_5_85 = and:int(ldc:int(-30491), ldc:int(28938))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9834), ldc:int(-26220)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60E:int, ldc:int(1374625183))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(8293), ldc:int(19)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4481), ldc:int(4480)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60E = and:int(var_3_D2:int, ldc:int(-225460919))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(25229), ldc:int(289)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-553009491))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1155023786))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2094964642))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1041638406))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1643917304))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1499930042))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(966682595))
                            var_11_E3 = and:int(ldc:int(-27550), ldc:int(27549))
                            goto(Label_1408)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1267830184))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(501929487))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-765739946))
                        goto(Label_1028)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-141826935))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-259100394))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1534167946))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-131627286))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1179245349))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1899707864))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-359671830))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1080322304))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1028)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1511994686))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-907031145))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4544), ldc:int(4545))
                                goto(Label_1028)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-302427214))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(907957480))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1110192207))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-503998178))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1674411833))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1370645810))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1301738286))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1434241607))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(197115781))
                        var_11_E3 = and:int(ldc:int(30214), ldc:int(-30215))
                    }
                    
                    Label_1028:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1492955720))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-2034448163))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(607004776))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2089767246))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1262)
                            }
                        }
                    }
                    
                    Label_1135:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(59323965))
                            goto(Label_1028)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(2094394661))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1666898394))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1469180441))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-2031193229))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1408)
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1497482960))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1601020036))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-979575326))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1395395767))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1476133627))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-2022506682))
                        loopcontinue()
                    }
                    
                    var_3_60E = and:int(var_3_60E:int, ldc:int(-1818293816))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1408:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_619 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1419:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-438133360))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1820369891))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1309264550))
                        goto(Label_1028)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1550071703))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1036646225))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1848372690))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(501197723))
                        var_17_619 = add:int(var_16_111:int, and:int(ldc:int(6955), ldc:int(17409)))
                        looporswitchbreak()
                    }
                    
                    var_3_60E = and:int(var_3_60E:int, ldc:int(-1113596534))
                }
                
                var_3_60E = and:int(var_3_60E:int, ldc:int(855597868))
                
                if (cmple:boolean(var_5_85 = var_17_619:int, sub:int(var_6_8C:int, and:int(ldc:int(9569), ldc:int(18433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
