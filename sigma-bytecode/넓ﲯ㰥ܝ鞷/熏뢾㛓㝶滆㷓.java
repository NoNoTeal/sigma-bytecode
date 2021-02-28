public class \ub113\ufcaf\u3c25\u071d\u97b7.\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3 {
    public void \u718f\ub8be\u36d3\u3776\u6ec6\u3dd3(java.nio.channels.SocketChannel p0, javax.net.ssl.SSLEngine p1, java.util.concurrent.ExecutorService p2, java.nio.channels.SelectionKey p3) {
        expr_B5 : SSLEngineResult [generated]
        
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
            invokespecial:Object(Object::<init>, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
            putfield:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u12b2\u446c\u071d\u3d4b\u8709\u4bc8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, and:int(ldc:int(-30497), ldc:int(5920)))
            
            if (cmpne:boolean(p0:SocketChannel, aconstnull:SocketChannel())) {
                if (cmpne:boolean(p1:SSLEngine, aconstnull:SSLEngine())) {
                    if (cmpne:boolean(p2:ExecutorService, aconstnull:ExecutorService())) {
                        putfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p0:SocketChannel)
                        putfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p1:SSLEngine)
                        putfield:ExecutorService(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ube23\ub32d\u927d\uc31c\u6cfe\u8cae, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p2:ExecutorService)
                        expr_B5 = initobject:SSLEngineResult(SSLEngineResult::<init>, getstatic:Status(Status::BUFFER_UNDERFLOW), invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, p1:SSLEngine), and:int(ldc:int(-176), ldc:int(173)), and:int(ldc:int(-6538), ldc:int(6537)))
                        putfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ubf56\ud51e\uc87f\u7043\ub19c\u983f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, expr_B5:SSLEngineResult)
                        putfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, expr_B5:SSLEngineResult)
                        putfield:List<Future<?>>(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8350\u3d64\u9a18\ub70c\u12b2\u67e9, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, initobject:ArrayList<Future<?>>[expected:List<Future<?>>](ArrayList<E>::<init>, xor:int(ldc:int(1282), ldc:int(1281))))
                        
                        if (cmpne:boolean(p3:SelectionKey, aconstnull:SelectionKey())) {
                            invokevirtual:SelectionKey(SelectionKey::interestOps, p3:SelectionKey, or:int(invokevirtual:int(SelectionKey::interestOps, p3:SelectionKey), and:int(ldc:int(228), ldc:int(14341))))
                            putfield:SelectionKey(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u6b5f\u7c6b\u97e6\ubefe\uc3e3\ub70c, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p3:SelectionKey)
                        }
                        
                        invokevirtual:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u1833\u71ae\u5654\u8640\ua6bd\ub18d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokevirtual:SSLSession(SSLEngine::getSession, p1:SSLEngine))
                        invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7c6b\u61a4\u8bb0\ubcb0\u93a2\uceb8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getstatic:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8cae\u760c\u960f\u4492\u6bb9\u927d)))
                        invokespecial:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7049\u52d3\u8709\u74b1\u56bd\ud4fe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                        return:void()
                    }
                }
            }
            
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9), and:int(ldc:int(-18430), ldc:int(253)))))
        }
        
        goto(Label_0006)
    }
    
    private void \u8df4\uf9c5\u12b2\u76bc\u8640\ud4fe(java.util.concurrent.Future<?> p0) {
        var_2_9B : int
        var_4_C4 : ExecutionException
        
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
            var_2_9B = and:int(ldc:int(-10261739), ldc:int(1567898379))
            
            try {
                try {
                    do {
                        Label_0096:
                        
                        if (cmpeq:boolean(and:int(var_2_9B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_9B = and:int(var_2_9B:int, ldc:int(108129747))
                        }
                        else {
                            var_2_9B = and:int(var_2_9B:int, ldc:int(-706441671))
                            invokeinterface:?(Future<?>::get, p0:Future<?>)
                        }
                    } while (cmpne:boolean(and:int(var_2_9B:int, ldc:int(524288)), ldc:int(0)))
                    
                    var_2_9B = and:int(var_2_9B:int, ldc:int(-6894719))
                }
                catch (java.lang.InterruptedException var_4_8E) {
                    loop {
                        if (cmpne:boolean(and:int(var_2_9B:int, ldc:int(512)), ldc:int(0))) {
                            var_2_9B = and:int(var_2_9B:int, ldc:int(-105739613))
                            invokevirtual:void(Thread::interrupt, invokestatic:Thread(Thread::currentThread))
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_9B:int, ldc:int(128)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_9B = and:int(var_2_9B:int, ldc:int(476291989))
                    }
                    
                    var_2_9B = and:int(var_2_9B:int, ldc:int(-42254359))
                    goto(Label_0096)
                }
            }
            catch (java.util.concurrent.ExecutionException var_4_C4) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, var_4_C4:ExecutionException[expected:Throwable]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private synchronized void \u7049\u52d3\u8709\u74b1\u56bd\ud4fe() {
        var_1_355 : int
        var_3_27B : Iterator<Future<?>>
        var_4_29B : Future<?>
        var_1_336 : int
        
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
        var_1_355 = and:int(ldc:int(1803844865), ldc:int(1600068117))
        
        if (cmpne:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NOT_HANDSHAKING))) {
            loop {
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(1696447260))
                    goto(Label_0766)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(1642442298))
                    goto(Label_0539)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(1126457791))
                    goto(Label_0462)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(938274555))
                    goto(Label_0292)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-953660380))
                }
                else {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-507160386))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<Future<?>>(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8350\u3d64\u9a18\ub70c\u12b2\u67e9, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                        var_3_27B = invokeinterface:Iterator<Future<?>>(List<Future<?>>::iterator, getfield:List<Future<?>>(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8350\u3d64\u9a18\ub70c\u12b2\u67e9, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                        
                        loop {
                            var_1_355 = and:int(var_1_355:int, ldc:int(-335585620))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_27B:Iterator<Future<?>>))) {
                                looporswitchbreak()
                            }
                            
                            var_4_29B = checkcast:Future<?>(java.util.concurrent.Future<?>.class, invokeinterface:Future<?>(Iterator<Future<?>>::next, var_3_27B:Iterator<Future<?>>))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Future<V>::isDone, var_4_29B:Future<?>))) {
                                looporswitchbreak(Label_0679)
                            }
                            
                            invokeinterface:void(Iterator<E>::remove, var_3_27B:Iterator<Future<?>>)
                        }
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-228603430))
                    goto(Label_0766)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-709070097))
                    goto(Label_0539)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0462)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(-1743988406))
                        loopcontinue()
                    }
                    
                    var_1_355 = and:int(var_1_355:int, ldc:int(591240547))
                    
                    if (cmpeq:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NEED_UNWRAP))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\u62da\u7049\u385b\u67d0\ud12e, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                            goto(Label_0766)
                        }
                        
                        if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::BUFFER_UNDERFLOW))) {
                            goto(Label_0882)
                        }
                        
                        goto(Label_0766)
                    }
                }
                
                Label_0292:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-482641867))
                    goto(Label_0766)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0539)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0462)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_355 = and:int(var_1_355:int, ldc:int(-1556734670))
                    invokevirtual:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7c6b\u4cd9\u4daf\u3d4b\u98a4\ub171, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                    
                    if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<Future<?>>(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8350\u3d64\u9a18\ub70c\u12b2\u67e9, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                        if (cmpne:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NEED_WRAP))) {
                            goto(Label_0462)
                        }
                    }
                }
                
                Label_0363:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-1502978915))
                    goto(Label_0766)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(1206363701))
                    goto(Label_0539)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(4)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(-1670713448))
                        loopcontinue()
                    }
                    
                    var_1_355 = and:int(var_1_355:int, ldc:int(-541639070))
                    invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7c6b\u61a4\u8bb0\ubcb0\u93a2\uceb8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getstatic:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8cae\u760c\u960f\u4492\u6bb9\u927d)))
                    
                    if (cmpeq:boolean(invokevirtual:HandshakeStatus(SSLEngineResult::getHandshakeStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ubf56\ud51e\uc87f\u7043\ub19c\u983f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::FINISHED))) {
                        goto(Label_1000)
                    }
                }
                
                Label_0462:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0766)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(960676822))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(2)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(-1556506718))
                        goto(Label_0363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(243587987))
                        loopcontinue()
                    }
                    
                    var_1_355 = and:int(var_1_355:int, ldc:int(-372384655))
                    
                    if (logicalnot:boolean(getstatic:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u88c5\u6c52\u36d3\ubf56\u3bd6\u69d9))) {
                        if (cmpeq:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NOT_HANDSHAKING))) {
                            athrow(initobject:AssertionError(AssertionError::<init>))
                        }
                    }
                }
                
                Label_0539:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(-1079287407))
                        goto(Label_0462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_355:int, ldc:int(2)), ldc:int(0))) {
                        var_1_355 = and:int(var_1_355:int, ldc:int(-626400472))
                        loopcontinue()
                    }
                    
                    putfield:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u12b2\u446c\u071d\u3d4b\u8709\u4bc8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, and:int(ldc:int(4121), ldc:int(16417)))
                    return:void()
                }
                
                Label_0766:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0539)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0462)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0292)
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_1_355:int, ldc:int(2)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(1586284731))
                    loopcontinue()
                }
                
                var_1_336 = and:int(var_1_355:int, ldc:int(-7864615))
                invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                
                if (cmpeq:boolean(invokevirtual:int(SocketChannel::read, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), ldc:int(-1))) {
                    athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9), xor:int(ldc:int(258), ldc:int(259)))))
                }
                
                var_1_355 = and:int(var_1_336:int, ldc:int(-1388037744))
                invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                Label_0882:
                var_1_355 = and:int(var_1_355:int, ldc:int(1036417663))
                invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u59ec\u600f\u8350\u4492\u72f1\ud158, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                
                if (cmpne:boolean(invokevirtual:HandshakeStatus(SSLEngineResult::getHandshakeStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::FINISHED))) {
                    goto(Label_0292)
                }
                
                goto(Label_0954)
            }
            
            loop {
                Label_0679:
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-824090985))
                }
                else {
                    var_1_355 = and:int(var_1_355:int, ldc:int(-1587101816))
                    
                    if (invokevirtual:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\u62da\u7049\u385b\u67d0\ud12e, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)) {
                        invokespecial:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8df4\uf9c5\u12b2\u76bc\u8640\ud4fe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, var_4_29B:Future<?>)
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_355:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
            Label_0954:
            invokevirtual:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u1833\u71ae\u5654\u8640\ua6bd\ub18d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
            return:void()
            Label_1000:
            invokevirtual:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u1833\u71ae\u5654\u8640\ua6bd\ub18d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
    }
    
    private synchronized java.nio.ByteBuffer \u7c6b\u61a4\u8bb0\ubcb0\u93a2\uceb8(java.nio.ByteBuffer p0) {
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
            invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            putfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ubf56\ud51e\uc87f\u7043\ub19c\u983f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokevirtual:SSLEngineResult(SSLEngine::wrap, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:ByteBuffer, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
            invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            return:ByteBuffer(getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    private synchronized java.nio.ByteBuffer \u59ec\u600f\u8350\u4492\u72f1\ud158() {
        var_1_20D : int
        var_4_215 : int
        
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
            var_1_20D = and:int(ldc:int(847415764), ldc:int(-1341143098))
            
            loop {
                Label_0098:
                
                if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(534149433))
                        goto(Label_0326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(-599752846))
                        goto(Label_0265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0173)
                    }
                    
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-1092450835))
                    
                    if (cmpeq:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::CLOSED))) {
                        goto(Label_0173)
                    }
                }
                
                Label_0453:
                
                while (cmpne:boolean(and:int(var_1_20D:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0326)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(1)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(-1802733128))
                        goto(Label_0265)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(376790597))
                        loopcontinue(Label_0098)
                    }
                    
                    var_1_20D = and:int(var_1_20D:int, ldc:int(1927735775))
                    var_4_215 = invokevirtual:int(Buffer::remaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(797234117))
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(256)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-1572527392))
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(1048311668))
                            putfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokevirtual:SSLEngineResult(SSLEngine::unwrap, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
                        }
                        
                        Label_0616:
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-323982659))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(32)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(1607154519))
                            goto(Label_0783)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(1)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_20D = and:int(var_1_20D:int, ldc:int(182693687))
                                loopcontinue()
                            }
                            
                            var_1_20D = and:int(var_1_20D:int, ldc:int(1053165540))
                            
                            if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::OK))) {
                                goto(Label_0927)
                            }
                        }
                        
                        Label_0701:
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(1619514045))
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(1885668724))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(64)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-712164014))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0616)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-1220095665))
                            
                            if (cmpne:boolean(var_4_215:int, invokevirtual:int(Buffer::remaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0783:
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_0701)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_20D = and:int(var_1_20D:int, ldc:int(-1172000728))
                                goto(Label_0616)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                                var_1_20D = and:int(var_1_20D:int, ldc:int(-1554330096))
                                loopcontinue()
                            }
                            
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-1248918204))
                            
                            if (cmpeq:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NEED_UNWRAP))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0857:
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(32)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-1076022944))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                                var_1_20D = and:int(var_1_20D:int, ldc:int(-1041258309))
                                goto(Label_0783)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0701)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0616)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                                var_1_20D = and:int(var_1_20D:int, ldc:int(-1756113573))
                                loopcontinue()
                            }
                            
                            var_1_20D = and:int(var_1_20D:int, ldc:int(2061376380))
                        }
                        
                        Label_0927:
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-1297243383))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(256)), ldc:int(0))) {
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-656421660))
                            goto(Label_0783)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0616)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(4)), ldc:int(0))) {
                            looporswitchbreak(Block_53)
                        }
                    }
                }
                
                var_1_20D = and:int(var_1_20D:int, ldc:int(1534582939))
                goto(Label_0392)
                Label_0173:
                
                if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_20D = and:int(var_1_20D:int, ldc:int(464464435))
                    goto(Label_0453)
                }
                
                if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-665096955))
                    goto(Label_0392)
                }
                
                if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-1971591450))
                    goto(Label_0326)
                }
                
                if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                    var_1_20D = and:int(var_1_20D:int, ldc:int(759733625))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_20D = and:int(var_1_20D:int, ldc:int(871102295))
                    
                    if (cmpne:boolean(invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:HandshakeStatus(HandshakeStatus::NOT_HANDSHAKING))) {
                        goto(Label_0453)
                    }
                }
                
                Label_0265:
                
                if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0453)
                }
                
                if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0392)
                }
                
                if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(64)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(584879774))
                        goto(Label_0173)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(400338930))
                        loopcontinue()
                    }
                    
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-1334591505))
                }
                
                try {
                    Label_0326:
                    
                    while (cmpne:boolean(and:int(var_1_20D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(4194304)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0265)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_20D:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Block_57)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Block_58)
                            }
                            
                            var_1_20D = and:int(var_1_20D:int, ldc:int(-43622057))
                            invokevirtual:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::close, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                        }
                        
                        Label_0392:
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Block_60)
                        }
                    }
                    
                    goto(Label_0453)
                    Block_57:
                    var_1_20D = and:int(var_1_20D:int, ldc:int(138932851))
                    goto(Label_0173)
                    Block_58:
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-319177254))
                    loopcontinue()
                    Block_60:
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0265)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(2)), ldc:int(0))) {
                        var_1_20D = and:int(var_1_20D:int, ldc:int(83703971))
                        goto(Label_0173)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_20D:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_20D = and:int(var_1_20D:int, ldc:int(-1155284129))
                }
                catch (java.io.IOException stack_1C4_0) {
                }
                
                goto(Label_0453)
            }
            
            Block_53:
            invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            return:ByteBuffer(getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    public void \u7c6b\u4cd9\u4daf\u3d4b\u98a4\ub171() {
        var_1_61 : int
        var_3_70 : Runnable
        
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
            var_1_61 = and:int(ldc:int(-1820429117), ldc:int(-1352770351))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1187160340))
                
                if (cmpeq:boolean(var_3_70 = invokevirtual:Runnable(SSLEngine::getDelegatedTask, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), aconstnull:Runnable())) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<Future<?>>::add, getfield:List<Future<?>>(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8350\u3d64\u9a18\ub70c\u12b2\u67e9, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), invokeinterface:Future<?>(ExecutorService::submit, getfield:ExecutorService(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ube23\ub32d\u927d\uc31c\u6cfe\u8cae, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), var_3_70:Runnable))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u71ae\u5654\u8640\ua6bd\ub18d(javax.net.ssl.SSLSession p0) {
        var_2_E4 : int
        var_4_68 : int
        var_5_75 : int
        
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
            var_2_E4 = and:int(ldc:int(-1109736469), ldc:int(-566577222))
            var_4_68 = invokeinterface:int(SSLSession::getPacketBufferSize, p0:SSLSession)
            var_5_75 = invokestatic:int(Math::max, invokeinterface:int(SSLSession::getApplicationBufferSize, p0:SSLSession), var_4_68:int)
            
            if (cmpne:boolean(getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), aconstnull:ByteBuffer())) {
                loop {
                    if (cmpne:boolean(and:int(var_2_E4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_E4:int, ldc:int(2)), ldc:int(0))) {
                        var_2_E4 = and:int(var_2_E4:int, ldc:int(-1734443994))
                    }
                    else {
                        var_2_E4 = and:int(var_2_E4:int, ldc:int(-184901781))
                        
                        if (cmpne:boolean(invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), var_5_75:int)) {
                            putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_5_75:int))
                        }
                    }
                    
                    Label_0167:
                    
                    if (cmpeq:boolean(and:int(var_2_E4:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_E4:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_E4 = and:int(var_2_E4:int, ldc:int(1969197055))
                        
                        if (cmpne:boolean(invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), var_4_68:int)) {
                            putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_4_68:int))
                        }
                    }
                    
                    Label_0199:
                    
                    if (cmpeq:boolean(and:int(var_2_E4:int, ldc:int(512)), ldc:int(0))) {
                        var_2_E4 = and:int(var_2_E4:int, ldc:int(-791552401))
                        goto(Label_0167)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_E4:int, ldc:int(256)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_E4 = and:int(var_2_E4:int, ldc:int(-1212169285))
                
                if (cmpne:boolean(invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), var_4_68:int)) {
                    putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_4_68:int))
                }
            }
            else {
                putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_5_75:int))
                putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_4_68:int))
                putfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, invokestatic:ByteBuffer(ByteBuffer::allocate, var_4_68:int))
            }
            
            invokevirtual:Buffer(Buffer::rewind, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokevirtual:Buffer(Buffer::rewind, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokevirtual:Buffer(Buffer::rewind, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            putfield:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u12b2\u446c\u071d\u3d4b\u8709\u4bc8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, add:int(getfield:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u12b2\u446c\u071d\u3d4b\u8709\u4bc8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), xor:int(ldc:int(-24048), ldc:int(-24047))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int write(java.nio.ByteBuffer p0) {
        var_4_7B : int
        
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
        
        if (logicalnot:boolean(invokespecial:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u965f\u52d3\u8640\u6ec6\ub8be\u120d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
            invokespecial:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7049\u52d3\u8709\u74b1\u56bd\ud4fe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
            return:int(and:int(ldc:int(-8683), ldc:int(8674)))
        }
        
        var_4_7B = invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7c6b\u61a4\u8bb0\ubcb0\u93a2\uceb8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p0:ByteBuffer))
        
        if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ubf56\ud51e\uc87f\u7043\ub19c\u983f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::CLOSED))) {
            return:int(var_4_7B:int)
        }
        
        athrow(initobject:EOFException(EOFException::<init>, loadelement:String(getstatic:String[](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9), and:int(ldc:int(10242), ldc:int(17198)))))
    }
    
    public int read(java.nio.ByteBuffer p0) {
        var_2_61 : int
        var_2_F5 : int
        var_4_FB : int
        var_5_3F1 : int
        
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
        var_2_61 = and:int(ldc:int(-1410657754), ldc:int(-34609036))
        
        loop {
            Label_0098:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-522336501))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0537)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0210)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-105146393))
                
                if (invokevirtual:boolean(Buffer::hasRemaining, p0:ByteBuffer[expected:Buffer])) {
                    goto(Label_0149)
                }
                
                return:int(and:int(ldc:int(-6702), ldc:int(6701)))
            }
            
            Label_0609:
            
            while (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-750294886))
                    goto(Label_0210)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1555952036))
                    loopcontinue(Label_0098)
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-5505025))
                
                if (invokespecial:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u965f\u52d3\u8640\u6ec6\ub8be\u120d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)) {
                    goto(Label_0210)
                }
                
                invokespecial:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7049\u52d3\u8709\u74b1\u56bd\ud4fe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-597652481))
            goto(Label_0537)
            Label_0149:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0609)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1776903119))
                goto(Label_0537)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1355316985))
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1179705609))
                
                if (logicalnot:boolean(invokespecial:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u965f\u52d3\u8640\u6ec6\ub8be\u120d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\u62da\u7049\u385b\u67d0\ud12e, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                        goto(Label_0537)
                    }
                    
                    goto(Label_0609)
                }
            }
            
            Label_0210:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0609)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_F5 = and:int(var_2_61:int, ldc:int(-1086344978))
                var_4_FB = invokespecial:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u9af2\u8aa5\u4492\u0b8e\u76bc\u71f1, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p0:ByteBuffer)
                
                if (cmpne:boolean(var_4_FB:int, ldc:int(0))) {
                    return:int(var_4_FB:int)
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-1032906171))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-116919915))
                        goto(Label_0763)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(766533611))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(4)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-314890571))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u88c5\u6c52\u36d3\ubf56\u3bd6\u69d9))) {
                            if (cmpne:boolean(invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), ldc:int(0))) {
                                athrow(initobject:AssertionError(AssertionError::<init>))
                            }
                        }
                    }
                    
                    Label_0334:
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(1934627489))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(1080150525))
                        goto(Label_0763)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(4)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-612578045))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-269778883))
                        invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                            invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                            goto(Label_0763)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(1594406711))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-1118178016))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(-546171530))
                            goto(Label_0334)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(-17385112))
                            loopcontinue()
                        }
                        
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-41956241))
                        invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                    }
                    
                    Label_0763:
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(4)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(795884306))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(64)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(452453745))
                            goto(Label_0334)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(-1961169202))
                            loopcontinue()
                        }
                        
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-1388632410))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\u62da\u7049\u385b\u67d0\ud12e, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                            if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::BUFFER_UNDERFLOW))) {
                                goto(Label_0926)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(1098351328))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0763)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(8)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(-949788697))
                            goto(Label_0334)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(32)), ldc:int(0))) {
                            var_2_F5 = and:int(var_2_F5:int, ldc:int(2117463915))
                            loopcontinue()
                        }
                        
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-110161866))
                        
                        if (cmpeq:boolean(invokevirtual:int(SocketChannel::read, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), ldc:int(-1))) {
                            return:int(ldc:int(-1))
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(-1020998125))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0763)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_F5 = and:int(var_2_F5:int, ldc:int(1489105133))
                        goto(Label_0334)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F5:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_F5:int, ldc:int(-109364884))
                    invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                    invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u59ec\u600f\u8350\u4492\u72f1\ud158, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                    var_5_3F1 = invokespecial:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u718f\u6435\ubcb0\u960f\u7049\u6ec6, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:ByteBuffer)
                    
                    if (logicaland:boolean(cmpeq:boolean(var_5_3F1:int, ldc:int(0)), invokevirtual:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\u62da\u7049\u385b\u67d0\ud12e, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                        loopcontinue(Label_0098)
                    }
                    
                    return:int(var_5_3F1:int)
                }
            }
            
            Label_0537:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0609)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1913545832))
                goto(Label_0210)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1926394660))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-39099596))
            invokespecial:void(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7049\u52d3\u8709\u74b1\u56bd\ud4fe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
            
            if (invokespecial:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u965f\u52d3\u8640\u6ec6\ub8be\u120d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)) {
                goto(Label_0210)
            }
            
            return:int(and:int(ldc:int(-21745), ldc:int(21744)))
        }
    }
    
    private int \u9af2\u8aa5\u4492\u0b8e\u76bc\u71f1(java.nio.ByteBuffer p0) {
        var_2_9E : int
        var_4_10A : int
        
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
        var_2_9E = and:int(ldc:int(-365297449), ldc:int(-14719539))
        
        if (invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
            return:int(invokespecial:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u718f\u6435\ubcb0\u960f\u7049\u6ec6, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:ByteBuffer))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_9E:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpne:boolean(and:int(var_2_9E:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_9E = and:int(var_2_9E:int, ldc:int(-283170583))
                
                if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                    invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
                }
            }
            
            Label_0139:
            
            if (cmpne:boolean(and:int(var_2_9E:int, ldc:int(128)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_9E:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_9E = and:int(var_2_9E:int, ldc:int(-182803721))
                
                if (invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                    invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u59ec\u600f\u8350\u4492\u72f1\ud158, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)
                    var_4_10A = invokespecial:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u718f\u6435\ubcb0\u960f\u7049\u6ec6, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:ByteBuffer)
                    
                    if (cmpeq:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::CLOSED))) {
                        return:int(ldc:int(-1))
                    }
                    
                    var_2_9E = and:int(var_2_9E:int, ldc:int(-220488231))
                    
                    if (cmpgt:boolean(var_4_10A:int, ldc:int(0))) {
                        return:int(var_4_10A:int)
                    }
                }
            }
            
            Label_0169:
            
            if (cmpeq:boolean(and:int(var_2_9E:int, ldc:int(131072)), ldc:int(0))) {
                var_2_9E = and:int(var_2_9E:int, ldc:int(193036667))
                goto(Label_0139)
            }
            
            if (cmpne:boolean(and:int(var_2_9E:int, ldc:int(524288)), ldc:int(0))) {
                return:int(and:int(ldc:int(4769), ldc:int(-4786)))
            }
            
            var_2_9E = and:int(var_2_9E:int, ldc:int(-1558618140))
        }
    }
    
    public boolean \u93a2\ub19c\u16f6\ud7e8\ubded\ub7dc() {
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
            return:boolean(invokevirtual:boolean(SocketChannel::isConnected, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            invokeinterface:void(SSLSession::invalidate, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
            
            if (invokevirtual:boolean(AbstractInterruptibleChannel::isOpen, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), invokespecial:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u7c6b\u61a4\u8bb0\ubcb0\u93a2\uceb8, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getstatic:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8cae\u760c\u960f\u4492\u6bb9\u927d)))
            }
            
            invokevirtual:void(AbstractInterruptibleChannel::close, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u965f\u52d3\u8640\u6ec6\ub8be\u120d() {
        var_3_69 : HandshakeStatus
        
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
            var_3_69 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            return:boolean(ternaryop:int(logicaland:boolean(cmpne:boolean(var_3_69:HandshakeStatus, getstatic:HandshakeStatus(HandshakeStatus::FINISHED)), cmpne:boolean(var_3_69:HandshakeStatus, getstatic:HandshakeStatus(HandshakeStatus::NOT_HANDSHAKING))), and:int(ldc:int(10073), ldc:int(-12122)), xor:int(ldc:int(5138), ldc:int(5139))))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.channels.SelectableChannel \ub1b9\u6d99\ud12e\ub19c\u16f6\u8d98(boolean p0) {
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
            return:SelectableChannel(invokevirtual:SelectableChannel(AbstractSelectableChannel::configureBlocking, getfield:SocketChannel[expected:AbstractSelectableChannel](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5bc4\uc9f6\ub113\ud36e\u7873\u6b5f(java.net.SocketAddress p0) {
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
            return:boolean(invokevirtual:boolean(SocketChannel::connect, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3), p0:SocketAddress))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u1833\u960f\uc238\u8cae\uff55\u4f52() {
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
            return:boolean(invokevirtual:boolean(SocketChannel::finishConnect, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    public java.net.Socket \ubff1\ufcaf\ua61f\u36d3\uafe7\ua61f() {
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
            return:Socket(invokevirtual:Socket(SocketChannel::socket, getfield:SocketChannel(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u59ec\ufe34\u7873\u927d\uc7fe\u71f1() {
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
            return:boolean(invokevirtual:boolean(SSLEngine::isInboundDone, getfield:SSLEngine(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ub19c\u7ce1\u120d\u8bb0\u3c25\u7e3f, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    public boolean isOpen() {
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
            return:boolean(invokevirtual:boolean(AbstractInterruptibleChannel::isOpen, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub102\ubcb0\u99f7\ubb2b\u4c2b\u6b0d() {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))), invokespecial:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u965f\u52d3\u8640\u6ec6\ub8be\u120d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), and:int(ldc:int(-23028), ldc:int(22833)), xor:int(ldc:int(-16000), ldc:int(-15999))))
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u7049\u99f7\u6bb9\uf94d\ub32d() {
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
            invokevirtual:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::write, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, getfield:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u64f2\u494c\uae87\u6d69\ua6bd\ubefe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3bd6\u97b7\ud171\ucb79\uf9c5() {
        stack_CD_0 : int [generated]
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u56bd\u8753\u61a4\u624e\u983f\u6cfe, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))) {
                if (invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u516c\ubded\u7c6b\uc2bd\u7c6b\u3776, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3))) {
                    if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::BUFFER_UNDERFLOW))) {
                        if (cmpne:boolean(invokevirtual:Status(SSLEngineResult::getStatus, getfield:SSLEngineResult(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8c8a\ua068\u4f52\u4c2b\u3c25\u7330, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)), getstatic:Status(Status::CLOSED))) {
                            return:boolean(xor:int[expected:boolean](ldc:int(16388), ldc:int(16389)))
                        }
                    }
                }
                
                stack_CD_0 = and:int[expected:boolean](ldc:int(2066), ldc:int(-2067))
                return:boolean(stack_CD_0:boolean)
            }
            
            stack_CD_0 = xor:int[expected:boolean](ldc:int(16388), ldc:int(16389))
            return:boolean(stack_CD_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public int \u5140\ubf56\u3bd6\u8bb0\ud4fe\u64ab(java.nio.ByteBuffer p0) {
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
            return:int(invokespecial:int(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u9af2\u8aa5\u4492\u0b8e\u76bc\u71f1, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3, p0:ByteBuffer))
        }
        
        goto(Label_0006)
    }
    
    private int \u718f\u6435\ubcb0\u960f\u7049\u6ec6(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) {
        var_3_61 : int
        var_5_66 : int
        var_6_6C : int
        var_7_8F : int
        var_8_98 : int
        
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
        var_3_61 = and:int(ldc:int(2068839822), ldc:int(333967359))
        var_5_66 = invokevirtual:int(Buffer::remaining, p0:ByteBuffer[expected:Buffer])
        var_6_6C = invokevirtual:int(Buffer::remaining, p1:ByteBuffer[expected:Buffer])
        
        if (cmple:boolean(var_5_66:int, var_6_6C:int)) {
            invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, p0:ByteBuffer)
            return:int(var_5_66:int)
        }
        
        var_7_8F = invokestatic:int(Math::min, var_5_66:int, var_6_6C:int)
        var_8_98 = and:int(ldc:int(14916), ldc:int(-15942))
        
        loop {
            var_3_61 = and:int(var_3_61:int, ldc:int(-80740354))
            
            if (cmpge:boolean(var_8_98:int, var_7_8F:int)) {
                looporswitchbreak()
            }
            
            invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, invokevirtual:byte(ByteBuffer::get, p0:ByteBuffer))
            inc:int(var_8_98, ldc:int(1))
        }
        
        return:int(var_7_8F:int)
    }
    
    public boolean \ucb79\u62da\u7049\u385b\u67d0\ud12e() {
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
            return:boolean(invokevirtual:boolean(AbstractSelectableChannel::isBlocking, getfield:SocketChannel[expected:AbstractSelectableChannel](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\ucb79\uff55\u56bd\uf995\u8753\uae5d, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_270 : int
        expr_6E : int [generated]
        stack_AA_0 : byte[] [generated]
        stack_AC_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_16B_0 : byte[] [generated]
        stack_1B9_0 : byte[] [generated]
        stack_283_0 : byte[] [generated]
        stack_2E1_0 : byte[] [generated]
        stack_386_0 : byte[] [generated]
        stack_3D7_0 : byte[] [generated]
        stack_457_0 : byte[] [generated]
        var_4_24C : int
        var_3_251 : byte[]
        var_5_252 : int
        var_0_2D7 : int
        expr_2E1 : byte [generated]
        stack_329_2 : byte [generated]
        stack_306_0 : byte [generated]
        expr_386 : byte [generated]
        expr_AC : int [generated]
        expr_FC : int [generated]
        var_2_131 : byte[]
        expr_135 : int [generated]
        var_3_3C5 : byte[]
        var_5_3C6 : int
        expr_16B : int [generated]
        var_0_1B7 : int
        var_3_1C5 : String
        stack_22E_0 : String[] [generated]
        expr_1D7 : String[] [generated]
        stack_48A_0 : int [generated]
        
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
        var_0_270 = and:int(ldc:int(-1990633390), ldc:int(-1242435685))
        expr_6E = arraylength:int(stack_AA_0 = stack_AC_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("odbRy8V9udGM1RG6wAbBxc+2u73F1tHLxX25x8PWEcGF4sC71hK2xuG3ucLPcMrZgdIPwcMdttXJuqvRs9OF077VyMTGtbx1CsSPxQzBvC/x7/b9zQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_24C = expr_6E:int
        var_3_251 = newarray:byte[](byte.class, expr_6E:int)
        var_5_252 = expr_6E:int
        Label_0596:
        
        while (cmpeq:boolean(and:int(var_0_270:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0847)
            }
            
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(16)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(-1088641802))
                goto(Label_0690)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-103684005))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            storeelement:byte(var_3_251:byte[], var_5_252:int, add:byte(loadelement:byte(stack_283_0:byte[], var_5_252:int), ldc:byte(58)))
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AC_0 = stack_AA_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = var_3_251:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1054)
        Label_0690:
        
        while (cmpeq:boolean(and:int(var_0_270:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0847)
            }
            
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(1902538487))
                goto(Label_0596)
            }
            
            var_0_2D7 = and:int(var_0_270:int, ldc:int(-145027113))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            expr_2E1 = stack_329_2 = loadelement(stack_2E1_0, var_5_252)
            
            if (cmplt:boolean(add:int(add:int(var_5_252:int, ldc:int(5)), neg:int(var_4_24C:int)), ldc:int(0))) {
                stack_329_2 = stack_306_0 = add:byte(expr_2E1:byte, loadelement:byte(var_3_251:byte[], add:int(var_5_252:int, ldc:int(5))))
                goto(Label_0790)
            }
            
            Label_0750:
            
            if (cmpeq:boolean(and:int(var_0_2D7:int, ldc:int(65536)), ldc:int(0))) {
                var_0_2D7 = and:int(var_0_2D7:int, ldc:int(136542654))
            }
            else {
                var_0_2D7 = and:int(var_0_2D7:int, ldc:int(-613323533))
                stack_329_2 = stack_306_0 = add:byte(expr_2E1:byte, ldc:byte(5))
            }
            
            Label_0790:
            
            if (cmpne:boolean(and:int(var_0_2D7:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0750)
            }
            
            var_0_270 = and:int(var_0_2D7:int, ldc:int(-170399169))
            storeelement:byte(var_3_251:byte[], var_5_252:int, stack_329_2:byte)
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AC_0 = stack_AA_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = var_3_251:byte[]
            goto(Label_0177)
        }
        
        goto(Label_1054)
        Label_0847:
        
        while (cmpeq:boolean(and:int(var_0_270:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(131072)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(1347922167))
                goto(Label_0690)
            }
            
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(2048)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(768164607))
                goto(Label_0596)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-2056008010))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            expr_386 = loadelement:byte(stack_386_0:byte[], var_5_252:int)
            storeelement:byte(var_3_251:byte[], var_5_252:int, or:int(and:int(shl:int(expr_386:byte, xor:int(ldc:int(14336), ldc:int(14340))), ldc:int(-16)), and:int(shr:int(expr_386:byte[expected:int], and:int(ldc:int(1156), ldc:int(2661))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AC_0 = stack_AA_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = var_3_251:byte[]
            goto(Label_0257)
        }
        
        Label_1054:
        
        while (cmpeq:boolean(and:int(var_0_270:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(-917329148))
                goto(Label_0690)
            }
            
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(-224839237))
                goto(Label_0596)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-209863169))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            storeelement:byte(var_3_251:byte[], var_5_252:int, xor:byte(loadelement:byte(stack_457_0:byte[], var_5_252:int), ldc:byte(80)))
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AC_0 = stack_AA_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = var_3_251:byte[]
            goto(Label_0368)
        }
        
        goto(Label_0847)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0314)
        }
        
        if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(-634391003))
            goto(Label_0257)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(-827316851))
        }
        else {
            var_0_270 = and:int(var_0_270:int, ldc:int(-1556796513))
            expr_AC = arraylength:int(stack_AC_0:byte[])
            
            if (cmpne:boolean(expr_AC:int, ldc:int(0))) {
                var_4_24C = expr_AC:int
                var_3_251 = newarray:byte[](byte.class, expr_AC:int)
                var_5_252 = expr_AC:int
                goto(Label_0690)
            }
        }
        
        Label_0177:
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(512)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(869866210))
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(8192)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(1692816595))
            goto(Label_0314)
        }
        
        if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(65536)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(11573509))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(65536)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(-1350131271))
                goto(Label_0115)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-1187423242))
            expr_FC = arraylength:int(stack_FC_0:byte[])
            
            if (cmpne:boolean(expr_FC:int, ldc:int(0))) {
                var_4_24C = expr_FC:int
                var_3_251 = newarray:byte[](byte.class, expr_FC:int)
                var_5_252 = expr_FC:int
                goto(Label_0847)
            }
        }
        
        Label_0257:
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_270 = and:int(var_0_270:int, ldc:int(1382954301))
                goto(Label_0177)
            }
            
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-918626))
            var_2_131 = stack_131_0:byte[]
            expr_135 = add:int(arraylength:int(stack_133_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_135:int, ldc:int(0))) {
                var_3_3C5 = newarray:byte[](byte.class, expr_135:int)
                var_5_3C6 = expr_135:int
                
                loop {
                    var_0_270 = and:int(var_0_270:int, ldc:int(-67289925))
                    var_5_3C6 = add:int(var_5_3C6:int, ldc:int(-1))
                    storeelement:byte(var_3_3C5:byte[], var_5_3C6:int, add:int(shl:int(loadelement:byte(stack_3D7_0:byte[], var_5_3C6:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_131:byte[], add:int(var_5_3C6:int, xor:int(ldc:int(132), ldc:int(133)))), ldc:int(4)), and:int(ldc:int(4127), ldc:int(303)))))
                    
                    if (cmpne:boolean(var_5_3C6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AC_0 = stack_AA_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1B9_0 = stack_283_0 = stack_2E1_0 = stack_386_0 = stack_3D7_0 = stack_457_0 = var_3_3C5:byte[]
            }
        }
        
        Label_0314:
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(1810778495))
        }
        else {
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0257)
            }
            
            if (cmpne:boolean(and:int(var_0_270:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0177)
            }
            
            if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_270 = and:int(var_0_270:int, ldc:int(-340305185))
            expr_16B = arraylength:int(stack_16B_0:byte[])
            
            if (cmpne:boolean(expr_16B:int, ldc:int(0))) {
                var_4_24C = expr_16B:int
                var_3_251 = newarray:byte[](byte.class, expr_16B:int)
                var_5_252 = expr_16B:int
                goto(Label_1054)
            }
        }
        
        Label_0368:
        
        if (cmpeq:boolean(and:int(var_0_270:int, ldc:int(16)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(-1062447544))
            goto(Label_0314)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(-161011790))
            goto(Label_0257)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(1218274883))
            goto(Label_0177)
        }
        
        if (cmpne:boolean(and:int(var_0_270:int, ldc:int(128)), ldc:int(0))) {
            var_0_270 = and:int(var_0_270:int, ldc:int(179396897))
            goto(Label_0115)
        }
        
        var_0_1B7 = and:int(var_0_270:int, ldc:int(-440989677))
        var_3_1C5 = initobject:String(String::<init>, stack_1B9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_22E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32730), ldc:int(-32731)))
        expr_1D7 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(28675), ldc:int(1303)))
        storeelement:String(expr_1D7:String[], xor:int(ldc:int(12417), ldc:int(12419)), invokevirtual:String[expected:String](String::substring, var_3_1C5:String, and:int(ldc:int(16601), ldc:int(-29402)), xor:int(ldc:int(1039), ldc:int(1051))))
        storeelement:String(expr_1D7:String[], xor:int(ldc:int(226), ldc:int(227)), invokevirtual:String[expected:String](String::substring, var_3_1C5:String, and:int(ldc:int(16404), ldc:int(6166)), xor:int(ldc:int(390), ldc:int(444))))
        storeelement:String(expr_1D7:String[], and:int(ldc:int(-16753), ldc:int(16752)), invokevirtual:String[expected:String](String::substring, var_3_1C5:String, and:int(ldc:int(8254), ldc:int(19066)), xor:int(ldc:int(4678), ldc:int(4626))))
        putstatic:String[](\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9, expr_1D7:String[])
        
        if (invokevirtual:boolean(Class<T>::desiredAssertionStatus, ldc:Class<\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3>(\ub113\ufcaf\u3c25\u071d\u97b7.\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3.class))) {
            var_0_1B7 = and:int(var_0_1B7:int, ldc:int(-479069422))
            stack_48A_0 = and:int(ldc:int(-27565), ldc:int(19244))
        }
        else {
            stack_48A_0 = and:int(ldc:int(6145), ldc:int(24963))
        }
        
        putstatic:boolean(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u88c5\u6c52\u36d3\ubf56\u3bd6\u69d9, stack_48A_0:int)
        putstatic:ByteBuffer(\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3::\u8cae\u760c\u960f\u4492\u6bb9\u927d, invokestatic:ByteBuffer(ByteBuffer::allocate, and:int(ldc:int(-28413), ldc:int(12016))))
    }
    
    public void \ub18d\u7d52\u446c\uc229\ub171\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_679 : int
        
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
        var_3_66E = and:int(ldc:int(-60925132), ldc:int(-1349266145))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\ub8be\u36d3\u3776\u6ec6\u3dd3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(-1541958723))
            var_5_81 = and:int(ldc:int(22161), ldc:int(-22162))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20230), ldc:int(20229)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_66E:int, ldc:int(-307316803))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(10370), ldc:int(10371)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(3765), ldc:int(1)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_66E = and:int(var_3_DA:int, ldc:int(-1392618057))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2589), ldc:int(1219)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1250252878))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1560152718))
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1509174380))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-85984452))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-477830086))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-390026440))
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(791615392))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1140443689))
                            var_11_EB = and:int(ldc:int(-391), ldc:int(390))
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0553:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(399029546))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(550549180))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(40685902))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1912858494))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-435523307))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0673:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1030421973))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2038463261))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1548642874))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1021617536))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1478016582))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1110213220))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(384768886))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1727801614))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-29434690))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1138092556))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(16901), ldc:int(8281))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0930:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-771160872))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-445636487))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-940372453))
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-710414465))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1153500381))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-2083712398))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-286346858))
                        var_11_EB = and:int(ldc:int(2084), ldc:int(-2085))
                    }
                    
                    Label_1107:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(543403755))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2083186987))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1165361477))
                            goto(Label_0930)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(536777390))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-498138955))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-929439628))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1216473217))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2053633984))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1107)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(423335915))
                            goto(Label_0930)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1811451131))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1508956832))
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-6540931))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1536222402))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1391:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2054271004))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1005674200))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1713126521))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1639221040))
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1981294987))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1030010219))
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-449162945))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_679 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-597884040))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1134848002))
                        var_17_679 = add:int(var_16_119:int, and:int(ldc:int(275), ldc:int(2593)))
                        looporswitchbreak()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-1014829082))
                }
                
                var_3_66E = and:int(var_3_66E:int, ldc:int(-59506826))
                
                if (cmple:boolean(var_5_81 = var_17_679:int, sub:int(var_6_88:int, xor:int(ldc:int(18442), ldc:int(18443))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(438903923))
            goto(Label_0108)
        }
    }
}
