public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u7043\u71f1\u0b8e\u51fa\ubefe {
    public void \u7043\u71f1\u0b8e\u51fa\ubefe(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\u7043\u71f1\u0b8e\u51fa\ubefe)
            putfield:String(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4179\u8bb0\ufcaf\u8413\uc2bd\u61a4, this:\u7043\u71f1\u0b8e\u51fa\ubefe, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public synchronized boolean \u7006\u7bad\uf94d\u88c5\u67d0\ub171() {
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
        
        if (logicalnot:boolean(getfield:boolean(\u7043\u71f1\u0b8e\u51fa\ubefe::\u51b2\uc9f6\ubff1\u3e2a\u760c\u59ec, this:\u7043\u71f1\u0b8e\u51fa\ubefe))) {
            putfield:boolean(\u7043\u71f1\u0b8e\u51fa\ubefe::\u51b2\uc9f6\ubff1\u3e2a\u760c\u59ec, this:\u7043\u71f1\u0b8e\u51fa\ubefe, and:int[expected:boolean](ldc:int(6553), ldc:int(8199)))
            invokevirtual:void(Thread::setUncaughtExceptionHandler, putfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe, initobject:Thread(Thread::<init>, this:\u7043\u71f1\u0b8e\u51fa\ubefe[expected:Runnable], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4179\u8bb0\ufcaf\u8413\uc2bd\u61a4, this:\u7043\u71f1\u0b8e\u51fa\ubefe)), ldc:String(" #")), invokevirtual:int(AtomicInteger::incrementAndGet, getstatic:AtomicInteger(\u7043\u71f1\u0b8e\u51fa\ubefe::\ua6bd\u494c\u8640\ud12e\u120d\u3dd3)))))), initobject:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6[expected:UncaughtExceptionHandler](\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::<init>, getstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc)))
            invokevirtual:void(Thread::start, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe))
            invokeinterface:void(Logger::info, getstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc), ldc:String("Thread {} started"), getfield:String[expected:Object](\u7043\u71f1\u0b8e\u51fa\ubefe::\u4179\u8bb0\ufcaf\u8413\uc2bd\u61a4, this:\u7043\u71f1\u0b8e\u51fa\ubefe))
            return:boolean(and:int[expected:boolean](ldc:int(97), ldc:int(27401)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(9483), ldc:int(2737)))
    }
    
    public synchronized void \u3bd6\ua61f\u4c2b\uc9f6\u8258\u7e3f() {
        var_1_7AF : int
        var_1_10A : int
        var_3_112 : int
        
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
            var_1_7AF = and:int(ldc:int(2069934086), ldc:int(1856468718))
            
            loop {
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(-813478755))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(-1207337095))
                    goto(Label_0199)
                }
                
                if (cmpeq:boolean(and:int(var_1_7AF:int, ldc:int(512)), ldc:int(0))) {
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(2068037278))
                    putfield:boolean(\u7043\u71f1\u0b8e\u51fa\ubefe::\u51b2\uc9f6\ubff1\u3e2a\u760c\u59ec, this:\u7043\u71f1\u0b8e\u51fa\ubefe, and:int[expected:boolean](ldc:int(20628), ldc:int(-23701)))
                }
                
                Label_0149:
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(91810645))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_7AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_7AF = and:int(var_1_7AF:int, ldc:int(-1484499648))
                        loopcontinue()
                    }
                    
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(-67282194))
                    
                    if (cmpeq:boolean(aconstnull:Thread(), getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0199:
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_7AF = and:int(var_1_7AF:int, ldc:int(-2107939957))
                        goto(Label_0149)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(-366601489))
                }
                
                Label_0233:
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0199)
                }
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_7AF = and:int(var_1_7AF:int, ldc:int(-150579812))
                    goto(Label_0149)
                }
                
                if (cmpne:boolean(and:int(var_1_7AF:int, ldc:int(2)), ldc:int(0))) {
                    var_1_10A = and:int(var_1_7AF:int, ldc:int(1802591999))
                    var_3_112 = and:int(ldc:int(5641), ldc:int(-7754))
                    
                    loop {
                        Label_0275:
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1125977241))
                            goto(Label_1831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1258)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(799111550))
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1320690147))
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1530413562))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-46288342))
                        }
                        else {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-16057361))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(Thread::isAlive, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe)))) {
                                invokeinterface:void(Logger::info, getstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc), ldc:String("Thread {} stopped"), getfield:String[expected:Object](\u7043\u71f1\u0b8e\u51fa\ubefe::\u4179\u8bb0\ufcaf\u8413\uc2bd\u61a4, this:\u7043\u71f1\u0b8e\u51fa\ubefe))
                                goto(Label_1831)
                            }
                        }
                        
                        Label_0407:
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1831)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1342487621))
                            goto(Label_1654)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1669965230))
                            goto(Label_1517)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(24084422))
                            goto(Label_1380)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1196951765))
                            goto(Label_1258)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-490845002))
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(2137867176))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(128)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(2077024938))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(128)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                                var_1_10A = and:int(var_1_10A:int, ldc:int(1798643433))
                                loopcontinue()
                            }
                            
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-294625649))
                        }
                        
                        try {
                            Label_0553:
                            
                            while (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_1654)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-682470104))
                                    goto(Label_1517)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-920310661))
                                    goto(Label_1380)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-1150829412))
                                    goto(Label_1258)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-1244161263))
                                    goto(Label_1105)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-1940319571))
                                    goto(Label_0983)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_0826)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-1169083356))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                        goto(Label_0407)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        loopcontinue(Label_0275)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-74778873))
                                    invokevirtual:void(Thread::join, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe), ldc:long(1000L))
                                }
                                
                                Label_0693:
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Block_60)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(963737172))
                                    goto(Label_1654)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-448670166))
                                    goto(Label_1517)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_1380)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_1258)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_1105)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1359698512))
                                    goto(Label_0983)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(4)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(1653809376))
                                        loopcontinue()
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Block_69)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        loopcontinue(Label_0275)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-345565642))
                                    inc:int(var_3_112, ldc:int(1))
                                }
                                
                                Label_0826:
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(468657573))
                                    goto(Label_1654)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-120139213))
                                    goto(Label_1517)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-951503946))
                                    goto(Label_1380)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1217397104))
                                    goto(Label_1258)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_1105)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(1084311074))
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(915099171))
                                        loopcontinue()
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Block_80)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                        goto(Block_81)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-98525993))
                                    
                                    if (cmplt:boolean(var_3_112:int, and:int(ldc:int(9101), ldc:int(69)))) {
                                        if (invokevirtual:boolean(Thread::isAlive, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe))) {
                                            goto(Label_1258)
                                        }
                                        
                                        goto(Label_1654)
                                    }
                                }
                                
                                Label_0983:
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Block_82)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1602121578))
                                    goto(Label_1654)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-1618867007))
                                    goto(Label_1517)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(556215309))
                                    goto(Label_1380)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1258)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-439331351))
                                        goto(Label_0826)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_0407)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                        loopcontinue(Label_0275)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(2072009071))
                                }
                                
                                Label_1105:
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-469097460))
                                    goto(Label_1654)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-609182827))
                                    goto(Label_1517)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_1380)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-1254913406))
                                        goto(Label_0983)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_0826)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-95086283))
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Label_0407)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Block_103)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(2123388006))
                                    invokeinterface:void(Logger::warn, getstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc), ldc:String("Waited {} seconds attempting force stop!"), invokestatic:Integer(Integer::valueOf, var_3_112:int))
                                    goto(Label_1654)
                                }
                                
                                Label_1258:
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                    goto(Label_1654)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1807304577))
                                    goto(Label_1517)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(2109998779))
                                        goto(Label_1105)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-1030791169))
                                        goto(Label_0983)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-2134108512))
                                        goto(Label_0826)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(1913309826))
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(128)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                        goto(Label_0407)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                        loopcontinue(Label_0275)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-364339234))
                                }
                                
                                Label_1380:
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1654)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-351928805))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_1258)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_1105)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Label_0983)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(-1770212703))
                                        goto(Label_0826)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                                        goto(Label_0407)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Block_125)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-281306313))
                                    invokeinterface:void(Logger::warn, getstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc), ldc:String("Thread {} ({}) failed to exit after {} second(s)"), this:\u7043\u71f1\u0b8e\u51fa\ubefe[expected:Object], invokevirtual:State[expected:Object](Thread::getState, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe)), invokestatic:Integer(Integer::valueOf, var_3_112:int), initobject:Exception[expected:Object](Exception::<init>, ldc:String("Stack:")))
                                }
                                
                                Label_1517:
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Block_126)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1378371353))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_1380)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                                        goto(Label_1258)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4)), ldc:int(0))) {
                                        goto(Label_1105)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_0983)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(1550614199))
                                        goto(Label_0826)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(128)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(1679349722))
                                        goto(Label_0693)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_1_10A = and:int(var_1_10A:int, ldc:int(921764146))
                                        loopcontinue()
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Block_135)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                        loopcontinue(Label_0275)
                                    }
                                    
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(2058418270))
                                    invokevirtual:void(Thread::interrupt, getfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe))
                                }
                                
                                Label_1654:
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1112719743))
                                    goto(Label_1517)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_1380)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(485079729))
                                    goto(Label_1258)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1105)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(41136721))
                                    goto(Label_0983)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(-70505465))
                                    goto(Label_0826)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4096)), ldc:int(0))) {
                                    var_1_10A = and:int(var_1_10A:int, ldc:int(1048715233))
                                    goto(Label_0693)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Block_145)
                                }
                            }
                            
                            goto(Label_1831)
                            Block_60:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1043645189))
                            goto(Label_1831)
                            Block_69:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1343169517))
                            goto(Label_0407)
                            Block_80:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1620965678))
                            goto(Label_0407)
                            Block_81:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1041183721))
                            loopcontinue()
                            Block_82:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1940811498))
                            goto(Label_1831)
                            Block_103:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(192258746))
                            loopcontinue()
                            Block_125:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1942957325))
                            loopcontinue()
                            Block_126:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1277288971))
                            goto(Label_1831)
                            Block_135:
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1986558373))
                            goto(Label_0407)
                            Block_145:
                            
                            if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(512)), ldc:int(0))) {
                                var_1_10A = and:int(var_1_10A:int, ldc:int(-2025782748))
                                goto(Label_0407)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(128)), ldc:int(0))) {
                                var_1_10A = and:int(var_1_10A:int, ldc:int(-1417374379))
                            }
                            else {
                                var_1_10A = and:int(var_1_10A:int, ldc:int(-367501554))
                            }
                        }
                        catch (java.lang.InterruptedException var_4_709) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1800165798))
                        }
                        
                        loopcontinue()
                        Label_1831:
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(256)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1775315657))
                            goto(Label_1654)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(1478671348))
                            goto(Label_1517)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1258)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-645560801))
                            goto(Label_1105)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-1620365507))
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-652136491))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_10A = and:int(var_1_10A:int, ldc:int(-445752256))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(65536)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_7AF = and:int(var_1_10A:int, ldc:int(1786698311))
                    putfield:Thread(\u7043\u71f1\u0b8e\u51fa\ubefe::\ud523\u51fa\u6c56\u416d\ub102\ud51e, this:\u7043\u71f1\u0b8e\u51fa\ubefe, aconstnull:Thread())
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d64\u97e6\u8aa5\u8258\u8c8a\u88c5() {
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
            return:boolean(getfield:boolean(\u7043\u71f1\u0b8e\u51fa\ubefe::\u51b2\uc9f6\ubff1\u3e2a\u760c\u59ec, this:\u7043\u71f1\u0b8e\u51fa\ubefe))
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
            putstatic:Logger(\u7043\u71f1\u0b8e\u51fa\ubefe::\u4cd9\u7006\ud7e8\u4e72\u624e\ub7dc, invokestatic:Logger(LogManager::getLogger))
            putstatic:AtomicInteger(\u7043\u71f1\u0b8e\u51fa\ubefe::\ua6bd\u494c\u8640\ud12e\u120d\u3dd3, initobject:AtomicInteger(AtomicInteger::<init>, and:int(ldc:int(-16187), ldc:int(13874))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u0b8e\u12b2\u8389\ub18d\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(115533599), ldc:int(232967775))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u71f1\u0b8e\u51fa\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(1092658862))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(82837499))
            var_5_8A = and:int(ldc:int(-21838), ldc:int(20812))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30986), ldc:int(-31019)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_654:int, ldc:int(1610601854))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(16453), ldc:int(16452)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-27392), ldc:int(-27391)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_E3:int, ldc:int(1576781183))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(12417), ldc:int(12416)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(148161207))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(138253173))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(119015033))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1929537925))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-35463717))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1428386772))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(276168924))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-843623379))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(294726517))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(955225962))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1745820162))
                        var_11_F4 = and:int(ldc:int(-9478), ldc:int(9477))
                        goto(Label_1507)
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1222903221))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-303635721))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-919036001))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1307238199))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(913477143))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1585326364))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1809633744))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-269038497))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1025492094))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-816152856))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1826515046))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-675792195))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1995061992))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(2129125115))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(16410), ldc:int(16411))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0954:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-605184992))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1444885344))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-967193260))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-405224771))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1041861539))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1861520099))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-987618))
                        var_11_F4 = and:int(ldc:int(3262), ldc:int(-3264))
                    }
                    
                    Label_1128:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(2109847301))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1083707807))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1795166977))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-213456245))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-173939752))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1242806267))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(447624035))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2050548682))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(887680054))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1507)
                    }
                    
                    Label_1376:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-111496087))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1287946586))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(520688634))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-185111540))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-705956110))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1381432398))
                        goto(Label_0954)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(697631805))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(520092983))
                        var_17_65F = add:int(var_16_122:int, and:int(ldc:int(16907), ldc:int(4097)))
                        looporswitchbreak()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(1048124913))
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-706286218))
                
                if (cmple:boolean(var_5_8A = var_17_65F:int, sub:int(var_6_91:int, xor:int(ldc:int(3108), ldc:int(3109))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(276387017))
            goto(Label_0108)
        }
    }
}
