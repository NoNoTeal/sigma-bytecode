public abstract class \u5245\u8aa5\u61a4\u7049\u4cd9.\u51b2\u156b\ub19c\u8640\ud4fe<T> {
    public void \u51b2\u156b\ub19c\u8640\ud4fe(T p0, java.util.Date p1, java.lang.String p2, java.util.Date p3, java.lang.String p4) {
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
            invokespecial:\u3d4b\ud217\ubcb0\u6cfe\u873d<T>(\u3d4b\ud217\ubcb0\u6cfe\u873d<T>::<init>, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>[expected:\u3d4b\ud217\ubcb0\u6cfe\u873d<T>], p0:T)
            putfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\uc87f\uc238\ud158\u67d0\u34df\uc31c, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, ternaryop:Date(cmpne:boolean(p1:Date, aconstnull:Date()), p1:Date, initobject:Date(Date::<init>)))
            putfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\u3bd6\ub7dc\uc238\u88c5\u516c\uc238, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, ternaryop:String(cmpne:boolean(p2:String, aconstnull:String()), p2:String, ldc:String("(Unknown)")))
            putfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, p3:Date)
            putfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\ud158\u56bd\uafe7\u7043\u965f\u8389, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, ternaryop:String(cmpne:boolean(p4:String, aconstnull:String()), p4:String, ldc:String("Banned by an operator.")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51b2\u156b\ub19c\u8640\ud4fe(T p0, com.google.gson.JsonObject p1) {
        var_5_9A : Date
        var_6_117 : Date
        
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
            invokespecial:\u3d4b\ud217\ubcb0\u6cfe\u873d<T>(\u3d4b\ud217\ubcb0\u6cfe\u873d<T>::<init>, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>[expected:\u3d4b\ud217\ubcb0\u6cfe\u873d<T>], p0:T)
            
            try {
                var_5_9A = ternaryop:Date(invokevirtual:boolean(JsonObject::has, p1:JsonObject, ldc:String("created")), invokevirtual:Date(DateFormat::parse, getstatic:SimpleDateFormat[expected:DateFormat](\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20), invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, p1:JsonObject, ldc:String("created")))), initobject:Date(Date::<init>))
            }
            catch (java.text.ParseException var_6_A7) {
                var_5_9A = initobject:Date(Date::<init>)
            }
            
            putfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\uc87f\uc238\ud158\u67d0\u34df\uc31c, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, var_5_9A:Date)
            putfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\u3bd6\ub7dc\uc238\u88c5\u516c\uc238, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, ternaryop:String(invokevirtual:boolean(JsonObject::has, p1:JsonObject, ldc:String("source")), invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, p1:JsonObject, ldc:String("source"))), ldc:String("(Unknown)")))
            
            try {
                var_6_117 = ternaryop:Date(invokevirtual:boolean(JsonObject::has, p1:JsonObject, ldc:String("expires")), invokevirtual:Date(DateFormat::parse, getstatic:SimpleDateFormat[expected:DateFormat](\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20), invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, p1:JsonObject, ldc:String("expires")))), aconstnull:Date())
            }
            catch (java.text.ParseException var_7_124) {
                var_6_117 = aconstnull:Date()
            }
            
            putfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, var_6_117:Date)
            putfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\ud158\u56bd\uafe7\u7043\u965f\u8389, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>, ternaryop:String(invokevirtual:boolean(JsonObject::has, p1:JsonObject, ldc:String("reason")), invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, p1:JsonObject, ldc:String("reason"))), ldc:String("Banned by an operator.")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u7043\u9af2\u5db4\u61a4\u7ce1\ucfaf() {
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
            return:String(getfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\u3bd6\ub7dc\uc238\u88c5\u516c\uc238, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Date \u8640\uc29a\u93a2\u071d\u59ec\u0b8e() {
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
            return:Date(getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u7bad\uc229\uc31c\u5f50\u120d\u62da() {
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
            return:String(getfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\ud158\u56bd\uafe7\u7043\u965f\u8389, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
        }
        
        goto(Label_0006)
    }
    
    public abstract net.minecraft.util.text.ITextComponent \u69d9\ubff1\u6ec6\u156b\u6d99\uc29a();
    
    public boolean \u4c04\u4179\uc3e3\u5140\u56bd\ub19c() {
        var_1_5F : int
        stack_8D_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-309635540), ldc:int(-307133201))
            
            if (cmpne:boolean(getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>), aconstnull:Date())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1078649372))
                stack_8D_0 = invokevirtual:boolean[expected:int](Date::before, getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>), initobject:Date(Date::<init>))
            }
            else {
                stack_8D_0 = and:int(ldc:int(-2256), ldc:int(2255))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u4492\uceb8\u93a2\u4f52\ubb2b(com.google.gson.JsonObject p0) {
        var_2_5F : int
        stack_A1_1 : String [generated]
        stack_A1_2 : String [generated]
        
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
            var_2_5F = and:int(ldc:int(1955474968), ldc:int(-88133861))
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, ldc:String("created"), invokevirtual:String(DateFormat::format, getstatic:SimpleDateFormat[expected:DateFormat](\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20), getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\uc87f\uc238\ud158\u67d0\u34df\uc31c, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>)))
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, ldc:String("source"), getfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\u3bd6\ub7dc\uc238\u88c5\u516c\uc238, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
            stack_A1_1 = ldc:String("expires")
            
            if (cmpne:boolean(getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>), aconstnull:Date())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1895771838))
                stack_A1_2 = invokevirtual:String(DateFormat::format, getstatic:SimpleDateFormat[expected:DateFormat](\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20), getfield:Date(\u51b2\u156b\ub19c\u8640\ud4fe::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
            }
            else {
                stack_A1_2 = ldc:String("forever")
            }
            
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, stack_A1_1:String, stack_A1_2:String)
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, ldc:String("reason"), getfield:String(\u51b2\u156b\ub19c\u8640\ud4fe::\ud158\u56bd\uafe7\u7043\u965f\u8389, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>))
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
            putstatic:SimpleDateFormat(\u51b2\u156b\ub19c\u8640\ud4fe::\u47c2\u40a9\u9033\u759a\u5db4\u5d20, initobject:SimpleDateFormat(SimpleDateFormat::<init>, ldc:String("yyyy-MM-dd HH:mm:ss Z")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0b8e\u8c8a\u836c\ua068\ucef1\u4f52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(-789684332), ldc:int(-1292152947))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u51b2\u156b\ub19c\u8640\ud4fe<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1795515110))
            var_5_7D = and:int(ldc:int(-11179), ldc:int(11146))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32591), ldc:int(26180)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5DD:int, ldc:int(-51750047))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(3), ldc:int(4273)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(1), ldc:int(15041)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_CA:int, ldc:int(-9761994))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(3112), ldc:int(3113)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2104162106))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1494294697))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(26073237))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-50435185))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1232813709))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(580093038))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1810379487))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1590969996))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-546391084))
                        var_11_DB = and:int(ldc:int(22880), ldc:int(-23009))
                        goto(Label_1395)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1885189061))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1840295552))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-998127959))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1463119418))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(145200622))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(339987285))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-118805642))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(105611364))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1329015936))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1197799425))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1902562540))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1664580375))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1845564112))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1465705685))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-494143056))
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1709462955))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1706411699))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1756713578))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-928517544))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1574602954))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1150603920))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8484), ldc:int(8485))
                                goto(Label_1069)
                            }
                        }
                    }
                    
                    Label_0918:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-465148305))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(443759768))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1345357073))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1675266469))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1728422116))
                        var_11_DB = and:int(ldc:int(-23555), ldc:int(23554))
                    }
                    
                    Label_1069:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1855393154))
                            goto(Label_0918)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-768153238))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-131719595))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-261125324))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1267)
                            }
                        }
                    }
                    
                    Label_1176:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1069)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0918)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-235234555))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1395)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1267:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(917562311))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(622552585))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-486124683))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(485031995))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1209337513))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1395:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1406:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(681062211))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-868382349))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-436845219))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1771374216))
                        var_17_5E8 = add:int(var_16_109:int, and:int(ldc:int(4609), ldc:int(33)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1745184472))
                
                if (cmple:boolean(var_5_7D = var_17_5E8:int, sub:int(var_6_84:int, and:int(ldc:int(4225), ldc:int(3))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
