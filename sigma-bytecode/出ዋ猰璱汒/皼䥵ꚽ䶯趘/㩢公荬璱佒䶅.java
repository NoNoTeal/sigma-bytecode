public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E> {
    public void \u3a62\u516c\u836c\u74b1\u4f52\u4d85() {
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
            invokespecial:ArrayList(ArrayList::<init>, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>)
            putfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>, initobject:Object(Object::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean add(E p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : boolean [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(-1422355412), ldc:int(-1212641171)), ldc:int(-1544235330))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1300848642))
            stack_7F_0 = invokespecial:boolean(ArrayList<E>::add, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:E)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(-1103782996))
            return:boolean(stack_7F_0:boolean)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public void add(int p0, E p1) {
        var_3_BE : int
        var_5_6A : Object
        
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
            var_3_BE = and:int(and:int(ldc:int(1678074961), ldc:int(912649233)), ldc:int(1456695233))
            monitorenter(var_5_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_BE = and:int(var_3_BE:int, ldc:int(-2074701736))
                        goto(Label_0164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_BE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_BE = and:int(var_3_BE:int, ldc:int(658984410))
                        invokespecial:void(ArrayList<E>::add, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int, p1:E)
                    }
                    
                    Label_0142:
                    
                    if (cmpeq:boolean(and:int(var_3_BE:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_BE:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_BE = and:int(var_3_BE:int, ldc:int(-1535844998))
                        monitorexit(var_5_6A:Object)
                    }
                    
                    Label_0164:
                    
                    if (cmpeq:boolean(and:int(var_3_BE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_BE:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_BE = and:int(var_3_BE:int, ldc:int(1580785013))
                }
                
                var_3_BE = and:int(var_3_BE:int, ldc:int(1012727635))
            }
            finally {
                monitorexit(var_5_6A:Object)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean addAll(java.util.Collection<? extends E> p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : boolean [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(5379223), ldc:int(1846687423)), ldc:int(1941387738))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(1759172325))
            stack_7F_0 = invokespecial:boolean(ArrayList<E>::addAll, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Collection<? extends E>)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(760739575))
            return:boolean(stack_7F_0:boolean)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public boolean addAll(int p0, java.util.Collection<? extends E> p1) {
        var_3_64 : int
        var_5_6A : Object
        stack_80_0 : boolean [generated]
        
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
        var_3_64 = and:int(and:int(ldc:int(-1500971949), ldc:int(-1326645901)), ldc:int(-789914301))
        monitorenter(var_5_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_3_64 = and:int(var_3_64:int, ldc:int(-184754969))
            stack_80_0 = invokespecial:boolean(ArrayList<E>::addAll, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int, p1:Collection<? extends E>)
            monitorexit(var_5_6A:Object)
            var_3_64 = and:int(var_3_64:int, ldc:int(-1009853345))
            return:boolean(stack_80_0:boolean)
        }
        finally {
            monitorexit(var_5_6A:Object)
        }
    }
    
    public void clear() {
        var_1_BA : int
        var_3_6A : Object
        
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
            var_1_BA = and:int(and:int(ldc:int(-578000750), ldc:int(-628991242)), ldc:int(-49517473))
            monitorenter(var_3_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_BA:int, ldc:int(32)), ldc:int(0))) {
                        var_1_BA = and:int(var_1_BA:int, ldc:int(-1722226469))
                        invokespecial:void(ArrayList<E>::clear, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>])
                    }
                    
                    Label_0131:
                    
                    if (cmpeq:boolean(and:int(var_1_BA:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_BA = and:int(var_1_BA:int, ldc:int(1486374994))
                        monitorexit(var_3_6A:Object)
                    }
                    
                    Label_0152:
                    
                    if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_BA = and:int(var_1_BA:int, ldc:int(-1173705897))
                        goto(Label_0131)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_BA = and:int(var_1_BA:int, ldc:int(-1934480420))
                }
                
                var_1_BA = and:int(var_1_BA:int, ldc:int(-1113200334))
            }
            finally {
                monitorexit(var_3_6A:Object)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object clone() {
        var_1_146 : int
        var_3_6A : Object
        var_4_78 : \u3a62\u516c\u836c\u74b1\u4f52\u4d85
        var_5_AE : Field
        stack_13B_0 : \u3a62\u516c\u836c\u74b1\u4f52\u4d85 [generated]
        var_4_140 : ReflectiveOperationException
        
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
        var_1_146 = and:int(and:int(ldc:int(502737093), ldc:int(-673223715)), ldc:int(1435983325))
        monitorenter(var_3_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_1_146 = and:int(var_1_146:int, ldc:int(500530391))
            var_4_78 = checkcast:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3a62\u516c\u836c\u74b1\u4f52\u4d85.class, invokespecial:Object[expected:\u3a62\u516c\u836c\u74b1\u4f52\u4d85](ArrayList<E>::clone, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>]))
            
            do {
                if (cmpne:boolean(and:int(var_1_146:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_146 = and:int(var_1_146:int, ldc:int(397921486))
                    putfield:int(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::modCount, var_4_78:\u3a62\u516c\u836c\u74b1\u4f52\u4d85, and:int(ldc:int(-4047), ldc:int(1994)))
                }
            } while (cmpne:boolean(and:int(var_1_146:int, ldc:int(536870912)), ldc:int(0)))
            
            var_1_146 = and:int(var_1_146:int, ldc:int(1440586478))
            var_5_AE = invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<ArrayList>(java.util.ArrayList.class), loadelement:String(getstatic:String[](\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\u93a2\uc246\u927d\ud217\u93a2\u92ee), and:int(ldc:int(4126), ldc:int(-13119))))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0260)
                }
                
                if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_146 = and:int(var_1_146:int, ldc:int(1766420875))
                }
                else {
                    var_1_146 = and:int(var_1_146:int, ldc:int(-1780647732))
                    invokevirtual:void(AccessibleObject::setAccessible, var_5_AE:Field[expected:AccessibleObject], and:int[expected:boolean](ldc:int(203), ldc:int(1793)))
                }
                
                Label_0215:
                
                if (cmpne:boolean(and:int(var_1_146:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_146:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_146 = and:int(var_1_146:int, ldc:int(-140662298))
                    invokevirtual:void(Field::set, var_5_AE:Field, var_4_78:\u3a62\u516c\u836c\u74b1\u4f52\u4d85[expected:Object], invokestatic:Object[](Arrays::copyOf, checkcast:Object[](java.lang.Object[].class, checkcast:Object[](java.lang.Object[].class, invokevirtual:Object(Field::get, var_5_AE:Field, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:Object]))), invokevirtual:int(ArrayList<E>::size, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>])))
                }
                
                Label_0260:
                
                if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0215)
                }
                
                if (cmpne:boolean(and:int(var_1_146:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_146 = and:int(var_1_146:int, ldc:int(534596068))
            stack_13B_0 = var_4_78:\u3a62\u516c\u836c\u74b1\u4f52\u4d85
            
            loop {
                if (cmpne:boolean(and:int(var_1_146:int, ldc:int(64)), ldc:int(0))) {
                    var_1_146 = and:int(var_1_146:int, ldc:int(-1073927225))
                    monitorexit(var_3_6A:Object)
                }
                
                if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_146 = and:int(var_1_146:int, ldc:int(1603220081))
            }
            
            var_1_146 = and:int(var_1_146:int, ldc:int(1069387215))
            return:Object(stack_13B_0:\u3a62\u516c\u836c\u74b1\u4f52\u4d85)
        }
        catch (java.lang.ReflectiveOperationException var_4_140) {
            var_1_146 = and:int(var_1_146:int, ldc:int(-1080717852))
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_4_140:ReflectiveOperationException[expected:Throwable]))
        }
        finally {
            monitorexit(var_3_6A:Object)
        }
    }
    
    public boolean contains(java.lang.Object p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : boolean [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(-1071585403), ldc:int(-987496955)), ldc:int(-1351104817))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1691240563))
            stack_7F_0 = invokespecial:boolean(ArrayList<E>::contains, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Object)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(-1570725905))
            return:boolean(stack_7F_0:boolean)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public void ensureCapacity(int p0) {
        var_2_CD : int
        var_4_6A : Object
        
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
            var_2_CD = and:int(and:int(ldc:int(-1047269256), ldc:int(-187696964)), ldc:int(-759202439))
            monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_2_CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_CD:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_CD = and:int(var_2_CD:int, ldc:int(-1560336922))
                    }
                    else {
                        var_2_CD = and:int(var_2_CD:int, ldc:int(-621053767))
                        invokespecial:void(ArrayList<E>::ensureCapacity, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int)
                    }
                    
                    Label_0141:
                    
                    if (cmpne:boolean(and:int(var_2_CD:int, ldc:int(256)), ldc:int(0))) {
                        var_2_CD = and:int(var_2_CD:int, ldc:int(326126628))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_CD:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_CD = and:int(var_2_CD:int, ldc:int(-875957761))
                        monitorexit(var_4_6A:Object)
                    }
                    
                    Label_0171:
                    
                    if (cmpeq:boolean(and:int(var_2_CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_CD = and:int(var_2_CD:int, ldc:int(-428899475))
                        goto(Label_0141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_CD:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_CD = and:int(var_2_CD:int, ldc:int(-1817011911))
                }
                
                var_2_CD = and:int(var_2_CD:int, ldc:int(-624853576))
            }
            finally {
                monitorexit(var_4_6A:Object)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public E get(int p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : E [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(-163028950), ldc:int(-573346502)), ldc:int(-2030507346))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1912901697))
            stack_7F_0 = invokespecial:E(ArrayList<E>::get, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(-940875209))
            return:E(stack_7F_0:E)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public int indexOf(java.lang.Object p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : int [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(61372100), ldc:int(1438512733)), ldc:int(-1275068580))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(1401781511))
            stack_7F_0 = invokespecial:int(ArrayList<E>::indexOf, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Object)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(-1243743089))
            return:int(stack_7F_0:int)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public int lastIndexOf(java.lang.Object p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_7F_0 : int [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(1910757308), ldc:int(-1283196196)), ldc:int(2076622397))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1247633636))
            stack_7F_0 = invokespecial:int(ArrayList<E>::lastIndexOf, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Object)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(1975509631))
            return:int(stack_7F_0:int)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public E remove(int p0) {
        var_2_64 : int
        var_4_6A : Object
        stack_80_0 : E [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(894456245), ldc:int(2128510783)), ldc:int(2094722389))
        monitorenter(var_4_6A = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1208914025))
            stack_80_0 = invokespecial:E(ArrayList<E>::remove, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int)
            monitorexit(var_4_6A:Object)
            var_2_64 = and:int(var_2_64:int, ldc:int(885386615))
            return:E(stack_80_0:E)
        }
        finally {
            monitorexit(var_4_6A:Object)
        }
    }
    
    public boolean remove(java.lang.Object p0) {
        var_2_67 : int
        var_4_6D : Object
        stack_84_0 : boolean [generated]
        
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
        var_2_67 = and:int(and:int(ldc:int(-1036603523), ldc:int(-1007702115)), ldc:int(-921720852))
        monitorenter(var_4_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_67 = and:int(var_2_67:int, ldc:int(-1029245180))
            stack_84_0 = invokespecial:boolean(ArrayList<E>::remove, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Object)
            monitorexit(var_4_6D:Object)
            var_2_67 = and:int(var_2_67:int, ldc:int(2101850085))
            return:boolean(stack_84_0:boolean)
        }
        finally {
            monitorexit(var_4_6D:Object)
        }
    }
    
    public boolean removeAll(java.util.Collection<?> p0) {
        var_2_67 : int
        var_4_6D : Object
        stack_84_0 : boolean [generated]
        
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
        var_2_67 = and:int(and:int(ldc:int(-299210763), ldc:int(-298064028)), ldc:int(-303075347))
        monitorenter(var_4_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_67 = and:int(var_2_67:int, ldc:int(-298156162))
            stack_84_0 = invokespecial:boolean(ArrayList<E>::removeAll, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Collection<?>)
            monitorexit(var_4_6D:Object)
            var_2_67 = and:int(var_2_67:int, ldc:int(-8720537))
            return:boolean(stack_84_0:boolean)
        }
        finally {
            monitorexit(var_4_6D:Object)
        }
    }
    
    public boolean retainAll(java.util.Collection<?> p0) {
        var_2_67 : int
        var_4_6D : Object
        stack_84_0 : boolean [generated]
        
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
        var_2_67 = and:int(and:int(ldc:int(636201950), ldc:int(2111499023)), ldc:int(-273765617))
        monitorenter(var_4_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_67 = and:int(var_2_67:int, ldc:int(-411128465))
            stack_84_0 = invokespecial:boolean(ArrayList<E>::retainAll, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:Collection<?>)
            monitorexit(var_4_6D:Object)
            var_2_67 = and:int(var_2_67:int, ldc:int(-269030515))
            return:boolean(stack_84_0:boolean)
        }
        finally {
            monitorexit(var_4_6D:Object)
        }
    }
    
    public E set(int p0, E p1) {
        var_3_67 : int
        var_5_6D : Object
        stack_85_0 : E [generated]
        
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
        var_3_67 = and:int(and:int(ldc:int(-1802159134), ldc:int(307198473)), ldc:int(-1828292448))
        monitorenter(var_5_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_3_67 = and:int(var_3_67:int, ldc:int(-1596130471))
            stack_85_0 = invokespecial:E(ArrayList<E>::set, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int, p1:E)
            monitorexit(var_5_6D:Object)
            var_3_67 = and:int(var_3_67:int, ldc:int(-1815250448))
            return:E(stack_85_0:E)
        }
        finally {
            monitorexit(var_5_6D:Object)
        }
    }
    
    public java.util.List<E> subList(int p0, int p1) {
        var_3_67 : int
        var_5_6D : Object
        stack_85_0 : List<E> [generated]
        
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
        var_3_67 = and:int(and:int(ldc:int(-1869517227), ldc:int(2059255215)), ldc:int(2109437823))
        monitorenter(var_5_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_3_67 = and:int(var_3_67:int, ldc:int(-118917659))
            stack_85_0 = invokespecial:List<E>(ArrayList<E>::subList, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:int, p1:int)
            monitorexit(var_5_6D:Object)
            var_3_67 = and:int(var_3_67:int, ldc:int(396174893))
            return:List<E>(stack_85_0:List<E>)
        }
        finally {
            monitorexit(var_5_6D:Object)
        }
    }
    
    public java.lang.Object[] toArray() {
        var_1_67 : int
        var_3_6D : Object
        stack_81_0 : Object[] [generated]
        
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
        var_1_67 = and:int(and:int(ldc:int(973024129), ldc:int(-103827751)), ldc:int(-1053045))
        monitorenter(var_3_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_1_67 = and:int(var_1_67:int, ldc:int(2112824053))
            stack_81_0 = invokespecial:Object[](ArrayList<E>::toArray, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>])
            monitorexit(var_3_6D:Object)
            var_1_67 = and:int(var_1_67:int, ldc:int(-1174540583))
            return:Object[](stack_81_0:Object[])
        }
        finally {
            monitorexit(var_3_6D:Object)
        }
    }
    
    public T[] toArray(T[] p0) {
        var_2_67 : int
        var_4_6D : Object
        stack_84_0 : T[] [generated]
        
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
        var_2_67 = and:int(and:int(ldc:int(-1249625996), ldc:int(-1276684099)), ldc:int(-356630921))
        monitorenter(var_4_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        
        try {
            var_2_67 = and:int(var_2_67:int, ldc:int(1049984693))
            stack_84_0 = invokespecial:T[](ArrayList<E>::toArray, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>], p0:T[])
            monitorexit(var_4_6D:Object)
            var_2_67 = and:int(var_2_67:int, ldc:int(1857435901))
            return:T[](stack_84_0:T[])
        }
        finally {
            monitorexit(var_4_6D:Object)
        }
    }
    
    public void trimToSize() {
        var_1_B2 : int
        var_3_6D : Object
        
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
            var_1_B2 = and:int(and:int(ldc:int(1843805106), ldc:int(-1075413230)), ldc:int(402618194))
            monitorenter(var_3_6D = getfield:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\ud36e\u6fb0\u3504\u3776\ub102\u7873, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_B2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_B2 = and:int(var_1_B2:int, ldc:int(-134841481))
                        invokespecial:void(ArrayList<E>::trimToSize, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:ArrayList<E>])
                    }
                    
                    Label_0137:
                    
                    if (cmpeq:boolean(and:int(var_1_B2:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_B2:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_B2 = and:int(var_1_B2:int, ldc:int(1442277715))
                        monitorexit(var_3_6D:Object)
                    }
                    
                    Label_0159:
                    
                    if (cmpne:boolean(and:int(var_1_B2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B2:int, ldc:int(65536)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_B2 = and:int(var_1_B2:int, ldc:int(99558195))
            }
            finally {
                monitorexit(var_3_6D:Object)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.ListIterator<E> listIterator() {
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
            return:ListIterator<E>(initobject:\ub113\u67e9\ube23\u7873\ua562\u71ae[expected:ListIterator<E>](\ub113\u67e9\ube23\u7873\ua562\u71ae::<init>, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>, and:int(ldc:int(-7515), ldc:int(7434))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Iterator<E> iterator() {
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
            return:Iterator<E>(initobject:\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56[expected:Iterator<E>](\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56::<init>, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_338 : int
        expr_6E : int [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_144_0 : byte[] [generated]
        stack_146_0 : byte[] [generated]
        stack_182_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_1C0_0 : byte[] [generated]
        stack_235_0 : byte[] [generated]
        stack_286_0 : byte[] [generated]
        stack_2FD_0 : byte[] [generated]
        stack_352_0 : byte[] [generated]
        stack_3CF_0 : byte[] [generated]
        var_4_206 : int
        var_3_20B : byte[]
        var_5_20C : int
        expr_235 : byte [generated]
        var_0_348 : int
        expr_352 : byte [generated]
        stack_39A_2 : byte [generated]
        stack_378_0 : byte [generated]
        var_2_BE : byte[]
        expr_C2 : int [generated]
        var_3_274 : byte[]
        var_5_275 : int
        expr_109 : int [generated]
        expr_146 : int [generated]
        expr_184 : int [generated]
        var_3_3BD : byte[]
        var_5_3BE : int
        var_3_1CC : String
        stack_1FF_0 : String[] [generated]
        expr_1DE : String[] [generated]
        
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
        var_0_338 = and:int(ldc:int(1521076601), ldc:int(-303209159))
        expr_6E = arraylength:int(stack_BE_0 = stack_C0_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tsYIYY5hcffmeeYI")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_206 = expr_6E:int
        var_3_20B = newarray:byte[](byte.class, expr_6E:int)
        var_5_20C = expr_6E:int
        Label_0526:
        
        while (cmpeq:boolean(and:int(var_0_338:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_338:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0717)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(-377755701))
            var_5_20C = add:int(var_5_20C:int, ldc:int(-1))
            expr_235 = loadelement:byte(stack_235_0:byte[], var_5_20C:int)
            storeelement:byte(var_3_20B:byte[], var_5_20C:int, or:int(and:int(shl:int(expr_235:byte, and:int(ldc:int(25604), ldc:int(420))), ldc:int(-16)), and:int(shr:int(expr_235:byte[expected:int], and:int(ldc:int(12292), ldc:int(1175))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_20C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C0_0 = stack_BE_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = var_3_20B:byte[]
            goto(Label_0115)
        }
        
        var_0_338 = and:int(var_0_338:int, ldc:int(797109446))
        goto(Label_0812)
        Label_0717:
        
        while (cmpeq:boolean(and:int(var_0_338:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_338 = and:int(var_0_338:int, ldc:int(667085985))
                goto(Label_0526)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(1567322105))
            var_5_20C = add:int(var_5_20C:int, ldc:int(-1))
            storeelement:byte(var_3_20B:byte[], var_5_20C:int, xor:byte(loadelement:byte(stack_2FD_0:byte[], var_5_20C:int), ldc:byte(33)))
            
            if (cmpne:boolean(var_5_20C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C0_0 = stack_BE_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = var_3_20B:byte[]
            goto(Label_0270)
        }
        
        var_0_338 = and:int(var_0_338:int, ldc:int(1846167492))
        Label_0812:
        
        while (cmpne:boolean(and:int(var_0_338:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0526)
            }
            
            var_0_348 = and:int(var_0_338:int, ldc:int(-381692931))
            var_5_20C = add:int(var_5_20C:int, ldc:int(-1))
            expr_352 = stack_39A_2 = loadelement(stack_352_0, var_5_20C)
            
            if (cmplt:boolean(add:int(add:int(var_5_20C:int, ldc:int(5)), neg:int(var_4_206:int)), ldc:int(0))) {
                stack_39A_2 = stack_378_0 = add:byte(expr_352:byte, loadelement:byte(var_3_20B:byte[], add:int(var_5_20C:int, ldc:int(5))))
                goto(Label_0904)
            }
            
            Label_0863:
            
            if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_348 = and:int(var_0_348:int, ldc:int(1238853428))
            }
            else {
                var_0_348 = and:int(var_0_348:int, ldc:int(1220264233))
                stack_39A_2 = stack_378_0 = add:byte(expr_352:byte, ldc:byte(5))
            }
            
            Label_0904:
            
            if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0863)
            }
            
            var_0_338 = and:int(var_0_348:int, ldc:int(1304127805))
            storeelement:byte(var_3_20B:byte[], var_5_20C:int, stack_39A_2:byte)
            
            if (cmpne:boolean(var_5_20C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C0_0 = stack_BE_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = var_3_20B:byte[]
            goto(Label_0331)
        }
        
        var_0_338 = and:int(var_0_338:int, ldc:int(1428107587))
        goto(Label_0717)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(131072)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(1767277162))
            goto(Label_0393)
        }
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(256)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-862351906))
            goto(Label_0331)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(2)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1083977338))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(4096)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-2075667736))
        }
        else {
            var_0_338 = and:int(var_0_338:int, ldc:int(1596573577))
            var_2_BE = stack_BE_0:byte[]
            expr_C2 = add:int(arraylength:int(stack_C0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C2:int, ldc:int(0))) {
                var_3_274 = newarray:byte[](byte.class, expr_C2:int)
                var_5_275 = expr_C2:int
                
                loop {
                    var_0_338 = and:int(var_0_338:int, ldc:int(2092921291))
                    var_5_275 = add:int(var_5_275:int, ldc:int(-1))
                    storeelement:byte(var_3_274:byte[], var_5_275:int, add:int(shl:int(loadelement:byte(stack_286_0:byte[], var_5_275:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BE:byte[], add:int(var_5_275:int, xor:int(ldc:int(66), ldc:int(67)))), ldc:int(7)), xor:int(ldc:int(20996), ldc:int(20997)))))
                    
                    if (cmpne:boolean(var_5_275:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C0_0 = stack_BE_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = var_3_274:byte[]
            }
        }
        
        Label_0199:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(524288)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(1246190887))
            goto(Label_0393)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(262144)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-738908256))
            goto(Label_0331)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_338:int, ldc:int(131072)), ldc:int(0))) {
                var_0_338 = and:int(var_0_338:int, ldc:int(163913039))
                goto(Label_0115)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(2126506347))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_4_206 = expr_109:int
                var_3_20B = newarray:byte[](byte.class, expr_109:int)
                var_5_20C = expr_109:int
                goto(Label_0717)
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(65536)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1660707656))
            goto(Label_0393)
        }
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(16384)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1416448319))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0199)
            }
            
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(-71476883))
            expr_146 = arraylength:int(stack_146_0:byte[])
            
            if (cmpne:boolean(expr_146:int, ldc:int(0))) {
                var_4_206 = expr_146:int
                var_3_20B = newarray:byte[](byte.class, expr_146:int)
                var_5_20C = expr_146:int
                goto(Label_0812)
            }
        }
        
        Label_0331:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(65536)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-103949301))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0270)
            }
            
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0199)
            }
            
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_338 = and:int(var_0_338:int, ldc:int(-2039294156))
                goto(Label_0115)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(1798037341))
            expr_184 = arraylength:int(stack_184_0:byte[])
            
            if (cmpne:boolean(expr_184:int, ldc:int(0))) {
                var_3_3BD = newarray:byte[](byte.class, expr_184:int)
                var_5_3BE = expr_184:int
                
                loop {
                    var_0_338 = and:int(var_0_338:int, ldc:int(2016110969))
                    var_5_3BE = add:int(var_5_3BE:int, ldc:int(-1))
                    storeelement:byte(var_3_3BD:byte[], var_5_3BE:int, add:byte(loadelement:byte(stack_3CF_0:byte[], var_5_3BE:int), ldc:byte(96)))
                    
                    if (cmpne:boolean(var_5_3BE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C0_0 = stack_BE_0 = stack_107_0 = stack_109_0 = stack_144_0 = stack_146_0 = stack_182_0 = stack_184_0 = stack_1C0_0 = stack_235_0 = stack_286_0 = stack_2FD_0 = stack_352_0 = stack_3CF_0 = var_3_3BD:byte[]
            }
        }
        
        Label_0393:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0331)
        }
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(1)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1836490001))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(8)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1447905531))
            goto(Label_0199)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(8)), ldc:int(0))) {
            var_3_1CC = initobject:String(String::<init>, stack_1C0_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1FF_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3395), ldc:int(677)))
            expr_1DE = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-25600), ldc:int(-25599)))
            storeelement:String(expr_1DE:String[], and:int(ldc:int(-18982), ldc:int(18981)), invokevirtual:String[expected:String](String::substring, var_3_1CC:String, and:int(ldc:int(-3139), ldc:int(3138)), xor:int(ldc:int(-31224), ldc:int(-31229))))
            putstatic:String[](\u3a62\u516c\u836c\u74b1\u4f52\u4d85::\u93a2\uc246\u927d\ud217\u93a2\u92ee, expr_1DE:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7af6\ufcaf\uc4d2\u40a9\u4ab3\u4daf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(-1645451693), ldc:int(2092072657))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(-1108869383))
            var_5_81 = and:int(ldc:int(26403), ldc:int(-26476))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21356), ldc:int(-24445)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_645:int, ldc:int(-1661075845))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(5380), ldc:int(5381)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(16585), ldc:int(1043)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_D1:int, ldc:int(-51025927))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(801), ldc:int(800)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1526561792))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2088299122))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1517641889))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(314458319))
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(143108776))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1138482833))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1175890928))
                    }
                    else {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1052698227))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(835675033))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1059327135))
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1134479440))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-559094155))
                            var_11_E2 = and:int(ldc:int(4467), ldc:int(-13180))
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0574:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2141370738))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-566079984))
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-303568935))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(844916760))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1018488563))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(277842203))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1567306521))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-762967018))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1575581427))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1102293523))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1222120636))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(726360351))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1068398559))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(5153), ldc:int(2315))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0919:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2112657891))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1338854634))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1706703817))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-628037289))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(133446727))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-727867486))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-576657423))
                        var_11_E2 = and:int(ldc:int(5304), ldc:int(-5305))
                    }
                    
                    Label_1090:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1146686128))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1563596444))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1162143389))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(2130260898))
                            goto(Label_0919)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-689645312))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(380970262))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1658413559))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1592424411))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2014829449))
                            goto(Label_0919)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-612078176))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1829854527))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-571703333))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1357:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1496162447))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1725431735))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1921892489))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(465673814))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2092753095))
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(1576234711))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1497:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1508:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1227904328))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1845016534))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-555352097))
                        var_17_650 = add:int(var_16_110:int, and:int(ldc:int(1569), ldc:int(2309)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-1994808854))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(-1804587))
                
                if (cmple:boolean(var_5_81 = var_17_650:int, sub:int(var_6_88:int, and:int(ldc:int(4105), ldc:int(10757))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
