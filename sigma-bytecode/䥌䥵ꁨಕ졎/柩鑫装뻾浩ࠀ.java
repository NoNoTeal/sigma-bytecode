public class \u494c\u4975\ua068\u0c95\uc84e.\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T> {
    public void \u67e9\u946b\u88c5\ubefe\u6d69\u0800(java.util.Iterator<T> p0, java.util.Iterator<T> p1, java.util.Comparator<T> p2) {
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
            invokespecial:AbstractIterator(AbstractIterator::<init>, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>)
            putfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3bc9\u6fb0\u8350\u8753\u183a\u52d3, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>, invokestatic:PeekingIterator(Iterators::peekingIterator, p0:Iterator<T>))
            putfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>, invokestatic:PeekingIterator(Iterators::peekingIterator, p1:Iterator<T>))
            putfield:Comparator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3e75\uf9c5\u759a\u927d\u3e75\u0a06, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>, p2:Comparator<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T computeNext() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        var_1_8A : int
        var_3_8B : int
        stack_B7_0 : int [generated]
        var_1_C8 : int
        var_4_B7 : int
        var_1_11E : int
        var_5_13A : int
        var_1_16D : int
        stack_1D7_0 : Object [generated]
        
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
        var_1_5F = and:int(ldc:int(-627828535), ldc:int(-3692061))
        
        if (invokeinterface:boolean(PeekingIterator::hasNext, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3bc9\u6fb0\u8350\u8753\u183a\u52d3, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1146597667))
            stack_8B_0 = and:int(ldc:int(-12280), ldc:int(11911))
        }
        else {
            stack_8B_0 = and:int(ldc:int(8461), ldc:int(1105))
        }
        
        var_1_8A = and:int(var_1_5F:int, ldc:int(-1632981784))
        var_3_8B = stack_8B_0:int
        
        if (invokeinterface:boolean(PeekingIterator::hasNext, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))) {
            var_1_8A = and:int(var_1_8A:int, ldc:int(-1651233798))
            stack_B7_0 = and:int(ldc:int(16857), ldc:int(-18938))
        }
        else {
            stack_B7_0 = and:int(ldc:int(17747), ldc:int(4105))
        }
        
        var_1_C8 = and:int(var_1_8A:int, ldc:int(-1647216412))
        var_4_B7 = stack_B7_0:int
        
        if (cmpne:boolean(var_3_8B:int, ldc:int(0))) {
            if (cmpne:boolean(var_4_B7:int, ldc:int(0))) {
                return:T(invokevirtual:Object[expected:T](\u67e9\u946b\u88c5\ubefe\u6d69\u0800::endOfData, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(2048)), ldc:int(0))) {
                var_1_C8 = and:int(var_1_C8:int, ldc:int(845337889))
                goto(Label_0252)
            }
            
            if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(4)), ldc:int(0))) {
                var_1_C8 = and:int(var_1_C8:int, ldc:int(-1508573219))
            }
            else {
                var_1_C8 = and:int(var_1_C8:int, ldc:int(-1110480393))
                
                if (cmpne:boolean(var_3_8B:int, ldc:int(0))) {
                    return:T(invokeinterface:Object[expected:T](PeekingIterator::next, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>)))
                }
            }
            
            Label_0228:
            
            if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(4194304)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_C8 = and:int(var_1_C8:int, ldc:int(-590795577))
                
                if (cmpne:boolean(var_4_B7:int, ldc:int(0))) {
                    return:T(invokeinterface:Object[expected:T](PeekingIterator::next, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3bc9\u6fb0\u8350\u8753\u183a\u52d3, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>)))
                }
            }
            
            Label_0252:
            
            if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(131072)), ldc:int(0))) {
                var_1_C8 = and:int(var_1_C8:int, ldc:int(1212523142))
                goto(Label_0228)
            }
            
            if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(2048)), ldc:int(0))) {
                var_1_11E = and:int(var_1_C8:int, ldc:int(-659543042))
                var_5_13A = invokeinterface:int(Comparator<T>::compare, getfield:Comparator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3e75\uf9c5\u759a\u927d\u3e75\u0a06, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>), invokeinterface:Object[expected:T](PeekingIterator::peek, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3bc9\u6fb0\u8350\u8753\u183a\u52d3, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>)), invokeinterface:Object[expected:T](PeekingIterator::peek, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>)))
                
                if (cmpeq:boolean(var_5_13A:int, ldc:int(0))) {
                    invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_1_11E:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_16D = and:int(var_1_11E:int, ldc:int(-235090840))
                    }
                    else {
                        var_1_16D = and:int(var_1_11E:int, ldc:int(-544523565))
                        
                        if (cmple:boolean(var_5_13A:int, ldc:int(0))) {
                            stack_1D7_0 = invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u3bc9\u6fb0\u8350\u8753\u183a\u52d3, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_16D:int, ldc:int(4)), ldc:int(0))) {
                        var_1_16D = and:int(var_1_16D:int, ldc:int(-1681433901))
                        stack_1D7_0 = invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u67e9\u946b\u88c5\ubefe\u6d69\u0800::\u4179\u9a18\u12cb\u600f\u960f\uc84e, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>))
                        looporswitchbreak()
                    }
                    
                    var_1_11E = and:int(var_1_16D:int, ldc:int(-1652098398))
                }
                
                return:T(stack_1D7_0:Object)
            }
            
            var_1_C8 = and:int(var_1_C8:int, ldc:int(-780096490))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\ubcb0\ub83f\u93a2\u385b\u5f50(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(307916687), ldc:int(-144707619))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\u946b\u88c5\ubefe\u6d69\u0800<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-450197637))
        }
        else {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-1837388097))
            var_5_85 = and:int(ldc:int(-4685), ldc:int(4684))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19941), ldc:int(18916)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61B:int, ldc:int(1987768245))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(27), ldc:int(229)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4109), ldc:int(17409)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_DA:int, ldc:int(-671350817))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(7680), ldc:int(7681)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1517282447))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1584316940))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(627634777))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1941539720))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(942751379))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-468728497))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(376639652))
                    }
                    else {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-136331377))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1625230606))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(950157746))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-756962689))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(792622848))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-82253))
                            var_11_EB = and:int(ldc:int(-8272), ldc:int(8270))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-124852573))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(973289360))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-740755951))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-768463017))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2085945190))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1586259725))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1578872799))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-834069809))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1686838580))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1185295246))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1381969857))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(101704034))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-588937757))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1372185524))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-307090486))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-263605674))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(306102247))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(14848), ldc:int(14849))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1393694873))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1761964926))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(816848253))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2090678765))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1988798215))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2010787469))
                        var_11_EB = and:int(ldc:int(8989), ldc:int(-9022))
                    }
                    
                    Label_1083:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-212518939))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1883466298))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2107089550))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1405223320))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1124565967))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1772212313))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(395901536))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(845098738))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(939883870))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(983285685))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(343136598))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1748755974))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2011688127))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(920394275))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1939767197))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1753428560))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1063671994))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(187382833))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1937484268))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(441675867))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1239453735))
                        var_17_626 = add:int(var_16_119:int, xor:int(ldc:int(19520), ldc:int(19521)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(-145047863))
                
                if (cmple:boolean(var_5_85 = var_17_626:int, sub:int(var_6_8C:int, and:int(ldc:int(12291), ldc:int(18433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(30218892))
            goto(Label_0106)
        }
    }
}
