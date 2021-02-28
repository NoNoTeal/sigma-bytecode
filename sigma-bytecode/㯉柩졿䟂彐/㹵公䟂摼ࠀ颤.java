public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u3e75\u516c\u47c2\u647c\u0800\u98a4<T> {
    public void \u3e75\u516c\u47c2\u647c\u0800\u98a4(java.util.Iterator<T> p0, java.util.Iterator<T> p1, java.util.Comparator<T> p2) {
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
            invokespecial:AbstractIterator(AbstractIterator::<init>, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>)
            putfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u1833\u2dcc\uc4d2\u67e9\u494c\uceb8, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>, invokestatic:PeekingIterator(Iterators::peekingIterator, p0:Iterator<T>))
            putfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>, invokestatic:PeekingIterator(Iterators::peekingIterator, p1:Iterator<T>))
            putfield:Comparator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u8c8a\u4d85\u3711\u6198\u527a\u3d4b, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>, p2:Comparator<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T computeNext() {
        var_1_DB : int
        var_3_BB : int
        
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
        var_1_DB = and:int(ldc:int(74249927), ldc:int(1441324739))
        
        loop {
            Label_0096:
            
            if (cmpne:boolean(and:int(var_1_DB:int, ldc:int(1024)), ldc:int(0))) {
                var_1_DB = and:int(var_1_DB:int, ldc:int(367392383))
                
                if (invokeinterface:boolean(PeekingIterator::hasNext, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u1833\u2dcc\uc4d2\u67e9\u494c\uceb8, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))) {
                    if (invokeinterface:boolean(PeekingIterator::hasNext, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))) {
                        var_3_BB = invokeinterface:int(Comparator<T>::compare, getfield:Comparator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u8c8a\u4d85\u3711\u6198\u527a\u3d4b, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>), invokeinterface:Object[expected:T](PeekingIterator::peek, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u1833\u2dcc\uc4d2\u67e9\u494c\uceb8, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>)), invokeinterface:Object[expected:T](PeekingIterator::peek, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>)))
                        
                        if (cmpne:boolean(var_3_BB:int, ldc:int(0))) {
                            do {
                                if (cmpeq:boolean(and:int(var_1_DB:int, ldc:int(16)), ldc:int(0))) {
                                    var_1_DB = and:int(var_1_DB:int, ldc:int(728815287))
                                    
                                    if (cmpge:boolean(var_3_BB:int, ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u1833\u2dcc\uc4d2\u67e9\u494c\uceb8, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))
                                    Label_0274:
                                    var_1_DB = and:int(var_1_DB:int, ldc:int(-2090543429))
                                    loopcontinue(Label_0096)
                                }
                            } while (cmpne:boolean(and:int(var_1_DB:int, ldc:int(536870912)), ldc:int(0)))
                            
                            var_1_DB = and:int(var_1_DB:int, ldc:int(694484703))
                            invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))
                            goto(Label_0274)
                        }
                        
                        invokeinterface:Object(PeekingIterator::next, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))
                        return:T(invokeinterface:Object[expected:T](PeekingIterator::next, getfield:PeekingIterator<T>(\u3e75\u516c\u47c2\u647c\u0800\u98a4::\u1833\u2dcc\uc4d2\u67e9\u494c\uceb8, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>)))
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_1_DB:int, ldc:int(1)), ldc:int(0))) {
                return:T(invokevirtual:Object[expected:T](\u3e75\u516c\u47c2\u647c\u0800\u98a4::endOfData, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>))
            }
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
    
    public void \u446c\u64f2\uf9c5\u7c6b\uc87f\ubefe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(-1004173060), ldc:int(-419567396))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u516c\u47c2\u647c\u0800\u98a4<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-133967783))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1585307101))
            var_5_85 = and:int(ldc:int(-29717), ldc:int(29712))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25539), ldc:int(8642)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(-186270212))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(6221), ldc:int(17153)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4617), ldc:int(24657)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(1546620893))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32724), ldc:int(-32723)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(318377964))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1340444254))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(163528990))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-840427161))
                    }
                    else {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2113392254))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2082548052))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(41285248))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(265977525))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-592058273))
                            var_11_E3 = and:int(ldc:int(17336), ldc:int(-17337))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-197096525))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(580147937))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1156111649))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-420619171))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(673581))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(939715379))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1771832110))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1460270230))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1168663836))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-834671012))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1348886047))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-764414556))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1095321825))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1726703006))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1856494045))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(16386), ldc:int(16387))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-177337119))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(506176940))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-871853646))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1485474283))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1647954659))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-600843426))
                        var_11_E3 = and:int(ldc:int(-26851), ldc:int(24770))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1244733101))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1168141477))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1226174900))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1056849791))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1508900164))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2003288028))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(65120330))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1876377859))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(167213477))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(364966993))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1707047816))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1873779197))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1306944875))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1565622942))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1119070470))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1772518617))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(105741870))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(2004340732))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(655241650))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1987683443))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(868845471))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(19677233))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2109136867))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1145039358))
                        var_17_608 = add:int(var_16_111:int, and:int(ldc:int(129), ldc:int(609)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1496017079))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(1953344223))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, xor:int(ldc:boolean(0), ldc:boolean(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
