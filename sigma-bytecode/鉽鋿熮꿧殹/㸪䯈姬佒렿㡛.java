public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T> {
    public void \u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0) {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6)), ldc:String(" Array"))), invokestatic:Class<?>(\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>::\u3d64\u600f\u5140\u7006\u1833\ubb2b, invokevirtual:Class<? super T>(\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)))
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>(\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b::\u4f4a\u97b7\u759a\u156b\u34df\u7ce1, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Class<?> \u3d64\u600f\u5140\u7006\u1833\ubb2b(java.lang.Class<?> p0) {
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
            return:Class<?>(invokevirtual:Class<?>(Object::getClass, invokestatic:Object(Array::newInstance, p0:Class<?>, and:int(ldc:int(19811), ldc:int(-19812)))))
        }
        
        goto(Label_0006)
    }
    
    public T[] \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_67 : int
        var_5_7B : Object[]
        var_6_84 : int
        
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
            var_2_5F = and:int(ldc:int(805270977), ldc:int(-436267541))
            var_4_67 = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_5_7B = checkcast:Object[](java.lang.Object[].class, checkcast:Object[](java.lang.Object[].class, invokestatic:Object[expected:Object[]](Array::newInstance, invokevirtual:Class<? super T>(\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, getfield:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>(\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b::\u4f4a\u97b7\u759a\u156b\u34df\u7ce1, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>)), var_4_67:int)))
            var_6_84 = and:int(ldc:int(-23024), ldc:int(18735))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(670769023))
                
                if (cmpge:boolean(var_6_84:int, var_4_67:int)) {
                    looporswitchbreak()
                }
                
                storeelement:Object(var_5_7B:Object[], var_6_84:int, invokevirtual:Object(\u8389\u494c\u527a\u8753\ub1b9\u8640<Object>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getfield:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<Object>](\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b::\u4f4a\u97b7\u759a\u156b\u34df\u7ce1, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>), p0:ByteBuf))
                inc:int(var_6_84, ldc:int(1))
            }
            
            return:T[](var_5_7B:Object[])
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, T[] p1) {
        var_3_5F : int
        var_6_6F : int
        var_7_78 : int
        
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
            var_3_5F = and:int(ldc:int(1285088937), ldc:int(-319240140))
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, arraylength:int(p1:T[]))
            var_6_6F = arraylength:int(p1:T[])
            var_7_78 = and:int(ldc:int(-4696), ldc:int(4679))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1788665652))
                
                if (cmpge:boolean(var_7_78:int, var_6_6F:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<T>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getfield:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<T>](\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b::\u4f4a\u97b7\u759a\u156b\u34df\u7ce1, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>), p0:ByteBuf, loadelement:T(p1:T[], var_7_78:int))
                inc:int(var_7_78, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:T[][expected:Object](\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<Object>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>, p0:ByteBuf, checkcast:Object[](java.lang.Object[].class, p1:Object[expected:Object[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(1393470386), ldc:int(-1189347602))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(1640763404))
        }
        else {
            var_3_641 = and:int(var_3_641:int, ldc:int(1202142187))
            var_5_85 = and:int(ldc:int(-8211), ldc:int(8210))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7376), ldc:int(7367)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_641:int, ldc:int(765115105))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16477), ldc:int(10913)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(68), ldc:int(69)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D2:int, ldc:int(-76629060))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(18915), ldc:int(1)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1033265522))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2085946698))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1644966635))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1035807375))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(967751884))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1607575463))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1501856255))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1841589652))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1741624997))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2068892275))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2005815208))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(130811288))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-373302132))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1361958068))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-605390861))
                        var_11_E3 = and:int(ldc:int(-23607), ldc:int(7222))
                        goto(Label_1468)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1647650460))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1384073353))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1776756414))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1152922642))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(491453781))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1066089749))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(458008309))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1659712853))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1121356831))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(644261242))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(464829336))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1584902267))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2116420918))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1621358181))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(23950240))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(586), ldc:int(587))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-755317493))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1320126655))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1876387427))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1653399780))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1853704254))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1542989616))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1430907560))
                        var_11_E3 = and:int(ldc:int(27912), ldc:int(-27913))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1805444353))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1491633791))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(282790761))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(192844831))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(527106019))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1322)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1245666417))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1402583386))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1966964146))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1753189639))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1744075688))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1468)
                    }
                    
                    Label_1322:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1068811125))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1785972332))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(379951357))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(360733081))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1536744743))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-73594344))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(-471145796))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1468:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1479:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1921405725))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(438193738))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(391477996))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2140932622))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1875184194))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1308436214))
                        var_17_64C = add:int(var_16_111:int, and:int(ldc:int(5265), ldc:int(8455)))
                        looporswitchbreak()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(1288341505))
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-1961221148))
                
                if (cmple:boolean(var_5_85 = var_17_64C:int, sub:int(var_6_8C:int, xor:int(ldc:int(9216), ldc:int(9217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
