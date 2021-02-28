public class \u3504\ufe34\u600f\u6b0d\u69d9.\ucef1\uc87f\u8753\u8753\u6d69\u4d85 {
    public void \ucef1\uc87f\u8753\u8753\u6d69\u4d85(javax.net.ssl.SSLContext p0, javax.net.ssl.SSLParameters p1) {
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
            invokespecial:\ucef1\uc87f\u8753\u8753\u6d69\u4d85(\ucef1\uc87f\u8753\u8753\u6d69\u4d85::<init>, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85, p0:SSLContext, invokestatic:ScheduledExecutorService[expected:ExecutorService](Executors::newSingleThreadScheduledExecutor), p1:SSLParameters)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucef1\uc87f\u8753\u8753\u6d69\u4d85(javax.net.ssl.SSLContext p0, java.util.concurrent.ExecutorService p1, javax.net.ssl.SSLParameters p2) {
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
        invokespecial:\uc4d2\ud51e\ub171\u8389\uff55\u647c(\uc4d2\ud51e\ub171\u8389\uff55\u647c::<init>, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85, p0:SSLContext, p1:ExecutorService)
        
        if (cmpne:boolean(p2:SSLParameters, aconstnull:SSLParameters())) {
            putfield:SSLParameters(\ucef1\uc87f\u8753\u8753\u6d69\u4d85::\u0b8e\u8aa5\u8413\u516c\u183a\u8640, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85, p2:SSLParameters)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>))
    }
    
    public java.nio.channels.ByteChannel \u8d98\ud523\u960f\u6ec6\u3711\u7043(java.nio.channels.SocketChannel p0, java.nio.channels.SelectionKey p1) {
        var_5_67 : SSLEngine
        
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
            var_5_67 = invokevirtual:SSLEngine(SSLContext::createSSLEngine, getfield:SSLContext(\ucef1\uc87f\u8753\u8753\u6d69\u4d85::\u0b8e\u8cae\ub18d\ub32d\ud158\ubb2b, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85))
            invokevirtual:void(SSLEngine::setUseClientMode, var_5_67:SSLEngine, and:int[expected:boolean](ldc:int(-16996), ldc:int(16995)))
            invokevirtual:void(SSLEngine::setSSLParameters, var_5_67:SSLEngine, getfield:SSLParameters(\ucef1\uc87f\u8753\u8753\u6d69\u4d85::\u0b8e\u8aa5\u8413\u516c\u183a\u8640, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85))
            return:ByteChannel(initobject:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::<init>, p0:SocketChannel, var_5_67:SSLEngine, getfield:ExecutorService(\ucef1\uc87f\u8753\u8753\u6d69\u4d85::\u2dcc\u071d\u62da\u071d\u3bc9\u7043, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85), p1:SelectionKey))
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
    
    public void \u74b1\ua61f\u71f1\uc9f6\u9a18\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(-426737515), ldc:int(-201327052))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\uc87f\u8753\u8753\u6d69\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-342726729))
            var_5_7D = and:int(ldc:int(25665), ldc:int(-26086))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-118), ldc:int(117)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5E5:int, ldc:int(-269093802))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(11), ldc:int(23073)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(1560), ldc:int(1561)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_CA:int, ldc:int(-742393546))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21761), ldc:int(8297)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-425742450))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-858732420))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-750333368))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(648886475))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1432733035))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(516682674))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1308814199))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1427374065))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1897697284))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(314011249))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-423645022))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-86476780))
                            var_11_DB = and:int(ldc:int(19376), ldc:int(-23473))
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1582831742))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1191285443))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1123055835))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-989166916))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1229616801))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(362491295))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1819696861))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-866867386))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(434104629))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1643137450))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1764419436))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(264564335))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1535254460))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1985399500))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-406484116))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1210669922))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(5145), ldc:int(2369))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-615864037))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-785636087))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-560156329))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(753574557))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1212842187))
                        var_11_DB = and:int(ldc:int(-9582), ldc:int(9569))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1615936223))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-35187255))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(530211471))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(405837779))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1547818665))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-199189138))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(232808281))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(789153854))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-223047236))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1574887185))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-655571850))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1247381122))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(922366693))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-673881484))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1138771050))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1073004025))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-49792467))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1035213394))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1414169097))
                        var_17_5F0 = add:int(var_16_109:int, and:int(ldc:int(1031), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2015931680))
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-492926468))
                
                if (cmple:boolean(var_5_7D = var_17_5F0:int, sub:int(var_6_84:int, xor:int(ldc:int(10498), ldc:int(10499))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
