public class \u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T> {
    private void \u836c\u873d\u99f7\u6b5f\ucfaf\u836c(int p0, java.util.Comparator<T> p1) {
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
        invokespecial:AbstractSet(AbstractSet::<init>, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>)
        putfield:Comparator<T>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u47c2\u16f6\u6d69\u6ec6\ud4fe\u5fe1, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p1:Comparator<T>)
        
        if (cmpge:boolean(p0:int, ldc:int(0))) {
            putfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, checkcast:Object[](java.lang.Object[].class, invokestatic:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u1187\u760c\u8753\u3e75\u56bd\u9937, newarray:Object[](java.lang.Object.class, p0:int))))
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u9937\uae5d\u67d0\u4e72\u1187\uc4d2), and:int(ldc:int(29326), ldc:int(-30671)))), p0:int), loadelement:String(getstatic:String[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u9937\uae5d\u67d0\u4e72\u1187\uc4d2), and:int(ldc:int(297), ldc:int(9793)))))))
    }
    
    public static \u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T> \u9033\ud51e\uc9f6\ube23\u385b\uc229(int p0) {
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
            return:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>(initobject:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::<init>, p0:int, invokestatic:Comparator<T>(Comparator<T>::naturalOrder)))
        }
        
        goto(Label_0006)
    }
    
    private static T[] \u1187\u760c\u8753\u3e75\u56bd\u9937(java.lang.Object[] p0) {
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
            return:T[](checkcast:Object[][expected:T[]](java.lang.Object[].class, p0:Object[][expected:T[]]))
        }
        
        goto(Label_0006)
    }
    
    private int \u983f\u69d9\u9033\u3504\uf9c5\u6c52(T p0) {
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
            return:int(invokestatic:int(Arrays::binarySearch, getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(-18388), ldc:int(18323)), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p0:T[expected:Object], getfield:Comparator<T>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u47c2\u16f6\u6d69\u6ec6\ud4fe\u5fe1, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u67d0\u5245\u98a4\u72f1\u3711\u8c8a(int p0) {
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
            return:int(sub:int(neg:int(p0:int), xor:int(ldc:int(18592), ldc:int(18593))))
        }
        
        goto(Label_0006)
    }
    
    public boolean add(T p0) {
        var_4_65 : int
        
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
        var_4_65 = invokespecial:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u983f\u69d9\u9033\u3504\uf9c5\u6c52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:T)
        
        if (cmplt:boolean(var_4_65:int, ldc:int(0))) {
            invokespecial:void(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\ub83f\u8350\ucb79\u6198\u8413\uc3e3, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:T, invokestatic:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u67d0\u5245\u98a4\u72f1\u3711\u8c8a, var_4_65:int))
            return:boolean(and:int[expected:boolean](ldc:int(137), ldc:int(2071)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-26579), ldc:int(25554)))
    }
    
    private void \u3504\u600f\ud12e\u61a4\ub32d\u88c5(int p0) {
        var_2_8F : int
        var_4_9F : Object[]
        
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
            var_2_8F = and:int(ldc:int(1276292341), ldc:int(472902549))
            
            if (cmpgt:boolean(p0:int, arraylength:int(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>)))) {
                if (cmpeq:boolean(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getstatic:Object[](ObjectArrays::DEFAULT_EMPTY_ARRAY))) {
                    goto(Label_0132)
                }
                
                p0 = l2i:int(invokestatic:long(Math::max, invokestatic:long(Math::min, add:long(i2l:long(arraylength:int(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))), i2l:long(shr:int(arraylength:int(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>)), xor:int(ldc:int(1289), ldc:int(1288))))), ldc:long(2147483639L)), i2l:long(p0:int)))
                goto(Label_0150)
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_2_8F:int, ldc:int(67108864)), ldc:int(0))) {
                return:void()
            }
            
            Label_0132:
            
            if (cmpeq:boolean(and:int(var_2_8F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_2_8F = and:int(var_2_8F:int, ldc:int(1848802292))
            
            if (cmplt:boolean(p0:int, ldc:int(10))) {
                p0 = ldc:int(10)
            }
            
            Label_0150:
            var_2_8F = and:int(var_2_8F:int, ldc:int(1037970326))
            var_4_9F = newarray:Object[](java.lang.Object.class, p0:int)
            invokestatic:void(System::arraycopy, getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(9500), ldc:int(-13629)), var_4_9F:Object[][expected:Object], and:int(ldc:int(8517), ldc:int(-29544)), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))
            putfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, checkcast:Object[](java.lang.Object[].class, invokestatic:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u1187\u760c\u8753\u3e75\u56bd\u9937, var_4_9F:Object[])))
            goto(Label_0105)
        }
        
        goto(Label_0006)
    }
    
    private void \ub83f\u8350\ucb79\u6198\u8413\uc3e3(T p0, int p1) {
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
            invokespecial:void(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u3504\u600f\ud12e\u61a4\ub32d\u88c5, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, add:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(16385), ldc:int(15361))))
            
            if (cmpne:boolean(p1:int, getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))) {
                invokestatic:void(System::arraycopy, getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p1:int, getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), add:int(p1:int, xor:int(ldc:int(8330), ldc:int(8331))), sub:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p1:int))
            }
            
            storeelement:Object(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p1:int, p0:T[expected:Object])
            putfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, add:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), xor:int(ldc:int(1056), ldc:int(1057))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7330\u7043\u416d\uf9c5\u6fb0\u56bd(int p0) {
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
            putfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, sub:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(1097), ldc:int(4227))))
            
            if (cmpne:boolean(p0:int, getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))) {
                invokestatic:void(System::arraycopy, getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), add:int(p0:int, xor:int(ldc:int(21760), ldc:int(21761))), getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p0:int, sub:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p0:int))
            }
            
            storeelement:Object(getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), aconstnull:Object())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private T \u71ae\u4975\ua562\u8aa5\ubf56\u4f52(int p0) {
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
            return:T(loadelement:Object[expected:T](getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public T \u7043\u69d9\uf995\u1833\u718f\u6435(T p0) {
        var_4_65 : int
        
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
        var_4_65 = invokespecial:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u983f\u69d9\u9033\u3504\uf9c5\u6c52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:T)
        
        if (cmplt:boolean(var_4_65:int, ldc:int(0))) {
            invokespecial:void(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\ub83f\u8350\ucb79\u6198\u8413\uc3e3, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:T, invokestatic:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u67d0\u5245\u98a4\u72f1\u3711\u8c8a, var_4_65:int))
            return:T(p0:T)
        }
        
        return:T(invokespecial:T(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u71ae\u4975\ua562\u8aa5\ubf56\u4f52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, var_4_65:int))
    }
    
    public boolean remove(java.lang.Object p0) {
        var_4_65 : int
        
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
        var_4_65 = invokespecial:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<Object>::\u983f\u69d9\u9033\u3504\uf9c5\u6c52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:Object)
        
        if (cmplt:boolean(var_4_65:int, ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(-1232), ldc:int(1230)))
        }
        
        invokespecial:void(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u7330\u7043\u416d\uf9c5\u6fb0\u56bd, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, var_4_65:int)
        return:boolean(xor:int[expected:boolean](ldc:int(18576), ldc:int(18577)))
    }
    
    public T \u071d\u839e\uc29a\u3bc9\ub70c\uc9f6() {
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
            return:T(invokespecial:T(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>::\u71ae\u4975\ua562\u8aa5\ubf56\u4f52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, and:int(ldc:int(-6266), ldc:int(2169))))
        }
        
        goto(Label_0006)
    }
    
    public boolean contains(java.lang.Object p0) {
        var_2_5F : int
        stack_8B_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1165310020), ldc:int(-82927695))
            
            if (cmplt:boolean(invokespecial:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<Object>::\u983f\u69d9\u9033\u3504\uf9c5\u6c52, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, p0:Object), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-15020043))
                stack_8B_0 = and:int(ldc:int(-29701), ldc:int(29700))
            }
            else {
                stack_8B_0 = and:int(ldc:int(1115), ldc:int(17313))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
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
            return:Iterator<T>(initobject:\u8709\u5f50\u64ab\ud4fe\u5245\u3711[expected:Iterator<T>](\u8709\u5f50\u64ab\ud4fe\u5245\u3711::<init>, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, aconstnull:\u99f7\u47c2\u64ab\u6cfe\uc31c\u4d85()))
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
            return:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object[] toArray() {
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
            return:Object[](checkcast:Object[](java.lang.Object[].class, invokevirtual:Object[](Object[]::clone, getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))))
        }
        
        goto(Label_0006)
    }
    
    public U[] toArray(U[] p0) {
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
        
        if (cmpge:boolean(arraylength:int(p0:U[]), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))) {
            invokestatic:void(System::arraycopy, getfield:Object[][expected:Object](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(23296), ldc:int(-23361)), p0:U[][expected:Object], and:int(ldc:int(20260), ldc:int(-20261)), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))
            
            if (cmpgt:boolean(arraylength:int(p0:U[]), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>))) {
                storeelement:U(p0:U[], getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), aconstnull:U())
            }
            
            return:U[](p0:U[])
        }
        
        return:U[](checkcast:U[](U[].class, invokestatic:U[](Arrays::copyOf, getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), invokevirtual:Class<? extends Object[]>(U[]::getClass, p0:U[]))))
    }
    
    public void clear() {
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
            invokestatic:void(Arrays::fill, getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), and:int(ldc:int(11364), ldc:int(-15461)), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), aconstnull:Object())
            putfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>, and:int(ldc:int(-11050), ldc:int(2825)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_DB : int
        var_4_B1 : \u836c\u873d\u99f7\u6b5f\ucfaf\u836c
        stack_10D_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(1707386717), ldc:int(-758672567))
        
        if (cmpeq:boolean(this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(289), ldc:int(15427)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                var_2_DB = and:int(var_2_5F:int, ldc:int(-117700504))
            }
            else {
                var_2_DB = and:int(var_2_5F:int, ldc:int(-358813871))
                
                if (instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c.class, p0:Object)) {
                    var_4_B1 = checkcast:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c.class, p0:Object[expected:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c])
                    
                    if (invokeinterface:boolean(Comparator<T>::equals, getfield:Comparator<T>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u47c2\u16f6\u6d69\u6ec6\ud4fe\u5fe1, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getfield:Comparator<T>(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u47c2\u16f6\u6d69\u6ec6\ud4fe\u5fe1, var_4_B1:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c))) {
                        if (logicaland:boolean(cmpeq:boolean(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, var_4_B1:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c)), invokestatic:boolean(Arrays::equals, getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>), getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, var_4_B1:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c)))) {
                            stack_10D_0 = xor:int(ldc:int(156), ldc:int(157))
                        }
                        else {
                            var_2_DB = and:int(var_2_DB:int, ldc:int(2078712679))
                            stack_10D_0 = and:int(ldc:int(-20128), ldc:int(18575))
                        }
                        
                        return:boolean(stack_10D_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(512)), ldc:int(0))) {
                return:boolean(invokespecial:boolean(AbstractSet<E>::equals, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>[expected:AbstractSet<T>], p0:Object))
            }
            
            var_2_5F = and:int(var_2_DB:int, ldc:int(-1990100182))
        }
    }
    
    public static int \ubb2b\ub32d\uc9f6\u0800\u8709\u8258(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c p0) {
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
            return:int(getfield:int(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\uc4d2\ubded\u6bb9\u7d52\u6ec6\ube23, p0:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Object[] \u3a62\u4e72\u071d\uc87f\u446c\uf94d(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c p0) {
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
            return:Object[](getfield:Object[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\ua068\u446c\u59ec\u5654\u7006\u527a, p0:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c))
        }
        
        goto(Label_0006)
    }
    
    public static void \u760c\u76bc\u8c8a\u4f4a\u6fb0\u946b(\u3d64\u7af6\uae87\uc238\u7d52.\u836c\u873d\u99f7\u6b5f\ucfaf\u836c p0, int p1) {
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
            invokespecial:void(\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u7330\u7043\u416d\uf9c5\u6fb0\u56bd, p0:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_148 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_15B_0 : byte[] [generated]
        stack_1C6_0 : byte[] [generated]
        stack_23F_0 : byte[] [generated]
        var_4_133 : int
        var_3_138 : byte[]
        var_5_139 : int
        expr_15B : byte [generated]
        var_0_1BC : int
        expr_1C6 : byte [generated]
        stack_20D_2 : byte [generated]
        stack_1EB_0 : byte [generated]
        expr_96 : int [generated]
        var_2_B3 : byte[]
        expr_B7 : int [generated]
        var_3_22D : byte[]
        var_5_22E : int
        var_3_DE : String
        stack_12C_0 : String[] [generated]
        expr_F0 : String[] [generated]
        
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
        var_0_148 = and:int(ldc:int(1284840910), ldc:int(-1921184083))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_B3_0 = stack_B5_0 = stack_D2_0 = stack_15B_0 = stack_1C6_0 = stack_23F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7OenX/6osatPVaKsroikb1attK3nqbapZG4IRkGVnPQ=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_133 = expr_6E:int
        var_3_138 = newarray:byte[](byte.class, expr_6E:int)
        var_5_139 = expr_6E:int
        Label_0315:
        
        while (cmpne:boolean(and:int(var_0_148:int, ldc:int(1024)), ldc:int(0))) {
            var_0_148 = and:int(var_0_148:int, ldc:int(481759221))
            var_5_139 = add:int(var_5_139:int, ldc:int(-1))
            expr_15B = loadelement:byte(stack_15B_0:byte[], var_5_139:int)
            storeelement:byte(var_3_138:byte[], var_5_139:int, add:int(xor:int(or:int(and:int(shl:int(expr_15B:byte, xor:int(ldc:int(594), ldc:int(598))), ldc:int(-16)), and:int(shr:int(expr_15B:byte[expected:int], xor:int(ldc:int(296), ldc:int(300))), ldc:int(15))), ldc:int(5)), ldc:int(49)))
            
            if (cmpne:boolean(var_5_139:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_D2_0 = stack_15B_0 = stack_1C6_0 = stack_23F_0 = var_3_138:byte[]
            goto(Label_0115)
        }
        
        var_0_148 = and:int(var_0_148:int, ldc:int(-1321484823))
        Label_0422:
        
        while (cmpne:boolean(and:int(var_0_148:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1BC = and:int(var_0_148:int, ldc:int(-1390829946))
            var_5_139 = add:int(var_5_139:int, ldc:int(-1))
            expr_1C6 = stack_20D_2 = loadelement(stack_1C6_0, var_5_139)
            
            if (cmplt:boolean(add:int(add:int(var_5_139:int, ldc:int(5)), neg:int(var_4_133:int)), ldc:int(0))) {
                stack_20D_2 = stack_1EB_0 = add:byte(expr_1C6:byte, loadelement:byte(var_3_138:byte[], add:int(var_5_139:int, ldc:int(5))))
                goto(Label_0507)
            }
            
            Label_0467:
            
            if (cmpeq:boolean(and:int(var_0_1BC:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_1BC = and:int(var_0_1BC:int, ldc:int(-1507710991))
            }
            else {
                var_0_1BC = and:int(var_0_1BC:int, ldc:int(521125822))
                stack_20D_2 = stack_1EB_0 = add:byte(expr_1C6:byte, ldc:byte(5))
            }
            
            Label_0507:
            
            if (cmpne:boolean(and:int(var_0_1BC:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0467)
            }
            
            var_0_148 = and:int(var_0_1BC:int, ldc:int(-1933234249))
            storeelement:byte(var_3_138:byte[], var_5_139:int, stack_20D_2:byte)
            
            if (cmpne:boolean(var_5_139:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_D2_0 = stack_15B_0 = stack_1C6_0 = stack_23F_0 = var_3_138:byte[]
            goto(Label_0155)
        }
        
        var_0_148 = and:int(var_0_148:int, ldc:int(595450020))
        goto(Label_0315)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_148:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0188)
        }
        
        if (cmpeq:boolean(and:int(var_0_148:int, ldc:int(1024)), ldc:int(0))) {
            var_0_148 = and:int(var_0_148:int, ldc:int(-842681806))
        }
        else {
            var_0_148 = and:int(var_0_148:int, ldc:int(1584132062))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_133 = expr_96:int
                var_3_138 = newarray:byte[](byte.class, expr_96:int)
                var_5_139 = expr_96:int
                goto(Label_0422)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_148:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_148:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_148 = and:int(var_0_148:int, ldc:int(1054326437))
            var_2_B3 = stack_B3_0:byte[]
            expr_B7 = add:int(arraylength:int(stack_B5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_3_22D = newarray:byte[](byte.class, expr_B7:int)
                var_5_22E = expr_B7:int
                
                loop {
                    var_0_148 = and:int(var_0_148:int, ldc:int(2132872948))
                    var_5_22E = add:int(var_5_22E:int, ldc:int(-1))
                    storeelement:byte(var_3_22D:byte[], var_5_22E:int, add:int(shl:int(loadelement:byte(stack_23F_0:byte[], var_5_22E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B3:byte[], add:int(var_5_22E:int, and:int(ldc:int(22801), ldc:int(8257)))), ldc:int(4)), xor:int(ldc:int(24965), ldc:int(24970)))))
                    
                    if (cmpne:boolean(var_5_22E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B3_0 = stack_B5_0 = stack_D2_0 = stack_15B_0 = stack_1C6_0 = stack_23F_0 = var_3_22D:byte[]
            }
        }
        
        Label_0188:
        
        if (cmpeq:boolean(and:int(var_0_148:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_148:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_DE = initobject:String(String::<init>, stack_D2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_12C_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32511), ldc:int(-32509)))
            expr_F0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4100), ldc:int(4102)))
            storeelement:String(expr_F0:String[], and:int(ldc:int(3), ldc:int(25029)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(3166), ldc:int(-3167)), and:int(ldc:int(653), ldc:int(7503))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(16392), ldc:int(-16393)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(14351), ldc:int(16525)), xor:int(ldc:int(1115), ldc:int(1092))))
            putstatic:String[](\u836c\u873d\u99f7\u6b5f\ucfaf\u836c::\u9937\uae5d\u67d0\u4e72\u1187\uc4d2, expr_F0:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u4cd9\u516c\u156b\u9937\u156b\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
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
        var_3_696 = and:int(ldc:int(-1406487139), ldc:int(1840510293))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u836c\u873d\u99f7\u6b5f\ucfaf\u836c<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(1755568887))
            var_5_81 = and:int(ldc:int(-26461), ldc:int(9044))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16918), ldc:int(-16919)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_696:int, ldc:int(-1079992675))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(1040), ldc:int(1041)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(18189), ldc:int(6145)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_D1:int, ldc:int(1030552403))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1043), ldc:int(14981)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1646667375))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(574643820))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-19298759))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(128316868))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-610436106))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(867956057))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1235188833))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(833843513))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1831090037))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1014500559))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1751504559))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-519715558))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2036782391))
                        var_11_E2 = and:int(ldc:int(2291), ldc:int(-18932))
                        goto(Label_1544)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(633082685))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-321706224))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1124996254))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1928657745))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(826394969))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1097556185))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1741890801))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-469903205))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(161517080))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-931705702))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1260247104))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(926021696))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(820809969))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(1317), ldc:int(2561))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1944733758))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-156841164))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(136335154))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1869992960))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-520013595))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1339149747))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2108527391))
                        var_11_E2 = and:int(ldc:int(6153), ldc:int(-6154))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-560919503))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1535900738))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(147063800))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1715503995))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(619745291))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1936260475))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1078519458))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1526628180))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-297889476))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1886410364))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(592232604))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1005695859))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1544)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-661323750))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(535841890))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(588085868))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(1763759415))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(954969940))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(901979875))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1422211001))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1857927280))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(850431889))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1802761777))
                        var_17_6A1 = add:int(var_16_110:int, and:int(ldc:int(1415), ldc:int(6201)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(605502091))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1797635131))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, and:int(ldc:int(9217), ldc:int(31))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
