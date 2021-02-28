public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u120d\u7049\ub18d\u6b5f\uc31c {
    public void \u120d\u7049\ub18d\u6b5f\uc31c(int p0) {
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
            invokespecial:Object(Object::<init>, this:\u120d\u7049\ub18d\u6b5f\uc31c)
            putfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\ua562\u760c\u965f\uceb8\u8df4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p1) {
        var_3_89 : int
        var_5_75 : \u8753\u92ee\ub70c\ua562\ud523
        var_6_7C : int
        stack_A1_0 : int [generated]
        var_7_A1 : int
        
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
            var_3_89 = and:int(ldc:int(1971939382), ldc:int(-175232902))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                var_5_75 = checkcast:\u8753\u92ee\ub70c\ua562\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\u8753\u92ee\ub70c\ua562\ud523])
                var_6_7C = invokevirtual:int(AbstractCollection<E>::size, var_5_75:\u8753\u92ee\ub70c\ua562\ud523<Object>[expected:AbstractCollection<Object>])
                
                if (cmpge:boolean(getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(2096659000))
                    stack_A1_0 = getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c)
                }
                else {
                    stack_A1_0 = add:int(var_6_7C:int, getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c))
                }
                
                var_3_89 = and:int(var_3_89:int, ldc:int(-171986959))
                var_7_A1 = stack_A1_0:int
                
                if (cmple:boolean(and:int(ldc:int(9410), ldc:int(-9411)), var_7_A1:int)) {
                    if (cmplt:boolean(var_7_A1:int, var_6_7C:int)) {
                        invokeinterface:boolean(List<\u93a2\u97b7\u647c\ud36e\u64ab>::add, p1:List<\u93a2\u97b7\u647c\ud36e\u64ab>, invokevirtual:Object(AbstractList<Object>::get, var_5_75:\u8753\u92ee\ub70c\ua562\ud523<Object>[expected:AbstractList<Object>], var_7_A1:int))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3a62\u4975\u6ec6\u76bc\u92ee\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0, java.util.function.Supplier<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p1, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p2) {
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
            invokevirtual:void(\u120d\u7049\ub18d\u6b5f\uc31c::\ud523\ua562\u760c\u965f\uceb8\u8df4, this:\u120d\u7049\ub18d\u6b5f\uc31c, p0:\u93a2\u97b7\u647c\ud36e\u64ab, p2:List<\u93a2\u97b7\u647c\ud36e\u64ab>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \u4492\u4975\u5f50\uafe7\uc87f\u36d3() {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(initobject:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\ud158\u8308\u76bc\u0a06\ud36e::<init>))
        }
        
        goto(Label_0006)
    }
    
    public int \u3776\ufcaf\u12b2\uc84e\ud171\u7af6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0, java.util.function.Supplier<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p1) {
        var_3_90 : int
        var_5_7C : \u8753\u92ee\ub70c\ua562\ud523
        var_6_83 : int
        stack_A8_0 : int [generated]
        var_7_A8 : int
        var_8_D5 : \u93a2\u97b7\u647c\ud36e\u64ab
        var_9_E0 : \u93a2\u97b7\u647c\ud36e\u64ab
        
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
            var_3_90 = and:int(ldc:int(1690544981), ldc:int(915930743))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                var_5_7C = checkcast:\u8753\u92ee\ub70c\ua562\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\u8753\u92ee\ub70c\ua562\ud523])
                var_6_83 = invokevirtual:int(AbstractCollection<E>::size, var_5_7C:\u8753\u92ee\ub70c\ua562\ud523<Object>[expected:AbstractCollection<Object>])
                
                if (cmpge:boolean(getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c), ldc:int(0))) {
                    var_3_90 = and:int(var_3_90:int, ldc:int(1285537623))
                    stack_A8_0 = getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c)
                }
                else {
                    stack_A8_0 = add:int(var_6_83:int, getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c))
                }
                
                var_3_90 = and:int(var_3_90:int, ldc:int(-425723671))
                var_7_A8 = stack_A8_0:int
                
                if (cmple:boolean(and:int(ldc:int(1924), ldc:int(-1927)), var_7_A8:int)) {
                    if (cmplt:boolean(var_7_A8:int, var_6_83:int)) {
                        var_8_D5 = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(AbstractList<\u93a2\u97b7\u647c\ud36e\u64ab>::get, var_5_7C:\u8753\u92ee\ub70c\ua562\ud523<\u93a2\u97b7\u647c\ud36e\u64ab>[expected:AbstractList<\u93a2\u97b7\u647c\ud36e\u64ab>], var_7_A8:int))
                        var_9_E0 = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Supplier<\u93a2\u97b7\u647c\ud36e\u64ab>::get, p1:Supplier<\u93a2\u97b7\u647c\ud36e\u64ab>))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Object::equals, var_9_E0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:Object], var_8_D5:\u93a2\u97b7\u647c\ud36e\u64ab[expected:Object]))) {
                            if (invokevirtual:boolean(\u8753\u92ee\ub70c\ua562\ud523<T>::\u8df4\u718f\u3c25\u36d3\u647c\u836c, var_5_7C:\u8753\u92ee\ub70c\ua562\ud523<\u93a2\u97b7\u647c\ud36e\u64ab>, var_7_A8:int, var_9_E0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                                return:int(xor:int(ldc:int(19072), ldc:int(19073)))
                            }
                        }
                    }
                }
            }
            
            return:int(and:int(ldc:int(9330), ldc:int(-11767)))
        }
        
        goto(Label_0006)
    }
    
    public int \ud171\u51fa\u4cd9\ud217\u8d98\u71ae(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0) {
        var_2_90 : int
        var_4_7C : \u8753\u92ee\ub70c\ua562\ud523
        var_5_83 : int
        stack_A8_0 : int [generated]
        var_6_A8 : int
        
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
            var_2_90 = and:int(ldc:int(1074228602), ldc:int(13762303))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                var_4_7C = checkcast:\u8753\u92ee\ub70c\ua562\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\u8753\u92ee\ub70c\ua562\ud523])
                var_5_83 = invokevirtual:int(AbstractCollection::size, var_4_7C:\u8753\u92ee\ub70c\ua562\ud523[expected:AbstractCollection])
                
                if (cmpge:boolean(getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c), ldc:int(0))) {
                    var_2_90 = and:int(var_2_90:int, ldc:int(126875647))
                    stack_A8_0 = getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c)
                }
                else {
                    stack_A8_0 = add:int(var_5_83:int, getfield:int(\u120d\u7049\ub18d\u6b5f\uc31c::\u6435\u6ec6\u67e9\u6435\ubff1\u71ae, this:\u120d\u7049\ub18d\u6b5f\uc31c))
                }
                
                var_2_90 = and:int(var_2_90:int, ldc:int(882863231))
                var_6_A8 = stack_A8_0:int
                
                if (cmple:boolean(and:int(ldc:int(5763), ldc:int(-22152)), var_6_A8:int)) {
                    if (cmplt:boolean(var_6_A8:int, var_5_83:int)) {
                        invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\u8753\u92ee\ub70c\ua562\ud523::remove, var_4_7C:\u8753\u92ee\ub70c\ua562\ud523, var_6_A8:int)
                        return:int(xor:int(ldc:int(3), ldc:int(2)))
                    }
                }
            }
            
            return:int(and:int(ldc:int(17384), ldc:int(-17401)))
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
    
    public void \u8753\uc2e8\u9033\ua562\u7d52\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_627 : int
        
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
        var_3_61C = and:int(ldc:int(-1414840587), ldc:int(-171314183))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\u7049\ub18d\u6b5f\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-2116188587))
        }
        else {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-1314948868))
            var_5_85 = and:int(ldc:int(10552), ldc:int(-14783))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2469), ldc:int(2468)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61C:int, ldc:int(-1616121107))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-16366), ldc:int(-16365)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(17), ldc:int(20521)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61C = and:int(var_3_DA:int, ldc:int(-978601241))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(3245), ldc:int(513)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1566675422))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-364678832))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-174620240))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(837651292))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-686399632))
                    }
                    else {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-72795986))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1502647472))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1328506316))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2034939129))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1522807661))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(616838280))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1948404254))
                        var_11_EB = and:int(ldc:int(4711), ldc:int(-12904))
                        goto(Label_1458)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1908142326))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1056205190))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2000706817))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1793835982))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1824242565))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-178418419))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1415857502))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1354031338))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1257106751))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1292918818))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-107056475))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1112218138))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-473074964))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2123811818))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1649003093))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1170630324))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(969526312))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-202392839))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(10897), ldc:int(1313))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1844797215))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2010561006))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(523779870))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1291301731))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1996934118))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2099465))
                        var_11_EB = and:int(ldc:int(20224), ldc:int(-20225))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-106132512))
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(135132920))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(933564417))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1225499187))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-740722970))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1770947499))
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1821983534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1981535904))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-240494123))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1488824004))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-978716948))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1458)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1678351495))
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-292860116))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1448456096))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1778814795))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1449774350))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(-1109527112))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1458:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_627 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1469:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1443025229))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(457018514))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1811992654))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-203456854))
                        var_17_627 = add:int(var_16_119:int, and:int(ldc:int(2125), ldc:int(20641)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61C = and:int(var_3_61C:int, ldc:int(-275778329))
                
                if (cmple:boolean(var_5_85 = var_17_627:int, sub:int(var_6_8C:int, xor:int(ldc:int(4115), ldc:int(4114))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-2099340981))
            goto(Label_0106)
        }
    }
}
